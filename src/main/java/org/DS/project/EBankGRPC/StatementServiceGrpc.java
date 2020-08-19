package org.DS.project.EBankGRPC;

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
    comments = "Source: statement.proto")
public final class StatementServiceGrpc {

  private StatementServiceGrpc() {}

  public static final String SERVICE_NAME = "EBankGRPC.StatementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty,
      org.DS.project.EBankGRPC.statementResp> getInitialSystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialSystem",
      requestType = org.DS.project.EBankGRPC.Empty.class,
      responseType = org.DS.project.EBankGRPC.statementResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty,
      org.DS.project.EBankGRPC.statementResp> getInitialSystemMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty, org.DS.project.EBankGRPC.statementResp> getInitialSystemMethod;
    if ((getInitialSystemMethod = StatementServiceGrpc.getInitialSystemMethod) == null) {
      synchronized (StatementServiceGrpc.class) {
        if ((getInitialSystemMethod = StatementServiceGrpc.getInitialSystemMethod) == null) {
          StatementServiceGrpc.getInitialSystemMethod = getInitialSystemMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.Empty, org.DS.project.EBankGRPC.statementResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.StatementService", "initialSystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.statementResp.getDefaultInstance()))
                  .setSchemaDescriptor(new StatementServiceMethodDescriptorSupplier("initialSystem"))
                  .build();
          }
        }
     }
     return getInitialSystemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest,
      org.DS.project.EBankGRPC.ValResponse> getChangeHelpfulMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeHelpful",
      requestType = org.DS.project.EBankGRPC.ValRequest.class,
      responseType = org.DS.project.EBankGRPC.ValResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest,
      org.DS.project.EBankGRPC.ValResponse> getChangeHelpfulMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest, org.DS.project.EBankGRPC.ValResponse> getChangeHelpfulMethod;
    if ((getChangeHelpfulMethod = StatementServiceGrpc.getChangeHelpfulMethod) == null) {
      synchronized (StatementServiceGrpc.class) {
        if ((getChangeHelpfulMethod = StatementServiceGrpc.getChangeHelpfulMethod) == null) {
          StatementServiceGrpc.getChangeHelpfulMethod = getChangeHelpfulMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.ValRequest, org.DS.project.EBankGRPC.ValResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.StatementService", "changeHelpful"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.ValRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.ValResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StatementServiceMethodDescriptorSupplier("changeHelpful"))
                  .build();
          }
        }
     }
     return getChangeHelpfulMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.BooleanReq,
      org.DS.project.EBankGRPC.BooleanRes> getOnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "onOff",
      requestType = org.DS.project.EBankGRPC.BooleanReq.class,
      responseType = org.DS.project.EBankGRPC.BooleanRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.BooleanReq,
      org.DS.project.EBankGRPC.BooleanRes> getOnOffMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.BooleanReq, org.DS.project.EBankGRPC.BooleanRes> getOnOffMethod;
    if ((getOnOffMethod = StatementServiceGrpc.getOnOffMethod) == null) {
      synchronized (StatementServiceGrpc.class) {
        if ((getOnOffMethod = StatementServiceGrpc.getOnOffMethod) == null) {
          StatementServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.BooleanReq, org.DS.project.EBankGRPC.BooleanRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.StatementService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.BooleanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.BooleanRes.getDefaultInstance()))
                  .setSchemaDescriptor(new StatementServiceMethodDescriptorSupplier("onOff"))
                  .build();
          }
        }
     }
     return getOnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.BooleanReq,
      org.DS.project.EBankGRPC.BooleanRes> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "stop",
      requestType = org.DS.project.EBankGRPC.BooleanReq.class,
      responseType = org.DS.project.EBankGRPC.BooleanRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.BooleanReq,
      org.DS.project.EBankGRPC.BooleanRes> getStopMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.BooleanReq, org.DS.project.EBankGRPC.BooleanRes> getStopMethod;
    if ((getStopMethod = StatementServiceGrpc.getStopMethod) == null) {
      synchronized (StatementServiceGrpc.class) {
        if ((getStopMethod = StatementServiceGrpc.getStopMethod) == null) {
          StatementServiceGrpc.getStopMethod = getStopMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.BooleanReq, org.DS.project.EBankGRPC.BooleanRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.StatementService", "stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.BooleanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.BooleanRes.getDefaultInstance()))
                  .setSchemaDescriptor(new StatementServiceMethodDescriptorSupplier("stop"))
                  .build();
          }
        }
     }
     return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest,
      org.DS.project.EBankGRPC.StringResponse> getChangeSystemNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeSystemName",
      requestType = org.DS.project.EBankGRPC.StringRequest.class,
      responseType = org.DS.project.EBankGRPC.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest,
      org.DS.project.EBankGRPC.StringResponse> getChangeSystemNameMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest, org.DS.project.EBankGRPC.StringResponse> getChangeSystemNameMethod;
    if ((getChangeSystemNameMethod = StatementServiceGrpc.getChangeSystemNameMethod) == null) {
      synchronized (StatementServiceGrpc.class) {
        if ((getChangeSystemNameMethod = StatementServiceGrpc.getChangeSystemNameMethod) == null) {
          StatementServiceGrpc.getChangeSystemNameMethod = getChangeSystemNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.StringRequest, org.DS.project.EBankGRPC.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.StatementService", "changeSystemName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StatementServiceMethodDescriptorSupplier("changeSystemName"))
                  .build();
          }
        }
     }
     return getChangeSystemNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StatementServiceStub newStub(io.grpc.Channel channel) {
    return new StatementServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StatementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StatementServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StatementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StatementServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StatementServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialSystem(org.DS.project.EBankGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.statementResp> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialSystemMethod(), responseObserver);
    }

    /**
     */
    public void changeHelpful(org.DS.project.EBankGRPC.ValRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeHelpfulMethod(), responseObserver);
    }

    /**
     */
    public void onOff(org.DS.project.EBankGRPC.BooleanReq request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.BooleanRes> responseObserver) {
      asyncUnimplementedUnaryCall(getOnOffMethod(), responseObserver);
    }

    /**
     */
    public void stop(org.DS.project.EBankGRPC.BooleanReq request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.BooleanRes> responseObserver) {
      asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     */
    public void changeSystemName(org.DS.project.EBankGRPC.StringRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeSystemNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialSystemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.Empty,
                org.DS.project.EBankGRPC.statementResp>(
                  this, METHODID_INITIAL_SYSTEM)))
          .addMethod(
            getChangeHelpfulMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.ValRequest,
                org.DS.project.EBankGRPC.ValResponse>(
                  this, METHODID_CHANGE_HELPFUL)))
          .addMethod(
            getOnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.BooleanReq,
                org.DS.project.EBankGRPC.BooleanRes>(
                  this, METHODID_ON_OFF)))
          .addMethod(
            getStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.BooleanReq,
                org.DS.project.EBankGRPC.BooleanRes>(
                  this, METHODID_STOP)))
          .addMethod(
            getChangeSystemNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.StringRequest,
                org.DS.project.EBankGRPC.StringResponse>(
                  this, METHODID_CHANGE_SYSTEM_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class StatementServiceStub extends io.grpc.stub.AbstractStub<StatementServiceStub> {
    private StatementServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StatementServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatementServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StatementServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialSystem(org.DS.project.EBankGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.statementResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialSystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeHelpful(org.DS.project.EBankGRPC.ValRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeHelpfulMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onOff(org.DS.project.EBankGRPC.BooleanReq request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.BooleanRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stop(org.DS.project.EBankGRPC.BooleanReq request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.BooleanRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeSystemName(org.DS.project.EBankGRPC.StringRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeSystemNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StatementServiceBlockingStub extends io.grpc.stub.AbstractStub<StatementServiceBlockingStub> {
    private StatementServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StatementServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatementServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StatementServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.project.EBankGRPC.statementResp initialSystem(org.DS.project.EBankGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialSystemMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.project.EBankGRPC.ValResponse> changeHelpful(
        org.DS.project.EBankGRPC.ValRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeHelpfulMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.BooleanRes onOff(org.DS.project.EBankGRPC.BooleanReq request) {
      return blockingUnaryCall(
          getChannel(), getOnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.BooleanRes stop(org.DS.project.EBankGRPC.BooleanReq request) {
      return blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.StringResponse changeSystemName(org.DS.project.EBankGRPC.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeSystemNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StatementServiceFutureStub extends io.grpc.stub.AbstractStub<StatementServiceFutureStub> {
    private StatementServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StatementServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatementServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StatementServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.statementResp> initialSystem(
        org.DS.project.EBankGRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialSystemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.BooleanRes> onOff(
        org.DS.project.EBankGRPC.BooleanReq request) {
      return futureUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.BooleanRes> stop(
        org.DS.project.EBankGRPC.BooleanReq request) {
      return futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.StringResponse> changeSystemName(
        org.DS.project.EBankGRPC.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeSystemNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_SYSTEM = 0;
  private static final int METHODID_CHANGE_HELPFUL = 1;
  private static final int METHODID_ON_OFF = 2;
  private static final int METHODID_STOP = 3;
  private static final int METHODID_CHANGE_SYSTEM_NAME = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StatementServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StatementServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_SYSTEM:
          serviceImpl.initialSystem((org.DS.project.EBankGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.statementResp>) responseObserver);
          break;
        case METHODID_CHANGE_HELPFUL:
          serviceImpl.changeHelpful((org.DS.project.EBankGRPC.ValRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse>) responseObserver);
          break;
        case METHODID_ON_OFF:
          serviceImpl.onOff((org.DS.project.EBankGRPC.BooleanReq) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.BooleanRes>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((org.DS.project.EBankGRPC.BooleanReq) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.BooleanRes>) responseObserver);
          break;
        case METHODID_CHANGE_SYSTEM_NAME:
          serviceImpl.changeSystemName((org.DS.project.EBankGRPC.StringRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.StringResponse>) responseObserver);
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

  private static abstract class StatementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StatementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.project.EBankGRPC.StatementServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StatementService");
    }
  }

  private static final class StatementServiceFileDescriptorSupplier
      extends StatementServiceBaseDescriptorSupplier {
    StatementServiceFileDescriptorSupplier() {}
  }

  private static final class StatementServiceMethodDescriptorSupplier
      extends StatementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StatementServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StatementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StatementServiceFileDescriptorSupplier())
              .addMethod(getInitialSystemMethod())
              .addMethod(getChangeHelpfulMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getStopMethod())
              .addMethod(getChangeSystemNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
