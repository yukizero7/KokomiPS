// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InteractType.proto

package emu.grasscutter.net.proto;

public final class InteractTypeOuterClass {
  private InteractTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code InteractType}
   */
  public enum InteractType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>InteractNone = 0;</code>
     */
    InteractNone(0),
    /**
     * <code>InteractPickItem = 1;</code>
     */
    InteractPickItem(1),
    /**
     * <code>InteractGather = 2;</code>
     */
    InteractGather(2),
    /**
     * <code>InteractOpenChest = 3;</code>
     */
    InteractOpenChest(3),
    /**
     * <code>InteractOpenStatue = 4;</code>
     */
    InteractOpenStatue(4),
    /**
     * <code>InteractConsum = 5;</code>
     */
    InteractConsum(5),
    /**
     * <code>InteractMpPlayReward = 6;</code>
     */
    InteractMpPlayReward(6),
    /**
     * <code>InteractView = 7;</code>
     */
    InteractView(7),
    /**
     * <code>InteractGeneralReward = 8;</code>
     */
    InteractGeneralReward(8),
    /**
     * <code>InteractMiracleRing = 9;</code>
     */
    InteractMiracleRing(9),
    /**
     * <code>InteractFoundation = 10;</code>
     */
    InteractFoundation(10),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>InteractNone = 0;</code>
     */
    public static final int InteractNone_VALUE = 0;
    /**
     * <code>InteractPickItem = 1;</code>
     */
    public static final int InteractPickItem_VALUE = 1;
    /**
     * <code>InteractGather = 2;</code>
     */
    public static final int InteractGather_VALUE = 2;
    /**
     * <code>InteractOpenChest = 3;</code>
     */
    public static final int InteractOpenChest_VALUE = 3;
    /**
     * <code>InteractOpenStatue = 4;</code>
     */
    public static final int InteractOpenStatue_VALUE = 4;
    /**
     * <code>InteractConsum = 5;</code>
     */
    public static final int InteractConsum_VALUE = 5;
    /**
     * <code>InteractMpPlayReward = 6;</code>
     */
    public static final int InteractMpPlayReward_VALUE = 6;
    /**
     * <code>InteractView = 7;</code>
     */
    public static final int InteractView_VALUE = 7;
    /**
     * <code>InteractGeneralReward = 8;</code>
     */
    public static final int InteractGeneralReward_VALUE = 8;
    /**
     * <code>InteractMiracleRing = 9;</code>
     */
    public static final int InteractMiracleRing_VALUE = 9;
    /**
     * <code>InteractFoundation = 10;</code>
     */
    public static final int InteractFoundation_VALUE = 10;


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
    public static InteractType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static InteractType forNumber(int value) {
      switch (value) {
        case 0: return InteractNone;
        case 1: return InteractPickItem;
        case 2: return InteractGather;
        case 3: return InteractOpenChest;
        case 4: return InteractOpenStatue;
        case 5: return InteractConsum;
        case 6: return InteractMpPlayReward;
        case 7: return InteractView;
        case 8: return InteractGeneralReward;
        case 9: return InteractMiracleRing;
        case 10: return InteractFoundation;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<InteractType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        InteractType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<InteractType>() {
            public InteractType findValueByNumber(int number) {
              return InteractType.forNumber(number);
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
      return emu.grasscutter.net.proto.InteractTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final InteractType[] VALUES = values();

    public static InteractType valueOf(
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

    private InteractType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:InteractType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022InteractType.proto*\205\002\n\014InteractType\022\020\n" +
      "\014InteractNone\020\000\022\024\n\020InteractPickItem\020\001\022\022\n" +
      "\016InteractGather\020\002\022\025\n\021InteractOpenChest\020\003" +
      "\022\026\n\022InteractOpenStatue\020\004\022\022\n\016InteractCons" +
      "um\020\005\022\030\n\024InteractMpPlayReward\020\006\022\020\n\014Intera" +
      "ctView\020\007\022\031\n\025InteractGeneralReward\020\010\022\027\n\023I" +
      "nteractMiracleRing\020\t\022\026\n\022InteractFoundati" +
      "on\020\nB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
