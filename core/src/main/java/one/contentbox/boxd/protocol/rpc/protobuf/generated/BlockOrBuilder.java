// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: block.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

public interface BlockOrBuilder extends
    // @@protoc_insertion_point(interface_extends:corepb.Block)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.corepb.BlockHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.corepb.BlockHeader header = 1;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.BlockHeader getHeader();
  /**
   * <code>.corepb.BlockHeader header = 1;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.BlockHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>repeated .corepb.Transaction txs = 2;</code>
   */
  java.util.List<Transaction>
      getTxsList();
  /**
   * <code>repeated .corepb.Transaction txs = 2;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction getTxs(int index);
  /**
   * <code>repeated .corepb.Transaction txs = 2;</code>
   */
  int getTxsCount();
  /**
   * <code>repeated .corepb.Transaction txs = 2;</code>
   */
  java.util.List<? extends TransactionOrBuilder>
      getTxsOrBuilderList();
  /**
   * <code>repeated .corepb.Transaction txs = 2;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionOrBuilder getTxsOrBuilder(
          int index);

  /**
   * <code>repeated .corepb.Transaction internal_txs = 3;</code>
   */
  java.util.List<Transaction>
      getInternalTxsList();
  /**
   * <code>repeated .corepb.Transaction internal_txs = 3;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction getInternalTxs(int index);
  /**
   * <code>repeated .corepb.Transaction internal_txs = 3;</code>
   */
  int getInternalTxsCount();
  /**
   * <code>repeated .corepb.Transaction internal_txs = 3;</code>
   */
  java.util.List<? extends TransactionOrBuilder>
      getInternalTxsOrBuilderList();
  /**
   * <code>repeated .corepb.Transaction internal_txs = 3;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionOrBuilder getInternalTxsOrBuilder(
          int index);

  /**
   * <code>bytes signature = 4;</code>
   */
  com.google.protobuf.ByteString getSignature();

  /**
   * <code>.corepb.IrreversibleInfo irreversible_info = 5;</code>
   */
  boolean hasIrreversibleInfo();
  /**
   * <code>.corepb.IrreversibleInfo irreversible_info = 5;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.IrreversibleInfo getIrreversibleInfo();
  /**
   * <code>.corepb.IrreversibleInfo irreversible_info = 5;</code>
   */
  one.contentbox.boxd.protocol.rpc.protobuf.generated.IrreversibleInfoOrBuilder getIrreversibleInfoOrBuilder();
}
