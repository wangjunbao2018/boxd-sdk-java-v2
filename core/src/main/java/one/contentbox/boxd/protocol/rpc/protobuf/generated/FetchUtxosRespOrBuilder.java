// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transaction.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

public interface FetchUtxosRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpcpb.FetchUtxosResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 code = 1;</code>
   */
  int getCode();

  /**
   * <code>string message = 2;</code>
   */
  String getMessage();
  /**
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>repeated .rpcpb.Utxo utxos = 3;</code>
   */
  java.util.List<Utxo>
      getUtxosList();
  /**
   * <code>repeated .rpcpb.Utxo utxos = 3;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.Utxo getUtxos(int index);
  /**
   * <code>repeated .rpcpb.Utxo utxos = 3;</code>
   */
  int getUtxosCount();
  /**
   * <code>repeated .rpcpb.Utxo utxos = 3;</code>
   */
  java.util.List<? extends one.contentbox.boxd.protocol.rpc.protobuf.generated.UtxoOrBuilder>
      getUtxosOrBuilderList();
  /**
   * <code>repeated .rpcpb.Utxo utxos = 3;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.UtxoOrBuilder getUtxosOrBuilder(
          int index);
}
