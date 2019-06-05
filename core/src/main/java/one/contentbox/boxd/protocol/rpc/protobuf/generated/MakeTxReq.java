// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transaction.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

/**
 * Protobuf type {@code rpcpb.MakeTxReq}
 */
public  final class MakeTxReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpcpb.MakeTxReq)
    MakeTxReqOrBuilder {
  // Use MakeTxReq.newBuilder() to construct.
  private MakeTxReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MakeTxReq() {
    from_ = "";
    to_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    amounts_ = java.util.Collections.emptyList();
    gasPrice_ = 0L;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MakeTxReq(
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

            from_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              to_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            to_.add(s);
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              amounts_ = new java.util.ArrayList<Long>();
              mutable_bitField0_ |= 0x00000004;
            }
            amounts_.add(input.readUInt64());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
              amounts_ = new java.util.ArrayList<Long>();
              mutable_bitField0_ |= 0x00000004;
            }
            while (input.getBytesUntilLimit() > 0) {
              amounts_.add(input.readUInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 32: {

            gasPrice_ = input.readUInt64();
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        to_ = to_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        amounts_ = java.util.Collections.unmodifiableList(amounts_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_MakeTxReq_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_MakeTxReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq.Builder.class);
  }

  private int bitField0_;
  public static final int FROM_FIELD_NUMBER = 1;
  private volatile Object from_;
  /**
   * <code>string from = 1;</code>
   */
  public String getFrom() {
    Object ref = from_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      from_ = s;
      return s;
    }
  }
  /**
   * <code>string from = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFromBytes() {
    Object ref = from_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      from_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TO_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList to_;
  /**
   * <code>repeated string to = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getToList() {
    return to_;
  }
  /**
   * <code>repeated string to = 2;</code>
   */
  public int getToCount() {
    return to_.size();
  }
  /**
   * <code>repeated string to = 2;</code>
   */
  public String getTo(int index) {
    return to_.get(index);
  }
  /**
   * <code>repeated string to = 2;</code>
   */
  public com.google.protobuf.ByteString
      getToBytes(int index) {
    return to_.getByteString(index);
  }

  public static final int AMOUNTS_FIELD_NUMBER = 3;
  private java.util.List<Long> amounts_;
  /**
   * <code>repeated uint64 amounts = 3;</code>
   */
  public java.util.List<Long>
      getAmountsList() {
    return amounts_;
  }
  /**
   * <code>repeated uint64 amounts = 3;</code>
   */
  public int getAmountsCount() {
    return amounts_.size();
  }
  /**
   * <code>repeated uint64 amounts = 3;</code>
   */
  public long getAmounts(int index) {
    return amounts_.get(index);
  }
  private int amountsMemoizedSerializedSize = -1;

  public static final int GAS_PRICE_FIELD_NUMBER = 4;
  private long gasPrice_;
  /**
   * <code>uint64 gas_price = 4;</code>
   */
  public long getGasPrice() {
    return gasPrice_;
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
    getSerializedSize();
    if (!getFromBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, from_);
    }
    for (int i = 0; i < to_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, to_.getRaw(i));
    }
    if (getAmountsList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(amountsMemoizedSerializedSize);
    }
    for (int i = 0; i < amounts_.size(); i++) {
      output.writeUInt64NoTag(amounts_.get(i));
    }
    if (gasPrice_ != 0L) {
      output.writeUInt64(4, gasPrice_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFromBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, from_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < to_.size(); i++) {
        dataSize += computeStringSizeNoTag(to_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getToList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < amounts_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(amounts_.get(i));
      }
      size += dataSize;
      if (!getAmountsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      amountsMemoizedSerializedSize = dataSize;
    }
    if (gasPrice_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, gasPrice_);
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
    if (!(obj instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq)) {
      return super.equals(obj);
    }
    one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq other = (one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq) obj;

    boolean result = true;
    result = result && getFrom()
        .equals(other.getFrom());
    result = result && getToList()
        .equals(other.getToList());
    result = result && getAmountsList()
        .equals(other.getAmountsList());
    result = result && (getGasPrice()
        == other.getGasPrice());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom().hashCode();
    if (getToCount() > 0) {
      hash = (37 * hash) + TO_FIELD_NUMBER;
      hash = (53 * hash) + getToList().hashCode();
    }
    if (getAmountsCount() > 0) {
      hash = (37 * hash) + AMOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + getAmountsList().hashCode();
    }
    hash = (37 * hash) + GAS_PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGasPrice());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq parseFrom(
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
  public static Builder newBuilder(one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq prototype) {
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
   * Protobuf type {@code rpcpb.MakeTxReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpcpb.MakeTxReq)
      one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_MakeTxReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_MakeTxReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq.Builder.class);
    }

    // Construct using one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq.newBuilder()
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
      from_ = "";

      to_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      amounts_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      gasPrice_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_MakeTxReq_descriptor;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq getDefaultInstanceForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq.getDefaultInstance();
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq build() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq buildPartial() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq result = new one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.from_ = from_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        to_ = to_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.to_ = to_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        amounts_ = java.util.Collections.unmodifiableList(amounts_);
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.amounts_ = amounts_;
      result.gasPrice_ = gasPrice_;
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
      if (other instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq) {
        return mergeFrom((one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq other) {
      if (other == one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq.getDefaultInstance()) return this;
      if (!other.getFrom().isEmpty()) {
        from_ = other.from_;
        onChanged();
      }
      if (!other.to_.isEmpty()) {
        if (to_.isEmpty()) {
          to_ = other.to_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureToIsMutable();
          to_.addAll(other.to_);
        }
        onChanged();
      }
      if (!other.amounts_.isEmpty()) {
        if (amounts_.isEmpty()) {
          amounts_ = other.amounts_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureAmountsIsMutable();
          amounts_.addAll(other.amounts_);
        }
        onChanged();
      }
      if (other.getGasPrice() != 0L) {
        setGasPrice(other.getGasPrice());
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
      one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object from_ = "";
    /**
     * <code>string from = 1;</code>
     */
    public String getFrom() {
      Object ref = from_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        from_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string from = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      Object ref = from_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from = 1;</code>
     */
    public Builder setFrom(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      from_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string from = 1;</code>
     */
    public Builder clearFrom() {

      from_ = getDefaultInstance().getFrom();
      onChanged();
      return this;
    }
    /**
     * <code>string from = 1;</code>
     */
    public Builder setFromBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      from_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList to_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureToIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        to_ = new com.google.protobuf.LazyStringArrayList(to_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string to = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getToList() {
      return to_.getUnmodifiableView();
    }
    /**
     * <code>repeated string to = 2;</code>
     */
    public int getToCount() {
      return to_.size();
    }
    /**
     * <code>repeated string to = 2;</code>
     */
    public String getTo(int index) {
      return to_.get(index);
    }
    /**
     * <code>repeated string to = 2;</code>
     */
    public com.google.protobuf.ByteString
        getToBytes(int index) {
      return to_.getByteString(index);
    }
    /**
     * <code>repeated string to = 2;</code>
     */
    public Builder setTo(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureToIsMutable();
      to_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string to = 2;</code>
     */
    public Builder addTo(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureToIsMutable();
      to_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string to = 2;</code>
     */
    public Builder addAllTo(
        Iterable<String> values) {
      ensureToIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, to_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string to = 2;</code>
     */
    public Builder clearTo() {
      to_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string to = 2;</code>
     */
    public Builder addToBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureToIsMutable();
      to_.add(value);
      onChanged();
      return this;
    }

    private java.util.List<Long> amounts_ = java.util.Collections.emptyList();
    private void ensureAmountsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        amounts_ = new java.util.ArrayList<Long>(amounts_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated uint64 amounts = 3;</code>
     */
    public java.util.List<Long>
        getAmountsList() {
      return java.util.Collections.unmodifiableList(amounts_);
    }
    /**
     * <code>repeated uint64 amounts = 3;</code>
     */
    public int getAmountsCount() {
      return amounts_.size();
    }
    /**
     * <code>repeated uint64 amounts = 3;</code>
     */
    public long getAmounts(int index) {
      return amounts_.get(index);
    }
    /**
     * <code>repeated uint64 amounts = 3;</code>
     */
    public Builder setAmounts(
        int index, long value) {
      ensureAmountsIsMutable();
      amounts_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 amounts = 3;</code>
     */
    public Builder addAmounts(long value) {
      ensureAmountsIsMutable();
      amounts_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 amounts = 3;</code>
     */
    public Builder addAllAmounts(
        Iterable<? extends Long> values) {
      ensureAmountsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, amounts_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 amounts = 3;</code>
     */
    public Builder clearAmounts() {
      amounts_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    private long gasPrice_ ;
    /**
     * <code>uint64 gas_price = 4;</code>
     */
    public long getGasPrice() {
      return gasPrice_;
    }
    /**
     * <code>uint64 gas_price = 4;</code>
     */
    public Builder setGasPrice(long value) {

      gasPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 gas_price = 4;</code>
     */
    public Builder clearGasPrice() {

      gasPrice_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:rpcpb.MakeTxReq)
  }

  // @@protoc_insertion_point(class_scope:rpcpb.MakeTxReq)
  private static final one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq();
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MakeTxReq>
      PARSER = new com.google.protobuf.AbstractParser<MakeTxReq>() {
    public MakeTxReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MakeTxReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MakeTxReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<MakeTxReq> getParserForType() {
    return PARSER;
  }

  public one.contentbox.boxd.protocol.rpc.protobuf.generated.MakeTxReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
