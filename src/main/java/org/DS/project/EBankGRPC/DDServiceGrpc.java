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
      org.DS.project.EBankGRPC.ddResp> getInitialSystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialSystem",
      requestType = org.DS.project.EBankGRPC.Empty.class,
      responseType = org.DS.project.EBankGRPC.ddResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty,
      org.DS.project.EBankGRPC.ddResp> getInitialSystemMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty, org.DS.project.EBankGRPC.ddResp> getInitialSystemMethod;
    if ((getInitialSystemMethod = DDServiceGrpc.getInitialSystemMethod) == null) {
      synchronized (DDServiceGrpc.class) {
        if ((getInitialSystemMethod = DDServiceGrpc.getInitialSystemMethod) == null) {
          DDServiceGrpc.getInitialSystemMethod = getInitialSystemMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.Empty, org.DS.project.EBankGRPC.ddResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.DDService", "initialSystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.ddResp.getDefaultInstance()))
                  .setSchemaDescriptor(new DDServiceMethodDescriptorSupplier("initialSystem"))
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
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest,
      org.DS.project.EBankGRPC.ValResponse> getChangeHelpfulMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest, org.DS.project.EBankGRPC.ValResponse> getChangeHelpfulMethod;
    if ((getChangeHelpfulMethod = DDServiceGrpc.getChangeHelpfulMethod) == null) {
      synchronized (DDServiceGrpc.class) {
        if ((getChangeHelpfulMethod = DDServiceGrpc.getChangeHelpfulMethod) == null) {
          DDServiceGrpc.getChangeHelpfulMethod = getChangeHelpfulMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.ValRequest, org.DS.project.EBankGRPC.ValResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.DDService", "changeHelpful"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.ValRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.ValResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DDServiceMethodDescriptorSupplier("changeHelpful"))
                  .build();
          }
        }
     }
     return getChangeHelpfulMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest,
      org.DS.project.EBankGRPC.ValResponse> getChangeFrequencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeFrequency",
      requestType = org.DS.project.EBankGRPC.ValRequest.class,
      responseType = org.DS.project.EBankGRPC.ValResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest,
      org.DS.project.EBankGRPC.ValResponse> getChangeFrequencyMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest, org.DS.project.EBankGRPC.ValResponse> getChangeFrequencyMethod;
    if ((getChangeFrequencyMethod = DDServiceGrpc.getChangeFrequencyMethod) == null) {
      synchronized (DDServiceGrpc.class) {
        if ((getChangeFrequencyMethod = DDServiceGrpc.getChangeFrequencyMethod) == null) {
          DDServiceGrpc.getChangeFrequencyMethod = getChangeFrequencyMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.ValRequest, org.DS.project.EBankGRPC.ValResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.DDService", "changeFrequency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.ValRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.ValResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DDServiceMethodDescriptorSupplier("changeFrequency"))
                  .build();
          }
        }
     }
     return getChangeFrequencyMethod;
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
      org.DS.project.EBankGRPC.StringResponse> getChangeSystemNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeSystemName",
      requestType = org.DS.project.EBankGRPC.StringRequest.class,
      responseType = org.DS.project.EBankGRPC.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest,
      org.DS.project.EBankGRPC.StringResponse> getChangeSystemNameMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest, org.DS.project.EBankGRPC.StringResponse> getChangeSystemNameMethod;
    if ((getChangeSystemNameMethod = DDServiceGrpc.getChangeSystemNameMethod) == null) {
      synchronized (DDServiceGrpc.class) {
        if ((getChangeSystemNameMethod = DDServiceGrpc.getChangeSystemNameMethod) == null) {
          DDServiceGrpc.getChangeSystemNameMethod = getChangeSystemNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.StringRequest, org.DS.project.EBankGRPC.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.DDService", "changeSystemName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DDServiceMethodDescriptorSupplier("changeSystemName"))
                  .build();
          }
        }
     }
     return getChangeSystemNameMethod;
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
    public void initialSystem(org.DS.project.EBankGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ddResp> responseObserver) {
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
    public void changeFrequency(org.DS.project.EBankGRPC.ValRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeFrequencyMethod(), responseObserver);
    }

    /**
     */
    public void onOff(org.DS.project.EBankGRPC.BooleanReq request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.BooleanRes> responseObserver) {
      asyncUnimplementedUnaryCall(getOnOffMethod(), responseObserver);
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
                org.DS.project.EBankGRPC.ddResp>(
                  this, METHODID_INITIAL_SYSTEM)))
          .addMethod(
            getChangeHelpfulMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.ValRequest,
                org.DS.project.EBankGRPC.ValResponse>(
                  this, METHODID_CHANGE_HELPFUL)))
          .addMethod(
            getChangeFrequencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.ValRequest,
                org.DS.project.EBankGRPC.ValResponse>(
                  this, METHODID_CHANGE_FREQUENCY)))
          .addMethod(
            getOnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.BooleanReq,
                org.DS.project.EBankGRPC.BooleanRes>(
                  this, METHODID_ON_OFF)))
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
    public void initialSystem(org.DS.project.EBankGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ddResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialSystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeHelpful(org.DS.project.EBankGRPC.ValRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeHelpfulMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeFrequency(org.DS.project.EBankGRPC.ValRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeFrequencyMethod(), getCallOptions()), request, responseObserver);
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
    public void changeSystemName(org.DS.project.EBankGRPC.StringRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeSystemNameMethod(), getCallOptions()), request, responseObserver);
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
    public org.DS.project.EBankGRPC.ddResp initialSystem(org.DS.project.EBankGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialSystemMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.ValResponse changeHelpful(org.DS.project.EBankGRPC.ValRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeHelpfulMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.ValResponse changeFrequency(org.DS.project.EBankGRPC.ValRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeFrequencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.BooleanRes onOff(org.DS.project.EBankGRPC.BooleanReq request) {
      return blockingUnaryCall(
          getChannel(), getOnOffMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.ddResp> initialSystem(
        org.DS.project.EBankGRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialSystemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.ValResponse> changeHelpful(
        org.DS.project.EBankGRPC.ValRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeHelpfulMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.ValResponse> changeFrequency(
        org.DS.project.EBankGRPC.ValRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeFrequencyMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.StringResponse> changeSystemName(
        org.DS.project.EBankGRPC.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeSystemNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_SYSTEM = 0;
  private static final int METHODID_CHANGE_HELPFUL = 1;
  private static final int METHODID_CHANGE_FREQUENCY = 2;
  private static final int METHODID_ON_OFF = 3;
  private static final int METHODID_CHANGE_SYSTEM_NAME = 4;

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
        case METHODID_INITIAL_SYSTEM:
          serviceImpl.initialSystem((org.DS.project.EBankGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ddResp>) responseObserver);
          break;
        case METHODID_CHANGE_HELPFUL:
          serviceImpl.changeHelpful((org.DS.project.EBankGRPC.ValRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse>) responseObserver);
          break;
        case METHODID_CHANGE_FREQUENCY:
          serviceImpl.changeFrequency((org.DS.project.EBankGRPC.ValRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse>) responseObserver);
          break;
        case METHODID_ON_OFF:
          serviceImpl.onOff((org.DS.project.EBankGRPC.BooleanReq) request,
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
              .addMethod(getInitialSystemMethod())
              .addMethod(getChangeHelpfulMethod())
              .addMethod(getChangeFrequencyMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeSystemNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
