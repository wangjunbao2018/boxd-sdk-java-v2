package one.contentbox.boxd.protocol.rpc.protobuf.generated;

import io.grpc.stub.ClientCalls;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: faucet.proto")
public final class FaucetGrpc {

  private FaucetGrpc() {}

  public static final String SERVICE_NAME = "rpcpb.Faucet";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimReq,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimResp> METHOD_CLAIM =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimReq, one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.Faucet", "Claim"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimResp.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FaucetStub newStub(io.grpc.Channel channel) {
    return new FaucetStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FaucetBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FaucetBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FaucetFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FaucetFutureStub(channel);
  }

  /**
   */
  public static abstract class FaucetImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *  rpc Claim(ClaimReq) returns (ClaimResp) {
     *    option (google.api.http) = {
     *        post: "/v1/faucet/claim"
     *        body: "*"
     *    };
     *  }
     * </pre>
     */
    public void claim(one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CLAIM, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CLAIM,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimReq,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimResp>(
                  this, METHODID_CLAIM)))
          .build();
    }
  }

  /**
   */
  public static final class FaucetStub extends io.grpc.stub.AbstractStub<FaucetStub> {
    private FaucetStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FaucetStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected FaucetStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FaucetStub(channel, callOptions);
    }

    /**
     * <pre>
     *  rpc Claim(ClaimReq) returns (ClaimResp) {
     *    option (google.api.http) = {
     *        post: "/v1/faucet/claim"
     *        body: "*"
     *    };
     *  }
     * </pre>
     */
    public void claim(one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimResp> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(METHOD_CLAIM, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FaucetBlockingStub extends io.grpc.stub.AbstractStub<FaucetBlockingStub> {
    private FaucetBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FaucetBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected FaucetBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FaucetBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *  rpc Claim(ClaimReq) returns (ClaimResp) {
     *    option (google.api.http) = {
     *        post: "/v1/faucet/claim"
     *        body: "*"
     *    };
     *  }
     * </pre>
     */
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimResp claim(one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CLAIM, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FaucetFutureStub extends io.grpc.stub.AbstractStub<FaucetFutureStub> {
    private FaucetFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FaucetFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected FaucetFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FaucetFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *  rpc Claim(ClaimReq) returns (ClaimResp) {
     *    option (google.api.http) = {
     *        post: "/v1/faucet/claim"
     *        body: "*"
     *    };
     *  }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimResp> claim(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CLAIM, getCallOptions()), request);
    }
  }

  private static final int METHODID_CLAIM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FaucetImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FaucetImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLAIM:
          serviceImpl.claim((one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.ClaimResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class FaucetDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.FaucetProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FaucetGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FaucetDescriptorSupplier())
              .addMethod(METHOD_CLAIM)
              .build();
        }
      }
    }
    return result;
  }
}
