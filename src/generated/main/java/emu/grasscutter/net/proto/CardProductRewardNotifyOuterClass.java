// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CardProductRewardNotify.proto

package emu.grasscutter.net.proto;

public final class CardProductRewardNotifyOuterClass {
  private CardProductRewardNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CardProductRewardNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CardProductRewardNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * MLKHDJPCJLG
     * </pre>
     *
     * <code>uint32 remain_days = 8;</code>
     * @return The remainDays.
     */
    int getRemainDays();

    /**
     * <pre>
     * OKKCPKEGAJF
     * </pre>
     *
     * <code>uint32 hcoin = 1;</code>
     * @return The hcoin.
     */
    int getHcoin();

    /**
     * <code>string product_id = 12;</code>
     * @return The productId.
     */
    java.lang.String getProductId();
    /**
     * <code>string product_id = 12;</code>
     * @return The bytes for productId.
     */
    com.google.protobuf.ByteString
        getProductIdBytes();
  }
  /**
   * <pre>
   * CmdId: 4149
   * Name: FGEMJEBIEBF
   * </pre>
   *
   * Protobuf type {@code CardProductRewardNotify}
   */
  public static final class CardProductRewardNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CardProductRewardNotify)
      CardProductRewardNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CardProductRewardNotify.newBuilder() to construct.
    private CardProductRewardNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CardProductRewardNotify() {
      productId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CardProductRewardNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CardProductRewardNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              hcoin_ = input.readUInt32();
              break;
            }
            case 64: {

              remainDays_ = input.readUInt32();
              break;
            }
            case 98: {
              java.lang.String s = input.readStringRequireUtf8();

              productId_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify.class, emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify.Builder.class);
    }

    public static final int REMAIN_DAYS_FIELD_NUMBER = 8;
    private int remainDays_;
    /**
     * <pre>
     * MLKHDJPCJLG
     * </pre>
     *
     * <code>uint32 remain_days = 8;</code>
     * @return The remainDays.
     */
    @java.lang.Override
    public int getRemainDays() {
      return remainDays_;
    }

    public static final int HCOIN_FIELD_NUMBER = 1;
    private int hcoin_;
    /**
     * <pre>
     * OKKCPKEGAJF
     * </pre>
     *
     * <code>uint32 hcoin = 1;</code>
     * @return The hcoin.
     */
    @java.lang.Override
    public int getHcoin() {
      return hcoin_;
    }

    public static final int PRODUCT_ID_FIELD_NUMBER = 12;
    private volatile java.lang.Object productId_;
    /**
     * <code>string product_id = 12;</code>
     * @return The productId.
     */
    @java.lang.Override
    public java.lang.String getProductId() {
      java.lang.Object ref = productId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productId_ = s;
        return s;
      }
    }
    /**
     * <code>string product_id = 12;</code>
     * @return The bytes for productId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getProductIdBytes() {
      java.lang.Object ref = productId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hcoin_ != 0) {
        output.writeUInt32(1, hcoin_);
      }
      if (remainDays_ != 0) {
        output.writeUInt32(8, remainDays_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, productId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hcoin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, hcoin_);
      }
      if (remainDays_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, remainDays_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, productId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify other = (emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify) obj;

      if (getRemainDays()
          != other.getRemainDays()) return false;
      if (getHcoin()
          != other.getHcoin()) return false;
      if (!getProductId()
          .equals(other.getProductId())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REMAIN_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + getRemainDays();
      hash = (37 * hash) + HCOIN_FIELD_NUMBER;
      hash = (53 * hash) + getHcoin();
      hash = (37 * hash) + PRODUCT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getProductId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 4149
     * Name: FGEMJEBIEBF
     * </pre>
     *
     * Protobuf type {@code CardProductRewardNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CardProductRewardNotify)
        emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify.class, emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        remainDays_ = 0;

        hcoin_ = 0;

        productId_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.internal_static_CardProductRewardNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify build() {
        emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify buildPartial() {
        emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify result = new emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify(this);
        result.remainDays_ = remainDays_;
        result.hcoin_ = hcoin_;
        result.productId_ = productId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify) {
          return mergeFrom((emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify other) {
        if (other == emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify.getDefaultInstance()) return this;
        if (other.getRemainDays() != 0) {
          setRemainDays(other.getRemainDays());
        }
        if (other.getHcoin() != 0) {
          setHcoin(other.getHcoin());
        }
        if (!other.getProductId().isEmpty()) {
          productId_ = other.productId_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int remainDays_ ;
      /**
       * <pre>
       * MLKHDJPCJLG
       * </pre>
       *
       * <code>uint32 remain_days = 8;</code>
       * @return The remainDays.
       */
      @java.lang.Override
      public int getRemainDays() {
        return remainDays_;
      }
      /**
       * <pre>
       * MLKHDJPCJLG
       * </pre>
       *
       * <code>uint32 remain_days = 8;</code>
       * @param value The remainDays to set.
       * @return This builder for chaining.
       */
      public Builder setRemainDays(int value) {
        
        remainDays_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * MLKHDJPCJLG
       * </pre>
       *
       * <code>uint32 remain_days = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRemainDays() {
        
        remainDays_ = 0;
        onChanged();
        return this;
      }

      private int hcoin_ ;
      /**
       * <pre>
       * OKKCPKEGAJF
       * </pre>
       *
       * <code>uint32 hcoin = 1;</code>
       * @return The hcoin.
       */
      @java.lang.Override
      public int getHcoin() {
        return hcoin_;
      }
      /**
       * <pre>
       * OKKCPKEGAJF
       * </pre>
       *
       * <code>uint32 hcoin = 1;</code>
       * @param value The hcoin to set.
       * @return This builder for chaining.
       */
      public Builder setHcoin(int value) {
        
        hcoin_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * OKKCPKEGAJF
       * </pre>
       *
       * <code>uint32 hcoin = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearHcoin() {
        
        hcoin_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object productId_ = "";
      /**
       * <code>string product_id = 12;</code>
       * @return The productId.
       */
      public java.lang.String getProductId() {
        java.lang.Object ref = productId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          productId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string product_id = 12;</code>
       * @return The bytes for productId.
       */
      public com.google.protobuf.ByteString
          getProductIdBytes() {
        java.lang.Object ref = productId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          productId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string product_id = 12;</code>
       * @param value The productId to set.
       * @return This builder for chaining.
       */
      public Builder setProductId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        productId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string product_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearProductId() {
        
        productId_ = getDefaultInstance().getProductId();
        onChanged();
        return this;
      }
      /**
       * <code>string product_id = 12;</code>
       * @param value The bytes for productId to set.
       * @return This builder for chaining.
       */
      public Builder setProductIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        productId_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CardProductRewardNotify)
    }

    // @@protoc_insertion_point(class_scope:CardProductRewardNotify)
    private static final emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify();
    }

    public static emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CardProductRewardNotify>
        PARSER = new com.google.protobuf.AbstractParser<CardProductRewardNotify>() {
      @java.lang.Override
      public CardProductRewardNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CardProductRewardNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CardProductRewardNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CardProductRewardNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CardProductRewardNotifyOuterClass.CardProductRewardNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CardProductRewardNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CardProductRewardNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035CardProductRewardNotify.proto\"Q\n\027CardP" +
      "roductRewardNotify\022\023\n\013remain_days\030\010 \001(\r\022" +
      "\r\n\005hcoin\030\001 \001(\r\022\022\n\nproduct_id\030\014 \001(\tB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CardProductRewardNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CardProductRewardNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CardProductRewardNotify_descriptor,
        new java.lang.String[] { "RemainDays", "Hcoin", "ProductId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
