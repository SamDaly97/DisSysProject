package EBankGRPC;

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
  private static volatile io.grpc.MethodDescriptor<EBankGRPC.Phone.Empty,
      EBankGRPC.Phone.phoneResp> getInitialPhoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialPhone",
      requestType = EBankGRPC.Phone.Empty.class,
      responseType = EBankGRPC.Phone.phoneResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EBankGRPC.Phone.Empty,
      EBankGRPC.Phone.phoneResp> getInitialPhoneMethod() {
    io.grpc.MethodDescriptor<EBankGRPC.Phone.Empty, EBankGRPC.Phone.phoneResp> getInitialPhoneMethod;
    if ((getInitialPhoneMethod = PhoneServiceGrpc.getInitialPhoneMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getInitialPhoneMethod = PhoneServiceGrpc.getInitialPhoneMethod) == null) {
          PhoneServiceGrpc.getInitialPhoneMethod = getInitialPhoneMethod = 
              io.grpc.MethodDescriptor.<EBankGRPC.Phone.Empty, EBankGRPC.Phone.phoneResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.PhoneService", "initialPhone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EBankGRPC.Phone.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EBankGRPC.Phone.phoneResp.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("initialPhone"))
                  .build();
          }
        }
     }
     return getInitialPhoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EBankGRPC.Phone.StringRequest,
      EBankGRPC.Phone.StringResponse> getChangeApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeApplication",
      requestType = EBankGRPC.Phone.StringRequest.class,
      responseType = EBankGRPC.Phone.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EBankGRPC.Phone.StringRequest,
      EBankGRPC.Phone.StringResponse> getChangeApplicationMethod() {
    io.grpc.MethodDescriptor<EBankGRPC.Phone.StringRequest, EBankGRPC.Phone.StringResponse> getChangeApplicationMethod;
    if ((getChangeApplicationMethod = PhoneServiceGrpc.getChangeApplicationMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getChangeApplicationMethod = PhoneServiceGrpc.getChangeApplicationMethod) == null) {
          PhoneServiceGrpc.getChangeApplicationMethod = getChangeApplicationMethod = 
              io.grpc.MethodDescriptor.<EBankGRPC.Phone.StringRequest, EBankGRPC.Phone.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.PhoneService", "changeApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EBankGRPC.Phone.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EBankGRPC.Phone.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("changeApplication"))
                  .build();
          }
        }
     }
     return getChangeApplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EBankGRPC.Phone.valRequest,
      EBankGRPC.Phone.valResponse> getChangeBatteryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeBattery",
      requestType = EBankGRPC.Phone.valRequest.class,
      responseType = EBankGRPC.Phone.valResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EBankGRPC.Phone.valRequest,
      EBankGRPC.Phone.valResponse> getChangeBatteryMethod() {
    io.grpc.MethodDescriptor<EBankGRPC.Phone.valRequest, EBankGRPC.Phone.valResponse> getChangeBatteryMethod;
    if ((getChangeBatteryMethod = PhoneServiceGrpc.getChangeBatteryMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getChangeBatteryMethod = PhoneServiceGrpc.getChangeBatteryMethod) == null) {
          PhoneServiceGrpc.getChangeBatteryMethod = getChangeBatteryMethod = 
              io.grpc.MethodDescriptor.<EBankGRPC.Phone.valRequest, EBankGRPC.Phone.valResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.PhoneService", "changeBattery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EBankGRPC.Phone.valRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EBankGRPC.Phone.valResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("changeBattery"))
                  .build();
          }
        }
     }
     return getChangeBatteryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EBankGRPC.Phone.BooleanReq,
      EBankGRPC.Phone.BooleanRes> getOnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "onOff",
      requestType = EBankGRPC.Phone.BooleanReq.class,
      responseType = EBankGRPC.Phone.BooleanRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EBankGRPC.Phone.BooleanReq,
      EBankGRPC.Phone.BooleanRes> getOnOffMethod() {
    io.grpc.MethodDescriptor<EBankGRPC.Phone.BooleanReq, EBankGRPC.Phone.BooleanRes> getOnOffMethod;
    if ((getOnOffMethod = PhoneServiceGrpc.getOnOffMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getOnOffMethod = PhoneServiceGrpc.getOnOffMethod) == null) {
          PhoneServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<EBankGRPC.Phone.BooleanReq, EBankGRPC.Phone.BooleanRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.PhoneService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EBankGRPC.Phone.BooleanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EBankGRPC.Phone.BooleanRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("onOff"))
                  .build();
          }
        }
     }
     return getOnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EBankGRPC.Phone.StringRequest,
      EBankGRPC.Phone.StringRequest> getChangePhoneNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changePhoneName",
      requestType = EBankGRPC.Phone.StringRequest.class,
      responseType = EBankGRPC.Phone.StringRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EBankGRPC.Phone.StringRequest,
      EBankGRPC.Phone.StringRequest> getChangePhoneNameMethod() {
    io.grpc.MethodDescriptor<EBankGRPC.Phone.StringRequest, EBankGRPC.Phone.StringRequest> getChangePhoneNameMethod;
    if ((getChangePhoneNameMethod = PhoneServiceGrpc.getChangePhoneNameMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getChangePhoneNameMethod = PhoneServiceGrpc.getChangePhoneNameMethod) == null) {
          PhoneServiceGrpc.getChangePhoneNameMethod = getChangePhoneNameMethod = 
              io.grpc.MethodDescriptor.<EBankGRPC.Phone.StringRequest, EBankGRPC.Phone.StringRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.PhoneService", "changePhoneName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EBankGRPC.Phone.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EBankGRPC.Phone.StringRequest.getDefaultInstance()))
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
    public void initialPhone(EBankGRPC.Phone.Empty request,
        io.grpc.stub.StreamObserver<EBankGRPC.Phone.phoneResp> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialPhoneMethod(), responseObserver);
    }

    /**
     */
    public void changeApplication(EBankGRPC.Phone.StringRequest request,
        io.grpc.stub.StreamObserver<EBankGRPC.Phone.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeApplicationMethod(), responseObserver);
    }

    /**
     */
    public void changeBattery(EBankGRPC.Phone.valRequest request,
        io.grpc.stub.StreamObserver<EBankGRPC.Phone.valResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeBatteryMethod(), responseObserver);
    }

    /**
     */
    public void onOff(EBankGRPC.Phone.BooleanReq request,
        io.grpc.stub.StreamObserver<EBankGRPC.Phone.BooleanRes> responseObserver) {
      asyncUnimplementedUnaryCall(getOnOffMethod(), responseObserver);
    }

    /**
     */
    public void changePhoneName(EBankGRPC.Phone.StringRequest request,
        io.grpc.stub.StreamObserver<EBankGRPC.Phone.StringRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getChangePhoneNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialPhoneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                EBankGRPC.Phone.Empty,
                EBankGRPC.Phone.phoneResp>(
                  this, METHODID_INITIAL_PHONE)))
          .addMethod(
            getChangeApplicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                EBankGRPC.Phone.StringRequest,
                EBankGRPC.Phone.StringResponse>(
                  this, METHODID_CHANGE_APPLICATION)))
          .addMethod(
            getChangeBatteryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                EBankGRPC.Phone.valRequest,
                EBankGRPC.Phone.valResponse>(
                  this, METHODID_CHANGE_BATTERY)))
          .addMethod(
            getOnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                EBankGRPC.Phone.BooleanReq,
                EBankGRPC.Phone.BooleanRes>(
                  this, METHODID_ON_OFF)))
          .addMethod(
            getChangePhoneNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                EBankGRPC.Phone.StringRequest,
                EBankGRPC.Phone.StringRequest>(
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
    public void initialPhone(EBankGRPC.Phone.Empty request,
        io.grpc.stub.StreamObserver<EBankGRPC.Phone.phoneResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialPhoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeApplication(EBankGRPC.Phone.StringRequest request,
        io.grpc.stub.StreamObserver<EBankGRPC.Phone.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeApplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeBattery(EBankGRPC.Phone.valRequest request,
        io.grpc.stub.StreamObserver<EBankGRPC.Phone.valResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeBatteryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onOff(EBankGRPC.Phone.BooleanReq request,
        io.grpc.stub.StreamObserver<EBankGRPC.Phone.BooleanRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changePhoneName(EBankGRPC.Phone.StringRequest request,
        io.grpc.stub.StreamObserver<EBankGRPC.Phone.StringRequest> responseObserver) {
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
    public EBankGRPC.Phone.phoneResp initialPhone(EBankGRPC.Phone.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialPhoneMethod(), getCallOptions(), request);
    }

    /**
     */
    public EBankGRPC.Phone.StringResponse changeApplication(EBankGRPC.Phone.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeApplicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public EBankGRPC.Phone.valResponse changeBattery(EBankGRPC.Phone.valRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeBatteryMethod(), getCallOptions(), request);
    }

    /**
     */
    public EBankGRPC.Phone.BooleanRes onOff(EBankGRPC.Phone.BooleanReq request) {
      return blockingUnaryCall(
          getChannel(), getOnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public EBankGRPC.Phone.StringRequest changePhoneName(EBankGRPC.Phone.StringRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<EBankGRPC.Phone.phoneResp> initialPhone(
        EBankGRPC.Phone.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialPhoneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<EBankGRPC.Phone.StringResponse> changeApplication(
        EBankGRPC.Phone.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeApplicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<EBankGRPC.Phone.valResponse> changeBattery(
        EBankGRPC.Phone.valRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeBatteryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<EBankGRPC.Phone.BooleanRes> onOff(
        EBankGRPC.Phone.BooleanReq request) {
      return futureUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<EBankGRPC.Phone.StringRequest> changePhoneName(
        EBankGRPC.Phone.StringRequest request) {
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
          serviceImpl.initialPhone((EBankGRPC.Phone.Empty) request,
              (io.grpc.stub.StreamObserver<EBankGRPC.Phone.phoneResp>) responseObserver);
          break;
        case METHODID_CHANGE_APPLICATION:
          serviceImpl.changeApplication((EBankGRPC.Phone.StringRequest) request,
              (io.grpc.stub.StreamObserver<EBankGRPC.Phone.StringResponse>) responseObserver);
          break;
        case METHODID_CHANGE_BATTERY:
          serviceImpl.changeBattery((EBankGRPC.Phone.valRequest) request,
              (io.grpc.stub.StreamObserver<EBankGRPC.Phone.valResponse>) responseObserver);
          break;
        case METHODID_ON_OFF:
          serviceImpl.onOff((EBankGRPC.Phone.BooleanReq) request,
              (io.grpc.stub.StreamObserver<EBankGRPC.Phone.BooleanRes>) responseObserver);
          break;
        case METHODID_CHANGE_PHONE_NAME:
          serviceImpl.changePhoneName((EBankGRPC.Phone.StringRequest) request,
              (io.grpc.stub.StreamObserver<EBankGRPC.Phone.StringRequest>) responseObserver);
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
      return EBankGRPC.Phone.getDescriptor();
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
