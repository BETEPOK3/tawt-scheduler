package ru.textanalysis.tawt.scheduler;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.grpc.ManagedChannel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.stub.StreamObserver;
import ru.textanalysis.tawt.scheduler.adapters.TasksClient;
import ru.textanalysis.tawt.scheduler.adapters.TasksStreamObserverImpl;
import ru.textanalysis.tawt.scheduler.processors.ProcessorPool;
import ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamRequest;
import ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamResponse;
import ru.textanalysis.tawt.scheduler.proto.scheduler.QueueType;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.ScheduledExecutorService;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    private static ProcessorPool pool;

    private static final String target = "scheduler:9808";

    public static void main(String[] args) {
        Builder builder = new Builder(target);
        pool = new ProcessorPool(
                builder.buildProcessorGraphematical(),
                builder.buildProcessorGama()
        );

        ScheduledExecutorService executorServiceSlow = Executors.newScheduledThreadPool(2);

        executorServiceSlow.scheduleAtFixedRate(() -> task(QueueType.SLOW), 0, 3, TimeUnit.SECONDS);
        executorServiceSlow.scheduleAtFixedRate(() -> task(QueueType.FAST), 0, 3, TimeUnit.SECONDS);
    }

    private static void task(QueueType queueType) {
        ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create()).build();

        try {
            TasksClient client = new TasksClient(channel);
            TasksStreamObserverImpl respObserver = new TasksStreamObserverImpl(pool, client);
            var reqObserver = client.getTaskStream(respObserver);

            GetTaskStreamRequest req = GetTaskStreamRequest.newBuilder().setQueueType(queueType).build();

            while (true) {
                reqObserver.onNext(req);
                respObserver.await();
            }

        } catch (Exception e) {
            logger.log(Level.INFO, "Error: {0}", e.getMessage());
        } finally {
            channel.shutdownNow();
        }
    }
}
