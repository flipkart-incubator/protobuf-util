// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person/person.proto

package com.flipkart.protobuf.ext.example.person;

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_PhoneNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_PhoneNumber_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023person/person.proto\"\324\001\n\006Person\022\014\n\004name" +
      "\030\001 \001(\t\022\n\n\002id\030\002 \001(\005\022\r\n\005email\030\003 \001(\t\022(\n\013pho" +
      "neNumber\030\004 \003(\0132\023.Person.PhoneNumber\032w\n\013P" +
      "honeNumber\022\016\n\006number\030\001 \001(\t\022+\n\004type\030\002 \001(\016" +
      "2\035.Person.PhoneNumber.PhoneType\"+\n\tPhone" +
      "Type\022\n\n\006MOBILE\020\000\022\010\n\004HOME\020\001\022\010\n\004WORK\020\002B,\n(" +
      "com.flipkart.protobuf.ext.example.person" +
      "P\001b\006proto3"
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
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", "PhoneNumber", });
    internal_static_Person_PhoneNumber_descriptor =
      internal_static_Person_descriptor.getNestedTypes().get(0);
    internal_static_Person_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}