// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dimitStore.proto

package dimit.store;

public interface ChannelTotalStatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ChannelTotalStat)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 v = 1;</code>
   */
  int getV();

  /**
   * <code>string id = 2;</code>
   */
  java.lang.String getId();
  /**
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
   * <pre>
   * accumulative
   * </pre>
   *
   * <code>uint64 count = 4;</code>
   */
  long getCount();

  /**
   * <pre>
   * total send millisecond
   * </pre>
   *
   * <code>uint64 time = 5;</code>
   */
  long getTime();

  /**
   * <code>uint64 succCount = 6;</code>
   */
  long getSuccCount();

  /**
   * <code>uint64 succTime = 7;</code>
   */
  long getSuccTime();

  /**
   * <pre>
   * interval mean
   * </pre>
   *
   * <code>double tps = 8;</code>
   */
  double getTps();

  /**
   * <pre>
   * average calling millisecond
   * </pre>
   *
   * <code>double avgTime = 11;</code>
   */
  double getAvgTime();

  /**
   * <code>double succRate = 12;</code>
   */
  double getSuccRate();

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
