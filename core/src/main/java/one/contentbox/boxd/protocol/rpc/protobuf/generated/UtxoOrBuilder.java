// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

public interface UtxoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpcpb.Utxo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.corepb.OutPoint out_point = 1;</code>
   */
  boolean hasOutPoint();
  /**
   * <code>.corepb.OutPoint out_point = 1;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.OutPoint getOutPoint();
  /**
   * <code>.corepb.OutPoint out_point = 1;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.OutPointOrBuilder getOutPointOrBuilder();

  /**
   * <code>.corepb.TxOut tx_out = 2;</code>
   */
  boolean hasTxOut();
  /**
   * <code>.corepb.TxOut tx_out = 2;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.TxOut getTxOut();
  /**
   * <code>.corepb.TxOut tx_out = 2;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.TxOutOrBuilder getTxOutOrBuilder();

  /**
   * <code>uint32 block_height = 3;</code>
   */
  int getBlockHeight();

  /**
   * <code>bool is_coinbase = 4;</code>
   */
  boolean getIsCoinbase();

  /**
   * <code>bool is_spent = 5;</code>
   */
  boolean getIsSpent();
}