// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MassivePropParam.proto

package emu.grasscutter.net.proto;

public final class MassivePropParamOuterClass {
  private MassivePropParamOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MassivePropParamOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MassivePropParam)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 elementReactionType = 1;</code>
     * @return The elementReactionType.
     */
    int getElementReactionType();

    /**
     * <code>uint32 casterId = 2;</code>
     * @return The casterId.
     */
    int getCasterId();

    /**
     * <code>repeated float paramList = 3;</code>
     * @return A list containing the paramList.
     */
    java.util.List<java.lang.Float> getParamListList();
    /**
     * <code>repeated float paramList = 3;</code>
     * @return The count of paramList.
     */
    int getParamListCount();
    /**
     * <code>repeated float paramList = 3;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    float getParamList(int index);

    /**
     * <code>uint32 syncFlag = 4;</code>
     * @return The syncFlag.
     */
    int getSyncFlag();
  }
  /**
   * Protobuf type {@code MassivePropParam}
   */
  public static final class MassivePropParam extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MassivePropParam)
      MassivePropParamOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MassivePropParam.newBuilder() to construct.
    private MassivePropParam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MassivePropParam() {
      paramList_ = emptyFloatList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MassivePropParam();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MassivePropParam(
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
            case 8: {

              elementReactionType_ = input.readInt32();
              break;
            }
            case 16: {

              casterId_ = input.readUInt32();
              break;
            }
            case 29: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                paramList_ = newFloatList();
                mutable_bitField0_ |= 0x00000001;
              }
              paramList_.addFloat(input.readFloat());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                paramList_ = newFloatList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                paramList_.addFloat(input.readFloat());
              }
              input.popLimit(limit);
              break;
            }
            case 32: {

              syncFlag_ = input.readUInt32();
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
          paramList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MassivePropParamOuterClass.internal_static_MassivePropParam_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MassivePropParamOuterClass.internal_static_MassivePropParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.class, emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.Builder.class);
    }

    public static final int ELEMENTREACTIONTYPE_FIELD_NUMBER = 1;
    private int elementReactionType_;
    /**
     * <code>int32 elementReactionType = 1;</code>
     * @return The elementReactionType.
     */
    @java.lang.Override
    public int getElementReactionType() {
      return elementReactionType_;
    }

    public static final int CASTERID_FIELD_NUMBER = 2;
    private int casterId_;
    /**
     * <code>uint32 casterId = 2;</code>
     * @return The casterId.
     */
    @java.lang.Override
    public int getCasterId() {
      return casterId_;
    }

    public static final int PARAMLIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.FloatList paramList_;
    /**
     * <code>repeated float paramList = 3;</code>
     * @return A list containing the paramList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Float>
        getParamListList() {
      return paramList_;
    }
    /**
     * <code>repeated float paramList = 3;</code>
     * @return The count of paramList.
     */
    public int getParamListCount() {
      return paramList_.size();
    }
    /**
     * <code>repeated float paramList = 3;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    public float getParamList(int index) {
      return paramList_.getFloat(index);
    }
    private int paramListMemoizedSerializedSize = -1;

    public static final int SYNCFLAG_FIELD_NUMBER = 4;
    private int syncFlag_;
    /**
     * <code>uint32 syncFlag = 4;</code>
     * @return The syncFlag.
     */
    @java.lang.Override
    public int getSyncFlag() {
      return syncFlag_;
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
      getSerializedSize();
      if (elementReactionType_ != 0) {
        output.writeInt32(1, elementReactionType_);
      }
      if (casterId_ != 0) {
        output.writeUInt32(2, casterId_);
      }
      if (getParamListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(paramListMemoizedSerializedSize);
      }
      for (int i = 0; i < paramList_.size(); i++) {
        output.writeFloatNoTag(paramList_.getFloat(i));
      }
      if (syncFlag_ != 0) {
        output.writeUInt32(4, syncFlag_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (elementReactionType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, elementReactionType_);
      }
      if (casterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, casterId_);
      }
      {
        int dataSize = 0;
        dataSize = 4 * getParamListList().size();
        size += dataSize;
        if (!getParamListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        paramListMemoizedSerializedSize = dataSize;
      }
      if (syncFlag_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, syncFlag_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam other = (emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam) obj;

      if (getElementReactionType()
          != other.getElementReactionType()) return false;
      if (getCasterId()
          != other.getCasterId()) return false;
      if (!getParamListList()
          .equals(other.getParamListList())) return false;
      if (getSyncFlag()
          != other.getSyncFlag()) return false;
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
      hash = (37 * hash) + ELEMENTREACTIONTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getElementReactionType();
      hash = (37 * hash) + CASTERID_FIELD_NUMBER;
      hash = (53 * hash) + getCasterId();
      if (getParamListCount() > 0) {
        hash = (37 * hash) + PARAMLIST_FIELD_NUMBER;
        hash = (53 * hash) + getParamListList().hashCode();
      }
      hash = (37 * hash) + SYNCFLAG_FIELD_NUMBER;
      hash = (53 * hash) + getSyncFlag();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam prototype) {
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
     * Protobuf type {@code MassivePropParam}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MassivePropParam)
        emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParamOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MassivePropParamOuterClass.internal_static_MassivePropParam_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MassivePropParamOuterClass.internal_static_MassivePropParam_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.class, emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.newBuilder()
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
        elementReactionType_ = 0;

        casterId_ = 0;

        paramList_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000001);
        syncFlag_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MassivePropParamOuterClass.internal_static_MassivePropParam_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam build() {
        emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam buildPartial() {
        emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam result = new emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam(this);
        int from_bitField0_ = bitField0_;
        result.elementReactionType_ = elementReactionType_;
        result.casterId_ = casterId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          paramList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.paramList_ = paramList_;
        result.syncFlag_ = syncFlag_;
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
        if (other instanceof emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam) {
          return mergeFrom((emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam other) {
        if (other == emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.getDefaultInstance()) return this;
        if (other.getElementReactionType() != 0) {
          setElementReactionType(other.getElementReactionType());
        }
        if (other.getCasterId() != 0) {
          setCasterId(other.getCasterId());
        }
        if (!other.paramList_.isEmpty()) {
          if (paramList_.isEmpty()) {
            paramList_ = other.paramList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParamListIsMutable();
            paramList_.addAll(other.paramList_);
          }
          onChanged();
        }
        if (other.getSyncFlag() != 0) {
          setSyncFlag(other.getSyncFlag());
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
        emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int elementReactionType_ ;
      /**
       * <code>int32 elementReactionType = 1;</code>
       * @return The elementReactionType.
       */
      @java.lang.Override
      public int getElementReactionType() {
        return elementReactionType_;
      }
      /**
       * <code>int32 elementReactionType = 1;</code>
       * @param value The elementReactionType to set.
       * @return This builder for chaining.
       */
      public Builder setElementReactionType(int value) {
        
        elementReactionType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 elementReactionType = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearElementReactionType() {
        
        elementReactionType_ = 0;
        onChanged();
        return this;
      }

      private int casterId_ ;
      /**
       * <code>uint32 casterId = 2;</code>
       * @return The casterId.
       */
      @java.lang.Override
      public int getCasterId() {
        return casterId_;
      }
      /**
       * <code>uint32 casterId = 2;</code>
       * @param value The casterId to set.
       * @return This builder for chaining.
       */
      public Builder setCasterId(int value) {
        
        casterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 casterId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCasterId() {
        
        casterId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.FloatList paramList_ = emptyFloatList();
      private void ensureParamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          paramList_ = mutableCopy(paramList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated float paramList = 3;</code>
       * @return A list containing the paramList.
       */
      public java.util.List<java.lang.Float>
          getParamListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(paramList_) : paramList_;
      }
      /**
       * <code>repeated float paramList = 3;</code>
       * @return The count of paramList.
       */
      public int getParamListCount() {
        return paramList_.size();
      }
      /**
       * <code>repeated float paramList = 3;</code>
       * @param index The index of the element to return.
       * @return The paramList at the given index.
       */
      public float getParamList(int index) {
        return paramList_.getFloat(index);
      }
      /**
       * <code>repeated float paramList = 3;</code>
       * @param index The index to set the value at.
       * @param value The paramList to set.
       * @return This builder for chaining.
       */
      public Builder setParamList(
          int index, float value) {
        ensureParamListIsMutable();
        paramList_.setFloat(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float paramList = 3;</code>
       * @param value The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addParamList(float value) {
        ensureParamListIsMutable();
        paramList_.addFloat(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float paramList = 3;</code>
       * @param values The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addAllParamList(
          java.lang.Iterable<? extends java.lang.Float> values) {
        ensureParamListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, paramList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float paramList = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearParamList() {
        paramList_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int syncFlag_ ;
      /**
       * <code>uint32 syncFlag = 4;</code>
       * @return The syncFlag.
       */
      @java.lang.Override
      public int getSyncFlag() {
        return syncFlag_;
      }
      /**
       * <code>uint32 syncFlag = 4;</code>
       * @param value The syncFlag to set.
       * @return This builder for chaining.
       */
      public Builder setSyncFlag(int value) {
        
        syncFlag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 syncFlag = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSyncFlag() {
        
        syncFlag_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MassivePropParam)
    }

    // @@protoc_insertion_point(class_scope:MassivePropParam)
    private static final emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam();
    }

    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MassivePropParam>
        PARSER = new com.google.protobuf.AbstractParser<MassivePropParam>() {
      @java.lang.Override
      public MassivePropParam parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MassivePropParam(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MassivePropParam> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MassivePropParam> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MassivePropParam_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MassivePropParam_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026MassivePropParam.proto\"f\n\020MassivePropP" +
      "aram\022\033\n\023elementReactionType\030\001 \001(\005\022\020\n\010cas" +
      "terId\030\002 \001(\r\022\021\n\tparamList\030\003 \003(\002\022\020\n\010syncFl" +
      "ag\030\004 \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MassivePropParam_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MassivePropParam_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MassivePropParam_descriptor,
        new java.lang.String[] { "ElementReactionType", "CasterId", "ParamList", "SyncFlag", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
