// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HitColliderType.proto

package emu.grasscutter.net.proto;

public final class HitColliderTypeOuterClass {
  private HitColliderTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code HitColliderType}
   */
  public enum HitColliderType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>HitColliderInvalid = 0;</code>
     */
    HitColliderInvalid(0),
    /**
     * <code>HitColliderHitBox = 1;</code>
     */
    HitColliderHitBox(1),
    /**
     * <code>HitColliderWetHitBox = 2;</code>
     */
    HitColliderWetHitBox(2),
    /**
     * <code>HitColliderHeadBox = 3;</code>
     */
    HitColliderHeadBox(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>HitColliderInvalid = 0;</code>
     */
    public static final int HitColliderInvalid_VALUE = 0;
    /**
     * <code>HitColliderHitBox = 1;</code>
     */
    public static final int HitColliderHitBox_VALUE = 1;
    /**
     * <code>HitColliderWetHitBox = 2;</code>
     */
    public static final int HitColliderWetHitBox_VALUE = 2;
    /**
     * <code>HitColliderHeadBox = 3;</code>
     */
    public static final int HitColliderHeadBox_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static HitColliderType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static HitColliderType forNumber(int value) {
      switch (value) {
        case 0: return HitColliderInvalid;
        case 1: return HitColliderHitBox;
        case 2: return HitColliderWetHitBox;
        case 3: return HitColliderHeadBox;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HitColliderType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        HitColliderType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<HitColliderType>() {
            public HitColliderType findValueByNumber(int number) {
              return HitColliderType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HitColliderTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final HitColliderType[] VALUES = values();

    public static HitColliderType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private HitColliderType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:HitColliderType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025HitColliderType.proto*r\n\017HitColliderTy" +
      "pe\022\026\n\022HitColliderInvalid\020\000\022\025\n\021HitCollide" +
      "rHitBox\020\001\022\030\n\024HitColliderWetHitBox\020\002\022\026\n\022H" +
      "itColliderHeadBox\020\003B\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
