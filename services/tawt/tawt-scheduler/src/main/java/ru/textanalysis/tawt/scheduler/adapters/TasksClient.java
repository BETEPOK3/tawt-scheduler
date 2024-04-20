package ru.textanalysis.tawt.scheduler.adapters;

import io.grpc.stub.StreamObserver;
import ru.textanalysis.tawt.scheduler.proto.scheduler.*;
import io.grpc.Channel;
import io.grpc.StatusRuntimeException;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TasksClient {
    private static final Logger logger = Logger.getLogger(TasksClient.class.getName());

    private final TasksGrpc.TasksBlockingStub blockingStub;
    private final TasksGrpc.TasksStub stub;

    public TasksClient(Channel channel) {
        blockingStub = TasksGrpc.newBlockingStub(channel);
        stub = TasksGrpc.newStub(channel);
    }

    public StreamObserver<GetTaskStreamRequest> getTaskStream(StreamObserver<GetTaskStreamResponse> respObserver)  {
        return stub.getTaskStream(respObserver);
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
