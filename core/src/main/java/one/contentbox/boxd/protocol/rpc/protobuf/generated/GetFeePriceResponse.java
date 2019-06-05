// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transaction.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

/**
 * Protobuf type {@code rpcpb.GetFeePriceResponse}
 */
public  final class GetFeePriceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpcpb.GetFeePriceResponse)
        GetFeePriceResponseOrBuilder {
  // Use GetFeePriceResponse.newBuilder() to construct.
  private GetFeePriceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetFeePriceResponse() {
    boxPerByte_ = 0L;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetFeePriceResponse(
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

            boxPerByte_ = input.readUInt64();
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
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_GetFeePriceResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_GetFeePriceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse.Builder.class);
  }

  public static final int BOX_PER_BYTE_FIELD_NUMBER = 1;
  private long boxPerByte_;
  /**
   * <code>uint64 box_per_byte = 1;</code>
   */
  public long getBoxPerByte() {
    return boxPerByte_;
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
    if (boxPerByte_ != 0L) {
      output.writeUInt64(1, boxPerByte_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (boxPerByte_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, boxPerByte_);
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
    if (!(obj instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse)) {
      return super.equals(obj);
    }
    one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse other = (one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse) obj;

    boolean result = true;
    result = result && (getBoxPerByte()
        == other.getBoxPerByte());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BOX_PER_BYTE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBoxPerByte());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse parseFrom(
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
  public static Builder newBuilder(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse prototype) {
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
   * Protobuf type {@code rpcpb.GetFeePriceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpcpb.GetFeePriceResponse)
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_GetFeePriceResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_GetFeePriceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse.Builder.class);
    }

    // Construct using one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse.newBuilder()
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
      boxPerByte_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_GetFeePriceResponse_descriptor;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse getDefaultInstanceForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse.getDefaultInstance();
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse build() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse buildPartial() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse result = new one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse(this);
      result.boxPerByte_ = boxPerByte_;
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
      if (other instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse) {
        return mergeFrom((one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse other) {
      if (other == one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse.getDefaultInstance()) return this;
      if (other.getBoxPerByte() != 0L) {
        setBoxPerByte(other.getBoxPerByte());
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
      one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long boxPerByte_ ;
    /**
     * <code>uint64 box_per_byte = 1;</code>
     */
    public long getBoxPerByte() {
      return boxPerByte_;
    }
    /**
     * <code>uint64 box_per_byte = 1;</code>
     */
    public Builder setBoxPerByte(long value) {

      boxPerByte_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 box_per_byte = 1;</code>
     */
    public Builder clearBoxPerByte() {

      boxPerByte_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:rpcpb.GetFeePriceResponse)
  }

  // @@protoc_insertion_point(class_scope:rpcpb.GetFeePriceResponse)
  private static final one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse();
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetFeePriceResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetFeePriceResponse>() {
    public GetFeePriceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetFeePriceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetFeePriceResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GetFeePriceResponse> getParserForType() {
    return PARSER;
  }

  public one.contentbox.boxd.protocol.rpc.protobuf.generated.GetFeePriceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

