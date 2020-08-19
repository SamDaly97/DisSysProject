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
    comments = "Source: user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "EBankGRPC.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty,
      org.DS.project.EBankGRPC.userResp> getInitialSystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialSystem",
      requestType = org.DS.project.EBankGRPC.Empty.class,
      responseType = org.DS.project.EBankGRPC.userResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty,
      org.DS.project.EBankGRPC.userResp> getInitialSystemMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty, org.DS.project.EBankGRPC.userResp> getInitialSystemMethod;
    if ((getInitialSystemMethod = UserServiceGrpc.getInitialSystemMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getInitialSystemMethod = UserServiceGrpc.getInitialSystemMethod) == null) {
          UserServiceGrpc.getInitialSystemMethod = getInitialSystemMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.Empty, org.DS.project.EBankGRPC.userResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.UserService", "initialSystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.userResp.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("initialSystem"))
                  .build();
          }
        }
     }
     return getInitialSystemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest,
      org.DS.project.EBankGRPC.ValResponse> getChangeActivityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeActivity",
      requestType = org.DS.project.EBankGRPC.ValRequest.class,
      responseType = org.DS.project.EBankGRPC.ValResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest,
      org.DS.project.EBankGRPC.ValResponse> getChangeActivityMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.ValRequest, org.DS.project.EBankGRPC.ValResponse> getChangeActivityMethod;
    if ((getChangeActivityMethod = UserServiceGrpc.getChangeActivityMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getChangeActivityMethod = UserServiceGrpc.getChangeActivityMethod) == null) {
          UserServiceGrpc.getChangeActivityMethod = getChangeActivityMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.ValRequest, org.DS.project.EBankGRPC.ValResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.UserService", "changeActivity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.ValRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.ValResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("changeActivity"))
                  .build();
          }
        }
     }
     return getChangeActivityMethod;
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
    if ((getOnOffMethod = UserServiceGrpc.getOnOffMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getOnOffMethod = UserServiceGrpc.getOnOffMethod) == null) {
          UserServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.BooleanReq, org.DS.project.EBankGRPC.BooleanRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.UserService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.BooleanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.BooleanRes.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("onOff"))
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
    if ((getChangeSystemNameMethod = UserServiceGrpc.getChangeSystemNameMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getChangeSystemNameMethod = UserServiceGrpc.getChangeSystemNameMethod) == null) {
          UserServiceGrpc.getChangeSystemNameMethod = getChangeSystemNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.StringRequest, org.DS.project.EBankGRPC.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.UserService", "changeSystemName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("changeSystemName"))
                  .build();
          }
        }
     }
     return getChangeSystemNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialSystem(org.DS.project.EBankGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.userResp> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialSystemMethod(), responseObserver);
    }

    /**
     */
    public void changeActivity(org.DS.project.EBankGRPC.ValRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeActivityMethod(), responseObserver);
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
                org.DS.project.EBankGRPC.userResp>(
                  this, METHODID_INITIAL_SYSTEM)))
          .addMethod(
            getChangeActivityMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.ValRequest,
                org.DS.project.EBankGRPC.ValResponse>(
                  this, METHODID_CHANGE_ACTIVITY)))
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
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialSystem(org.DS.project.EBankGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.userResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialSystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeActivity(org.DS.project.EBankGRPC.ValRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.ValResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeActivityMethod(), getCallOptions()), request, responseObserver);
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
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.project.EBankGRPC.userResp initialSystem(org.DS.project.EBankGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialSystemMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.project.EBankGRPC.ValResponse> changeActivity(
        org.DS.project.EBankGRPC.ValRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeActivityMethod(), getCallOptions(), request);
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
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.userResp> initialSystem(
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
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.StringResponse> changeSystemName(
        org.DS.project.EBankGRPC.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeSystemNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_SYSTEM = 0;
  private static final int METHODID_CHANGE_ACTIVITY = 1;
  private static final int METHODID_ON_OFF = 2;
  private static final int METHODID_CHANGE_SYSTEM_NAME = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_SYSTEM:
          serviceImpl.initialSystem((org.DS.project.EBankGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.userResp>) responseObserver);
          break;
        case METHODID_CHANGE_ACTIVITY:
          serviceImpl.changeActivity((org.DS.project.EBankGRPC.ValRequest) request,
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.project.EBankGRPC.UserServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getInitialSystemMethod())
              .addMethod(getChangeActivityMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeSystemNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
