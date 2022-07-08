package com.myflix.adapter.grpc.protofiles.customer;

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
    comments = "Source: Customer.proto")
public final class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final String SERVICE_NAME = "CustomerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.saveRequest,
      com.myflix.adapter.grpc.protofiles.customer.saveResponse> getSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "save",
      requestType = com.myflix.adapter.grpc.protofiles.customer.saveRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.customer.saveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.saveRequest,
      com.myflix.adapter.grpc.protofiles.customer.saveResponse> getSaveMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.saveRequest, com.myflix.adapter.grpc.protofiles.customer.saveResponse> getSaveMethod;
    if ((getSaveMethod = CustomerServiceGrpc.getSaveMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getSaveMethod = CustomerServiceGrpc.getSaveMethod) == null) {
          CustomerServiceGrpc.getSaveMethod = getSaveMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.customer.saveRequest, com.myflix.adapter.grpc.protofiles.customer.saveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerService", "save"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.customer.saveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.customer.saveResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("save"))
                  .build();
          }
        }
     }
     return getSaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.deleteRequest,
      com.myflix.adapter.grpc.protofiles.customer.deleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = com.myflix.adapter.grpc.protofiles.customer.deleteRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.customer.deleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.deleteRequest,
      com.myflix.adapter.grpc.protofiles.customer.deleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.deleteRequest, com.myflix.adapter.grpc.protofiles.customer.deleteResponse> getDeleteMethod;
    if ((getDeleteMethod = CustomerServiceGrpc.getDeleteMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getDeleteMethod = CustomerServiceGrpc.getDeleteMethod) == null) {
          CustomerServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.customer.deleteRequest, com.myflix.adapter.grpc.protofiles.customer.deleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerService", "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.customer.deleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.customer.deleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.getAllRequest,
      com.myflix.adapter.grpc.protofiles.customer.getAllResponse> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = com.myflix.adapter.grpc.protofiles.customer.getAllRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.customer.getAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.getAllRequest,
      com.myflix.adapter.grpc.protofiles.customer.getAllResponse> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.getAllRequest, com.myflix.adapter.grpc.protofiles.customer.getAllResponse> getGetAllMethod;
    if ((getGetAllMethod = CustomerServiceGrpc.getGetAllMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetAllMethod = CustomerServiceGrpc.getGetAllMethod) == null) {
          CustomerServiceGrpc.getGetAllMethod = getGetAllMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.customer.getAllRequest, com.myflix.adapter.grpc.protofiles.customer.getAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CustomerService", "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.customer.getAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.customer.getAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("getAll"))
                  .build();
          }
        }
     }
     return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.getRequest,
      com.myflix.adapter.grpc.protofiles.customer.getResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.myflix.adapter.grpc.protofiles.customer.getRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.customer.getResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.getRequest,
      com.myflix.adapter.grpc.protofiles.customer.getResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.getRequest, com.myflix.adapter.grpc.protofiles.customer.getResponse> getGetMethod;
    if ((getGetMethod = CustomerServiceGrpc.getGetMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetMethod = CustomerServiceGrpc.getGetMethod) == null) {
          CustomerServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.customer.getRequest, com.myflix.adapter.grpc.protofiles.customer.getResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CustomerService", "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.customer.getRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.customer.getResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.watchRequest,
      com.myflix.adapter.grpc.protofiles.customer.watchResponse> getWatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "watch",
      requestType = com.myflix.adapter.grpc.protofiles.customer.watchRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.customer.watchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.watchRequest,
      com.myflix.adapter.grpc.protofiles.customer.watchResponse> getWatchMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.watchRequest, com.myflix.adapter.grpc.protofiles.customer.watchResponse> getWatchMethod;
    if ((getWatchMethod = CustomerServiceGrpc.getWatchMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getWatchMethod = CustomerServiceGrpc.getWatchMethod) == null) {
          CustomerServiceGrpc.getWatchMethod = getWatchMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.customer.watchRequest, com.myflix.adapter.grpc.protofiles.customer.watchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerService", "watch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.customer.watchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.customer.watchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("watch"))
                  .build();
          }
        }
     }
     return getWatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedRequest,
      com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedResponse> getGetMoviesWatchedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMoviesWatched",
      requestType = com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedRequest.class,
      responseType = com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedRequest,
      com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedResponse> getGetMoviesWatchedMethod() {
    io.grpc.MethodDescriptor<com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedRequest, com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedResponse> getGetMoviesWatchedMethod;
    if ((getGetMoviesWatchedMethod = CustomerServiceGrpc.getGetMoviesWatchedMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetMoviesWatchedMethod = CustomerServiceGrpc.getGetMoviesWatchedMethod) == null) {
          CustomerServiceGrpc.getGetMoviesWatchedMethod = getGetMoviesWatchedMethod = 
              io.grpc.MethodDescriptor.<com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedRequest, com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CustomerService", "getMoviesWatched"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("getMoviesWatched"))
                  .build();
          }
        }
     }
     return getGetMoviesWatchedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CustomerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void save(com.myflix.adapter.grpc.protofiles.customer.saveRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.saveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.myflix.adapter.grpc.protofiles.customer.deleteRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.deleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void getAll(com.myflix.adapter.grpc.protofiles.customer.getAllRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.getAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void get(com.myflix.adapter.grpc.protofiles.customer.getRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.getResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void watch(com.myflix.adapter.grpc.protofiles.customer.watchRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.watchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchMethod(), responseObserver);
    }

    /**
     */
    public void getMoviesWatched(com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMoviesWatchedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.customer.saveRequest,
                com.myflix.adapter.grpc.protofiles.customer.saveResponse>(
                  this, METHODID_SAVE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.customer.deleteRequest,
                com.myflix.adapter.grpc.protofiles.customer.deleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.customer.getAllRequest,
                com.myflix.adapter.grpc.protofiles.customer.getAllResponse>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.customer.getRequest,
                com.myflix.adapter.grpc.protofiles.customer.getResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getWatchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.customer.watchRequest,
                com.myflix.adapter.grpc.protofiles.customer.watchResponse>(
                  this, METHODID_WATCH)))
          .addMethod(
            getGetMoviesWatchedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedRequest,
                com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedResponse>(
                  this, METHODID_GET_MOVIES_WATCHED)))
          .build();
    }
  }

  /**
   */
  public static final class CustomerServiceStub extends io.grpc.stub.AbstractStub<CustomerServiceStub> {
    private CustomerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceStub(channel, callOptions);
    }

    /**
     */
    public void save(com.myflix.adapter.grpc.protofiles.customer.saveRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.saveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.myflix.adapter.grpc.protofiles.customer.deleteRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.deleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.myflix.adapter.grpc.protofiles.customer.getAllRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.getAllResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(com.myflix.adapter.grpc.protofiles.customer.getRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.getResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void watch(com.myflix.adapter.grpc.protofiles.customer.watchRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.watchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMoviesWatched(com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedRequest request,
        io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMoviesWatchedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CustomerServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerServiceBlockingStub> {
    private CustomerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.myflix.adapter.grpc.protofiles.customer.saveResponse save(com.myflix.adapter.grpc.protofiles.customer.saveRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.myflix.adapter.grpc.protofiles.customer.deleteResponse delete(com.myflix.adapter.grpc.protofiles.customer.deleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.myflix.adapter.grpc.protofiles.customer.getAllResponse> getAll(
        com.myflix.adapter.grpc.protofiles.customer.getAllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.myflix.adapter.grpc.protofiles.customer.getResponse> get(
        com.myflix.adapter.grpc.protofiles.customer.getRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.myflix.adapter.grpc.protofiles.customer.watchResponse watch(com.myflix.adapter.grpc.protofiles.customer.watchRequest request) {
      return blockingUnaryCall(
          getChannel(), getWatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedResponse> getMoviesWatched(
        com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMoviesWatchedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CustomerServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerServiceFutureStub> {
    private CustomerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myflix.adapter.grpc.protofiles.customer.saveResponse> save(
        com.myflix.adapter.grpc.protofiles.customer.saveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myflix.adapter.grpc.protofiles.customer.deleteResponse> delete(
        com.myflix.adapter.grpc.protofiles.customer.deleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myflix.adapter.grpc.protofiles.customer.watchResponse> watch(
        com.myflix.adapter.grpc.protofiles.customer.watchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWatchMethod(), getCallOptions()), request);
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
    private final CustomerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE:
          serviceImpl.save((com.myflix.adapter.grpc.protofiles.customer.saveRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.saveResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.myflix.adapter.grpc.protofiles.customer.deleteRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.deleteResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.myflix.adapter.grpc.protofiles.customer.getAllRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.getAllResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.myflix.adapter.grpc.protofiles.customer.getRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.getResponse>) responseObserver);
          break;
        case METHODID_WATCH:
          serviceImpl.watch((com.myflix.adapter.grpc.protofiles.customer.watchRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.watchResponse>) responseObserver);
          break;
        case METHODID_GET_MOVIES_WATCHED:
          serviceImpl.getMoviesWatched((com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedRequest) request,
              (io.grpc.stub.StreamObserver<com.myflix.adapter.grpc.protofiles.customer.getMoviesWatchedResponse>) responseObserver);
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

  private static abstract class CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.myflix.adapter.grpc.protofiles.customer.CustomerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerService");
    }
  }

  private static final class CustomerServiceFileDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier {
    CustomerServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerServiceMethodDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerServiceFileDescriptorSupplier())
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
