// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ResVersionConfig.proto

package emu.grasscutter.net.proto;

public final class ResVersionConfigOuterClass {
  private ResVersionConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResVersionConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResVersionConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 version = 1;</code>
     * @return The version.
     */
    int getVersion();

    /**
     * <code>string md5 = 2;</code>
     * @return The md5.
     */
    java.lang.String getMd5();
    /**
     * <code>string md5 = 2;</code>
     * @return The bytes for md5.
     */
    com.google.protobuf.ByteString
        getMd5Bytes();

    /**
     * <code>string size = 3;</code>
     * @return The size.
     */
    java.lang.String getSize();
    /**
     * <code>string size = 3;</code>
     * @return The bytes for size.
     */
    com.google.protobuf.ByteString
        getSizeBytes();

    /**
     * <code>string versionSuffix = 4;</code>
     * @return The versionSuffix.
     */
    java.lang.String getVersionSuffix();
    /**
     * <code>string versionSuffix = 4;</code>
     * @return The bytes for versionSuffix.
     */
    com.google.protobuf.ByteString
        getVersionSuffixBytes();

    /**
     * <code>string branch = 5;</code>
     * @return The branch.
     */
    java.lang.String getBranch();
    /**
     * <code>string branch = 5;</code>
     * @return The bytes for branch.
     */
    com.google.protobuf.ByteString
        getBranchBytes();
  }
  /**
   * Protobuf type {@code ResVersionConfig}
   */
  public static final class ResVersionConfig extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResVersionConfig)
      ResVersionConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResVersionConfig.newBuilder() to construct.
    private ResVersionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResVersionConfig() {
      md5_ = "";
      size_ = "";
      versionSuffix_ = "";
      branch_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ResVersionConfig();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResVersionConfig(
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

              version_ = input.readInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              md5_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              size_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              versionSuffix_ = s;
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              branch_ = s;
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
      return emu.grasscutter.net.proto.ResVersionConfigOuterClass.internal_static_ResVersionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ResVersionConfigOuterClass.internal_static_ResVersionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.class, emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.Builder.class);
    }

    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;
    /**
     * <code>int32 version = 1;</code>
     * @return The version.
     */
    @java.lang.Override
    public int getVersion() {
      return version_;
    }

    public static final int MD5_FIELD_NUMBER = 2;
    private volatile java.lang.Object md5_;
    /**
     * <code>string md5 = 2;</code>
     * @return The md5.
     */
    @java.lang.Override
    public java.lang.String getMd5() {
      java.lang.Object ref = md5_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        md5_ = s;
        return s;
      }
    }
    /**
     * <code>string md5 = 2;</code>
     * @return The bytes for md5.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMd5Bytes() {
      java.lang.Object ref = md5_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        md5_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SIZE_FIELD_NUMBER = 3;
    private volatile java.lang.Object size_;
    /**
     * <code>string size = 3;</code>
     * @return The size.
     */
    @java.lang.Override
    public java.lang.String getSize() {
      java.lang.Object ref = size_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        size_ = s;
        return s;
      }
    }
    /**
     * <code>string size = 3;</code>
     * @return The bytes for size.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSizeBytes() {
      java.lang.Object ref = size_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        size_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VERSIONSUFFIX_FIELD_NUMBER = 4;
    private volatile java.lang.Object versionSuffix_;
    /**
     * <code>string versionSuffix = 4;</code>
     * @return The versionSuffix.
     */
    @java.lang.Override
    public java.lang.String getVersionSuffix() {
      java.lang.Object ref = versionSuffix_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        versionSuffix_ = s;
        return s;
      }
    }
    /**
     * <code>string versionSuffix = 4;</code>
     * @return The bytes for versionSuffix.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getVersionSuffixBytes() {
      java.lang.Object ref = versionSuffix_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        versionSuffix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BRANCH_FIELD_NUMBER = 5;
    private volatile java.lang.Object branch_;
    /**
     * <code>string branch = 5;</code>
     * @return The branch.
     */
    @java.lang.Override
    public java.lang.String getBranch() {
      java.lang.Object ref = branch_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        branch_ = s;
        return s;
      }
    }
    /**
     * <code>string branch = 5;</code>
     * @return The bytes for branch.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBranchBytes() {
      java.lang.Object ref = branch_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        branch_ = b;
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
      if (version_ != 0) {
        output.writeInt32(1, version_);
      }
      if (!getMd5Bytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, md5_);
      }
      if (!getSizeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, size_);
      }
      if (!getVersionSuffixBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, versionSuffix_);
      }
      if (!getBranchBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, branch_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (version_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, version_);
      }
      if (!getMd5Bytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, md5_);
      }
      if (!getSizeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, size_);
      }
      if (!getVersionSuffixBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, versionSuffix_);
      }
      if (!getBranchBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, branch_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig other = (emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig) obj;

      if (getVersion()
          != other.getVersion()) return false;
      if (!getMd5()
          .equals(other.getMd5())) return false;
      if (!getSize()
          .equals(other.getSize())) return false;
      if (!getVersionSuffix()
          .equals(other.getVersionSuffix())) return false;
      if (!getBranch()
          .equals(other.getBranch())) return false;
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
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion();
      hash = (37 * hash) + MD5_FIELD_NUMBER;
      hash = (53 * hash) + getMd5().hashCode();
      hash = (37 * hash) + SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getSize().hashCode();
      hash = (37 * hash) + VERSIONSUFFIX_FIELD_NUMBER;
      hash = (53 * hash) + getVersionSuffix().hashCode();
      hash = (37 * hash) + BRANCH_FIELD_NUMBER;
      hash = (53 * hash) + getBranch().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig prototype) {
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
     * Protobuf type {@code ResVersionConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResVersionConfig)
        emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ResVersionConfigOuterClass.internal_static_ResVersionConfig_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ResVersionConfigOuterClass.internal_static_ResVersionConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.class, emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.newBuilder()
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
        version_ = 0;

        md5_ = "";

        size_ = "";

        versionSuffix_ = "";

        branch_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ResVersionConfigOuterClass.internal_static_ResVersionConfig_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig build() {
        emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig buildPartial() {
        emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig result = new emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig(this);
        result.version_ = version_;
        result.md5_ = md5_;
        result.size_ = size_;
        result.versionSuffix_ = versionSuffix_;
        result.branch_ = branch_;
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
        if (other instanceof emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig) {
          return mergeFrom((emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig other) {
        if (other == emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.getDefaultInstance()) return this;
        if (other.getVersion() != 0) {
          setVersion(other.getVersion());
        }
        if (!other.getMd5().isEmpty()) {
          md5_ = other.md5_;
          onChanged();
        }
        if (!other.getSize().isEmpty()) {
          size_ = other.size_;
          onChanged();
        }
        if (!other.getVersionSuffix().isEmpty()) {
          versionSuffix_ = other.versionSuffix_;
          onChanged();
        }
        if (!other.getBranch().isEmpty()) {
          branch_ = other.branch_;
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
        emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int version_ ;
      /**
       * <code>int32 version = 1;</code>
       * @return The version.
       */
      @java.lang.Override
      public int getVersion() {
        return version_;
      }
      /**
       * <code>int32 version = 1;</code>
       * @param value The version to set.
       * @return This builder for chaining.
       */
      public Builder setVersion(int value) {
        
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 version = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearVersion() {
        
        version_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object md5_ = "";
      /**
       * <code>string md5 = 2;</code>
       * @return The md5.
       */
      public java.lang.String getMd5() {
        java.lang.Object ref = md5_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          md5_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string md5 = 2;</code>
       * @return The bytes for md5.
       */
      public com.google.protobuf.ByteString
          getMd5Bytes() {
        java.lang.Object ref = md5_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          md5_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string md5 = 2;</code>
       * @param value The md5 to set.
       * @return This builder for chaining.
       */
      public Builder setMd5(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        md5_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string md5 = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMd5() {
        
        md5_ = getDefaultInstance().getMd5();
        onChanged();
        return this;
      }
      /**
       * <code>string md5 = 2;</code>
       * @param value The bytes for md5 to set.
       * @return This builder for chaining.
       */
      public Builder setMd5Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        md5_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object size_ = "";
      /**
       * <code>string size = 3;</code>
       * @return The size.
       */
      public java.lang.String getSize() {
        java.lang.Object ref = size_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          size_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string size = 3;</code>
       * @return The bytes for size.
       */
      public com.google.protobuf.ByteString
          getSizeBytes() {
        java.lang.Object ref = size_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          size_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string size = 3;</code>
       * @param value The size to set.
       * @return This builder for chaining.
       */
      public Builder setSize(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        size_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string size = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSize() {
        
        size_ = getDefaultInstance().getSize();
        onChanged();
        return this;
      }
      /**
       * <code>string size = 3;</code>
       * @param value The bytes for size to set.
       * @return This builder for chaining.
       */
      public Builder setSizeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        size_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object versionSuffix_ = "";
      /**
       * <code>string versionSuffix = 4;</code>
       * @return The versionSuffix.
       */
      public java.lang.String getVersionSuffix() {
        java.lang.Object ref = versionSuffix_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          versionSuffix_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string versionSuffix = 4;</code>
       * @return The bytes for versionSuffix.
       */
      public com.google.protobuf.ByteString
          getVersionSuffixBytes() {
        java.lang.Object ref = versionSuffix_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          versionSuffix_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string versionSuffix = 4;</code>
       * @param value The versionSuffix to set.
       * @return This builder for chaining.
       */
      public Builder setVersionSuffix(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        versionSuffix_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string versionSuffix = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearVersionSuffix() {
        
        versionSuffix_ = getDefaultInstance().getVersionSuffix();
        onChanged();
        return this;
      }
      /**
       * <code>string versionSuffix = 4;</code>
       * @param value The bytes for versionSuffix to set.
       * @return This builder for chaining.
       */
      public Builder setVersionSuffixBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        versionSuffix_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object branch_ = "";
      /**
       * <code>string branch = 5;</code>
       * @return The branch.
       */
      public java.lang.String getBranch() {
        java.lang.Object ref = branch_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          branch_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string branch = 5;</code>
       * @return The bytes for branch.
       */
      public com.google.protobuf.ByteString
          getBranchBytes() {
        java.lang.Object ref = branch_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          branch_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string branch = 5;</code>
       * @param value The branch to set.
       * @return This builder for chaining.
       */
      public Builder setBranch(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        branch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string branch = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBranch() {
        
        branch_ = getDefaultInstance().getBranch();
        onChanged();
        return this;
      }
      /**
       * <code>string branch = 5;</code>
       * @param value The bytes for branch to set.
       * @return This builder for chaining.
       */
      public Builder setBranchBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        branch_ = value;
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


      // @@protoc_insertion_point(builder_scope:ResVersionConfig)
    }

    // @@protoc_insertion_point(class_scope:ResVersionConfig)
    private static final emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig();
    }

    public static emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResVersionConfig>
        PARSER = new com.google.protobuf.AbstractParser<ResVersionConfig>() {
      @java.lang.Override
      public ResVersionConfig parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResVersionConfig(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResVersionConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResVersionConfig> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResVersionConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResVersionConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ResVersionConfig.proto\"e\n\020ResVersionCo" +
      "nfig\022\017\n\007version\030\001 \001(\005\022\013\n\003md5\030\002 \001(\t\022\014\n\004si" +
      "ze\030\003 \001(\t\022\025\n\rversionSuffix\030\004 \001(\t\022\016\n\006branc" +
      "h\030\005 \001(\tB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ResVersionConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ResVersionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResVersionConfig_descriptor,
        new java.lang.String[] { "Version", "Md5", "Size", "VersionSuffix", "Branch", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
