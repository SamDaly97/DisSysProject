// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: statement.proto

package org.DS.project.EBankGRPC;

public final class StatementServiceImpl {
  private StatementServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EBankGRPC_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EBankGRPC_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EBankGRPC_StringRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EBankGRPC_StringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EBankGRPC_StringResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EBankGRPC_StringResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EBankGRPC_BooleanReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EBankGRPC_BooleanReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EBankGRPC_BooleanRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EBankGRPC_BooleanRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EBankGRPC_ValRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EBankGRPC_ValRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EBankGRPC_ValResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EBankGRPC_ValResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EBankGRPC_statementResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EBankGRPC_statementResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017statement.proto\022\tEBankGRPC\"\007\n\005Empty\"\035\n" +
      "\rStringRequest\022\014\n\004text\030\001 \001(\t\"\036\n\016StringRe" +
      "sponse\022\014\n\004text\030\001 \001(\t\"\031\n\nBooleanReq\022\013\n\003ms" +
      "g\030\002 \001(\010\"\031\n\nBooleanRes\022\013\n\003msg\030\002 \001(\010\"\034\n\nVa" +
      "lRequest\022\016\n\006length\030\003 \001(\005\"\035\n\013ValResponse\022" +
      "\016\n\006length\030\003 \001(\005\"Q\n\rstatementResp\022\r\n\005snam" +
      "e\030\004 \001(\t\022\016\n\006status\030\005 \001(\010\022\r\n\005stype\030\006 \001(\t\022\022" +
      "\n\nsendOptOut\030\007 \001(\0102\345\002\n\020StatementService\022" +
      "@\n\020initialStatement\022\020.EBankGRPC.Empty\032\030." +
      "EBankGRPC.statementResp\"\000\022:\n\006optOut\022\025.EB" +
      "ankGRPC.BooleanReq\032\025.EBankGRPC.BooleanRe" +
      "s\"\0000\001\0227\n\005onOff\022\025.EBankGRPC.BooleanReq\032\025." +
      "EBankGRPC.BooleanRes\"\000\022L\n\023changeStatemen" +
      "tType\022\030.EBankGRPC.StringRequest\032\031.EBankG" +
      "RPC.StringResponse\"\000\022L\n\023changeStatementN" +
      "ame\022\030.EBankGRPC.StringRequest\032\031.EBankGRP" +
      "C.StringResponse\"\000B2\n\030org.DS.project.EBa" +
      "nkGRPCB\024StatementServiceImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_EBankGRPC_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EBankGRPC_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EBankGRPC_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_EBankGRPC_StringRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_EBankGRPC_StringRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EBankGRPC_StringRequest_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_EBankGRPC_StringResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_EBankGRPC_StringResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EBankGRPC_StringResponse_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_EBankGRPC_BooleanReq_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_EBankGRPC_BooleanReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EBankGRPC_BooleanReq_descriptor,
        new java.lang.String[] { "Msg", });
    internal_static_EBankGRPC_BooleanRes_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_EBankGRPC_BooleanRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EBankGRPC_BooleanRes_descriptor,
        new java.lang.String[] { "Msg", });
    internal_static_EBankGRPC_ValRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_EBankGRPC_ValRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EBankGRPC_ValRequest_descriptor,
        new java.lang.String[] { "Length", });
    internal_static_EBankGRPC_ValResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_EBankGRPC_ValResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EBankGRPC_ValResponse_descriptor,
        new java.lang.String[] { "Length", });
    internal_static_EBankGRPC_statementResp_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_EBankGRPC_statementResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EBankGRPC_statementResp_descriptor,
        new java.lang.String[] { "Sname", "Status", "Stype", "SendOptOut", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}