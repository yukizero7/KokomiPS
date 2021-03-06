// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerDieType.proto

package emu.grasscutter.net.proto;

public final class PlayerDieTypeOuterClass {
  private PlayerDieTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code PlayerDieType}
   */
  public enum PlayerDieType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PlayerDieNone = 0;</code>
     */
    PlayerDieNone(0),
    /**
     * <code>PlayerDieKillByMonster = 1;</code>
     */
    PlayerDieKillByMonster(1),
    /**
     * <code>PlayerDieKillByGear = 2;</code>
     */
    PlayerDieKillByGear(2),
    /**
     * <code>PlayerDieFall = 3;</code>
     */
    PlayerDieFall(3),
    /**
     * <code>PlayerDieDrawn = 4;</code>
     */
    PlayerDieDrawn(4),
    /**
     * <code>PlayerDieAbyss = 5;</code>
     */
    PlayerDieAbyss(5),
    /**
     * <code>PlayerDieGm = 6;</code>
     */
    PlayerDieGm(6),
    /**
     * <code>PlayerDieClimateCold = 7;</code>
     */
    PlayerDieClimateCold(7),
    /**
     * <code>PlayerDieStormLighting = 8;</code>
     */
    PlayerDieStormLighting(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PlayerDieNone = 0;</code>
     */
    public static final int PlayerDieNone_VALUE = 0;
    /**
     * <code>PlayerDieKillByMonster = 1;</code>
     */
    public static final int PlayerDieKillByMonster_VALUE = 1;
    /**
     * <code>PlayerDieKillByGear = 2;</code>
     */
    public static final int PlayerDieKillByGear_VALUE = 2;
    /**
     * <code>PlayerDieFall = 3;</code>
     */
    public static final int PlayerDieFall_VALUE = 3;
    /**
     * <code>PlayerDieDrawn = 4;</code>
     */
    public static final int PlayerDieDrawn_VALUE = 4;
    /**
     * <code>PlayerDieAbyss = 5;</code>
     */
    public static final int PlayerDieAbyss_VALUE = 5;
    /**
     * <code>PlayerDieGm = 6;</code>
     */
    public static final int PlayerDieGm_VALUE = 6;
    /**
     * <code>PlayerDieClimateCold = 7;</code>
     */
    public static final int PlayerDieClimateCold_VALUE = 7;
    /**
     * <code>PlayerDieStormLighting = 8;</code>
     */
    public static final int PlayerDieStormLighting_VALUE = 8;


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
    public static PlayerDieType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PlayerDieType forNumber(int value) {
      switch (value) {
        case 0: return PlayerDieNone;
        case 1: return PlayerDieKillByMonster;
        case 2: return PlayerDieKillByGear;
        case 3: return PlayerDieFall;
        case 4: return PlayerDieDrawn;
        case 5: return PlayerDieAbyss;
        case 6: return PlayerDieGm;
        case 7: return PlayerDieClimateCold;
        case 8: return PlayerDieStormLighting;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PlayerDieType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PlayerDieType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PlayerDieType>() {
            public PlayerDieType findValueByNumber(int number) {
              return PlayerDieType.forNumber(number);
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
      return emu.grasscutter.net.proto.PlayerDieTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final PlayerDieType[] VALUES = values();

    public static PlayerDieType valueOf(
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

    private PlayerDieType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:PlayerDieType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023PlayerDieType.proto*\331\001\n\rPlayerDieType\022" +
      "\021\n\rPlayerDieNone\020\000\022\032\n\026PlayerDieKillByMon" +
      "ster\020\001\022\027\n\023PlayerDieKillByGear\020\002\022\021\n\rPlaye" +
      "rDieFall\020\003\022\022\n\016PlayerDieDrawn\020\004\022\022\n\016Player" +
      "DieAbyss\020\005\022\017\n\013PlayerDieGm\020\006\022\030\n\024PlayerDie" +
      "ClimateCold\020\007\022\032\n\026PlayerDieStormLighting\020" +
      "\010B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
