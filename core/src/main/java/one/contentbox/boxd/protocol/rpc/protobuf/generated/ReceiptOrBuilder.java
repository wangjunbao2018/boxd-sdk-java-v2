// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: receipt.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

public interface ReceiptOrBuilder extends
    // @@protoc_insertion_point(interface_extends:corepb.Receipt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 tx_index = 1;</code>
   */
  int getTxIndex();

  /**
   * <code>bool failed = 2;</code>
   */
  boolean getFailed();

  /**
   * <code>uint64 gas_used = 3;</code>
   */
  long getGasUsed();
}
