// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Actor.proto

package com.myflix.adapter.grpc.protofiles.actor;

/**
 * Protobuf type {@code deleteRequest}
 */
public  final class deleteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:deleteRequest)
    deleteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use deleteRequest.newBuilder() to construct.
  private deleteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private deleteRequest() {
    idActor_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private deleteRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            idActor_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.myflix.adapter.grpc.protofiles.actor.ActorProto.internal_static_deleteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.myflix.adapter.grpc.protofiles.actor.ActorProto.internal_static_deleteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.myflix.adapter.grpc.protofiles.actor.deleteRequest.class, com.myflix.adapter.grpc.protofiles.actor.deleteRequest.Builder.class);
  }

  public static final int IDACTOR_FIELD_NUMBER = 1;
  private volatile java.lang.Object idActor_;
  /**
   * <code>string idActor = 1;</code>
   */
  public java.lang.String getIdActor() {
    java.lang.Object ref = idActor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      idActor_ = s;
      return s;
    }
  }
  /**
   * <code>string idActor = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdActorBytes() {
    java.lang.Object ref = idActor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      idActor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIdActorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, idActor_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdActorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, idActor_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.myflix.adapter.grpc.protofiles.actor.deleteRequest)) {
      return super.equals(obj);
    }
    com.myflix.adapter.grpc.protofiles.actor.deleteRequest other = (com.myflix.adapter.grpc.protofiles.actor.deleteRequest) obj;

    boolean result = true;
    result = result && getIdActor()
        .equals(other.getIdActor());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IDACTOR_FIELD_NUMBER;
    hash = (53 * hash) + getIdActor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.myflix.adapter.grpc.protofiles.actor.deleteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.myflix.adapter.grpc.protofiles.actor.deleteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.myflix.adapter.grpc.protofiles.actor.deleteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.myflix.adapter.grpc.protofiles.actor.deleteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.myflix.adapter.grpc.protofiles.actor.deleteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.myflix.adapter.grpc.protofiles.actor.deleteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.myflix.adapter.grpc.protofiles.actor.deleteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.myflix.adapter.grpc.protofiles.actor.deleteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.myflix.adapter.grpc.protofiles.actor.deleteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.myflix.adapter.grpc.protofiles.actor.deleteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.myflix.adapter.grpc.protofiles.actor.deleteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.myflix.adapter.grpc.protofiles.actor.deleteRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.myflix.adapter.grpc.protofiles.actor.deleteRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code deleteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:deleteRequest)
      com.myflix.adapter.grpc.protofiles.actor.deleteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.myflix.adapter.grpc.protofiles.actor.ActorProto.internal_static_deleteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.myflix.adapter.grpc.protofiles.actor.ActorProto.internal_static_deleteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.myflix.adapter.grpc.protofiles.actor.deleteRequest.class, com.myflix.adapter.grpc.protofiles.actor.deleteRequest.Builder.class);
    }

    // Construct using com.myflix.adapter.grpc.protofiles.actor.deleteRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      idActor_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.myflix.adapter.grpc.protofiles.actor.ActorProto.internal_static_deleteRequest_descriptor;
    }

    @java.lang.Override
    public com.myflix.adapter.grpc.protofiles.actor.deleteRequest getDefaultInstanceForType() {
      return com.myflix.adapter.grpc.protofiles.actor.deleteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.myflix.adapter.grpc.protofiles.actor.deleteRequest build() {
      com.myflix.adapter.grpc.protofiles.actor.deleteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.myflix.adapter.grpc.protofiles.actor.deleteRequest buildPartial() {
      com.myflix.adapter.grpc.protofiles.actor.deleteRequest result = new com.myflix.adapter.grpc.protofiles.actor.deleteRequest(this);
      result.idActor_ = idActor_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.myflix.adapter.grpc.protofiles.actor.deleteRequest) {
        return mergeFrom((com.myflix.adapter.grpc.protofiles.actor.deleteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.myflix.adapter.grpc.protofiles.actor.deleteRequest other) {
      if (other == com.myflix.adapter.grpc.protofiles.actor.deleteRequest.getDefaultInstance()) return this;
      if (!other.getIdActor().isEmpty()) {
        idActor_ = other.idActor_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.myflix.adapter.grpc.protofiles.actor.deleteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.myflix.adapter.grpc.protofiles.actor.deleteRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object idActor_ = "";
    /**
     * <code>string idActor = 1;</code>
     */
    public java.lang.String getIdActor() {
      java.lang.Object ref = idActor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        idActor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string idActor = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdActorBytes() {
      java.lang.Object ref = idActor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        idActor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string idActor = 1;</code>
     */
    public Builder setIdActor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      idActor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string idActor = 1;</code>
     */
    public Builder clearIdActor() {
      
      idActor_ = getDefaultInstance().getIdActor();
      onChanged();
      return this;
    }
    /**
     * <code>string idActor = 1;</code>
     */
    public Builder setIdActorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      idActor_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:deleteRequest)
  }

  // @@protoc_insertion_point(class_scope:deleteRequest)
  private static final com.myflix.adapter.grpc.protofiles.actor.deleteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.myflix.adapter.grpc.protofiles.actor.deleteRequest();
  }

  public static com.myflix.adapter.grpc.protofiles.actor.deleteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<deleteRequest>
      PARSER = new com.google.protobuf.AbstractParser<deleteRequest>() {
    @java.lang.Override
    public deleteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new deleteRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<deleteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<deleteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.myflix.adapter.grpc.protofiles.actor.deleteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
