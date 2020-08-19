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
    comments = "Source: dd.proto")
public final class DDServiceGrpc {

  private DDServiceGrpc() {}

  public static final String SERVICE_NAME = "EBankGRPC.DDService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty,
      org.DS.project.EBankGRPC.ddResp> getInitialDDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialDD",
      requestType = org.DS.project.EBankGRPC.Empty.class,
      responseType = org.DS.project.EBankGRPC.ddResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty,
      org.DS.project.EBankGRPC.ddResp> getInitialDDMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty, org.DS.project.EBankGRPC.ddResp> getInitialDDMethod;
    if ((getInitialDDMethod = DDServiceGrpc.getInitialDDMethod) == null) {
      synchronized (DDServiceGrpc.class) {
        if ((getInitialDDMethod = DDServiceGrpc.getInitialDDMethod) == null) {
          DDServiceGrpc.getInitialDDMethod = getInitialDDMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.Empty, org.DS.project.EBankGRPC.ddResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.DDService", "initialDD"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.ddResp.getDefaultInstance()))
                  .setSchemaDescriptor(new DDServiceMethodDescriptorSupplier("initialDD"))
                  .build();
          }
        }
     }
     return getInitialDDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest,
      org.DS.project.EBankGRPC.ValResponse> getChangeAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeAmount",
      requestType = org.DS.project.EBankGRPC.ValRequest.class,
      responseType = org.DS.project.EBankGRPC.ValResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest,
      org.DS.project.EBankGRPC.ValResponse> getChangeAmountMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest, org.DS.project.EBankGRPC.ValResponse> getChangeAmountMethod;
    if ((getChangeAmountMethod = DDServiceGrpc.getChangeAmountMethod) == null) {
      synchronized (DDServiceGrpc.class) {
        if ((getChangeAmountMethod = DDServiceGrpc.getChangeAmountMethod) == null) {
          DDServiceGrpc.getChangeAmountMethod = getChangeAmountMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.ValRequest, org.DS.project.EBankGRPC.ValResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.DDService", "changeAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.ValRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.ValResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DDServiceMethodDescriptorSupplier("changeAmount"))
                  .build();
          }
        }
     }
     return getChangeAmountMethod;
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
    if ((getOnOffMethod = DDServiceGrpc.getOnOffMethod) == null) {
      synchronized (DDServiceGrpc.class) {
        if ((getOnOffMethod = DDServiceGrpc.getOnOffMethod) == null) {
          DDServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.BooleanReq, org.DS.project.EBankGRPC.BooleanRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.DDService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.BooleanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.BooleanRes.getDefaultInstance()))
                  .setSchemaDescriptor(new DDServiceMethodDescriptorSupplier("onOff"))
                  .build();
          }
        }
     }
     return getOnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest,
      org.DS.project.EBankGRPC.StringResponse> getChangeDirectDebitNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeDirectDebitName",
      requestType = org.DS.project.EBankGRPC.StringRequest.class,
      responseType = org.DS.project.EBankGRPC.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest,
      org.DS.project.EBankGRPC.StringResponse> getChangeDirectDebitNameMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest, org.DS.project.EBankGRPC.StringResponse> getChangeDirectDebitNameMethod;
    if ((getChangeDirectDebitNameMethod = DDServiceGrpc.getChangeDirectDebitNameMethod) == null) {
      synchronized (DDServiceGrpc.class) {
        if ((getChangeDirectDebitNameMethod = DDServiceGrpc.getChangeDirectDebitNameMethod) == null) {
          DDServiceGrpc.getChangeDirectDebitNameMethod = getChangeDirectDebitNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.StringRequest, org.DS.project.EBankGRPC.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.DDService", "changeDirectDebitName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DDServiceMethodDescriptorSupplier("changeDirectDebitName"))
                  .build();
          }
        }
     }
     return getChangeDirectDebitNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DDServiceStub newStub(io.grpc.Channel channel) {
    return new DDServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DDServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DDServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DDServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DDServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DDServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialDD(org.DS.project.EBankGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ddResp> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialDDMethod(), responseObserver);
    }

    /**
     */
    public void changeAmount(org.DS.project.EBankGRPC.ValRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeAmountMethod(), responseObserver);
    }

    /**
     */
    public void onOff(org.DS.project.EBankGRPC.BooleanReq request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.BooleanRes> responseObserver) {
      asyncUnimplementedUnaryCall(getOnOffMethod(), responseObserver);
    }

    /**
     */
    public void changeDirectDebitName(org.DS.project.EBankGRPC.StringRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeDirectDebitNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialDDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.Empty,
                org.DS.project.EBankGRPC.ddResp>(
                  this, METHODID_INITIAL_DD)))
          .addMethod(
            getChangeAmountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.ValRequest,
                org.DS.project.EBankGRPC.ValResponse>(
                  this, METHODID_CHANGE_AMOUNT)))
          .addMethod(
            getOnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.BooleanReq,
                org.DS.project.EBankGRPC.BooleanRes>(
                  this, METHODID_ON_OFF)))
          .addMethod(
            getChangeDirectDebitNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.StringRequest,
                org.DS.project.EBankGRPC.StringResponse>(
                  this, METHODID_CHANGE_DIRECT_DEBIT_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class DDServiceStub extends io.grpc.stub.AbstractStub<DDServiceStub> {
    private DDServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DDServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DDServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DDServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialDD(org.DS.project.EBankGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ddResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialDDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeAmount(org.DS.project.EBankGRPC.ValRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeAmountMethod(), getCallOptions()), request, responseObserver);
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
    public void changeDirectDebitName(org.DS.project.EBankGRPC.StringRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeDirectDebitNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DDServiceBlockingStub extends io.grpc.stub.AbstractStub<DDServiceBlockingStub> {
    private DDServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DDServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DDServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DDServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.project.EBankGRPC.ddResp initialDD(org.DS.project.EBankGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialDDMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.ValResponse changeAmount(org.DS.project.EBankGRPC.ValRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeAmountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.BooleanRes onOff(org.DS.project.EBankGRPC.BooleanReq request) {
      return blockingUnaryCall(
          getChannel(), getOnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.StringResponse changeDirectDebitName(org.DS.project.EBankGRPC.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeDirectDebitNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DDServiceFutureStub extends io.grpc.stub.AbstractStub<DDServiceFutureStub> {
    private DDServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DDServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DDServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DDServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.ddResp> initialDD(
        org.DS.project.EBankGRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialDDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.ValResponse> changeAmount(
        org.DS.project.EBankGRPC.ValRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeAmountMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.StringResponse> changeDirectDebitName(
        org.DS.project.EBankGRPC.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeDirectDebitNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_DD = 0;
  private static final int METHODID_CHANGE_AMOUNT = 1;
  private static final int METHODID_ON_OFF = 2;
  private static final int METHODID_CHANGE_DIRECT_DEBIT_NAME = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DDServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DDServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_DD:
          serviceImpl.initialDD((org.DS.project.EBankGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ddResp>) responseObserver);
          break;
        case METHODID_CHANGE_AMOUNT:
          serviceImpl.changeAmount((org.DS.project.EBankGRPC.ValRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse>) responseObserver);
          break;
        case METHODID_ON_OFF:
          serviceImpl.onOff((org.DS.project.EBankGRPC.BooleanReq) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.BooleanRes>) responseObserver);
          break;
        case METHODID_CHANGE_DIRECT_DEBIT_NAME:
          serviceImpl.changeDirectDebitName((org.DS.project.EBankGRPC.StringRequest) request,
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

  private static abstract class DDServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DDServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.project.EBankGRPC.DDServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DDService");
    }
  }

  private static final class DDServiceFileDescriptorSupplier
      extends DDServiceBaseDescriptorSupplier {
    DDServiceFileDescriptorSupplier() {}
  }

  private static final class DDServiceMethodDescriptorSupplier
      extends DDServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DDServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DDServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DDServiceFileDescriptorSupplier())
              .addMethod(getInitialDDMethod())
              .addMethod(getChangeAmountMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeDirectDebitNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
