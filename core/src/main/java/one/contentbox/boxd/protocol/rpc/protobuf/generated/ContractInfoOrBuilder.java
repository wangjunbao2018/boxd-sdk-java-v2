// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: web.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

public interface ContractInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpcpb.ContractInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 fee = 1;</code>
   */
  int getFee();

  /**
   * <code>bool failed = 2;</code>
   */
  boolean getFailed();

  /**
   * <code>uint64 gas_limit = 3;</code>
   */
  long getGasLimit();

  /**
   * <code>uint64 gas_used = 4;</code>
   */
  long getGasUsed();

  /**
   * <code>uint64 gas_price = 5;</code>
   */
  long getGasPrice();

  /**
   * <code>uint64 nonce = 6;</code>
   */
  long getNonce();

  /**
   * <code>string data = 7;</code>
   */
  String getData();
  /**
   * <code>string data = 7;</code>
   */
  com.google.protobuf.ByteString
      getDataBytes();
}
