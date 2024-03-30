package ru.textanalysis.tawt.scheduler;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.grpc.ManagedChannel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.ScheduledExecutorService;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    private static final String target = "scheduler:9808";
    private static ProcessorGraphematical graphematicalProcessor;
    private static ProcessorGama gamaProcessor;

    public static void main(String[] args) throws Exception {
        graphematicalProcessor = new ProcessorGraphematical();
        gamaProcessor = new ProcessorGama();

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                task("tawt_queue_fast");
            }
        }, 0, 3, TimeUnit.SECONDS);
    }

    private static void task(String queueName) {
        ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create()).build();

        try {
            TasksClient client = new TasksClient(channel);
            var stream = client.getTaskStream(queueName);

            while (stream.hasNext()) {
                var task = stream.next().getTask();
                String input = task.getInput();
                String output = null;
                String error = null;

                try {
                    switch (task.getType().getSpecificCase()) {
                        case GRAPHEMATICAL:
                            output = graphematicalProcessor.ParseText(input);
                            break;
                        case GAMA:
                            output = gamaProcessor.ParseText(input);
                            break;
                    }
                } catch (JsonProcessingException e) {
                    error = String.format("Invalid input format: %s", e.getLocalizedMessage());
                    logger.log(Level.INFO, "Task processing failed: {0}", e.getLocalizedMessage());
                } catch (Exception e) {
                    error = e.getLocalizedMessage();
                    logger.log(Level.INFO, "Task processing failed.");
                }

                logger.log(Level.INFO, "Processed task id {0}", task.getTaskId());
                logger.log(Level.INFO, "Output = {0}", output);

                client.finishTask(task.getTaskId(), output, error);
            }

        } catch (Exception e) {
            logger.log(Level.WARNING, "connection error");
        } finally {
            channel.shutdownNow();
        }
    }
}
