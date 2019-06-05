// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transaction.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

/**
 * Protobuf type {@code rpcpb.GetTokenBalanceReq}
 */
public  final class GetTokenBalanceReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpcpb.GetTokenBalanceReq)
        GetTokenBalanceReqOrBuilder {
  // Use GetTokenBalanceReq.newBuilder() to construct.
  private GetTokenBalanceReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTokenBalanceReq() {
    addrs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    tokenHash_ = "";
    tokenIndex_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetTokenBalanceReq(
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
          case 18: {
            String s = input.readStringRequireUtf8();

            tokenHash_ = s;
            break;
          }
          case 24: {

            tokenIndex_ = input.readUInt32();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_GetTokenBalanceReq_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_GetTokenBalanceReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq.Builder.class);
  }

  private int bitField0_;
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

  public static final int TOKEN_HASH_FIELD_NUMBER = 2;
  private volatile Object tokenHash_;
  /**
   * <code>string token_hash = 2;</code>
   */
  public String getTokenHash() {
    Object ref = tokenHash_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      tokenHash_ = s;
      return s;
    }
  }
  /**
   * <code>string token_hash = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTokenHashBytes() {
    Object ref = tokenHash_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      tokenHash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKEN_INDEX_FIELD_NUMBER = 3;
  private int tokenIndex_;
  /**
   * <code>uint32 token_index = 3;</code>
   */
  public int getTokenIndex() {
    return tokenIndex_;
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
    for (int i = 0; i < addrs_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, addrs_.getRaw(i));
    }
    if (!getTokenHashBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tokenHash_);
    }
    if (tokenIndex_ != 0) {
      output.writeUInt32(3, tokenIndex_);
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
    if (!getTokenHashBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tokenHash_);
    }
    if (tokenIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, tokenIndex_);
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
    if (!(obj instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq)) {
      return super.equals(obj);
    }
    one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq other = (one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq) obj;

    boolean result = true;
    result = result && getAddrsList()
        .equals(other.getAddrsList());
    result = result && getTokenHash()
        .equals(other.getTokenHash());
    result = result && (getTokenIndex()
        == other.getTokenIndex());
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
    hash = (37 * hash) + TOKEN_HASH_FIELD_NUMBER;
    hash = (53 * hash) + getTokenHash().hashCode();
    hash = (37 * hash) + TOKEN_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getTokenIndex();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq parseFrom(
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
  public static Builder newBuilder(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq prototype) {
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
   * Protobuf type {@code rpcpb.GetTokenBalanceReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpcpb.GetTokenBalanceReq)
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_GetTokenBalanceReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_GetTokenBalanceReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq.Builder.class);
    }

    // Construct using one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq.newBuilder()
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
      tokenHash_ = "";

      tokenIndex_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_GetTokenBalanceReq_descriptor;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq getDefaultInstanceForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq.getDefaultInstance();
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq build() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq buildPartial() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq result = new one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        addrs_ = addrs_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.addrs_ = addrs_;
      result.tokenHash_ = tokenHash_;
      result.tokenIndex_ = tokenIndex_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq) {
        return mergeFrom((one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq other) {
      if (other == one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq.getDefaultInstance()) return this;
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
      if (!other.getTokenHash().isEmpty()) {
        tokenHash_ = other.tokenHash_;
        onChanged();
      }
      if (other.getTokenIndex() != 0) {
        setTokenIndex(other.getTokenIndex());
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
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq) e.getUnfinishedMessage();
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

    private Object tokenHash_ = "";
    /**
     * <code>string token_hash = 2;</code>
     */
    public String getTokenHash() {
      Object ref = tokenHash_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        tokenHash_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string token_hash = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTokenHashBytes() {
      Object ref = tokenHash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        tokenHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string token_hash = 2;</code>
     */
    public Builder setTokenHash(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      tokenHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string token_hash = 2;</code>
     */
    public Builder clearTokenHash() {

      tokenHash_ = getDefaultInstance().getTokenHash();
      onChanged();
      return this;
    }
    /**
     * <code>string token_hash = 2;</code>
     */
    public Builder setTokenHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      tokenHash_ = value;
      onChanged();
      return this;
    }

    private int tokenIndex_ ;
    /**
     * <code>uint32 token_index = 3;</code>
     */
    public int getTokenIndex() {
      return tokenIndex_;
    }
    /**
     * <code>uint32 token_index = 3;</code>
     */
    public Builder setTokenIndex(int value) {

      tokenIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 token_index = 3;</code>
     */
    public Builder clearTokenIndex() {

      tokenIndex_ = 0;
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


    // @@protoc_insertion_point(builder_scope:rpcpb.GetTokenBalanceReq)
  }

  // @@protoc_insertion_point(class_scope:rpcpb.GetTokenBalanceReq)
  private static final one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq();
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTokenBalanceReq>
      PARSER = new com.google.protobuf.AbstractParser<GetTokenBalanceReq>() {
    public GetTokenBalanceReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetTokenBalanceReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTokenBalanceReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GetTokenBalanceReq> getParserForType() {
    return PARSER;
  }

  public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetTokenBalanceReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
