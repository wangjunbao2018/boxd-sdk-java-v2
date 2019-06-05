// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transaction.proto

package one.contentbox.boxd.protocol.rpc.protobuf.generated;

/**
 * Protobuf type {@code rpcpb.SendTransactionReq}
 */
public  final class SendTransactionReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpcpb.SendTransactionReq)
    SendTransactionReqOrBuilder {
  // Use SendTransactionReq.newBuilder() to construct.
  private SendTransactionReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendTransactionReq() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SendTransactionReq(
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
            one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction.Builder subBuilder = null;
            if (tx_ != null) {
              subBuilder = tx_.toBuilder();
            }
            tx_ = input.readMessage(one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tx_);
              tx_ = subBuilder.buildPartial();
            }

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
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_SendTransactionReq_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_SendTransactionReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq.Builder.class);
  }

  public static final int TX_FIELD_NUMBER = 1;
  private one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction tx_;
  /**
   * <code>.corepb.Transaction tx = 1;</code>
   */
  public boolean hasTx() {
    return tx_ != null;
  }
  /**
   * <code>.corepb.Transaction tx = 1;</code>
   */
  public one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction getTx() {
    return tx_ == null ? one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction.getDefaultInstance() : tx_;
  }
  /**
   * <code>.corepb.Transaction tx = 1;</code>
   */
  public one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionOrBuilder getTxOrBuilder() {
    return getTx();
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
    if (tx_ != null) {
      output.writeMessage(1, getTx());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tx_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTx());
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
    if (!(obj instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq)) {
      return super.equals(obj);
    }
    one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq other = (one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq) obj;

    boolean result = true;
    result = result && (hasTx() == other.hasTx());
    if (hasTx()) {
      result = result && getTx()
          .equals(other.getTx());
    }
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTx()) {
      hash = (37 * hash) + TX_FIELD_NUMBER;
      hash = (53 * hash) + getTx().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq parseFrom(
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
  public static Builder newBuilder(one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq prototype) {
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
   * Protobuf type {@code rpcpb.SendTransactionReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpcpb.SendTransactionReq)
      one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_SendTransactionReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_SendTransactionReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq.class, one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq.Builder.class);
    }

    // Construct using one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq.newBuilder()
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
      if (txBuilder_ == null) {
        tx_ = null;
      } else {
        tx_ = null;
        txBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionProto.internal_static_rpcpb_SendTransactionReq_descriptor;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq getDefaultInstanceForType() {
      return one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq.getDefaultInstance();
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq build() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq buildPartial() {
      one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq result = new one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq(this);
      if (txBuilder_ == null) {
        result.tx_ = tx_;
      } else {
        result.tx_ = txBuilder_.build();
      }
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
      if (other instanceof one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq) {
        return mergeFrom((one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq other) {
      if (other == one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq.getDefaultInstance()) return this;
      if (other.hasTx()) {
        mergeTx(other.getTx());
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
      one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction tx_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction, one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction.Builder, one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionOrBuilder> txBuilder_;
    /**
     * <code>.corepb.Transaction tx = 1;</code>
     */
    public boolean hasTx() {
      return txBuilder_ != null || tx_ != null;
    }
    /**
     * <code>.corepb.Transaction tx = 1;</code>
     */
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction getTx() {
      if (txBuilder_ == null) {
        return tx_ == null ? one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction.getDefaultInstance() : tx_;
      } else {
        return txBuilder_.getMessage();
      }
    }
    /**
     * <code>.corepb.Transaction tx = 1;</code>
     */
    public Builder setTx(one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction value) {
      if (txBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tx_ = value;
        onChanged();
      } else {
        txBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.corepb.Transaction tx = 1;</code>
     */
    public Builder setTx(
        one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction.Builder builderForValue) {
      if (txBuilder_ == null) {
        tx_ = builderForValue.build();
        onChanged();
      } else {
        txBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.corepb.Transaction tx = 1;</code>
     */
    public Builder mergeTx(one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction value) {
      if (txBuilder_ == null) {
        if (tx_ != null) {
          tx_ =
            one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction.newBuilder(tx_).mergeFrom(value).buildPartial();
        } else {
          tx_ = value;
        }
        onChanged();
      } else {
        txBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.corepb.Transaction tx = 1;</code>
     */
    public Builder clearTx() {
      if (txBuilder_ == null) {
        tx_ = null;
        onChanged();
      } else {
        tx_ = null;
        txBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.corepb.Transaction tx = 1;</code>
     */
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction.Builder getTxBuilder() {

      onChanged();
      return getTxFieldBuilder().getBuilder();
    }
    /**
     * <code>.corepb.Transaction tx = 1;</code>
     */
    public one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionOrBuilder getTxOrBuilder() {
      if (txBuilder_ != null) {
        return txBuilder_.getMessageOrBuilder();
      } else {
        return tx_ == null ?
            one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction.getDefaultInstance() : tx_;
      }
    }
    /**
     * <code>.corepb.Transaction tx = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction, one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction.Builder, one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionOrBuilder>
        getTxFieldBuilder() {
      if (txBuilder_ == null) {
        txBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction, one.contentbox.boxd.protocol.rpc.protobuf.generated.Transaction.Builder, one.contentbox.boxd.protocol.rpc.protobuf.generated.TransactionOrBuilder>(
                getTx(),
                getParentForChildren(),
                isClean());
        tx_ = null;
      }
      return txBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:rpcpb.SendTransactionReq)
  }

  // @@protoc_insertion_point(class_scope:rpcpb.SendTransactionReq)
  private static final one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq();
  }

  public static one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendTransactionReq>
      PARSER = new com.google.protobuf.AbstractParser<SendTransactionReq>() {
    public SendTransactionReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SendTransactionReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendTransactionReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SendTransactionReq> getParserForType() {
    return PARSER;
  }

  public one.contentbox.boxd.protocol.rpc.protobuf.generated.SendTransactionReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

