// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: streaming.proto

// Protobuf Java Version: 3.25.5
package examples;

public final class StreamingProto {
  private StreamingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_streaming_Item_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_streaming_Item_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_streaming_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_streaming_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017streaming.proto\022\tstreaming\"\025\n\004Item\022\r\n\005" +
      "value\030\001 \001(\t\"\007\n\005Empty2\233\001\n\tStreaming\022/\n\006So" +
      "urce\022\020.streaming.Empty\032\017.streaming.Item\"" +
      "\0000\001\022-\n\004Sink\022\017.streaming.Item\032\020.streaming" +
      ".Empty\"\000(\001\022.\n\004Pipe\022\017.streaming.Item\032\017.st" +
      "reaming.Item\"\000(\0010\001B\"\n\010examplesB\016Streamin" +
      "gProtoP\001\242\002\003RTGb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_streaming_Item_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_streaming_Item_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_streaming_Item_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_streaming_Empty_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_streaming_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_streaming_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
