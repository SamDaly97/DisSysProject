// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package org.DS.project.EBankGRPC;

public final class UserServiceImpl {
  private UserServiceImpl() {}
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
    internal_static_EBankGRPC_valRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EBankGRPC_valRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EBankGRPC_valResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EBankGRPC_valResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EBankGRPC_speakerResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EBankGRPC_speakerResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\tEBankGRPC\"\007\n\005Empty\"\035\n\rStri" +
      "ngRequest\022\014\n\004text\030\001 \001(\t\"\036\n\016StringRespons" +
      "e\022\014\n\004text\030\001 \001(\t\"\031\n\nBooleanReq\022\013\n\003msg\030\002 \001" +
      "(\010\"\031\n\nBooleanRes\022\013\n\003msg\030\002 \001(\010\"\034\n\nvalRequ" +
      "est\022\016\n\006length\030\003 \001(\005\"\035\n\013valResponse\022\016\n\006le" +
      "ngth\030\003 \001(\005\"O\n\013speakerResp\022\r\n\005aname\030\004 \001(\t" +
      "\022\r\n\005atype\030\005 \001(\t\022\020\n\010abalance\030\006 \001(\005\022\020\n\010aac" +
      "count\030\007 \001(\0102\336\002\n\016SpeakerService\0229\n\013initia" +
      "lUser\022\020.EBankGRPC.Empty\032\026.EBankGRPC.spea" +
      "kerResp\"\000\022B\n\rchangeBalance\022\025.EBankGRPC.v" +
      "alRequest\032\026.EBankGRPC.valResponse\"\0000\001\022?\n" +
      "\014activeAccont\022\025.EBankGRPC.BooleanReq\032\026.E" +
      "BankGRPC.valResponse\"\000\022C\n\021changeAccountT" +
      "ype\022\025.EBankGRPC.BooleanReq\032\025.EBankGRPC.B" +
      "ooleanRes\"\000\022G\n\016changeUserName\022\030.EBankGRP" +
      "C.StringRequest\032\031.EBankGRPC.StringRespon" +
      "se\"\000B-\n\030org.DS.project.EBankGRPCB\017UserSe" +
      "rviceImplP\001b\006proto3"
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
    internal_static_EBankGRPC_valRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_EBankGRPC_valRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EBankGRPC_valRequest_descriptor,
        new java.lang.String[] { "Length", });
    internal_static_EBankGRPC_valResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_EBankGRPC_valResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EBankGRPC_valResponse_descriptor,
        new java.lang.String[] { "Length", });
    internal_static_EBankGRPC_speakerResp_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_EBankGRPC_speakerResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EBankGRPC_speakerResp_descriptor,
        new java.lang.String[] { "Aname", "Atype", "Abalance", "Aaccount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
