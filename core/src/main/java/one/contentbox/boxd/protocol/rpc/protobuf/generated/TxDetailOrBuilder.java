// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: web.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

public interface TxDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpcpb.TxDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string hash = 1;</code>
   */
  String getHash();
  /**
   * <code>string hash = 1;</code>
   */
  com.google.protobuf.ByteString
      getHashBytes();

  /**
   * <code>repeated .rpcpb.TxInDetail vin = 2;</code>
   */
  java.util.List<one.contentbox.boxd.protocol.rpc.protobuf.generated.TxInDetail>
      getVinList();
  /**
   * <code>repeated .rpcpb.TxInDetail vin = 2;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.TxInDetail getVin(int index);
  /**
   * <code>repeated .rpcpb.TxInDetail vin = 2;</code>
   */
  int getVinCount();
  /**
   * <code>repeated .rpcpb.TxInDetail vin = 2;</code>
   */
  java.util.List<? extends one.contentbox.boxd.protocol.rpc.protobuf.generated.TxInDetailOrBuilder>
      getVinOrBuilderList();
  /**
   * <code>repeated .rpcpb.TxInDetail vin = 2;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.TxInDetailOrBuilder getVinOrBuilder(
          int index);

  /**
   * <code>repeated .rpcpb.TxOutDetail vout = 3;</code>
   */
  java.util.List<one.contentbox.boxd.protocol.rpc.protobuf.generated.TxOutDetail>
      getVoutList();
  /**
   * <code>repeated .rpcpb.TxOutDetail vout = 3;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.TxOutDetail getVout(int index);
  /**
   * <code>repeated .rpcpb.TxOutDetail vout = 3;</code>
   */
  int getVoutCount();
  /**
   * <code>repeated .rpcpb.TxOutDetail vout = 3;</code>
   */
  java.util.List<? extends one.contentbox.boxd.protocol.rpc.protobuf.generated.TxOutDetailOrBuilder>
      getVoutOrBuilderList();
  /**
   * <code>repeated .rpcpb.TxOutDetail vout = 3;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.TxOutDetailOrBuilder getVoutOrBuilder(
          int index);
}