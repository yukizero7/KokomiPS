// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AnimatorParameterValueInfo.proto

package emu.grasscutter.net.proto;

public final class AnimatorParameterValueInfoOuterClass {
  private AnimatorParameterValueInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AnimatorParameterValueInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AnimatorParameterValueInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 paraType = 1;</code>
     * @return The paraType.
     */
    int getParaType();

    /**
     * <code>int32 intVal = 2;</code>
     * @return The intVal.
     */
    int getIntVal();

    /**
     * <code>float floatVal = 3;</code>
     * @return The floatVal.
     */
    float getFloatVal();

    /**
     * <code>bool boolVal = 4;</code>
     * @return The boolVal.
     */
    boolean getBoolVal();
  }
  /**
   * Protobuf type {@code AnimatorParameterValueInfo}
   */
  public static final class AnimatorParameterValueInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AnimatorParameterValueInfo)
      AnimatorParameterValueInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AnimatorParameterValueInfo.newBuilder() to construct.
    private AnimatorParameterValueInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AnimatorParameterValueInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AnimatorParameterValueInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AnimatorParameterValueInfo(
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

              paraType_ = input.readUInt32();
              break;
            }
            case 16: {

              intVal_ = input.readInt32();
              break;
            }
            case 29: {

              floatVal_ = input.readFloat();
              break;
            }
            case 32: {

              boolVal_ = input.readBool();
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
      return emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.internal_static_AnimatorParameterValueInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.internal_static_AnimatorParameterValueInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.class, emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder.class);
    }

    public static final int PARATYPE_FIELD_NUMBER = 1;
    private int paraType_;
    /**
     * <code>uint32 paraType = 1;</code>
     * @return The paraType.
     */
    @java.lang.Override
    public int getParaType() {
      return paraType_;
    }

    public static final int INTVAL_FIELD_NUMBER = 2;
    private int intVal_;
    /**
     * <code>int32 intVal = 2;</code>
     * @return The intVal.
     */
    @java.lang.Override
    public int getIntVal() {
      return intVal_;
    }

    public static final int FLOATVAL_FIELD_NUMBER = 3;
    private float floatVal_;
    /**
     * <code>float floatVal = 3;</code>
     * @return The floatVal.
     */
    @java.lang.Override
    public float getFloatVal() {
      return floatVal_;
    }

    public static final int BOOLVAL_FIELD_NUMBER = 4;
    private boolean boolVal_;
    /**
     * <code>bool boolVal = 4;</code>
     * @return The boolVal.
     */
    @java.lang.Override
    public boolean getBoolVal() {
      return boolVal_;
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
      if (paraType_ != 0) {
        output.writeUInt32(1, paraType_);
      }
      if (intVal_ != 0) {
        output.writeInt32(2, intVal_);
      }
      if (floatVal_ != 0F) {
        output.writeFloat(3, floatVal_);
      }
      if (boolVal_ != false) {
        output.writeBool(4, boolVal_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (paraType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, paraType_);
      }
      if (intVal_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, intVal_);
      }
      if (floatVal_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, floatVal_);
      }
      if (boolVal_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, boolVal_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo other = (emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo) obj;

      if (getParaType()
          != other.getParaType()) return false;
      if (getIntVal()
          != other.getIntVal()) return false;
      if (java.lang.Float.floatToIntBits(getFloatVal())
          != java.lang.Float.floatToIntBits(
              other.getFloatVal())) return false;
      if (getBoolVal()
          != other.getBoolVal()) return false;
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
      hash = (37 * hash) + PARATYPE_FIELD_NUMBER;
      hash = (53 * hash) + getParaType();
      hash = (37 * hash) + INTVAL_FIELD_NUMBER;
      hash = (53 * hash) + getIntVal();
      hash = (37 * hash) + FLOATVAL_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getFloatVal());
      hash = (37 * hash) + BOOLVAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBoolVal());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo prototype) {
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
     * Protobuf type {@code AnimatorParameterValueInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AnimatorParameterValueInfo)
        emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.internal_static_AnimatorParameterValueInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.internal_static_AnimatorParameterValueInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.class, emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.newBuilder()
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
        paraType_ = 0;

        intVal_ = 0;

        floatVal_ = 0F;

        boolVal_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.internal_static_AnimatorParameterValueInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo build() {
        emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo buildPartial() {
        emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo result = new emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo(this);
        result.paraType_ = paraType_;
        result.intVal_ = intVal_;
        result.floatVal_ = floatVal_;
        result.boolVal_ = boolVal_;
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
        if (other instanceof emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo) {
          return mergeFrom((emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo other) {
        if (other == emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.getDefaultInstance()) return this;
        if (other.getParaType() != 0) {
          setParaType(other.getParaType());
        }
        if (other.getIntVal() != 0) {
          setIntVal(other.getIntVal());
        }
        if (other.getFloatVal() != 0F) {
          setFloatVal(other.getFloatVal());
        }
        if (other.getBoolVal() != false) {
          setBoolVal(other.getBoolVal());
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
        emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int paraType_ ;
      /**
       * <code>uint32 paraType = 1;</code>
       * @return The paraType.
       */
      @java.lang.Override
      public int getParaType() {
        return paraType_;
      }
      /**
       * <code>uint32 paraType = 1;</code>
       * @param value The paraType to set.
       * @return This builder for chaining.
       */
      public Builder setParaType(int value) {
        
        paraType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 paraType = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearParaType() {
        
        paraType_ = 0;
        onChanged();
        return this;
      }

      private int intVal_ ;
      /**
       * <code>int32 intVal = 2;</code>
       * @return The intVal.
       */
      @java.lang.Override
      public int getIntVal() {
        return intVal_;
      }
      /**
       * <code>int32 intVal = 2;</code>
       * @param value The intVal to set.
       * @return This builder for chaining.
       */
      public Builder setIntVal(int value) {
        
        intVal_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 intVal = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIntVal() {
        
        intVal_ = 0;
        onChanged();
        return this;
      }

      private float floatVal_ ;
      /**
       * <code>float floatVal = 3;</code>
       * @return The floatVal.
       */
      @java.lang.Override
      public float getFloatVal() {
        return floatVal_;
      }
      /**
       * <code>float floatVal = 3;</code>
       * @param value The floatVal to set.
       * @return This builder for chaining.
       */
      public Builder setFloatVal(float value) {
        
        floatVal_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float floatVal = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFloatVal() {
        
        floatVal_ = 0F;
        onChanged();
        return this;
      }

      private boolean boolVal_ ;
      /**
       * <code>bool boolVal = 4;</code>
       * @return The boolVal.
       */
      @java.lang.Override
      public boolean getBoolVal() {
        return boolVal_;
      }
      /**
       * <code>bool boolVal = 4;</code>
       * @param value The boolVal to set.
       * @return This builder for chaining.
       */
      public Builder setBoolVal(boolean value) {
        
        boolVal_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool boolVal = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearBoolVal() {
        
        boolVal_ = false;
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


      // @@protoc_insertion_point(builder_scope:AnimatorParameterValueInfo)
    }

    // @@protoc_insertion_point(class_scope:AnimatorParameterValueInfo)
    private static final emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo();
    }

    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AnimatorParameterValueInfo>
        PARSER = new com.google.protobuf.AbstractParser<AnimatorParameterValueInfo>() {
      @java.lang.Override
      public AnimatorParameterValueInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AnimatorParameterValueInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AnimatorParameterValueInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AnimatorParameterValueInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnimatorParameterValueInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnimatorParameterValueInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n AnimatorParameterValueInfo.proto\"a\n\032An" +
      "imatorParameterValueInfo\022\020\n\010paraType\030\001 \001" +
      "(\r\022\016\n\006intVal\030\002 \001(\005\022\020\n\010floatVal\030\003 \001(\002\022\017\n\007" +
      "boolVal\030\004 \001(\010B\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AnimatorParameterValueInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AnimatorParameterValueInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnimatorParameterValueInfo_descriptor,
        new java.lang.String[] { "ParaType", "IntVal", "FloatVal", "BoolVal", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
