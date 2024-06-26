package ru.textanalysis.tawt.scheduler.proto.scheduler;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Tasks - сервис по работе с задачами.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: scheduler/tasks.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TasksGrpc {

  private TasksGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scheduler.Tasks";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdRequest,
      ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdResponse> getGetTaskByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTaskById",
      requestType = ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdRequest.class,
      responseType = ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdRequest,
      ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdResponse> getGetTaskByIdMethod() {
    io.grpc.MethodDescriptor<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdRequest, ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdResponse> getGetTaskByIdMethod;
    if ((getGetTaskByIdMethod = TasksGrpc.getGetTaskByIdMethod) == null) {
      synchronized (TasksGrpc.class) {
        if ((getGetTaskByIdMethod = TasksGrpc.getGetTaskByIdMethod) == null) {
          TasksGrpc.getGetTaskByIdMethod = getGetTaskByIdMethod =
              io.grpc.MethodDescriptor.<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdRequest, ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTaskById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TasksMethodDescriptorSupplier("GetTaskById"))
              .build();
        }
      }
    }
    return getGetTaskByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamRequest,
      ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamResponse> getGetTaskStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTaskStream",
      requestType = ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamRequest.class,
      responseType = ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamRequest,
      ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamResponse> getGetTaskStreamMethod() {
    io.grpc.MethodDescriptor<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamRequest, ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamResponse> getGetTaskStreamMethod;
    if ((getGetTaskStreamMethod = TasksGrpc.getGetTaskStreamMethod) == null) {
      synchronized (TasksGrpc.class) {
        if ((getGetTaskStreamMethod = TasksGrpc.getGetTaskStreamMethod) == null) {
          TasksGrpc.getGetTaskStreamMethod = getGetTaskStreamMethod =
              io.grpc.MethodDescriptor.<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamRequest, ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTaskStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TasksMethodDescriptorSupplier("GetTaskStream"))
              .build();
        }
      }
    }
    return getGetTaskStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest,
      ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskResponse> getCreateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTask",
      requestType = ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest.class,
      responseType = ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest,
      ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskResponse> getCreateTaskMethod() {
    io.grpc.MethodDescriptor<ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest, ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskResponse> getCreateTaskMethod;
    if ((getCreateTaskMethod = TasksGrpc.getCreateTaskMethod) == null) {
      synchronized (TasksGrpc.class) {
        if ((getCreateTaskMethod = TasksGrpc.getCreateTaskMethod) == null) {
          TasksGrpc.getCreateTaskMethod = getCreateTaskMethod =
              io.grpc.MethodDescriptor.<ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest, ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TasksMethodDescriptorSupplier("CreateTask"))
              .build();
        }
      }
    }
    return getCreateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskRequest,
      ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskResponse> getFinishTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinishTask",
      requestType = ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskRequest.class,
      responseType = ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskRequest,
      ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskResponse> getFinishTaskMethod() {
    io.grpc.MethodDescriptor<ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskRequest, ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskResponse> getFinishTaskMethod;
    if ((getFinishTaskMethod = TasksGrpc.getFinishTaskMethod) == null) {
      synchronized (TasksGrpc.class) {
        if ((getFinishTaskMethod = TasksGrpc.getFinishTaskMethod) == null) {
          TasksGrpc.getFinishTaskMethod = getFinishTaskMethod =
              io.grpc.MethodDescriptor.<ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskRequest, ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinishTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TasksMethodDescriptorSupplier("FinishTask"))
              .build();
        }
      }
    }
    return getFinishTaskMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TasksStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TasksStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TasksStub>() {
        @java.lang.Override
        public TasksStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TasksStub(channel, callOptions);
        }
      };
    return TasksStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TasksBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TasksBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TasksBlockingStub>() {
        @java.lang.Override
        public TasksBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TasksBlockingStub(channel, callOptions);
        }
      };
    return TasksBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TasksFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TasksFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TasksFutureStub>() {
        @java.lang.Override
        public TasksFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TasksFutureStub(channel, callOptions);
        }
      };
    return TasksFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Tasks - сервис по работе с задачами.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetTaskById - получить задачу по идентификатору.
     * </pre>
     */
    default void getTaskById(ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdRequest request,
        io.grpc.stub.StreamObserver<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaskByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTaskStream - получить поток задач на обработку.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamRequest> getTaskStream(
        io.grpc.stub.StreamObserver<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGetTaskStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateTask - создать задачу.
     * </pre>
     */
    default void createTask(ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * FinishTask - завершить задачу.
     * </pre>
     */
    default void finishTask(ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskRequest request,
        io.grpc.stub.StreamObserver<ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinishTaskMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Tasks.
   * <pre>
   * Tasks - сервис по работе с задачами.
   * </pre>
   */
  public static abstract class TasksImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TasksGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Tasks.
   * <pre>
   * Tasks - сервис по работе с задачами.
   * </pre>
   */
  public static final class TasksStub
      extends io.grpc.stub.AbstractAsyncStub<TasksStub> {
    private TasksStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TasksStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TasksStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetTaskById - получить задачу по идентификатору.
     * </pre>
     */
    public void getTaskById(ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdRequest request,
        io.grpc.stub.StreamObserver<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaskByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTaskStream - получить поток задач на обработку.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamRequest> getTaskStream(
        io.grpc.stub.StreamObserver<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGetTaskStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * CreateTask - создать задачу.
     * </pre>
     */
    public void createTask(ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FinishTask - завершить задачу.
     * </pre>
     */
    public void finishTask(ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskRequest request,
        io.grpc.stub.StreamObserver<ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinishTaskMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Tasks.
   * <pre>
   * Tasks - сервис по работе с задачами.
   * </pre>
   */
  public static final class TasksBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TasksBlockingStub> {
    private TasksBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TasksBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TasksBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetTaskById - получить задачу по идентификатору.
     * </pre>
     */
    public ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdResponse getTaskById(ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaskByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateTask - создать задачу.
     * </pre>
     */
    public ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskResponse createTask(ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FinishTask - завершить задачу.
     * </pre>
     */
    public ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskResponse finishTask(ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinishTaskMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Tasks.
   * <pre>
   * Tasks - сервис по работе с задачами.
   * </pre>
   */
  public static final class TasksFutureStub
      extends io.grpc.stub.AbstractFutureStub<TasksFutureStub> {
    private TasksFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TasksFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TasksFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetTaskById - получить задачу по идентификатору.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdResponse> getTaskById(
        ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaskByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateTask - создать задачу.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskResponse> createTask(
        ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FinishTask - завершить задачу.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskResponse> finishTask(
        ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinishTaskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TASK_BY_ID = 0;
  private static final int METHODID_CREATE_TASK = 1;
  private static final int METHODID_FINISH_TASK = 2;
  private static final int METHODID_GET_TASK_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TASK_BY_ID:
          serviceImpl.getTaskById((ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdRequest) request,
              (io.grpc.stub.StreamObserver<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdResponse>) responseObserver);
          break;
        case METHODID_CREATE_TASK:
          serviceImpl.createTask((ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest) request,
              (io.grpc.stub.StreamObserver<ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskResponse>) responseObserver);
          break;
        case METHODID_FINISH_TASK:
          serviceImpl.finishTask((ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskRequest) request,
              (io.grpc.stub.StreamObserver<ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TASK_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getTaskStream(
              (io.grpc.stub.StreamObserver<ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetTaskByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdRequest,
              ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskByIdResponse>(
                service, METHODID_GET_TASK_BY_ID)))
        .addMethod(
          getGetTaskStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamRequest,
              ru.textanalysis.tawt.scheduler.proto.scheduler.GetTaskStreamResponse>(
                service, METHODID_GET_TASK_STREAM)))
        .addMethod(
          getCreateTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskRequest,
              ru.textanalysis.tawt.scheduler.proto.scheduler.CreateTaskResponse>(
                service, METHODID_CREATE_TASK)))
        .addMethod(
          getFinishTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskRequest,
              ru.textanalysis.tawt.scheduler.proto.scheduler.FinishTaskResponse>(
                service, METHODID_FINISH_TASK)))
        .build();
  }

  private static abstract class TasksBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TasksBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.textanalysis.tawt.scheduler.proto.scheduler.TasksOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Tasks");
    }
  }

  private static final class TasksFileDescriptorSupplier
      extends TasksBaseDescriptorSupplier {
    TasksFileDescriptorSupplier() {}
  }

  private static final class TasksMethodDescriptorSupplier
      extends TasksBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TasksMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TasksGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TasksFileDescriptorSupplier())
              .addMethod(getGetTaskByIdMethod())
              .addMethod(getGetTaskStreamMethod())
              .addMethod(getCreateTaskMethod())
              .addMethod(getFinishTaskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
