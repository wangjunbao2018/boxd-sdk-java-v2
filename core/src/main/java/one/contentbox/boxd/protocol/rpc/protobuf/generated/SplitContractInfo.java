// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: web.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

/**
 * Protobuf type {@code rpcpb.SplitContractInfo}
 */
public  final class SplitContractInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpcpb.SplitContractInfo)
        SplitContractInfoOrBuilder {
  // Use SplitContractInfo.newBuilder() to construct.
  private SplitContractInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SplitContractInfo() {
    addrs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    weights_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SplitContractInfo(
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
          case 10: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              addrs_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            addrs_.add(s);
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              weights_ = new java.util.ArrayList<Long>();
              mutable_bitField0_ |= 0x00000002;
            }
            weights_.add(input.readUInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
              weights_ = new java.util.ArrayList<Long>();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              weights_.add(input.readUInt64());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        addrs_ = addrs_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        weights_ = java.util.Collections.unmodifiableList(weights_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.internal_static_rpcpb_SplitContractInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.internal_static_rpcpb_SplitContractInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo.Builder.class);
  }

  public static final int ADDRS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList addrs_;
  /**
   * <code>repeated string addrs = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getAddrsList() {
    return addrs_;
  }
  /**
   * <code>repeated string addrs = 1;</code>
   */
  public int getAddrsCount() {
    return addrs_.size();
  }
  /**
   * <code>repeated string addrs = 1;</code>
   */
  public String getAddrs(int index) {
    return addrs_.get(index);
  }
  /**
   * <code>repeated string addrs = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAddrsBytes(int index) {
    return addrs_.getByteString(index);
  }

  public static final int WEIGHTS_FIELD_NUMBER = 2;
  private java.util.List<Long> weights_;
  /**
   * <code>repeated uint64 weights = 2;</code>
   */
  public java.util.List<Long>
      getWeightsList() {
    return weights_;
  }
  /**
   * <code>repeated uint64 weights = 2;</code>
   */
  public int getWeightsCount() {
    return weights_.size();
  }
  /**
   * <code>repeated uint64 weights = 2;</code>
   */
  public long getWeights(int index) {
    return weights_.get(index);
  }
  private int weightsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    for (int i = 0; i < addrs_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, addrs_.getRaw(i));
    }
    if (getWeightsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(weightsMemoizedSerializedSize);
    }
    for (int i = 0; i < weights_.size(); i++) {
      output.writeUInt64NoTag(weights_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < addrs_.size(); i++) {
        dataSize += computeStringSizeNoTag(addrs_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAddrsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < weights_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(weights_.get(i));
      }
      size += dataSize;
      if (!getWeightsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      weightsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo)) {
      return super.equals(obj);
    }
    one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo other = (one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo) obj;

    boolean result = true;
    result = result && getAddrsList()
        .equals(other.getAddrsList());
    result = result && getWeightsList()
        .equals(other.getWeightsList());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAddrsCount() > 0) {
      hash = (37 * hash) + ADDRS_FIELD_NUMBER;
      hash = (53 * hash) + getAddrsList().hashCode();
    }
    if (getWeightsCount() > 0) {
      hash = (37 * hash) + WEIGHTS_FIELD_NUMBER;
      hash = (53 * hash) + getWeightsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo parseFrom(
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
  public static Builder newBuilder(one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo prototype) {
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
   * Protobuf type {@code rpcpb.SplitContractInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpcpb.SplitContractInfo)
      one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.internal_static_rpcpb_SplitContractInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.internal_static_rpcpb_SplitContractInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo.Builder.class);
    }

    // Construct using one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo.newBuilder()
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
      addrs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      weights_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.internal_static_rpcpb_SplitContractInfo_descriptor;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo getDefaultInstanceForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo.getDefaultInstance();
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo build() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo buildPartial() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo result = new one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        addrs_ = addrs_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.addrs_ = addrs_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        weights_ = java.util.Collections.unmodifiableList(weights_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.weights_ = weights_;
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
      if (other instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo) {
        return mergeFrom((one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo other) {
      if (other == one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo.getDefaultInstance()) return this;
      if (!other.addrs_.isEmpty()) {
        if (addrs_.isEmpty()) {
          addrs_ = other.addrs_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAddrsIsMutable();
          addrs_.addAll(other.addrs_);
        }
        onChanged();
      }
      if (!other.weights_.isEmpty()) {
        if (weights_.isEmpty()) {
          weights_ = other.weights_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureWeightsIsMutable();
          weights_.addAll(other.weights_);
        }
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
      one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList addrs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAddrsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        addrs_ = new com.google.protobuf.LazyStringArrayList(addrs_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string addrs = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getAddrsList() {
      return addrs_.getUnmodifiableView();
    }
    /**
     * <code>repeated string addrs = 1;</code>
     */
    public int getAddrsCount() {
      return addrs_.size();
    }
    /**
     * <code>repeated string addrs = 1;</code>
     */
    public String getAddrs(int index) {
      return addrs_.get(index);
    }
    /**
     * <code>repeated string addrs = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAddrsBytes(int index) {
      return addrs_.getByteString(index);
    }
    /**
     * <code>repeated string addrs = 1;</code>
     */
    public Builder setAddrs(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAddrsIsMutable();
      addrs_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addrs = 1;</code>
     */
    public Builder addAddrs(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAddrsIsMutable();
      addrs_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addrs = 1;</code>
     */
    public Builder addAllAddrs(
        Iterable<String> values) {
      ensureAddrsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, addrs_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addrs = 1;</code>
     */
    public Builder clearAddrs() {
      addrs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addrs = 1;</code>
     */
    public Builder addAddrsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAddrsIsMutable();
      addrs_.add(value);
      onChanged();
      return this;
    }

    private java.util.List<Long> weights_ = java.util.Collections.emptyList();
    private void ensureWeightsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        weights_ = new java.util.ArrayList<Long>(weights_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated uint64 weights = 2;</code>
     */
    public java.util.List<Long>
        getWeightsList() {
      return java.util.Collections.unmodifiableList(weights_);
    }
    /**
     * <code>repeated uint64 weights = 2;</code>
     */
    public int getWeightsCount() {
      return weights_.size();
    }
    /**
     * <code>repeated uint64 weights = 2;</code>
     */
    public long getWeights(int index) {
      return weights_.get(index);
    }
    /**
     * <code>repeated uint64 weights = 2;</code>
     */
    public Builder setWeights(
        int index, long value) {
      ensureWeightsIsMutable();
      weights_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 weights = 2;</code>
     */
    public Builder addWeights(long value) {
      ensureWeightsIsMutable();
      weights_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 weights = 2;</code>
     */
    public Builder addAllWeights(
        Iterable<? extends Long> values) {
      ensureWeightsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, weights_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 weights = 2;</code>
     */
    public Builder clearWeights() {
      weights_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:rpcpb.SplitContractInfo)
  }

  // @@protoc_insertion_point(class_scope:rpcpb.SplitContractInfo)
  private static final one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo();
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SplitContractInfo>
      PARSER = new com.google.protobuf.AbstractParser<SplitContractInfo>() {
    public SplitContractInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SplitContractInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SplitContractInfo> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SplitContractInfo> getParserForType() {
    return PARSER;
  }

  public one.contentbox.boxd.protocol.rpc.protobuf.generated.SplitContractInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

