package com.myflix.adapter.grpc.protofiles.movie;

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
    comments = "Source: Movie.proto")
public final class MovieServiceGrpc {

  private MovieServiceGrpc() {}

  public static final String SERVICE_NAME = "MovieService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.saveRequest,
      com.myflix.adapter.grpc.protofiles.movie.saveResponse> getSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "save",
      requestType = com.myflix.adapter.grpc.protofiles.movie.saveRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.movie.saveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.saveRequest,
      com.myflix.adapter.grpc.protofiles.movie.saveResponse> getSaveMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.saveRequest, com.myflix.adapter.grpc.protofiles.movie.saveResponse> getSaveMethod;
    if ((getSaveMethod = MovieServiceGrpc.getSaveMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getSaveMethod = MovieServiceGrpc.getSaveMethod) == null) {
          MovieServiceGrpc.getSaveMethod = getSaveMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.movie.saveRequest, com.myflix.adapter.grpc.protofiles.movie.saveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MovieService", "save"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.movie.saveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.movie.saveResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("save"))
                  .build();
          }
        }
     }
     return getSaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.deleteRequest,
      com.myflix.adapter.grpc.protofiles.movie.deleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = com.myflix.adapter.grpc.protofiles.movie.deleteRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.movie.deleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.deleteRequest,
      com.myflix.adapter.grpc.protofiles.movie.deleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.deleteRequest, com.myflix.adapter.grpc.protofiles.movie.deleteResponse> getDeleteMethod;
    if ((getDeleteMethod = MovieServiceGrpc.getDeleteMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getDeleteMethod = MovieServiceGrpc.getDeleteMethod) == null) {
          MovieServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.movie.deleteRequest, com.myflix.adapter.grpc.protofiles.movie.deleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MovieService", "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.movie.deleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.movie.deleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.getAllRequest,
      com.myflix.adapter.grpc.protofiles.movie.getAllResponse> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = com.myflix.adapter.grpc.protofiles.movie.getAllRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.movie.getAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.getAllRequest,
      com.myflix.adapter.grpc.protofiles.movie.getAllResponse> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.getAllRequest, com.myflix.adapter.grpc.protofiles.movie.getAllResponse> getGetAllMethod;
    if ((getGetAllMethod = MovieServiceGrpc.getGetAllMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetAllMethod = MovieServiceGrpc.getGetAllMethod) == null) {
          MovieServiceGrpc.getGetAllMethod = getGetAllMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.movie.getAllRequest, com.myflix.adapter.grpc.protofiles.movie.getAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "MovieService", "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.movie.getAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.movie.getAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("getAll"))
                  .build();
          }
        }
     }
     return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.getRequest,
      com.myflix.adapter.grpc.protofiles.movie.getResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.myflix.adapter.grpc.protofiles.movie.getRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.movie.getResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.getRequest,
      com.myflix.adapter.grpc.protofiles.movie.getResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.getRequest, com.myflix.adapter.grpc.protofiles.movie.getResponse> getGetMethod;
    if ((getGetMethod = MovieServiceGrpc.getGetMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetMethod = MovieServiceGrpc.getGetMethod) == null) {
          MovieServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.movie.getRequest, com.myflix.adapter.grpc.protofiles.movie.getResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "MovieService", "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.movie.getRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.movie.getResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.getCharactersRequest,
      com.myflix.adapter.grpc.protofiles.movie.getCharactersResponse> getWatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "watch",
      requestType = com.myflix.adapter.grpc.protofiles.movie.getCharactersRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.movie.getCharactersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.getCharactersRequest,
      com.myflix.adapter.grpc.protofiles.movie.getCharactersResponse> getWatchMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.getCharactersRequest, com.myflix.adapter.grpc.protofiles.movie.getCharactersResponse> getWatchMethod;
    if ((getWatchMethod = MovieServiceGrpc.getWatchMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getWatchMethod = MovieServiceGrpc.getWatchMethod) == null) {
          MovieServiceGrpc.getWatchMethod = getWatchMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.movie.getCharactersRequest, com.myflix.adapter.grpc.protofiles.movie.getCharactersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "MovieService", "watch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.movie.getCharactersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.movie.getCharactersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("watch"))
                  .build();
          }
        }
     }
     return getWatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedRequest,
      com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedResponse> getGetMoviesWatchedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMoviesWatched",
      requestType = com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedRequest,
      com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedResponse> getGetMoviesWatchedMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedRequest, com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedResponse> getGetMoviesWatchedMethod;
    if ((getGetMoviesWatchedMethod = MovieServiceGrpc.getGetMoviesWatchedMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetMoviesWatchedMethod = MovieServiceGrpc.getGetMoviesWatchedMethod) == null) {
          MovieServiceGrpc.getGetMoviesWatchedMethod = getGetMoviesWatchedMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedRequest, com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "MovieService", "getMoviesWatched"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("getMoviesWatched"))
                  .build();
          }
        }
     }
     return getGetMoviesWatchedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MovieServiceStub newStub(io.grpc.Channel channel) {
    return new MovieServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MovieServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MovieServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MovieServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MovieServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MovieServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void save(com.myflix.adapter.grpc.protofiles.movie.saveRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.saveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.myflix.adapter.grpc.protofiles.movie.deleteRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.deleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void getAll(com.myflix.adapter.grpc.protofiles.movie.getAllRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.getAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void get(com.myflix.adapter.grpc.protofiles.movie.getRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.getResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void watch(com.myflix.adapter.grpc.protofiles.movie.getCharactersRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.getCharactersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchMethod(), responseObserver);
    }

    /**
     */
    public void getMoviesWatched(com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMoviesWatchedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.movie.saveRequest,
                com.myflix.adapter.grpc.protofiles.movie.saveResponse>(
                  this, METHODID_SAVE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.movie.deleteRequest,
                com.myflix.adapter.grpc.protofiles.movie.deleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.movie.getAllRequest,
                com.myflix.adapter.grpc.protofiles.movie.getAllResponse>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.movie.getRequest,
                com.myflix.adapter.grpc.protofiles.movie.getResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getWatchMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.movie.getCharactersRequest,
                com.myflix.adapter.grpc.protofiles.movie.getCharactersResponse>(
                  this, METHODID_WATCH)))
          .addMethod(
            getGetMoviesWatchedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedRequest,
                com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedResponse>(
                  this, METHODID_GET_MOVIES_WATCHED)))
          .build();
    }
  }

  /**
   */
  public static final class MovieServiceStub extends io.grpc.stub.AbstractStub<MovieServiceStub> {
    private MovieServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MovieServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MovieServiceStub(channel, callOptions);
    }

    /**
     */
    public void save(com.myflix.adapter.grpc.protofiles.movie.saveRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.saveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.myflix.adapter.grpc.protofiles.movie.deleteRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.deleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.myflix.adapter.grpc.protofiles.movie.getAllRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.getAllResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(com.myflix.adapter.grpc.protofiles.movie.getRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.getResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void watch(com.myflix.adapter.grpc.protofiles.movie.getCharactersRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.getCharactersResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMoviesWatched(com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMoviesWatchedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MovieServiceBlockingStub extends io.grpc.stub.AbstractStub<MovieServiceBlockingStub> {
    private MovieServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MovieServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MovieServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.myflix.adapter.grpc.protofiles.movie.saveResponse save(com.myflix.adapter.grpc.protofiles.movie.saveRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.myflix.adapter.grpc.protofiles.movie.deleteResponse delete(com.myflix.adapter.grpc.protofiles.movie.deleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.myflix.adapter.grpc.protofiles.movie.getAllResponse> getAll(
        com.myflix.adapter.grpc.protofiles.movie.getAllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.myflix.adapter.grpc.protofiles.movie.getResponse> get(
        com.myflix.adapter.grpc.protofiles.movie.getRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.myflix.adapter.grpc.protofiles.movie.getCharactersResponse> watch(
        com.myflix.adapter.grpc.protofiles.movie.getCharactersRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedResponse> getMoviesWatched(
        com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMoviesWatchedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MovieServiceFutureStub extends io.grpc.stub.AbstractStub<MovieServiceFutureStub> {
    private MovieServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MovieServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MovieServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myflix.adapter.grpc.protofiles.movie.saveResponse> save(
        com.myflix.adapter.grpc.protofiles.movie.saveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myflix.adapter.grpc.protofiles.movie.deleteResponse> delete(
        com.myflix.adapter.grpc.protofiles.movie.deleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_GET_ALL = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_WATCH = 4;
  private static final int METHODID_GET_MOVIES_WATCHED = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MovieServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MovieServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE:
          serviceImpl.save((com.myflix.adapter.grpc.protofiles.movie.saveRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.saveResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.myflix.adapter.grpc.protofiles.movie.deleteRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.deleteResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.myflix.adapter.grpc.protofiles.movie.getAllRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.getAllResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.myflix.adapter.grpc.protofiles.movie.getRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.getResponse>) responseObserver);
          break;
        case METHODID_WATCH:
          serviceImpl.watch((com.myflix.adapter.grpc.protofiles.movie.getCharactersRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.getCharactersResponse>) responseObserver);
          break;
        case METHODID_GET_MOVIES_WATCHED:
          serviceImpl.getMoviesWatched((com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.movie.getMoviesWatchedResponse>) responseObserver);
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

  private static abstract class MovieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MovieServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.myflix.adapter.grpc.protofiles.movie.MovieProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MovieService");
    }
  }

  private static final class MovieServiceFileDescriptorSupplier
      extends MovieServiceBaseDescriptorSupplier {
    MovieServiceFileDescriptorSupplier() {}
  }

  private static final class MovieServiceMethodDescriptorSupplier
      extends MovieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MovieServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MovieServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MovieServiceFileDescriptorSupplier())
              .addMethod(getSaveMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getGetMethod())
              .addMethod(getWatchMethod())
              .addMethod(getGetMoviesWatchedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
