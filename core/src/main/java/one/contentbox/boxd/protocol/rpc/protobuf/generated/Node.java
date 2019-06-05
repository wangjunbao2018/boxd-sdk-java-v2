// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: control.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

/**
 * Protobuf type {@code rpcpb.Node}
 */
public  final class Node extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpcpb.Node)
    NodeOrBuilder {
  // Use Node.newBuilder() to construct.
  private Node(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Node() {
    id_ = "";
    addrs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    ttl_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Node(
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

            id_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              addrs_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            addrs_.add(s);
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            ttl_ = s;
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
        addrs_ = addrs_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.ControlProto.internal_static_rpcpb_Node_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.ControlProto.internal_static_rpcpb_Node_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            one.contentbox.boxd.protocol.rpc.protobuf.generated.Node.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.Node.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private volatile Object id_;
  /**
   * <code>string id = 1;</code>
   */
  public String getId() {
    Object ref = id_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    Object ref = id_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDRS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList addrs_;
  /**
   * <code>repeated string addrs = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getAddrsList() {
    return addrs_;
  }
  /**
   * <code>repeated string addrs = 2;</code>
   */
  public int getAddrsCount() {
    return addrs_.size();
  }
  /**
   * <code>repeated string addrs = 2;</code>
   */
  public String getAddrs(int index) {
    return addrs_.get(index);
  }
  /**
   * <code>repeated string addrs = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAddrsBytes(int index) {
    return addrs_.getByteString(index);
  }

  public static final int TTL_FIELD_NUMBER = 3;
  private volatile Object ttl_;
  /**
   * <code>string ttl = 3;</code>
   */
  public String getTtl() {
    Object ref = ttl_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      ttl_ = s;
      return s;
    }
  }
  /**
   * <code>string ttl = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTtlBytes() {
    Object ref = ttl_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      ttl_ = b;
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    for (int i = 0; i < addrs_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, addrs_.getRaw(i));
    }
    if (!getTtlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ttl_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < addrs_.size(); i++) {
        dataSize += computeStringSizeNoTag(addrs_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAddrsList().size();
    }
    if (!getTtlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ttl_);
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
    if (!(obj instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.Node)) {
      return super.equals(obj);
    }
    one.contentbox.boxd.protocol.rpc.protobuf.generated.Node other = (one.contentbox.boxd.protocol.rpc.protobuf.generated.Node) obj;

    boolean result = true;
    result = result && getId()
        .equals(other.getId());
    result = result && getAddrsList()
        .equals(other.getAddrsList());
    result = result && getTtl()
        .equals(other.getTtl());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (getAddrsCount() > 0) {
      hash = (37 * hash) + ADDRS_FIELD_NUMBER;
      hash = (53 * hash) + getAddrsList().hashCode();
    }
    hash = (37 * hash) + TTL_FIELD_NUMBER;
    hash = (53 * hash) + getTtl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.Node parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.Node parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.Node parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.Node parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.Node parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.Node parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.Node parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.Node parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.Node parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.Node parseFrom(
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
  public static Builder newBuilder(one.contentbox.boxd.protocol.rpc.protobuf.generated.Node prototype) {
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
   * Protobuf type {@code rpcpb.Node}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpcpb.Node)
      one.contentbox.boxd.protocol.rpc.protobuf.generated.NodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.ControlProto.internal_static_rpcpb_Node_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.ControlProto.internal_static_rpcpb_Node_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.Node.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.Node.Builder.class);
    }

    // Construct using one.contentbox.boxd.protocol.rpc.protobuf.generated.Node.newBuilder()
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
      id_ = "";

      addrs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      ttl_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.ControlProto.internal_static_rpcpb_Node_descriptor;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.Node getDefaultInstanceForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.Node.getDefaultInstance();
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.Node build() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.Node result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.Node buildPartial() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.Node result = new one.contentbox.boxd.protocol.rpc.protobuf.generated.Node(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        addrs_ = addrs_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.addrs_ = addrs_;
      result.ttl_ = ttl_;
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
      if (other instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.Node) {
        return mergeFrom((one.contentbox.boxd.protocol.rpc.protobuf.generated.Node)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(one.contentbox.boxd.protocol.rpc.protobuf.generated.Node other) {
      if (other == one.contentbox.boxd.protocol.rpc.protobuf.generated.Node.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.addrs_.isEmpty()) {
        if (addrs_.isEmpty()) {
          addrs_ = other.addrs_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureAddrsIsMutable();
          addrs_.addAll(other.addrs_);
        }
        onChanged();
      }
      if (!other.getTtl().isEmpty()) {
        ttl_ = other.ttl_;
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
      one.contentbox.boxd.protocol.rpc.protobuf.generated.Node parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (one.contentbox.boxd.protocol.rpc.protobuf.generated.Node) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object id_ = "";
    /**
     * <code>string id = 1;</code>
     */
    public String getId() {
      Object ref = id_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder clearId() {

      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      id_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList addrs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAddrsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        addrs_ = new com.google.protobuf.LazyStringArrayList(addrs_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string addrs = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getAddrsList() {
      return addrs_.getUnmodifiableView();
    }
    /**
     * <code>repeated string addrs = 2;</code>
     */
    public int getAddrsCount() {
      return addrs_.size();
    }
    /**
     * <code>repeated string addrs = 2;</code>
     */
    public String getAddrs(int index) {
      return addrs_.get(index);
    }
    /**
     * <code>repeated string addrs = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAddrsBytes(int index) {
      return addrs_.getByteString(index);
    }
    /**
     * <code>repeated string addrs = 2;</code>
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
     * <code>repeated string addrs = 2;</code>
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
     * <code>repeated string addrs = 2;</code>
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
     * <code>repeated string addrs = 2;</code>
     */
    public Builder clearAddrs() {
      addrs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addrs = 2;</code>
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

    private Object ttl_ = "";
    /**
     * <code>string ttl = 3;</code>
     */
    public String getTtl() {
      Object ref = ttl_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        ttl_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string ttl = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTtlBytes() {
      Object ref = ttl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        ttl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ttl = 3;</code>
     */
    public Builder setTtl(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      ttl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ttl = 3;</code>
     */
    public Builder clearTtl() {

      ttl_ = getDefaultInstance().getTtl();
      onChanged();
      return this;
    }
    /**
     * <code>string ttl = 3;</code>
     */
    public Builder setTtlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      ttl_ = value;
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


    // @@protoc_insertion_point(builder_scope:rpcpb.Node)
  }

  // @@protoc_insertion_point(class_scope:rpcpb.Node)
  private static final one.contentbox.boxd.protocol.rpc.protobuf.generated.Node DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new one.contentbox.boxd.protocol.rpc.protobuf.generated.Node();
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.Node getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Node>
      PARSER = new com.google.protobuf.AbstractParser<Node>() {
    public Node parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Node(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Node> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Node> getParserForType() {
    return PARSER;
  }

  public one.contentbox.boxd.protocol.rpc.protobuf.generated.Node getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

