package ru.textanalysis.tawt.scheduler;

import ru.textanalysis.tawt.scheduler.proto.scheduler.*;
import io.grpc.Channel;
import io.grpc.StatusRuntimeException;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TasksClient {
    private static final Logger logger = Logger.getLogger(TasksClient.class.getName());
    private final TasksGrpc.TasksBlockingStub blockingStub;

    public TasksClient(Channel channel) {
        blockingStub = TasksGrpc.newBlockingStub(channel);
    }

    public Iterator<GetTaskStreamResponse> getTaskStream(String queueName)  {
        GetTaskStreamRequest req = GetTaskStreamRequest.newBuilder().setQueueName(queueName).build();
        Iterator<GetTaskStreamResponse> stream;

        try {
            return blockingStub.getTaskStream(req);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }

        return null;
    }

    public void finishTask(String taskId, String output, String error ) {
        FinishTask dto;
        if (error == null) {
            dto = FinishTask.newBuilder().setTaskId(taskId).setOutput(output).build();
        } else {
            dto = FinishTask.newBuilder().setTaskId(taskId).setError(error).build();
        }

        FinishTaskRequest req = FinishTaskRequest.newBuilder().setDto(dto).build();
        FinishTaskResponse resp;

        try {
            resp = blockingStub.finishTask(req);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }
    }
}
