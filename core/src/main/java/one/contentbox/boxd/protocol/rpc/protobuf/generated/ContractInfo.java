// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: web.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

/**
 * Protobuf type {@code rpcpb.ContractInfo}
 */
public  final class ContractInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpcpb.ContractInfo)
    ContractInfoOrBuilder {
  // Use ContractInfo.newBuilder() to construct.
  private ContractInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContractInfo() {
    fee_ = 0;
    failed_ = false;
    gasLimit_ = 0L;
    gasUsed_ = 0L;
    gasPrice_ = 0L;
    nonce_ = 0L;
    data_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ContractInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            fee_ = input.readUInt32();
            break;
          }
          case 16: {

            failed_ = input.readBool();
            break;
          }
          case 24: {

            gasLimit_ = input.readUInt64();
            break;
          }
          case 32: {

            gasUsed_ = input.readUInt64();
            break;
          }
          case 40: {

            gasPrice_ = input.readUInt64();
            break;
          }
          case 48: {

            nonce_ = input.readUInt64();
            break;
          }
          case 58: {
            String s = input.readStringRequireUtf8();

            data_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.internal_static_rpcpb_ContractInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.internal_static_rpcpb_ContractInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo.Builder.class);
  }

  public static final int FEE_FIELD_NUMBER = 1;
  private int fee_;
  /**
   * <code>uint32 fee = 1;</code>
   */
  public int getFee() {
    return fee_;
  }

  public static final int FAILED_FIELD_NUMBER = 2;
  private boolean failed_;
  /**
   * <code>bool failed = 2;</code>
   */
  public boolean getFailed() {
    return failed_;
  }

  public static final int GAS_LIMIT_FIELD_NUMBER = 3;
  private long gasLimit_;
  /**
   * <code>uint64 gas_limit = 3;</code>
   */
  public long getGasLimit() {
    return gasLimit_;
  }

  public static final int GAS_USED_FIELD_NUMBER = 4;
  private long gasUsed_;
  /**
   * <code>uint64 gas_used = 4;</code>
   */
  public long getGasUsed() {
    return gasUsed_;
  }

  public static final int GAS_PRICE_FIELD_NUMBER = 5;
  private long gasPrice_;
  /**
   * <code>uint64 gas_price = 5;</code>
   */
  public long getGasPrice() {
    return gasPrice_;
  }

  public static final int NONCE_FIELD_NUMBER = 6;
  private long nonce_;
  /**
   * <code>uint64 nonce = 6;</code>
   */
  public long getNonce() {
    return nonce_;
  }

  public static final int DATA_FIELD_NUMBER = 7;
  private volatile Object data_;
  /**
   * <code>string data = 7;</code>
   */
  public String getData() {
    Object ref = data_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      data_ = s;
      return s;
    }
  }
  /**
   * <code>string data = 7;</code>
   */
  public com.google.protobuf.ByteString
      getDataBytes() {
    Object ref = data_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      data_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (fee_ != 0) {
      output.writeUInt32(1, fee_);
    }
    if (failed_ != false) {
      output.writeBool(2, failed_);
    }
    if (gasLimit_ != 0L) {
      output.writeUInt64(3, gasLimit_);
    }
    if (gasUsed_ != 0L) {
      output.writeUInt64(4, gasUsed_);
    }
    if (gasPrice_ != 0L) {
      output.writeUInt64(5, gasPrice_);
    }
    if (nonce_ != 0L) {
      output.writeUInt64(6, nonce_);
    }
    if (!getDataBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, data_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fee_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, fee_);
    }
    if (failed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, failed_);
    }
    if (gasLimit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, gasLimit_);
    }
    if (gasUsed_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, gasUsed_);
    }
    if (gasPrice_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, gasPrice_);
    }
    if (nonce_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, nonce_);
    }
    if (!getDataBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, data_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo)) {
      return super.equals(obj);
    }
    one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo other = (one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo) obj;

    boolean result = true;
    result = result && (getFee()
        == other.getFee());
    result = result && (getFailed()
        == other.getFailed());
    result = result && (getGasLimit()
        == other.getGasLimit());
    result = result && (getGasUsed()
        == other.getGasUsed());
    result = result && (getGasPrice()
        == other.getGasPrice());
    result = result && (getNonce()
        == other.getNonce());
    result = result && getData()
        .equals(other.getData());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FEE_FIELD_NUMBER;
    hash = (53 * hash) + getFee();
    hash = (37 * hash) + FAILED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFailed());
    hash = (37 * hash) + GAS_LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGasLimit());
    hash = (37 * hash) + GAS_USED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGasUsed());
    hash = (37 * hash) + GAS_PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGasPrice());
    hash = (37 * hash) + NONCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNonce());
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rpcpb.ContractInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpcpb.ContractInfo)
      one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.internal_static_rpcpb_ContractInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.internal_static_rpcpb_ContractInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo.Builder.class);
    }

    // Construct using one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      fee_ = 0;

      failed_ = false;

      gasLimit_ = 0L;

      gasUsed_ = 0L;

      gasPrice_ = 0L;

      nonce_ = 0L;

      data_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.internal_static_rpcpb_ContractInfo_descriptor;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo getDefaultInstanceForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo.getDefaultInstance();
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo build() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo buildPartial() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo result = new one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo(this);
      result.fee_ = fee_;
      result.failed_ = failed_;
      result.gasLimit_ = gasLimit_;
      result.gasUsed_ = gasUsed_;
      result.gasPrice_ = gasPrice_;
      result.nonce_ = nonce_;
      result.data_ = data_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo) {
        return mergeFrom((one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo other) {
      if (other == one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo.getDefaultInstance()) return this;
      if (other.getFee() != 0) {
        setFee(other.getFee());
      }
      if (other.getFailed() != false) {
        setFailed(other.getFailed());
      }
      if (other.getGasLimit() != 0L) {
        setGasLimit(other.getGasLimit());
      }
      if (other.getGasUsed() != 0L) {
        setGasUsed(other.getGasUsed());
      }
      if (other.getGasPrice() != 0L) {
        setGasPrice(other.getGasPrice());
      }
      if (other.getNonce() != 0L) {
        setNonce(other.getNonce());
      }
      if (!other.getData().isEmpty()) {
        data_ = other.data_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int fee_ ;
    /**
     * <code>uint32 fee = 1;</code>
     */
    public int getFee() {
      return fee_;
    }
    /**
     * <code>uint32 fee = 1;</code>
     */
    public Builder setFee(int value) {

      fee_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 fee = 1;</code>
     */
    public Builder clearFee() {

      fee_ = 0;
      onChanged();
      return this;
    }

    private boolean failed_ ;
    /**
     * <code>bool failed = 2;</code>
     */
    public boolean getFailed() {
      return failed_;
    }
    /**
     * <code>bool failed = 2;</code>
     */
    public Builder setFailed(boolean value) {

      failed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool failed = 2;</code>
     */
    public Builder clearFailed() {

      failed_ = false;
      onChanged();
      return this;
    }

    private long gasLimit_ ;
    /**
     * <code>uint64 gas_limit = 3;</code>
     */
    public long getGasLimit() {
      return gasLimit_;
    }
    /**
     * <code>uint64 gas_limit = 3;</code>
     */
    public Builder setGasLimit(long value) {

      gasLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 gas_limit = 3;</code>
     */
    public Builder clearGasLimit() {

      gasLimit_ = 0L;
      onChanged();
      return this;
    }

    private long gasUsed_ ;
    /**
     * <code>uint64 gas_used = 4;</code>
     */
    public long getGasUsed() {
      return gasUsed_;
    }
    /**
     * <code>uint64 gas_used = 4;</code>
     */
    public Builder setGasUsed(long value) {

      gasUsed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 gas_used = 4;</code>
     */
    public Builder clearGasUsed() {

      gasUsed_ = 0L;
      onChanged();
      return this;
    }

    private long gasPrice_ ;
    /**
     * <code>uint64 gas_price = 5;</code>
     */
    public long getGasPrice() {
      return gasPrice_;
    }
    /**
     * <code>uint64 gas_price = 5;</code>
     */
    public Builder setGasPrice(long value) {

      gasPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 gas_price = 5;</code>
     */
    public Builder clearGasPrice() {

      gasPrice_ = 0L;
      onChanged();
      return this;
    }

    private long nonce_ ;
    /**
     * <code>uint64 nonce = 6;</code>
     */
    public long getNonce() {
      return nonce_;
    }
    /**
     * <code>uint64 nonce = 6;</code>
     */
    public Builder setNonce(long value) {

      nonce_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 nonce = 6;</code>
     */
    public Builder clearNonce() {

      nonce_ = 0L;
      onChanged();
      return this;
    }

    private Object data_ = "";
    /**
     * <code>string data = 7;</code>
     */
    public String getData() {
      Object ref = data_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        data_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string data = 7;</code>
     */
    public com.google.protobuf.ByteString
        getDataBytes() {
      Object ref = data_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string data = 7;</code>
     */
    public Builder setData(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string data = 7;</code>
     */
    public Builder clearData() {

      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }
    /**
     * <code>string data = 7;</code>
     */
    public Builder setDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      data_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:rpcpb.ContractInfo)
  }

  // @@protoc_insertion_point(class_scope:rpcpb.ContractInfo)
  private static final one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo();
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContractInfo>
      PARSER = new com.google.protobuf.AbstractParser<ContractInfo>() {
    public ContractInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ContractInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ContractInfo> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ContractInfo> getParserForType() {
    return PARSER;
  }

  public one.contentbox.boxd.protocol.rpc.protobuf.generated.ContractInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

