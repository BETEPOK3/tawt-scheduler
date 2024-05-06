package ru.textanalysis.tawt.scheduler.adapters;

import io.grpc.stub.StreamObserver;
import ru.textanalysis.tawt.scheduler.Main;
import ru.textanalysis.tawt.scheduler.processors.ProcessorPool;
import ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamResponse;
import ru.textanalysis.tawt.scheduler.proto.scheduler.TaskStreamData;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Наблюдатель, который при поступлении задач начинает их обработку.
 */
public class TasksStreamObserverImpl implements StreamObserver<GetTaskStreamResponse> {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private final ProcessorPool processorPool;
    private final TasksClient client;

    private CountDownLatch count;

    public TasksStreamObserverImpl(ProcessorPool processorPool, TasksClient client) {
        this.processorPool = processorPool;
        this.client = client;
    }

    @Override
    public void onNext(GetTaskStreamResponse resp) {
        TaskStreamData task = resp.getTask();
        int taskType = task.getType().getSpecificCase().getNumber();
        String result;

        logger.log(Level.INFO, "Start processing task with type: {0}", task.getType().getSpecificCase().toString());

        try {
            result = processorPool.processTask(task.getInput(), taskType);
        } catch (Exception e) {
            logger.log(Level.INFO, "Task processing failed: {0}", e.getLocalizedMessage());
            client.finishTask(task.getTaskId(), null, e.getMessage());
            count.countDown();
            return;
        }

        logger.log(Level.INFO, "Processed task id {0}", task.getTaskId());
        client.finishTask(task.getTaskId(), result, null);
        count.countDown();
    }

    @Override
    public void onError(Throwable throwable) {
        count.countDown();
    }

    @Override
    public void onCompleted() {
        count.countDown();
    }

    public synchronized void await() throws InterruptedException {
        count = new CountDownLatch(1);

        try {
            count.await();
        } catch (InterruptedException ignored) {
            logger.log(Level.INFO, "Wait interrupted!");
        }
    }
}
