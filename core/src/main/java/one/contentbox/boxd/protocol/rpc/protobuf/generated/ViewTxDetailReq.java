// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: web.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

/**
 * Protobuf type {@code rpcpb.ViewTxDetailReq}
 */
public  final class ViewTxDetailReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpcpb.ViewTxDetailReq)
    ViewTxDetailReqOrBuilder {
  // Use ViewTxDetailReq.newBuilder() to construct.
  private ViewTxDetailReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ViewTxDetailReq() {
    hash_ = "";
    spreadSplit_ = false;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ViewTxDetailReq(
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

            hash_ = s;
            break;
          }
          case 16: {

            spreadSplit_ = input.readBool();
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
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.internal_static_rpcpb_ViewTxDetailReq_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.internal_static_rpcpb_ViewTxDetailReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq.Builder.class);
  }

  public static final int HASH_FIELD_NUMBER = 1;
  private volatile Object hash_;
  /**
   * <code>string hash = 1;</code>
   */
  public String getHash() {
    Object ref = hash_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      hash_ = s;
      return s;
    }
  }
  /**
   * <code>string hash = 1;</code>
   */
  public com.google.protobuf.ByteString
      getHashBytes() {
    Object ref = hash_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      hash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPREAD_SPLIT_FIELD_NUMBER = 2;
  private boolean spreadSplit_;
  /**
   * <code>bool spread_split = 2;</code>
   */
  public boolean getSpreadSplit() {
    return spreadSplit_;
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
    if (!getHashBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hash_);
    }
    if (spreadSplit_ != false) {
      output.writeBool(2, spreadSplit_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHashBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hash_);
    }
    if (spreadSplit_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, spreadSplit_);
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
    if (!(obj instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq)) {
      return super.equals(obj);
    }
    one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq other = (one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq) obj;

    boolean result = true;
    result = result && getHash()
        .equals(other.getHash());
    result = result && (getSpreadSplit()
        == other.getSpreadSplit());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    hash = (37 * hash) + SPREAD_SPLIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSpreadSplit());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq parseFrom(
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
  public static Builder newBuilder(one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq prototype) {
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
   * Protobuf type {@code rpcpb.ViewTxDetailReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpcpb.ViewTxDetailReq)
      one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.internal_static_rpcpb_ViewTxDetailReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.internal_static_rpcpb_ViewTxDetailReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq.Builder.class);
    }

    // Construct using one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq.newBuilder()
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
      hash_ = "";

      spreadSplit_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.WebProto.internal_static_rpcpb_ViewTxDetailReq_descriptor;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq getDefaultInstanceForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq.getDefaultInstance();
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq build() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq buildPartial() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq result = new one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq(this);
      result.hash_ = hash_;
      result.spreadSplit_ = spreadSplit_;
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
      if (other instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq) {
        return mergeFrom((one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq other) {
      if (other == one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq.getDefaultInstance()) return this;
      if (!other.getHash().isEmpty()) {
        hash_ = other.hash_;
        onChanged();
      }
      if (other.getSpreadSplit() != false) {
        setSpreadSplit(other.getSpreadSplit());
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
      one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object hash_ = "";
    /**
     * <code>string hash = 1;</code>
     */
    public String getHash() {
      Object ref = hash_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        hash_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string hash = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHashBytes() {
      Object ref = hash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        hash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hash = 1;</code>
     */
    public Builder setHash(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      hash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hash = 1;</code>
     */
    public Builder clearHash() {

      hash_ = getDefaultInstance().getHash();
      onChanged();
      return this;
    }
    /**
     * <code>string hash = 1;</code>
     */
    public Builder setHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      hash_ = value;
      onChanged();
      return this;
    }

    private boolean spreadSplit_ ;
    /**
     * <code>bool spread_split = 2;</code>
     */
    public boolean getSpreadSplit() {
      return spreadSplit_;
    }
    /**
     * <code>bool spread_split = 2;</code>
     */
    public Builder setSpreadSplit(boolean value) {

      spreadSplit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool spread_split = 2;</code>
     */
    public Builder clearSpreadSplit() {

      spreadSplit_ = false;
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


    // @@protoc_insertion_point(builder_scope:rpcpb.ViewTxDetailReq)
  }

  // @@protoc_insertion_point(class_scope:rpcpb.ViewTxDetailReq)
  private static final one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq();
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ViewTxDetailReq>
      PARSER = new com.google.protobuf.AbstractParser<ViewTxDetailReq>() {
    public ViewTxDetailReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ViewTxDetailReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ViewTxDetailReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ViewTxDetailReq> getParserForType() {
    return PARSER;
  }

  public one.contentbox.boxd.protocol.rpc.protobuf.generated.ViewTxDetailReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

