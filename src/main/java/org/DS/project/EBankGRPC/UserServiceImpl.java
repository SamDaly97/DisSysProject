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
    internal_static_EBankGRPC_userResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EBankGRPC_userResp_fieldAccessorTable;

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
      "(\010\"\031\n\nBooleanRes\022\013\n\003msg\030\002 \001(\010\"\034\n\nValRequ" +
      "est\022\016\n\006length\030\003 \001(\005\"\035\n\013ValResponse\022\016\n\006le" +
      "ngth\030\003 \001(\005\";\n\010userResp\022\r\n\005sname\030\004 \001(\t\022\016\n" +
      "\006status\030\005 \001(\t\022\020\n\010activity\030\006 \001(\0052\220\002\n\013User" +
      "Service\0228\n\rinitialSystem\022\020.EBankGRPC.Emp" +
      "ty\032\023.EBankGRPC.userResp\"\000\022C\n\016changeActiv" +
      "ity\022\025.EBankGRPC.ValRequest\032\026.EBankGRPC.V" +
      "alResponse\"\0000\001\0227\n\005onOff\022\025.EBankGRPC.Bool" +
      "eanReq\032\025.EBankGRPC.BooleanRes\"\000\022I\n\020chang" +
      "eSystemName\022\030.EBankGRPC.StringRequest\032\031." +
      "EBankGRPC.StringResponse\"\000B-\n\030org.DS.pro" +
      "ject.EBankGRPCB\017UserServiceImplP\001b\006proto" +
      "3"
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
    internal_static_EBankGRPC_userResp_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_EBankGRPC_userResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EBankGRPC_userResp_descriptor,
        new java.lang.String[] { "Sname", "Status", "Activity", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
