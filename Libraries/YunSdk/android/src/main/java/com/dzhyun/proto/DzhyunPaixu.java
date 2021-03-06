// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dzhyun.paixu.proto

package com.dzhyun.proto;

public final class DzhyunPaixu {
  private DzhyunPaixu() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PaiXuOrBuilder extends
      // @@protoc_insertion_point(interface_extends:dzhyun.PaiXu)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string Obj = 1;</code>
     *
     * <pre>
     * 股票名称
     * </pre>
     */
    boolean hasObj();
    /**
     * <code>required string Obj = 1;</code>
     *
     * <pre>
     * 股票名称
     * </pre>
     */
    java.lang.String getObj();
    /**
     * <code>required string Obj = 1;</code>
     *
     * <pre>
     * 股票名称
     * </pre>
     */
    com.google.protobuf.ByteString
        getObjBytes();

    /**
     * <code>optional int64 Value = 2;</code>
     *
     * <pre>
     * yfloat
     * </pre>
     */
    boolean hasValue();
    /**
     * <code>optional int64 Value = 2;</code>
     *
     * <pre>
     * yfloat
     * </pre>
     */
    long getValue();

    /**
     * <code>optional string Text = 3;</code>
     */
    boolean hasText();
    /**
     * <code>optional string Text = 3;</code>
     */
    java.lang.String getText();
    /**
     * <code>optional string Text = 3;</code>
     */
    com.google.protobuf.ByteString
        getTextBytes();
  }
  /**
   * Protobuf type {@code dzhyun.PaiXu}
   *
   * <pre>
   * 排序存储结构
   * </pre>
   */
  public static final class PaiXu extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:dzhyun.PaiXu)
      PaiXuOrBuilder {
    // Use PaiXu.newBuilder() to construct.
    private PaiXu(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PaiXu(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PaiXu defaultInstance;
    public static PaiXu getDefaultInstance() {
      return defaultInstance;
    }

    public PaiXu getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PaiXu(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              obj_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              value_ = input.readInt64();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              text_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dzhyun.proto.DzhyunPaixu.internal_static_dzhyun_PaiXu_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dzhyun.proto.DzhyunPaixu.internal_static_dzhyun_PaiXu_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dzhyun.proto.DzhyunPaixu.PaiXu.class, com.dzhyun.proto.DzhyunPaixu.PaiXu.Builder.class);
    }

    public static com.google.protobuf.Parser<PaiXu> PARSER =
        new com.google.protobuf.AbstractParser<PaiXu>() {
      public PaiXu parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PaiXu(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PaiXu> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int OBJ_FIELD_NUMBER = 1;
    private java.lang.Object obj_;
    /**
     * <code>required string Obj = 1;</code>
     *
     * <pre>
     * 股票名称
     * </pre>
     */
    public boolean hasObj() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string Obj = 1;</code>
     *
     * <pre>
     * 股票名称
     * </pre>
     */
    public java.lang.String getObj() {
      java.lang.Object ref = obj_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          obj_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string Obj = 1;</code>
     *
     * <pre>
     * 股票名称
     * </pre>
     */
    public com.google.protobuf.ByteString
        getObjBytes() {
      java.lang.Object ref = obj_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        obj_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private long value_;
    /**
     * <code>optional int64 Value = 2;</code>
     *
     * <pre>
     * yfloat
     * </pre>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 Value = 2;</code>
     *
     * <pre>
     * yfloat
     * </pre>
     */
    public long getValue() {
      return value_;
    }

    public static final int TEXT_FIELD_NUMBER = 3;
    private java.lang.Object text_;
    /**
     * <code>optional string Text = 3;</code>
     */
    public boolean hasText() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string Text = 3;</code>
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          text_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string Text = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      obj_ = "";
      value_ = 0L;
      text_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasObj()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getObjBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, value_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getTextBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getObjBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, value_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getTextBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.dzhyun.proto.DzhyunPaixu.PaiXu parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dzhyun.proto.DzhyunPaixu.PaiXu parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dzhyun.proto.DzhyunPaixu.PaiXu parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dzhyun.proto.DzhyunPaixu.PaiXu parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dzhyun.proto.DzhyunPaixu.PaiXu parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dzhyun.proto.DzhyunPaixu.PaiXu parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.dzhyun.proto.DzhyunPaixu.PaiXu parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.dzhyun.proto.DzhyunPaixu.PaiXu parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.dzhyun.proto.DzhyunPaixu.PaiXu parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dzhyun.proto.DzhyunPaixu.PaiXu parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dzhyun.proto.DzhyunPaixu.PaiXu prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code dzhyun.PaiXu}
     *
     * <pre>
     * 排序存储结构
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:dzhyun.PaiXu)
        com.dzhyun.proto.DzhyunPaixu.PaiXuOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dzhyun.proto.DzhyunPaixu.internal_static_dzhyun_PaiXu_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dzhyun.proto.DzhyunPaixu.internal_static_dzhyun_PaiXu_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dzhyun.proto.DzhyunPaixu.PaiXu.class, com.dzhyun.proto.DzhyunPaixu.PaiXu.Builder.class);
      }

      // Construct using com.dzhyun.proto.DzhyunPaixu.PaiXu.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        obj_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        value_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        text_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dzhyun.proto.DzhyunPaixu.internal_static_dzhyun_PaiXu_descriptor;
      }

      public com.dzhyun.proto.DzhyunPaixu.PaiXu getDefaultInstanceForType() {
        return com.dzhyun.proto.DzhyunPaixu.PaiXu.getDefaultInstance();
      }

      public com.dzhyun.proto.DzhyunPaixu.PaiXu build() {
        com.dzhyun.proto.DzhyunPaixu.PaiXu result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.dzhyun.proto.DzhyunPaixu.PaiXu buildPartial() {
        com.dzhyun.proto.DzhyunPaixu.PaiXu result = new com.dzhyun.proto.DzhyunPaixu.PaiXu(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.obj_ = obj_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.value_ = value_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.text_ = text_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dzhyun.proto.DzhyunPaixu.PaiXu) {
          return mergeFrom((com.dzhyun.proto.DzhyunPaixu.PaiXu)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dzhyun.proto.DzhyunPaixu.PaiXu other) {
        if (other == com.dzhyun.proto.DzhyunPaixu.PaiXu.getDefaultInstance()) return this;
        if (other.hasObj()) {
          bitField0_ |= 0x00000001;
          obj_ = other.obj_;
          onChanged();
        }
        if (other.hasValue()) {
          setValue(other.getValue());
        }
        if (other.hasText()) {
          bitField0_ |= 0x00000004;
          text_ = other.text_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasObj()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dzhyun.proto.DzhyunPaixu.PaiXu parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dzhyun.proto.DzhyunPaixu.PaiXu) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object obj_ = "";
      /**
       * <code>required string Obj = 1;</code>
       *
       * <pre>
       * 股票名称
       * </pre>
       */
      public boolean hasObj() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string Obj = 1;</code>
       *
       * <pre>
       * 股票名称
       * </pre>
       */
      public java.lang.String getObj() {
        java.lang.Object ref = obj_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            obj_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string Obj = 1;</code>
       *
       * <pre>
       * 股票名称
       * </pre>
       */
      public com.google.protobuf.ByteString
          getObjBytes() {
        java.lang.Object ref = obj_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          obj_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string Obj = 1;</code>
       *
       * <pre>
       * 股票名称
       * </pre>
       */
      public Builder setObj(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        obj_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string Obj = 1;</code>
       *
       * <pre>
       * 股票名称
       * </pre>
       */
      public Builder clearObj() {
        bitField0_ = (bitField0_ & ~0x00000001);
        obj_ = getDefaultInstance().getObj();
        onChanged();
        return this;
      }
      /**
       * <code>required string Obj = 1;</code>
       *
       * <pre>
       * 股票名称
       * </pre>
       */
      public Builder setObjBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        obj_ = value;
        onChanged();
        return this;
      }

      private long value_ ;
      /**
       * <code>optional int64 Value = 2;</code>
       *
       * <pre>
       * yfloat
       * </pre>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int64 Value = 2;</code>
       *
       * <pre>
       * yfloat
       * </pre>
       */
      public long getValue() {
        return value_;
      }
      /**
       * <code>optional int64 Value = 2;</code>
       *
       * <pre>
       * yfloat
       * </pre>
       */
      public Builder setValue(long value) {
        bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 Value = 2;</code>
       *
       * <pre>
       * yfloat
       * </pre>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object text_ = "";
      /**
       * <code>optional string Text = 3;</code>
       */
      public boolean hasText() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string Text = 3;</code>
       */
      public java.lang.String getText() {
        java.lang.Object ref = text_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            text_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string Text = 3;</code>
       */
      public com.google.protobuf.ByteString
          getTextBytes() {
        java.lang.Object ref = text_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          text_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string Text = 3;</code>
       */
      public Builder setText(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        text_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string Text = 3;</code>
       */
      public Builder clearText() {
        bitField0_ = (bitField0_ & ~0x00000004);
        text_ = getDefaultInstance().getText();
        onChanged();
        return this;
      }
      /**
       * <code>optional string Text = 3;</code>
       */
      public Builder setTextBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        text_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:dzhyun.PaiXu)
    }

    static {
      defaultInstance = new PaiXu(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:dzhyun.PaiXu)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dzhyun_PaiXu_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_dzhyun_PaiXu_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022dzhyun.paixu.proto\022\006dzhyun\"1\n\005PaiXu\022\013\n" +
      "\003Obj\030\001 \002(\t\022\r\n\005Value\030\002 \001(\003\022\014\n\004Text\030\003 \001(\tB" +
      "\022\n\020com.dzhyun.proto"
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
    internal_static_dzhyun_PaiXu_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dzhyun_PaiXu_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_dzhyun_PaiXu_descriptor,
        new java.lang.String[] { "Obj", "Value", "Text", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
