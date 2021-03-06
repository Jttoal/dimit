// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dimitStore.proto

package dimit.store;

public interface ChannelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Channel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 v = 1;</code>
   */
  int getV();

  /**
   * <pre>
   * instance id
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * instance id
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * ChannelConf's id
   * </pre>
   *
   * <code>string cid = 3;</code>
   */
  java.lang.String getCid();
  /**
   * <pre>
   * ChannelConf's id
   * </pre>
   *
   * <code>string cid = 3;</code>
   */
  com.google.protobuf.ByteString
      getCidBytes();

  /**
   * <code>.ChannelType type = 4;</code>
   */
  int getTypeValue();
  /**
   * <code>.ChannelType type = 4;</code>
   */
  dimit.store.ChannelType getType();

  /**
   * <pre>
   * max-tps of the channel instance. Default value =
   * </pre>
   *
   * <code>float tps = 5;</code>
   */
  float getTps();

  /**
   * <pre>
   * Dimit' id
   * </pre>
   *
   * <code>string dimit = 6;</code>
   */
  java.lang.String getDimit();
  /**
   * <pre>
   * Dimit' id
   * </pre>
   *
   * <code>string dimit = 6;</code>
   */
  com.google.protobuf.ByteString
      getDimitBytes();

  /**
   * <pre>
   * timestamp
   * </pre>
   *
   * <code>uint64 ct = 9;</code>
   */
  long getCt();

  /**
   * <pre>
   * modify timestamp
   * </pre>
   *
   * <code>uint64 mt = 10;</code>
   */
  long getMt();
}
