// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Movie.proto

package com.myflix.adapter.grpc.protofiles.movie;

public final class MovieProto {
  private MovieProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Movie_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Movie_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Character_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Character_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Watch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Watch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_saveRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_saveRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_saveResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_saveResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_deleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_deleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_deleteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_deleteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_getAllRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_getAllRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_getAllResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_getAllResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_getRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_getRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_getResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_getResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_getCharactersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_getCharactersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_getCharactersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_getCharactersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_getMoviesWatchedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_getMoviesWatchedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_getMoviesWatchedResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_getMoviesWatchedResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Movie.proto\"4\n\005Movie\022\017\n\007idMovie\030\001 \001(\t\022" +
      "\014\n\004name\030\002 \001(\t\022\014\n\004year\030\003 \001(\005\";\n\tCharacter" +
      "\022\017\n\007idMovie\030\001 \001(\t\022\017\n\007idActor\030\002 \001(\t\022\014\n\004na" +
      "me\030\003 \001(\t\":\n\005Watch\022\022\n\nidCustomer\030\001 \001(\t\022\017\n" +
      "\007idMovie\030\002 \001(\t\022\014\n\004date\030\003 \001(\003\")\n\013saveRequ" +
      "est\022\014\n\004name\030\001 \001(\t\022\014\n\004year\030\002 \001(\005\"%\n\014saveR" +
      "esponse\022\025\n\005movie\030\001 \001(\0132\006.Movie\" \n\rdelete" +
      "Request\022\017\n\007idMovie\030\001 \001(\t\"\020\n\016deleteRespon" +
      "se\"\017\n\rgetAllRequest\"\'\n\016getAllResponse\022\025\n" +
      "\005movie\030\001 \001(\0132\006.Movie\" \n\ngetRequest\022\022\n\nid" +
      "Customer\030\001 \001(\t\"$\n\013getResponse\022\025\n\005movie\030\001" +
      " \001(\0132\006.Movie\"\'\n\024getCharactersRequest\022\017\n\007" +
      "idMovie\030\001 \001(\t\"\027\n\025getCharactersResponse\"*" +
      "\n\027getMoviesWatchedRequest\022\017\n\007idMovie\030\001 \001" +
      "(\t\"1\n\030getMoviesWatchedResponse\022\025\n\005watch\030" +
      "\001 \001(\0132\006.Watch2\300\002\n\014MovieService\022%\n\004save\022\014" +
      ".saveRequest\032\r.saveResponse\"\000\022+\n\006delete\022" +
      "\016.deleteRequest\032\017.deleteResponse\"\000\022-\n\006ge" +
      "tAll\022\016.getAllRequest\032\017.getAllResponse\"\0000" +
      "\001\022$\n\003get\022\013.getRequest\032\014.getResponse\"\0000\001\022" +
      ":\n\005watch\022\025.getCharactersRequest\032\026.getCha" +
      "ractersResponse\"\0000\001\022K\n\020getMoviesWatched\022" +
      "\030.getMoviesWatchedRequest\032\031.getMoviesWat" +
      "chedResponse\"\0000\001B8\n(com.myflix.adapter.g" +
      "rpc.protofiles.movieB\nMovieProtoP\001b\006prot" +
      "o3"
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
    internal_static_Movie_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Movie_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Movie_descriptor,
        new java.lang.String[] { "IdMovie", "Name", "Year", });
    internal_static_Character_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Character_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Character_descriptor,
        new java.lang.String[] { "IdMovie", "IdActor", "Name", });
    internal_static_Watch_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Watch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Watch_descriptor,
        new java.lang.String[] { "IdCustomer", "IdMovie", "Date", });
    internal_static_saveRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_saveRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_saveRequest_descriptor,
        new java.lang.String[] { "Name", "Year", });
    internal_static_saveResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_saveResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_saveResponse_descriptor,
        new java.lang.String[] { "Movie", });
    internal_static_deleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_deleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_deleteRequest_descriptor,
        new java.lang.String[] { "IdMovie", });
    internal_static_deleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_deleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_deleteResponse_descriptor,
        new java.lang.String[] { });
    internal_static_getAllRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_getAllRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_getAllRequest_descriptor,
        new java.lang.String[] { });
    internal_static_getAllResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_getAllResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_getAllResponse_descriptor,
        new java.lang.String[] { "Movie", });
    internal_static_getRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_getRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_getRequest_descriptor,
        new java.lang.String[] { "IdCustomer", });
    internal_static_getResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_getResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_getResponse_descriptor,
        new java.lang.String[] { "Movie", });
    internal_static_getCharactersRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_getCharactersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_getCharactersRequest_descriptor,
        new java.lang.String[] { "IdMovie", });
    internal_static_getCharactersResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_getCharactersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_getCharactersResponse_descriptor,
        new java.lang.String[] { });
    internal_static_getMoviesWatchedRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_getMoviesWatchedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_getMoviesWatchedRequest_descriptor,
        new java.lang.String[] { "IdMovie", });
    internal_static_getMoviesWatchedResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_getMoviesWatchedResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_getMoviesWatchedResponse_descriptor,
        new java.lang.String[] { "Watch", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
