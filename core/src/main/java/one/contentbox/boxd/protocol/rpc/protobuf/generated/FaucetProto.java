// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: faucet.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

public final class FaucetProto {
  private FaucetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpcpb_ClaimReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpcpb_ClaimReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpcpb_ClaimResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpcpb_ClaimResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\014faucet.proto\022\005rpcpb\"(\n\010ClaimReq\022\014\n\004add" +
      "r\030\001 \001(\t\022\016\n\006amount\030\002 \001(\004\"8\n\tClaimResp\022\014\n\004" +
      "code\030\001 \001(\005\022\017\n\007message\030\002 \001(\t\022\014\n\004hash\030\003 \001(" +
      "\t24\n\006Faucet\022*\n\005Claim\022\017.rpcpb.ClaimReq\032\020." +
      "rpcpb.ClaimRespBD\n3one.contentbox.boxd.p" +
      "rotocol.rpc.protobuf.generatedB\013FaucetPr" +
      "otoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_rpcpb_ClaimReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_rpcpb_ClaimReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpcpb_ClaimReq_descriptor,
        new String[] { "Addr", "Amount", });
    internal_static_rpcpb_ClaimResp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_rpcpb_ClaimResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpcpb_ClaimResp_descriptor,
        new String[] { "Code", "Message", "Hash", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}