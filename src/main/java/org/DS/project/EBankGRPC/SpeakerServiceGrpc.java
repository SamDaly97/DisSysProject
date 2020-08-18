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
public final class SpeakerServiceGrpc {

  private SpeakerServiceGrpc() {}

  public static final String SERVICE_NAME = "EBankGRPC.SpeakerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty,
      org.DS.project.EBankGRPC.speakerResp> getInitialUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialUser",
      requestType = org.DS.project.EBankGRPC.Empty.class,
      responseType = org.DS.project.EBankGRPC.speakerResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty,
      org.DS.project.EBankGRPC.speakerResp> getInitialUserMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.Empty, org.DS.project.EBankGRPC.speakerResp> getInitialUserMethod;
    if ((getInitialUserMethod = SpeakerServiceGrpc.getInitialUserMethod) == null) {
      synchronized (SpeakerServiceGrpc.class) {
        if ((getInitialUserMethod = SpeakerServiceGrpc.getInitialUserMethod) == null) {
          SpeakerServiceGrpc.getInitialUserMethod = getInitialUserMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.Empty, org.DS.project.EBankGRPC.speakerResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.SpeakerService", "initialUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.speakerResp.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerServiceMethodDescriptorSupplier("initialUser"))
                  .build();
          }
        }
     }
     return getInitialUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.valRequest,
      org.DS.project.EBankGRPC.valResponse> getChangeBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeBalance",
      requestType = org.DS.project.EBankGRPC.valRequest.class,
      responseType = org.DS.project.EBankGRPC.valResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.valRequest,
      org.DS.project.EBankGRPC.valResponse> getChangeBalanceMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.valRequest, org.DS.project.EBankGRPC.valResponse> getChangeBalanceMethod;
    if ((getChangeBalanceMethod = SpeakerServiceGrpc.getChangeBalanceMethod) == null) {
      synchronized (SpeakerServiceGrpc.class) {
        if ((getChangeBalanceMethod = SpeakerServiceGrpc.getChangeBalanceMethod) == null) {
          SpeakerServiceGrpc.getChangeBalanceMethod = getChangeBalanceMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.valRequest, org.DS.project.EBankGRPC.valResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.SpeakerService", "changeBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.valRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.valResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerServiceMethodDescriptorSupplier("changeBalance"))
                  .build();
          }
        }
     }
     return getChangeBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.BooleanReq,
      org.DS.project.EBankGRPC.valResponse> getActiveAccontMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activeAccont",
      requestType = org.DS.project.EBankGRPC.BooleanReq.class,
      responseType = org.DS.project.EBankGRPC.valResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.BooleanReq,
      org.DS.project.EBankGRPC.valResponse> getActiveAccontMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.BooleanReq, org.DS.project.EBankGRPC.valResponse> getActiveAccontMethod;
    if ((getActiveAccontMethod = SpeakerServiceGrpc.getActiveAccontMethod) == null) {
      synchronized (SpeakerServiceGrpc.class) {
        if ((getActiveAccontMethod = SpeakerServiceGrpc.getActiveAccontMethod) == null) {
          SpeakerServiceGrpc.getActiveAccontMethod = getActiveAccontMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.BooleanReq, org.DS.project.EBankGRPC.valResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.SpeakerService", "activeAccont"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.BooleanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.valResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerServiceMethodDescriptorSupplier("activeAccont"))
                  .build();
          }
        }
     }
     return getActiveAccontMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.BooleanReq,
      org.DS.project.EBankGRPC.BooleanRes> getChangeAccountTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeAccountType",
      requestType = org.DS.project.EBankGRPC.BooleanReq.class,
      responseType = org.DS.project.EBankGRPC.BooleanRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.BooleanReq,
      org.DS.project.EBankGRPC.BooleanRes> getChangeAccountTypeMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.BooleanReq, org.DS.project.EBankGRPC.BooleanRes> getChangeAccountTypeMethod;
    if ((getChangeAccountTypeMethod = SpeakerServiceGrpc.getChangeAccountTypeMethod) == null) {
      synchronized (SpeakerServiceGrpc.class) {
        if ((getChangeAccountTypeMethod = SpeakerServiceGrpc.getChangeAccountTypeMethod) == null) {
          SpeakerServiceGrpc.getChangeAccountTypeMethod = getChangeAccountTypeMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.BooleanReq, org.DS.project.EBankGRPC.BooleanRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.SpeakerService", "changeAccountType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.BooleanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.BooleanRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerServiceMethodDescriptorSupplier("changeAccountType"))
                  .build();
          }
        }
     }
     return getChangeAccountTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest,
      org.DS.project.EBankGRPC.StringResponse> getChangeUserNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeUserName",
      requestType = org.DS.project.EBankGRPC.StringRequest.class,
      responseType = org.DS.project.EBankGRPC.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest,
      org.DS.project.EBankGRPC.StringResponse> getChangeUserNameMethod() {
    io.grpc.MethodDescriptor<org.DS.project.EBankGRPC.StringRequest, org.DS.project.EBankGRPC.StringResponse> getChangeUserNameMethod;
    if ((getChangeUserNameMethod = SpeakerServiceGrpc.getChangeUserNameMethod) == null) {
      synchronized (SpeakerServiceGrpc.class) {
        if ((getChangeUserNameMethod = SpeakerServiceGrpc.getChangeUserNameMethod) == null) {
          SpeakerServiceGrpc.getChangeUserNameMethod = getChangeUserNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.project.EBankGRPC.StringRequest, org.DS.project.EBankGRPC.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EBankGRPC.SpeakerService", "changeUserName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.project.EBankGRPC.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerServiceMethodDescriptorSupplier("changeUserName"))
                  .build();
          }
        }
     }
     return getChangeUserNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpeakerServiceStub newStub(io.grpc.Channel channel) {
    return new SpeakerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpeakerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SpeakerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpeakerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SpeakerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SpeakerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialUser(org.DS.project.EBankGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.speakerResp> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialUserMethod(), responseObserver);
    }

    /**
     */
    public void changeBalance(org.DS.project.EBankGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.valResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeBalanceMethod(), responseObserver);
    }

    /**
     */
    public void activeAccont(org.DS.project.EBankGRPC.BooleanReq request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.valResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActiveAccontMethod(), responseObserver);
    }

    /**
     */
    public void changeAccountType(org.DS.project.EBankGRPC.BooleanReq request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.BooleanRes> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeAccountTypeMethod(), responseObserver);
    }

    /**
     */
    public void changeUserName(org.DS.project.EBankGRPC.StringRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeUserNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.Empty,
                org.DS.project.EBankGRPC.speakerResp>(
                  this, METHODID_INITIAL_USER)))
          .addMethod(
            getChangeBalanceMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.valRequest,
                org.DS.project.EBankGRPC.valResponse>(
                  this, METHODID_CHANGE_BALANCE)))
          .addMethod(
            getActiveAccontMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.BooleanReq,
                org.DS.project.EBankGRPC.valResponse>(
                  this, METHODID_ACTIVE_ACCONT)))
          .addMethod(
            getChangeAccountTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.BooleanReq,
                org.DS.project.EBankGRPC.BooleanRes>(
                  this, METHODID_CHANGE_ACCOUNT_TYPE)))
          .addMethod(
            getChangeUserNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.project.EBankGRPC.StringRequest,
                org.DS.project.EBankGRPC.StringResponse>(
                  this, METHODID_CHANGE_USER_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class SpeakerServiceStub extends io.grpc.stub.AbstractStub<SpeakerServiceStub> {
    private SpeakerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeakerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeakerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeakerServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialUser(org.DS.project.EBankGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.speakerResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeBalance(org.DS.project.EBankGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.valResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void activeAccont(org.DS.project.EBankGRPC.BooleanReq request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.valResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActiveAccontMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeAccountType(org.DS.project.EBankGRPC.BooleanReq request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.BooleanRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeAccountTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeUserName(org.DS.project.EBankGRPC.StringRequest request,
        io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeUserNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SpeakerServiceBlockingStub extends io.grpc.stub.AbstractStub<SpeakerServiceBlockingStub> {
    private SpeakerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeakerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeakerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeakerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.project.EBankGRPC.speakerResp initialUser(org.DS.project.EBankGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.project.EBankGRPC.valResponse> changeBalance(
        org.DS.project.EBankGRPC.valRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.valResponse activeAccont(org.DS.project.EBankGRPC.BooleanReq request) {
      return blockingUnaryCall(
          getChannel(), getActiveAccontMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.BooleanRes changeAccountType(org.DS.project.EBankGRPC.BooleanReq request) {
      return blockingUnaryCall(
          getChannel(), getChangeAccountTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.project.EBankGRPC.StringResponse changeUserName(org.DS.project.EBankGRPC.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeUserNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SpeakerServiceFutureStub extends io.grpc.stub.AbstractStub<SpeakerServiceFutureStub> {
    private SpeakerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeakerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeakerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeakerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.speakerResp> initialUser(
        org.DS.project.EBankGRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.valResponse> activeAccont(
        org.DS.project.EBankGRPC.BooleanReq request) {
      return futureUnaryCall(
          getChannel().newCall(getActiveAccontMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.BooleanRes> changeAccountType(
        org.DS.project.EBankGRPC.BooleanReq request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeAccountTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.project.EBankGRPC.StringResponse> changeUserName(
        org.DS.project.EBankGRPC.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeUserNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_USER = 0;
  private static final int METHODID_CHANGE_BALANCE = 1;
  private static final int METHODID_ACTIVE_ACCONT = 2;
  private static final int METHODID_CHANGE_ACCOUNT_TYPE = 3;
  private static final int METHODID_CHANGE_USER_NAME = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpeakerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpeakerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_USER:
          serviceImpl.initialUser((org.DS.project.EBankGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.speakerResp>) responseObserver);
          break;
        case METHODID_CHANGE_BALANCE:
          serviceImpl.changeBalance((org.DS.project.EBankGRPC.valRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.valResponse>) responseObserver);
          break;
        case METHODID_ACTIVE_ACCONT:
          serviceImpl.activeAccont((org.DS.project.EBankGRPC.BooleanReq) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.valResponse>) responseObserver);
          break;
        case METHODID_CHANGE_ACCOUNT_TYPE:
          serviceImpl.changeAccountType((org.DS.project.EBankGRPC.BooleanReq) request,
              (io.grpc.stub.StreamObserver<org.DS.project.EBankGRPC.BooleanRes>) responseObserver);
          break;
        case METHODID_CHANGE_USER_NAME:
          serviceImpl.changeUserName((org.DS.project.EBankGRPC.StringRequest) request,
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

  private static abstract class SpeakerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpeakerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.project.EBankGRPC.UserServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SpeakerService");
    }
  }

  private static final class SpeakerServiceFileDescriptorSupplier
      extends SpeakerServiceBaseDescriptorSupplier {
    SpeakerServiceFileDescriptorSupplier() {}
  }

  private static final class SpeakerServiceMethodDescriptorSupplier
      extends SpeakerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpeakerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SpeakerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpeakerServiceFileDescriptorSupplier())
              .addMethod(getInitialUserMethod())
              .addMethod(getChangeBalanceMethod())
              .addMethod(getActiveAccontMethod())
              .addMethod(getChangeAccountTypeMethod())
              .addMethod(getChangeUserNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
