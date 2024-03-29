// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transaction.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

public interface MakeSplitAddrTxReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpcpb.MakeSplitAddrTxReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string from = 1;</code>
   */
  String getFrom();
  /**
   * <code>string from = 1;</code>
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <code>repeated string addrs = 2;</code>
   */
  java.util.List<String>
      getAddrsList();
  /**
   * <code>repeated string addrs = 2;</code>
   */
  int getAddrsCount();
  /**
   * <code>repeated string addrs = 2;</code>
   */
  String getAddrs(int index);
  /**
   * <code>repeated string addrs = 2;</code>
   */
  com.google.protobuf.ByteString
      getAddrsBytes(int index);

  /**
   * <code>repeated uint64 weights = 3;</code>
   */
  java.util.List<Long> getWeightsList();
  /**
   * <code>repeated uint64 weights = 3;</code>
   */
  int getWeightsCount();
  /**
   * <code>repeated uint64 weights = 3;</code>
   */
  long getWeights(int index);

  /**
   * <code>uint64 gas_price = 4;</code>
   */
  long getGasPrice();
}
