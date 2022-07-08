// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Customer.proto

package com.myflix.adapter.grpc.protofiles.customer;

/**
 * Protobuf type {@code getAllResponse}
 */
public  final class getAllResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:getAllResponse)
    getAllResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use getAllResponse.newBuilder() to construct.
  private getAllResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private getAllResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private getAllResponse(
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
            com.myflix.adapter.grpc.protofiles.customer.Customer.Builder subBuilder = null;
            if (customer_ != null) {
              subBuilder = customer_.toBuilder();
            }
            customer_ = input.readMessage(com.myflix.adapter.grpc.protofiles.customer.Customer.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(customer_);
              customer_ = subBuilder.buildPartial();
            }

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
    return com.myflix.adapter.grpc.protofiles.customer.CustomerProto.internal_static_getAllResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.myflix.adapter.grpc.protofiles.customer.CustomerProto.internal_static_getAllResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.myflix.adapter.grpc.protofiles.customer.getAllResponse.class, com.myflix.adapter.grpc.protofiles.customer.getAllResponse.Builder.class);
  }

  public static final int CUSTOMER_FIELD_NUMBER = 1;
  private com.myflix.adapter.grpc.protofiles.customer.Customer customer_;
  /**
   * <code>.Customer customer = 1;</code>
   */
  public boolean hasCustomer() {
    return customer_ != null;
  }
  /**
   * <code>.Customer customer = 1;</code>
   */
  public com.myflix.adapter.grpc.protofiles.customer.Customer getCustomer() {
    return customer_ == null ? com.myflix.adapter.grpc.protofiles.customer.Customer.getDefaultInstance() : customer_;
  }
  /**
   * <code>.Customer customer = 1;</code>
   */
  public com.myflix.adapter.grpc.protofiles.customer.CustomerOrBuilder getCustomerOrBuilder() {
    return getCustomer();
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
    if (customer_ != null) {
      output.writeMessage(1, getCustomer());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (customer_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCustomer());
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
    if (!(obj instanceof com.myflix.adapter.grpc.protofiles.customer.getAllResponse)) {
      return super.equals(obj);
    }
    com.myflix.adapter.grpc.protofiles.customer.getAllResponse other = (com.myflix.adapter.grpc.protofiles.customer.getAllResponse) obj;

    boolean result = true;
    result = result && (hasCustomer() == other.hasCustomer());
    if (hasCustomer()) {
      result = result && getCustomer()
          .equals(other.getCustomer());
    }
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
    if (hasCustomer()) {
      hash = (37 * hash) + CUSTOMER_FIELD_NUMBER;
      hash = (53 * hash) + getCustomer().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.myflix.adapter.grpc.protofiles.customer.getAllResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.myflix.adapter.grpc.protofiles.customer.getAllResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.myflix.adapter.grpc.protofiles.customer.getAllResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.myflix.adapter.grpc.protofiles.customer.getAllResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.myflix.adapter.grpc.protofiles.customer.getAllResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.myflix.adapter.grpc.protofiles.customer.getAllResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.myflix.adapter.grpc.protofiles.customer.getAllResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.myflix.adapter.grpc.protofiles.customer.getAllResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.myflix.adapter.grpc.protofiles.customer.getAllResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.myflix.adapter.grpc.protofiles.customer.getAllResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.myflix.adapter.grpc.protofiles.customer.getAllResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.myflix.adapter.grpc.protofiles.customer.getAllResponse parseFrom(
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
  public static Builder newBuilder(com.myflix.adapter.grpc.protofiles.customer.getAllResponse prototype) {
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
   * Protobuf type {@code getAllResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:getAllResponse)
      com.myflix.adapter.grpc.protofiles.customer.getAllResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.myflix.adapter.grpc.protofiles.customer.CustomerProto.internal_static_getAllResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.myflix.adapter.grpc.protofiles.customer.CustomerProto.internal_static_getAllResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.myflix.adapter.grpc.protofiles.customer.getAllResponse.class, com.myflix.adapter.grpc.protofiles.customer.getAllResponse.Builder.class);
    }

    // Construct using com.myflix.adapter.grpc.protofiles.customer.getAllResponse.newBuilder()
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
      if (customerBuilder_ == null) {
        customer_ = null;
      } else {
        customer_ = null;
        customerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.myflix.adapter.grpc.protofiles.customer.CustomerProto.internal_static_getAllResponse_descriptor;
    }

    @java.lang.Override
    public com.myflix.adapter.grpc.protofiles.customer.getAllResponse getDefaultInstanceForType() {
      return com.myflix.adapter.grpc.protofiles.customer.getAllResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.myflix.adapter.grpc.protofiles.customer.getAllResponse build() {
      com.myflix.adapter.grpc.protofiles.customer.getAllResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.myflix.adapter.grpc.protofiles.customer.getAllResponse buildPartial() {
      com.myflix.adapter.grpc.protofiles.customer.getAllResponse result = new com.myflix.adapter.grpc.protofiles.customer.getAllResponse(this);
      if (customerBuilder_ == null) {
        result.customer_ = customer_;
      } else {
        result.customer_ = customerBuilder_.build();
      }
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
      if (other instanceof com.myflix.adapter.grpc.protofiles.customer.getAllResponse) {
        return mergeFrom((com.myflix.adapter.grpc.protofiles.customer.getAllResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.myflix.adapter.grpc.protofiles.customer.getAllResponse other) {
      if (other == com.myflix.adapter.grpc.protofiles.customer.getAllResponse.getDefaultInstance()) return this;
      if (other.hasCustomer()) {
        mergeCustomer(other.getCustomer());
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
      com.myflix.adapter.grpc.protofiles.customer.getAllResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.myflix.adapter.grpc.protofiles.customer.getAllResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.myflix.adapter.grpc.protofiles.customer.Customer customer_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.myflix.adapter.grpc.protofiles.customer.Customer, com.myflix.adapter.grpc.protofiles.customer.Customer.Builder, com.myflix.adapter.grpc.protofiles.customer.CustomerOrBuilder> customerBuilder_;
    /**
     * <code>.Customer customer = 1;</code>
     */
    public boolean hasCustomer() {
      return customerBuilder_ != null || customer_ != null;
    }
    /**
     * <code>.Customer customer = 1;</code>
     */
    public com.myflix.adapter.grpc.protofiles.customer.Customer getCustomer() {
      if (customerBuilder_ == null) {
        return customer_ == null ? com.myflix.adapter.grpc.protofiles.customer.Customer.getDefaultInstance() : customer_;
      } else {
        return customerBuilder_.getMessage();
      }
    }
    /**
     * <code>.Customer customer = 1;</code>
     */
    public Builder setCustomer(com.myflix.adapter.grpc.protofiles.customer.Customer value) {
      if (customerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customer_ = value;
        onChanged();
      } else {
        customerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Customer customer = 1;</code>
     */
    public Builder setCustomer(
        com.myflix.adapter.grpc.protofiles.customer.Customer.Builder builderForValue) {
      if (customerBuilder_ == null) {
        customer_ = builderForValue.build();
        onChanged();
      } else {
        customerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Customer customer = 1;</code>
     */
    public Builder mergeCustomer(com.myflix.adapter.grpc.protofiles.customer.Customer value) {
      if (customerBuilder_ == null) {
        if (customer_ != null) {
          customer_ =
            com.myflix.adapter.grpc.protofiles.customer.Customer.newBuilder(customer_).mergeFrom(value).buildPartial();
        } else {
          customer_ = value;
        }
        onChanged();
      } else {
        customerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Customer customer = 1;</code>
     */
    public Builder clearCustomer() {
      if (customerBuilder_ == null) {
        customer_ = null;
        onChanged();
      } else {
        customer_ = null;
        customerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Customer customer = 1;</code>
     */
    public com.myflix.adapter.grpc.protofiles.customer.Customer.Builder getCustomerBuilder() {
      
      onChanged();
      return getCustomerFieldBuilder().getBuilder();
    }
    /**
     * <code>.Customer customer = 1;</code>
     */
    public com.myflix.adapter.grpc.protofiles.customer.CustomerOrBuilder getCustomerOrBuilder() {
      if (customerBuilder_ != null) {
        return customerBuilder_.getMessageOrBuilder();
      } else {
        return customer_ == null ?
            com.myflix.adapter.grpc.protofiles.customer.Customer.getDefaultInstance() : customer_;
      }
    }
    /**
     * <code>.Customer customer = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.myflix.adapter.grpc.protofiles.customer.Customer, com.myflix.adapter.grpc.protofiles.customer.Customer.Builder, com.myflix.adapter.grpc.protofiles.customer.CustomerOrBuilder> 
        getCustomerFieldBuilder() {
      if (customerBuilder_ == null) {
        customerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.myflix.adapter.grpc.protofiles.customer.Customer, com.myflix.adapter.grpc.protofiles.customer.Customer.Builder, com.myflix.adapter.grpc.protofiles.customer.CustomerOrBuilder>(
                getCustomer(),
                getParentForChildren(),
                isClean());
        customer_ = null;
      }
      return customerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:getAllResponse)
  }

  // @@protoc_insertion_point(class_scope:getAllResponse)
  private static final com.myflix.adapter.grpc.protofiles.customer.getAllResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.myflix.adapter.grpc.protofiles.customer.getAllResponse();
  }

  public static com.myflix.adapter.grpc.protofiles.customer.getAllResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<getAllResponse>
      PARSER = new com.google.protobuf.AbstractParser<getAllResponse>() {
    @java.lang.Override
    public getAllResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new getAllResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<getAllResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<getAllResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.myflix.adapter.grpc.protofiles.customer.getAllResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
