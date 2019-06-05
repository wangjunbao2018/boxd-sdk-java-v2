package one.contentbox.boxd.protocol.rpc.protobuf.generated;

import io.grpc.stub.ClientCalls;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.*;
import static io.grpc.stub.ServerCalls.*;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: web.proto")
public final class WebApiGrpc {

  private WebApiGrpc() {}

  public static final String SERVICE_NAME = "rpcpb.WebApi";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailResp> METHOD_VIEW_TX_DETAIL =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq, one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.WebApi", "ViewTxDetail"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailReq,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailResp> METHOD_VIEW_BLOCK_DETAIL =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailReq, one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.WebApi", "ViewBlockDetail"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.ListenBlocksReq,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.BlockDetail> METHOD_LISTEN_AND_READ_NEW_BLOCK =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.ListenBlocksReq, one.contentbox.boxd.protocol.rpc.protobuf.generated.BlockDetail>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.WebApi", "ListenAndReadNewBlock"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.ListenBlocksReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.BlockDetail.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.CallReq,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.CallResp> METHOD_DO_CALL =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.CallReq, one.contentbox.boxd.protocol.rpc.protobuf.generated.CallResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.WebApi", "DoCall"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.CallReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.CallResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceReq,
      one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceResp> METHOD_NONCE =
      io.grpc.MethodDescriptor.<one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceReq, one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "rpcpb.WebApi", "Nonce"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceResp.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WebApiStub newStub(io.grpc.Channel channel) {
    return new WebApiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WebApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WebApiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WebApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WebApiFutureStub(channel);
  }

  /**
   */
  public static abstract class WebApiImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *    rpc ViewTxDetail (ViewTxDetailReq) returns (ViewTxDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void viewTxDetail(one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VIEW_TX_DETAIL, responseObserver);
    }

    /**
     * <pre>
     *    rpc ViewBlockDetail (ViewBlockDetailReq) returns (ViewBlockDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/block/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void viewBlockDetail(one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VIEW_BLOCK_DETAIL, responseObserver);
    }

    /**
     */
    public void listenAndReadNewBlock(one.contentbox.boxd.protocol.rpc.protobuf.generated.ListenBlocksReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.BlockDetail> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LISTEN_AND_READ_NEW_BLOCK, responseObserver);
    }

    /**
     * <pre>
     *    rpc DoCall (CallReq) returns (CallResp) {
     *        option (google.api.http) = {
     *            post: "/v1/contract/call"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void doCall(one.contentbox.boxd.protocol.rpc.protobuf.generated.CallReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.CallResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DO_CALL, responseObserver);
    }

    /**
     * <pre>
     *    rpc Nonce (NonceReq) returns (NonceResp) {
     *        option (google.api.http) = {
     *            post: "/v1/account/nonce"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void nonce(one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_NONCE, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_VIEW_TX_DETAIL,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailResp>(
                  this, METHODID_VIEW_TX_DETAIL)))
          .addMethod(
            METHOD_VIEW_BLOCK_DETAIL,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailReq,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailResp>(
                  this, METHODID_VIEW_BLOCK_DETAIL)))
          .addMethod(
            METHOD_LISTEN_AND_READ_NEW_BLOCK,
            asyncServerStreamingCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.ListenBlocksReq,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.BlockDetail>(
                  this, METHODID_LISTEN_AND_READ_NEW_BLOCK)))
          .addMethod(
            METHOD_DO_CALL,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.CallReq,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.CallResp>(
                  this, METHODID_DO_CALL)))
          .addMethod(
            METHOD_NONCE,
            asyncUnaryCall(
              new MethodHandlers<
                one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceReq,
                one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceResp>(
                  this, METHODID_NONCE)))
          .build();
    }
  }

  /**
   */
  public static final class WebApiStub extends io.grpc.stub.AbstractStub<WebApiStub> {
    private WebApiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WebApiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WebApiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WebApiStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc ViewTxDetail (ViewTxDetailReq) returns (ViewTxDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void viewTxDetail(one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailResp> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(METHOD_VIEW_TX_DETAIL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc ViewBlockDetail (ViewBlockDetailReq) returns (ViewBlockDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/block/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void viewBlockDetail(one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailResp> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(METHOD_VIEW_BLOCK_DETAIL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listenAndReadNewBlock(one.contentbox.boxd.protocol.rpc.protobuf.generated.ListenBlocksReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.BlockDetail> responseObserver) {
      ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(METHOD_LISTEN_AND_READ_NEW_BLOCK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc DoCall (CallReq) returns (CallResp) {
     *        option (google.api.http) = {
     *            post: "/v1/contract/call"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void doCall(one.contentbox.boxd.protocol.rpc.protobuf.generated.CallReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.CallResp> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(METHOD_DO_CALL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    rpc Nonce (NonceReq) returns (NonceResp) {
     *        option (google.api.http) = {
     *            post: "/v1/account/nonce"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public void nonce(one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceReq request,
        io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceResp> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(METHOD_NONCE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WebApiBlockingStub extends io.grpc.stub.AbstractStub<WebApiBlockingStub> {
    private WebApiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WebApiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WebApiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WebApiBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc ViewTxDetail (ViewTxDetailReq) returns (ViewTxDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailResp viewTxDetail(one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VIEW_TX_DETAIL, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc ViewBlockDetail (ViewBlockDetailReq) returns (ViewBlockDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/block/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailResp viewBlockDetail(one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VIEW_BLOCK_DETAIL, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<one.contentbox.boxd.protocol.rpc.protobuf.generated.BlockDetail> listenAndReadNewBlock(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.ListenBlocksReq request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_LISTEN_AND_READ_NEW_BLOCK, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc DoCall (CallReq) returns (CallResp) {
     *        option (google.api.http) = {
     *            post: "/v1/contract/call"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.CallResp doCall(one.contentbox.boxd.protocol.rpc.protobuf.generated.CallReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DO_CALL, getCallOptions(), request);
    }

    /**
     * <pre>
     *    rpc Nonce (NonceReq) returns (NonceResp) {
     *        option (google.api.http) = {
     *            post: "/v1/account/nonce"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceResp nonce(one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_NONCE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WebApiFutureStub extends io.grpc.stub.AbstractStub<WebApiFutureStub> {
    private WebApiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WebApiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WebApiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WebApiFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *    rpc ViewTxDetail (ViewTxDetailReq) returns (ViewTxDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/tx/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailResp> viewTxDetail(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VIEW_TX_DETAIL, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc ViewBlockDetail (ViewBlockDetailReq) returns (ViewBlockDetailResp) {
     *        option (google.api.http) = {
     *            post: "/v1/block/detail"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailResp> viewBlockDetail(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VIEW_BLOCK_DETAIL, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc DoCall (CallReq) returns (CallResp) {
     *        option (google.api.http) = {
     *            post: "/v1/contract/call"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.CallResp> doCall(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.CallReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DO_CALL, getCallOptions()), request);
    }

    /**
     * <pre>
     *    rpc Nonce (NonceReq) returns (NonceResp) {
     *        option (google.api.http) = {
     *            post: "/v1/account/nonce"
     *            body: "*"
     *        };
     *    }
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceResp> nonce(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NONCE, getCallOptions()), request);
    }
  }

  private static final int METHODID_VIEW_TX_DETAIL = 0;
  private static final int METHODID_VIEW_BLOCK_DETAIL = 1;
  private static final int METHODID_LISTEN_AND_READ_NEW_BLOCK = 2;
  private static final int METHODID_DO_CALL = 3;
  private static final int METHODID_NONCE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WebApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WebApiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VIEW_TX_DETAIL:
          serviceImpl.viewTxDetail((one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailResp>) responseObserver);
          break;
        case METHODID_VIEW_BLOCK_DETAIL:
          serviceImpl.viewBlockDetail((one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewBlockDetailResp>) responseObserver);
          break;
        case METHODID_LISTEN_AND_READ_NEW_BLOCK:
          serviceImpl.listenAndReadNewBlock((one.contentbox.boxd.protocol.rpc.protobuf.generated.ListenBlocksReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.BlockDetail>) responseObserver);
          break;
        case METHODID_DO_CALL:
          serviceImpl.doCall((one.contentbox.boxd.protocol.rpc.protobuf.generated.CallReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.CallResp>) responseObserver);
          break;
        case METHODID_NONCE:
          serviceImpl.nonce((one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceReq) request,
              (io.grpc.stub.StreamObserver<one.contentbox.boxd.protocol.rpc.protobuf.generated.NonceResp>) responseObserver);
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

  private static final class WebApiDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WebApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WebApiDescriptorSupplier())
              .addMethod(METHOD_VIEW_TX_DETAIL)
              .addMethod(METHOD_VIEW_BLOCK_DETAIL)
              .addMethod(METHOD_LISTEN_AND_READ_NEW_BLOCK)
              .addMethod(METHOD_DO_CALL)
              .addMethod(METHOD_NONCE)
              .build();
        }
      }
    }
    return result;
  }
}
