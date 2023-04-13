// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageMarketDeliverItemReq.proto

package emu.grasscutter.net.proto;

public final class VintageMarketDeliverItemReqOuterClass {
  private VintageMarketDeliverItemReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageMarketDeliverItemReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageMarketDeliverItemReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 trader_id = 7;</code>
     * @return The traderId.
     */
    int getTraderId();

    /**
     * <code>repeated .ItemParam deliver_item_list = 15;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> 
        getDeliverItemListList();
    /**
     * <code>repeated .ItemParam deliver_item_list = 15;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getDeliverItemList(int index);
    /**
     * <code>repeated .ItemParam deliver_item_list = 15;</code>
     */
    int getDeliverItemListCount();
    /**
     * <code>repeated .ItemParam deliver_item_list = 15;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getDeliverItemListOrBuilderList();
    /**
     * <code>repeated .ItemParam deliver_item_list = 15;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getDeliverItemListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 21795
   * Name: NKHKFPKDMOK
   * </pre>
   *
   * Protobuf type {@code VintageMarketDeliverItemReq}
   */
  public static final class VintageMarketDeliverItemReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageMarketDeliverItemReq)
      VintageMarketDeliverItemReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageMarketDeliverItemReq.newBuilder() to construct.
    private VintageMarketDeliverItemReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageMarketDeliverItemReq() {
      deliverItemList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageMarketDeliverItemReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VintageMarketDeliverItemReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 56: {

              traderId_ = input.readUInt32();
              break;
            }
            case 122: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                deliverItemList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>();
                mutable_bitField0_ |= 0x00000001;
              }
              deliverItemList_.add(
                  input.readMessage(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          deliverItemList_ = java.util.Collections.unmodifiableList(deliverItemList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.internal_static_VintageMarketDeliverItemReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.internal_static_VintageMarketDeliverItemReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq.class, emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq.Builder.class);
    }

    public static final int TRADER_ID_FIELD_NUMBER = 7;
    private int traderId_;
    /**
     * <code>uint32 trader_id = 7;</code>
     * @return The traderId.
     */
    @java.lang.Override
    public int getTraderId() {
      return traderId_;
    }

    public static final int DELIVER_ITEM_LIST_FIELD_NUMBER = 15;
    private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> deliverItemList_;
    /**
     * <code>repeated .ItemParam deliver_item_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getDeliverItemListList() {
      return deliverItemList_;
    }
    /**
     * <code>repeated .ItemParam deliver_item_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getDeliverItemListOrBuilderList() {
      return deliverItemList_;
    }
    /**
     * <code>repeated .ItemParam deliver_item_list = 15;</code>
     */
    @java.lang.Override
    public int getDeliverItemListCount() {
      return deliverItemList_.size();
    }
    /**
     * <code>repeated .ItemParam deliver_item_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getDeliverItemList(int index) {
      return deliverItemList_.get(index);
    }
    /**
     * <code>repeated .ItemParam deliver_item_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getDeliverItemListOrBuilder(
        int index) {
      return deliverItemList_.get(index);
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
      if (traderId_ != 0) {
        output.writeUInt32(7, traderId_);
      }
      for (int i = 0; i < deliverItemList_.size(); i++) {
        output.writeMessage(15, deliverItemList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (traderId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, traderId_);
      }
      for (int i = 0; i < deliverItemList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, deliverItemList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq other = (emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq) obj;

      if (getTraderId()
          != other.getTraderId()) return false;
      if (!getDeliverItemListList()
          .equals(other.getDeliverItemListList())) return false;
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
      hash = (37 * hash) + TRADER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTraderId();
      if (getDeliverItemListCount() > 0) {
        hash = (37 * hash) + DELIVER_ITEM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDeliverItemListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq prototype) {
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
     * CmdId: 21795
     * Name: NKHKFPKDMOK
     * </pre>
     *
     * Protobuf type {@code VintageMarketDeliverItemReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageMarketDeliverItemReq)
        emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.internal_static_VintageMarketDeliverItemReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.internal_static_VintageMarketDeliverItemReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq.class, emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq.newBuilder()
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
          getDeliverItemListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        traderId_ = 0;

        if (deliverItemListBuilder_ == null) {
          deliverItemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          deliverItemListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.internal_static_VintageMarketDeliverItemReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq build() {
        emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq buildPartial() {
        emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq result = new emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq(this);
        int from_bitField0_ = bitField0_;
        result.traderId_ = traderId_;
        if (deliverItemListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            deliverItemList_ = java.util.Collections.unmodifiableList(deliverItemList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.deliverItemList_ = deliverItemList_;
        } else {
          result.deliverItemList_ = deliverItemListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq) {
          return mergeFrom((emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq other) {
        if (other == emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq.getDefaultInstance()) return this;
        if (other.getTraderId() != 0) {
          setTraderId(other.getTraderId());
        }
        if (deliverItemListBuilder_ == null) {
          if (!other.deliverItemList_.isEmpty()) {
            if (deliverItemList_.isEmpty()) {
              deliverItemList_ = other.deliverItemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureDeliverItemListIsMutable();
              deliverItemList_.addAll(other.deliverItemList_);
            }
            onChanged();
          }
        } else {
          if (!other.deliverItemList_.isEmpty()) {
            if (deliverItemListBuilder_.isEmpty()) {
              deliverItemListBuilder_.dispose();
              deliverItemListBuilder_ = null;
              deliverItemList_ = other.deliverItemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              deliverItemListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDeliverItemListFieldBuilder() : null;
            } else {
              deliverItemListBuilder_.addAllMessages(other.deliverItemList_);
            }
          }
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
        emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int traderId_ ;
      /**
       * <code>uint32 trader_id = 7;</code>
       * @return The traderId.
       */
      @java.lang.Override
      public int getTraderId() {
        return traderId_;
      }
      /**
       * <code>uint32 trader_id = 7;</code>
       * @param value The traderId to set.
       * @return This builder for chaining.
       */
      public Builder setTraderId(int value) {
        
        traderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trader_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearTraderId() {
        
        traderId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> deliverItemList_ =
        java.util.Collections.emptyList();
      private void ensureDeliverItemListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          deliverItemList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>(deliverItemList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> deliverItemListBuilder_;

      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getDeliverItemListList() {
        if (deliverItemListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(deliverItemList_);
        } else {
          return deliverItemListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public int getDeliverItemListCount() {
        if (deliverItemListBuilder_ == null) {
          return deliverItemList_.size();
        } else {
          return deliverItemListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getDeliverItemList(int index) {
        if (deliverItemListBuilder_ == null) {
          return deliverItemList_.get(index);
        } else {
          return deliverItemListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public Builder setDeliverItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (deliverItemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeliverItemListIsMutable();
          deliverItemList_.set(index, value);
          onChanged();
        } else {
          deliverItemListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public Builder setDeliverItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (deliverItemListBuilder_ == null) {
          ensureDeliverItemListIsMutable();
          deliverItemList_.set(index, builderForValue.build());
          onChanged();
        } else {
          deliverItemListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public Builder addDeliverItemList(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (deliverItemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeliverItemListIsMutable();
          deliverItemList_.add(value);
          onChanged();
        } else {
          deliverItemListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public Builder addDeliverItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (deliverItemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeliverItemListIsMutable();
          deliverItemList_.add(index, value);
          onChanged();
        } else {
          deliverItemListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public Builder addDeliverItemList(
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (deliverItemListBuilder_ == null) {
          ensureDeliverItemListIsMutable();
          deliverItemList_.add(builderForValue.build());
          onChanged();
        } else {
          deliverItemListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public Builder addDeliverItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (deliverItemListBuilder_ == null) {
          ensureDeliverItemListIsMutable();
          deliverItemList_.add(index, builderForValue.build());
          onChanged();
        } else {
          deliverItemListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public Builder addAllDeliverItemList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> values) {
        if (deliverItemListBuilder_ == null) {
          ensureDeliverItemListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, deliverItemList_);
          onChanged();
        } else {
          deliverItemListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public Builder clearDeliverItemList() {
        if (deliverItemListBuilder_ == null) {
          deliverItemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          deliverItemListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public Builder removeDeliverItemList(int index) {
        if (deliverItemListBuilder_ == null) {
          ensureDeliverItemListIsMutable();
          deliverItemList_.remove(index);
          onChanged();
        } else {
          deliverItemListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder getDeliverItemListBuilder(
          int index) {
        return getDeliverItemListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getDeliverItemListOrBuilder(
          int index) {
        if (deliverItemListBuilder_ == null) {
          return deliverItemList_.get(index);  } else {
          return deliverItemListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
           getDeliverItemListOrBuilderList() {
        if (deliverItemListBuilder_ != null) {
          return deliverItemListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(deliverItemList_);
        }
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addDeliverItemListBuilder() {
        return getDeliverItemListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addDeliverItemListBuilder(
          int index) {
        return getDeliverItemListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam deliver_item_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder> 
           getDeliverItemListBuilderList() {
        return getDeliverItemListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
          getDeliverItemListFieldBuilder() {
        if (deliverItemListBuilder_ == null) {
          deliverItemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder>(
                  deliverItemList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          deliverItemList_ = null;
        }
        return deliverItemListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:VintageMarketDeliverItemReq)
    }

    // @@protoc_insertion_point(class_scope:VintageMarketDeliverItemReq)
    private static final emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq();
    }

    public static emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageMarketDeliverItemReq>
        PARSER = new com.google.protobuf.AbstractParser<VintageMarketDeliverItemReq>() {
      @java.lang.Override
      public VintageMarketDeliverItemReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VintageMarketDeliverItemReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VintageMarketDeliverItemReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageMarketDeliverItemReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VintageMarketDeliverItemReqOuterClass.VintageMarketDeliverItemReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageMarketDeliverItemReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageMarketDeliverItemReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!VintageMarketDeliverItemReq.proto\032\017Ite" +
      "mParam.proto\"W\n\033VintageMarketDeliverItem" +
      "Req\022\021\n\ttrader_id\030\007 \001(\r\022%\n\021deliver_item_l" +
      "ist\030\017 \003(\0132\n.ItemParamB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_VintageMarketDeliverItemReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageMarketDeliverItemReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageMarketDeliverItemReq_descriptor,
        new java.lang.String[] { "TraderId", "DeliverItemList", });
    emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
