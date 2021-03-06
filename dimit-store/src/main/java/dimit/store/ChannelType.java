// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dimitStore.proto

package dimit.store;

/**
 * Protobuf enum {@code ChannelType}
 */
public enum ChannelType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * client sending request
   * </pre>
   *
   * <code>SEND = 0;</code>
   */
  SEND(0),
  /**
   * <pre>
   * server received callback
   * </pre>
   *
   * <code>RECV = 1;</code>
   */
  RECV(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * client sending request
   * </pre>
   *
   * <code>SEND = 0;</code>
   */
  public static final int SEND_VALUE = 0;
  /**
   * <pre>
   * server received callback
   * </pre>
   *
   * <code>RECV = 1;</code>
   */
  public static final int RECV_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ChannelType valueOf(int value) {
    return forNumber(value);
  }

  public static ChannelType forNumber(int value) {
    switch (value) {
      case 0: return SEND;
      case 1: return RECV;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ChannelType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ChannelType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ChannelType>() {
          public ChannelType findValueByNumber(int number) {
            return ChannelType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return dimit.store.DimitStore.getDescriptor().getEnumTypes().get(0);
  }

  private static final ChannelType[] VALUES = values();

  public static ChannelType valueOf(
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

  private ChannelType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ChannelType)
}

