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
    comments = "Source: phone.proto")
public final class PhoneServiceGrpc {

  private PhoneServiceGrpc() {}

  public static final String SERVICE_NAME = "EBankGRPC.PhoneService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty,
      org.DS.project.EBankGRPC.phoneResp> getInitialPhoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialPhone",
      requestType = org.DS.project.EBankGRPC.Empty.class,
      responseType = org.DS.project.EBankGRPC.phoneResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty,
      org.DS.project.EBankGRPC.phoneResp> getInitialPhoneMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty, org.DS.project.EBankGRPC.phoneResp> getInitialPhoneMethod;
    if ((getInitialPhoneMethod = PhoneServiceGrpc.getInitialPhoneMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getInitialPhoneMethod = PhoneServiceGrpc.getInitialPhoneMethod) == null) {
          PhoneServiceGrpc.getInitialPhoneMethod = getInitialPhoneMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.Empty, org.DS.project.EBankGRPC.phoneResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.PhoneService", "initialPhone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.phoneResp.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("initialPhone"))
                  .build();
          }
        }
     }
     return getInitialPhoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest,
      org.DS.project.EBankGRPC.StringResponse> getChangeApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeApplication",
      requestType = org.DS.project.EBankGRPC.StringRequest.class,
      responseType = org.DS.project.EBankGRPC.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest,
      org.DS.project.EBankGRPC.StringResponse> getChangeApplicationMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest, org.DS.project.EBankGRPC.StringResponse> getChangeApplicationMethod;
    if ((getChangeApplicationMethod = PhoneServiceGrpc.getChangeApplicationMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getChangeApplicationMethod = PhoneServiceGrpc.getChangeApplicationMethod) == null) {
          PhoneServiceGrpc.getChangeApplicationMethod = getChangeApplicationMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.StringRequest, org.DS.project.EBankGRPC.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.PhoneService", "changeApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("changeApplication"))
                  .build();
          }
        }
     }
     return getChangeApplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest,
      org.DS.project.EBankGRPC.ValResponse> getChangeBatteryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeBattery",
      requestType = org.DS.project.EBankGRPC.ValRequest.class,
      responseType = org.DS.project.EBankGRPC.ValResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest,
      org.DS.project.EBankGRPC.ValResponse> getChangeBatteryMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest, org.DS.project.EBankGRPC.ValResponse> getChangeBatteryMethod;
    if ((getChangeBatteryMethod = PhoneServiceGrpc.getChangeBatteryMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getChangeBatteryMethod = PhoneServiceGrpc.getChangeBatteryMethod) == null) {
          PhoneServiceGrpc.getChangeBatteryMethod = getChangeBatteryMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.ValRequest, org.DS.project.EBankGRPC.ValResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.PhoneService", "changeBattery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.ValRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.ValResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("changeBattery"))
                  .build();
          }
        }
     }
     return getChangeBatteryMethod;
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
    if ((getOnOffMethod = PhoneServiceGrpc.getOnOffMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getOnOffMethod = PhoneServiceGrpc.getOnOffMethod) == null) {
          PhoneServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.BooleanReq, org.DS.project.EBankGRPC.BooleanRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.PhoneService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.BooleanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.BooleanRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("onOff"))
                  .build();
          }
        }
     }
     return getOnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest,
      org.DS.project.EBankGRPC.StringResponse> getChangePhoneNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changePhoneName",
      requestType = org.DS.project.EBankGRPC.StringRequest.class,
      responseType = org.DS.project.EBankGRPC.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest,
      org.DS.project.EBankGRPC.StringResponse> getChangePhoneNameMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest, org.DS.project.EBankGRPC.StringResponse> getChangePhoneNameMethod;
    if ((getChangePhoneNameMethod = PhoneServiceGrpc.getChangePhoneNameMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getChangePhoneNameMethod = PhoneServiceGrpc.getChangePhoneNameMethod) == null) {
          PhoneServiceGrpc.getChangePhoneNameMethod = getChangePhoneNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.StringRequest, org.DS.project.EBankGRPC.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.PhoneService", "changePhoneName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("changePhoneName"))
                  .build();
          }
        }
     }
     return getChangePhoneNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PhoneServiceStub newStub(io.grpc.Channel channel) {
    return new PhoneServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PhoneServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PhoneServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PhoneServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PhoneServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PhoneServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialPhone(org.DS.project.EBankGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.phoneResp> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialPhoneMethod(), responseObserver);
    }

    /**
     */
    public void changeApplication(org.DS.project.EBankGRPC.StringRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeApplicationMethod(), responseObserver);
    }

    /**
     */
    public void changeBattery(org.DS.project.EBankGRPC.ValRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeBatteryMethod(), responseObserver);
    }

    /**
     */
    public void onOff(org.DS.project.EBankGRPC.BooleanReq request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.BooleanRes> responseObserver) {
      asyncUnimplementedUnaryCall(getOnOffMethod(), responseObserver);
    }

    /**
     */
    public void changePhoneName(org.DS.project.EBankGRPC.StringRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangePhoneNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialPhoneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.Empty,
                org.DS.project.EBankGRPC.phoneResp>(
                  this, METHODID_INITIAL_PHONE)))
          .addMethod(
            getChangeApplicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.StringRequest,
                org.DS.project.EBankGRPC.StringResponse>(
                  this, METHODID_CHANGE_APPLICATION)))
          .addMethod(
            getChangeBatteryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.ValRequest,
                org.DS.project.EBankGRPC.ValResponse>(
                  this, METHODID_CHANGE_BATTERY)))
          .addMethod(
            getOnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.BooleanReq,
                org.DS.project.EBankGRPC.BooleanRes>(
                  this, METHODID_ON_OFF)))
          .addMethod(
            getChangePhoneNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.StringRequest,
                org.DS.project.EBankGRPC.StringResponse>(
                  this, METHODID_CHANGE_PHONE_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class PhoneServiceStub extends io.grpc.stub.AbstractStub<PhoneServiceStub> {
    private PhoneServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PhoneServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhoneServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PhoneServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialPhone(org.DS.project.EBankGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.phoneResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialPhoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeApplication(org.DS.project.EBankGRPC.StringRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeApplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeBattery(org.DS.project.EBankGRPC.ValRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeBatteryMethod(), getCallOptions()), request, responseObserver);
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
    public void changePhoneName(org.DS.project.EBankGRPC.StringRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangePhoneNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PhoneServiceBlockingStub extends io.grpc.stub.AbstractStub<PhoneServiceBlockingStub> {
    private PhoneServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PhoneServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhoneServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PhoneServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.project.EBankGRPC.phoneResp initialPhone(org.DS.project.EBankGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialPhoneMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.StringResponse changeApplication(org.DS.project.EBankGRPC.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeApplicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.ValResponse changeBattery(org.DS.project.EBankGRPC.ValRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeBatteryMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.BooleanRes onOff(org.DS.project.EBankGRPC.BooleanReq request) {
      return blockingUnaryCall(
          getChannel(), getOnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.StringResponse changePhoneName(org.DS.project.EBankGRPC.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangePhoneNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PhoneServiceFutureStub extends io.grpc.stub.AbstractStub<PhoneServiceFutureStub> {
    private PhoneServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PhoneServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhoneServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PhoneServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.phoneResp> initialPhone(
        org.DS.project.EBankGRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialPhoneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.StringResponse> changeApplication(
        org.DS.project.EBankGRPC.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeApplicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.ValResponse> changeBattery(
        org.DS.project.EBankGRPC.ValRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeBatteryMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.StringResponse> changePhoneName(
        org.DS.project.EBankGRPC.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangePhoneNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_PHONE = 0;
  private static final int METHODID_CHANGE_APPLICATION = 1;
  private static final int METHODID_CHANGE_BATTERY = 2;
  private static final int METHODID_ON_OFF = 3;
  private static final int METHODID_CHANGE_PHONE_NAME = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PhoneServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PhoneServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_PHONE:
          serviceImpl.initialPhone((org.DS.project.EBankGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.phoneResp>) responseObserver);
          break;
        case METHODID_CHANGE_APPLICATION:
          serviceImpl.changeApplication((org.DS.project.EBankGRPC.StringRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.StringResponse>) responseObserver);
          break;
        case METHODID_CHANGE_BATTERY:
          serviceImpl.changeBattery((org.DS.project.EBankGRPC.ValRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse>) responseObserver);
          break;
        case METHODID_ON_OFF:
          serviceImpl.onOff((org.DS.project.EBankGRPC.BooleanReq) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.BooleanRes>) responseObserver);
          break;
        case METHODID_CHANGE_PHONE_NAME:
          serviceImpl.changePhoneName((org.DS.project.EBankGRPC.StringRequest) request,
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

  private static abstract class PhoneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PhoneServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.project.EBankGRPC.PhoneServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PhoneService");
    }
  }

  private static final class PhoneServiceFileDescriptorSupplier
      extends PhoneServiceBaseDescriptorSupplier {
    PhoneServiceFileDescriptorSupplier() {}
  }

  private static final class PhoneServiceMethodDescriptorSupplier
      extends PhoneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PhoneServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PhoneServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PhoneServiceFileDescriptorSupplier())
              .addMethod(getInitialPhoneMethod())
              .addMethod(getChangeApplicationMethod())
              .addMethod(getChangeBatteryMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangePhoneNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
