package com.myflix.adapter.grpc.protofiles.actor;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Actor.proto")
public final class ActorServiceGrpc {

  private ActorServiceGrpc() {}

  public static final String SERVICE_NAME = "ActorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.saveRequest,
      com.myflix.adapter.grpc.protofiles.actor.saveResponse> getSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "save",
      requestType = com.myflix.adapter.grpc.protofiles.actor.saveRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.actor.saveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.saveRequest,
      com.myflix.adapter.grpc.protofiles.actor.saveResponse> getSaveMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.saveRequest, com.myflix.adapter.grpc.protofiles.actor.saveResponse> getSaveMethod;
    if ((getSaveMethod = ActorServiceGrpc.getSaveMethod) == null) {
      synchronized (ActorServiceGrpc.class) {
        if ((getSaveMethod = ActorServiceGrpc.getSaveMethod) == null) {
          ActorServiceGrpc.getSaveMethod = getSaveMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.actor.saveRequest, com.myflix.adapter.grpc.protofiles.actor.saveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ActorService", "save"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.actor.saveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.actor.saveResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ActorServiceMethodDescriptorSupplier("save"))
                  .build();
          }
        }
     }
     return getSaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.deleteRequest,
      com.myflix.adapter.grpc.protofiles.actor.deleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = com.myflix.adapter.grpc.protofiles.actor.deleteRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.actor.deleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.deleteRequest,
      com.myflix.adapter.grpc.protofiles.actor.deleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.deleteRequest, com.myflix.adapter.grpc.protofiles.actor.deleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ActorServiceGrpc.getDeleteMethod) == null) {
      synchronized (ActorServiceGrpc.class) {
        if ((getDeleteMethod = ActorServiceGrpc.getDeleteMethod) == null) {
          ActorServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.actor.deleteRequest, com.myflix.adapter.grpc.protofiles.actor.deleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ActorService", "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.actor.deleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.actor.deleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ActorServiceMethodDescriptorSupplier("delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.getAllRequest,
      com.myflix.adapter.grpc.protofiles.actor.getAllResponse> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = com.myflix.adapter.grpc.protofiles.actor.getAllRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.actor.getAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.getAllRequest,
      com.myflix.adapter.grpc.protofiles.actor.getAllResponse> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.getAllRequest, com.myflix.adapter.grpc.protofiles.actor.getAllResponse> getGetAllMethod;
    if ((getGetAllMethod = ActorServiceGrpc.getGetAllMethod) == null) {
      synchronized (ActorServiceGrpc.class) {
        if ((getGetAllMethod = ActorServiceGrpc.getGetAllMethod) == null) {
          ActorServiceGrpc.getGetAllMethod = getGetAllMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.actor.getAllRequest, com.myflix.adapter.grpc.protofiles.actor.getAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ActorService", "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.actor.getAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.actor.getAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ActorServiceMethodDescriptorSupplier("getAll"))
                  .build();
          }
        }
     }
     return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.getRequest,
      com.myflix.adapter.grpc.protofiles.actor.getResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.myflix.adapter.grpc.protofiles.actor.getRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.actor.getResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.getRequest,
      com.myflix.adapter.grpc.protofiles.actor.getResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.getRequest, com.myflix.adapter.grpc.protofiles.actor.getResponse> getGetMethod;
    if ((getGetMethod = ActorServiceGrpc.getGetMethod) == null) {
      synchronized (ActorServiceGrpc.class) {
        if ((getGetMethod = ActorServiceGrpc.getGetMethod) == null) {
          ActorServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.actor.getRequest, com.myflix.adapter.grpc.protofiles.actor.getResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ActorService", "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.actor.getRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.actor.getResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ActorServiceMethodDescriptorSupplier("get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.doCharacterRequest,
      com.myflix.adapter.grpc.protofiles.actor.doCharacterResponse> getDoCharacterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doCharacter",
      requestType = com.myflix.adapter.grpc.protofiles.actor.doCharacterRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.actor.doCharacterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.doCharacterRequest,
      com.myflix.adapter.grpc.protofiles.actor.doCharacterResponse> getDoCharacterMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.doCharacterRequest, com.myflix.adapter.grpc.protofiles.actor.doCharacterResponse> getDoCharacterMethod;
    if ((getDoCharacterMethod = ActorServiceGrpc.getDoCharacterMethod) == null) {
      synchronized (ActorServiceGrpc.class) {
        if ((getDoCharacterMethod = ActorServiceGrpc.getDoCharacterMethod) == null) {
          ActorServiceGrpc.getDoCharacterMethod = getDoCharacterMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.actor.doCharacterRequest, com.myflix.adapter.grpc.protofiles.actor.doCharacterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ActorService", "doCharacter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.actor.doCharacterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.actor.doCharacterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ActorServiceMethodDescriptorSupplier("doCharacter"))
                  .build();
          }
        }
     }
     return getDoCharacterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.getCharactersRequest,
      com.myflix.adapter.grpc.protofiles.actor.getCharactersResponse> getGetCharactersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCharacters",
      requestType = com.myflix.adapter.grpc.protofiles.actor.getCharactersRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.actor.getCharactersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.getCharactersRequest,
      com.myflix.adapter.grpc.protofiles.actor.getCharactersResponse> getGetCharactersMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.actor.getCharactersRequest, com.myflix.adapter.grpc.protofiles.actor.getCharactersResponse> getGetCharactersMethod;
    if ((getGetCharactersMethod = ActorServiceGrpc.getGetCharactersMethod) == null) {
      synchronized (ActorServiceGrpc.class) {
        if ((getGetCharactersMethod = ActorServiceGrpc.getGetCharactersMethod) == null) {
          ActorServiceGrpc.getGetCharactersMethod = getGetCharactersMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.actor.getCharactersRequest, com.myflix.adapter.grpc.protofiles.actor.getCharactersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ActorService", "getCharacters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.actor.getCharactersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.actor.getCharactersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ActorServiceMethodDescriptorSupplier("getCharacters"))
                  .build();
          }
        }
     }
     return getGetCharactersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ActorServiceStub newStub(io.grpc.Channel channel) {
    return new ActorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ActorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ActorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ActorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ActorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ActorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void save(com.myflix.adapter.grpc.protofiles.actor.saveRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.saveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.myflix.adapter.grpc.protofiles.actor.deleteRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.deleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void getAll(com.myflix.adapter.grpc.protofiles.actor.getAllRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.getAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void get(com.myflix.adapter.grpc.protofiles.actor.getRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.getResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void doCharacter(com.myflix.adapter.grpc.protofiles.actor.doCharacterRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.doCharacterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDoCharacterMethod(), responseObserver);
    }

    /**
     */
    public void getCharacters(com.myflix.adapter.grpc.protofiles.actor.getCharactersRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.getCharactersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCharactersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.actor.saveRequest,
                com.myflix.adapter.grpc.protofiles.actor.saveResponse>(
                  this, METHODID_SAVE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.actor.deleteRequest,
                com.myflix.adapter.grpc.protofiles.actor.deleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.actor.getAllRequest,
                com.myflix.adapter.grpc.protofiles.actor.getAllResponse>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.actor.getRequest,
                com.myflix.adapter.grpc.protofiles.actor.getResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getDoCharacterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.actor.doCharacterRequest,
                com.myflix.adapter.grpc.protofiles.actor.doCharacterResponse>(
                  this, METHODID_DO_CHARACTER)))
          .addMethod(
            getGetCharactersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.actor.getCharactersRequest,
                com.myflix.adapter.grpc.protofiles.actor.getCharactersResponse>(
                  this, METHODID_GET_CHARACTERS)))
          .build();
    }
  }

  /**
   */
  public static final class ActorServiceStub extends io.grpc.stub.AbstractStub<ActorServiceStub> {
    private ActorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ActorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ActorServiceStub(channel, callOptions);
    }

    /**
     */
    public void save(com.myflix.adapter.grpc.protofiles.actor.saveRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.saveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.myflix.adapter.grpc.protofiles.actor.deleteRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.deleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.myflix.adapter.grpc.protofiles.actor.getAllRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.getAllResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(com.myflix.adapter.grpc.protofiles.actor.getRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.getResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doCharacter(com.myflix.adapter.grpc.protofiles.actor.doCharacterRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.doCharacterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoCharacterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCharacters(com.myflix.adapter.grpc.protofiles.actor.getCharactersRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.getCharactersResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCharactersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ActorServiceBlockingStub extends io.grpc.stub.AbstractStub<ActorServiceBlockingStub> {
    private ActorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ActorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ActorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.myflix.adapter.grpc.protofiles.actor.saveResponse save(com.myflix.adapter.grpc.protofiles.actor.saveRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.myflix.adapter.grpc.protofiles.actor.deleteResponse delete(com.myflix.adapter.grpc.protofiles.actor.deleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.myflix.adapter.grpc.protofiles.actor.getAllResponse> getAll(
        com.myflix.adapter.grpc.protofiles.actor.getAllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.myflix.adapter.grpc.protofiles.actor.getResponse> get(
        com.myflix.adapter.grpc.protofiles.actor.getRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.myflix.adapter.grpc.protofiles.actor.doCharacterResponse doCharacter(com.myflix.adapter.grpc.protofiles.actor.doCharacterRequest request) {
      return blockingUnaryCall(
          getChannel(), getDoCharacterMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.myflix.adapter.grpc.protofiles.actor.getCharactersResponse> getCharacters(
        com.myflix.adapter.grpc.protofiles.actor.getCharactersRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCharactersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ActorServiceFutureStub extends io.grpc.stub.AbstractStub<ActorServiceFutureStub> {
    private ActorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ActorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ActorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myflix.adapter.grpc.protofiles.actor.saveResponse> save(
        com.myflix.adapter.grpc.protofiles.actor.saveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myflix.adapter.grpc.protofiles.actor.deleteResponse> delete(
        com.myflix.adapter.grpc.protofiles.actor.deleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myflix.adapter.grpc.protofiles.actor.doCharacterResponse> doCharacter(
        com.myflix.adapter.grpc.protofiles.actor.doCharacterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDoCharacterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_GET_ALL = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_DO_CHARACTER = 4;
  private static final int METHODID_GET_CHARACTERS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ActorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ActorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE:
          serviceImpl.save((com.myflix.adapter.grpc.protofiles.actor.saveRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.saveResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.myflix.adapter.grpc.protofiles.actor.deleteRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.deleteResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.myflix.adapter.grpc.protofiles.actor.getAllRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.getAllResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.myflix.adapter.grpc.protofiles.actor.getRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.getResponse>) responseObserver);
          break;
        case METHODID_DO_CHARACTER:
          serviceImpl.doCharacter((com.myflix.adapter.grpc.protofiles.actor.doCharacterRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.doCharacterResponse>) responseObserver);
          break;
        case METHODID_GET_CHARACTERS:
          serviceImpl.getCharacters((com.myflix.adapter.grpc.protofiles.actor.getCharactersRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.actor.getCharactersResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ActorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ActorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.myflix.adapter.grpc.protofiles.actor.ActorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ActorService");
    }
  }

  private static final class ActorServiceFileDescriptorSupplier
      extends ActorServiceBaseDescriptorSupplier {
    ActorServiceFileDescriptorSupplier() {}
  }

  private static final class ActorServiceMethodDescriptorSupplier
      extends ActorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ActorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ActorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ActorServiceFileDescriptorSupplier())
              .addMethod(getSaveMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getGetMethod())
              .addMethod(getDoCharacterMethod())
              .addMethod(getGetCharactersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
