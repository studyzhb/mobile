// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CldTradeRequiteShuJu.proto

package dzhyun;

public final class CldTradeRequiteShuJu {
  private CldTradeRequiteShuJu() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TradeObjOrBuilder extends
      // @@protoc_insertion_point(interface_extends:dzhyun.TradeObj)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string objs = 1;</code>
     *
     * <pre>
     * 股票代码
     * </pre>
     */
    com.google.protobuf.ProtocolStringList
        getObjsList();
    /**
     * <code>repeated string objs = 1;</code>
     *
     * <pre>
     * 股票代码
     * </pre>
     */
    int getObjsCount();
    /**
     * <code>repeated string objs = 1;</code>
     *
     * <pre>
     * 股票代码
     * </pre>
     */
    java.lang.String getObjs(int index);
    /**
     * <code>repeated string objs = 1;</code>
     *
     * <pre>
     * 股票代码
     * </pre>
     */
    com.google.protobuf.ByteString
        getObjsBytes(int index);
  }
  /**
   * Protobuf type {@code dzhyun.TradeObj}
   *
   * <pre>
   *交易obj数据
   * </pre>
   */
  public static final class TradeObj extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:dzhyun.TradeObj)
      TradeObjOrBuilder {
    // Use TradeObj.newBuilder() to construct.
    private TradeObj(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TradeObj(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TradeObj defaultInstance;
    public static TradeObj getDefaultInstance() {
      return defaultInstance;
    }

    public TradeObj getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TradeObj(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                objs_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              objs_.add(bs);
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          objs_ = objs_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dzhyun.CldTradeRequiteShuJu.internal_static_dzhyun_TradeObj_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dzhyun.CldTradeRequiteShuJu.internal_static_dzhyun_TradeObj_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dzhyun.CldTradeRequiteShuJu.TradeObj.class, dzhyun.CldTradeRequiteShuJu.TradeObj.Builder.class);
    }

    public static com.google.protobuf.Parser<TradeObj> PARSER =
        new com.google.protobuf.AbstractParser<TradeObj>() {
      public TradeObj parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TradeObj(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TradeObj> getParserForType() {
      return PARSER;
    }

    public static final int OBJS_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList objs_;
    /**
     * <code>repeated string objs = 1;</code>
     *
     * <pre>
     * 股票代码
     * </pre>
     */
    public com.google.protobuf.ProtocolStringList
        getObjsList() {
      return objs_;
    }
    /**
     * <code>repeated string objs = 1;</code>
     *
     * <pre>
     * 股票代码
     * </pre>
     */
    public int getObjsCount() {
      return objs_.size();
    }
    /**
     * <code>repeated string objs = 1;</code>
     *
     * <pre>
     * 股票代码
     * </pre>
     */
    public java.lang.String getObjs(int index) {
      return objs_.get(index);
    }
    /**
     * <code>repeated string objs = 1;</code>
     *
     * <pre>
     * 股票代码
     * </pre>
     */
    public com.google.protobuf.ByteString
        getObjsBytes(int index) {
      return objs_.getByteString(index);
    }

    private void initFields() {
      objs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < objs_.size(); i++) {
        output.writeBytes(1, objs_.getByteString(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < objs_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(objs_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getObjsList().size();
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

    public static dzhyun.CldTradeRequiteShuJu.TradeObj parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeObj parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeObj parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeObj parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeObj parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeObj parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeObj parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeObj parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeObj parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeObj parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(dzhyun.CldTradeRequiteShuJu.TradeObj prototype) {
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
     * Protobuf type {@code dzhyun.TradeObj}
     *
     * <pre>
     *交易obj数据
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:dzhyun.TradeObj)
        dzhyun.CldTradeRequiteShuJu.TradeObjOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return dzhyun.CldTradeRequiteShuJu.internal_static_dzhyun_TradeObj_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return dzhyun.CldTradeRequiteShuJu.internal_static_dzhyun_TradeObj_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                dzhyun.CldTradeRequiteShuJu.TradeObj.class, dzhyun.CldTradeRequiteShuJu.TradeObj.Builder.class);
      }

      // Construct using dzhyun.CldTradeRequiteShuJu.TradeObj.newBuilder()
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
        objs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return dzhyun.CldTradeRequiteShuJu.internal_static_dzhyun_TradeObj_descriptor;
      }

      public dzhyun.CldTradeRequiteShuJu.TradeObj getDefaultInstanceForType() {
        return dzhyun.CldTradeRequiteShuJu.TradeObj.getDefaultInstance();
      }

      public dzhyun.CldTradeRequiteShuJu.TradeObj build() {
        dzhyun.CldTradeRequiteShuJu.TradeObj result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public dzhyun.CldTradeRequiteShuJu.TradeObj buildPartial() {
        dzhyun.CldTradeRequiteShuJu.TradeObj result = new dzhyun.CldTradeRequiteShuJu.TradeObj(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          objs_ = objs_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.objs_ = objs_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof dzhyun.CldTradeRequiteShuJu.TradeObj) {
          return mergeFrom((dzhyun.CldTradeRequiteShuJu.TradeObj)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(dzhyun.CldTradeRequiteShuJu.TradeObj other) {
        if (other == dzhyun.CldTradeRequiteShuJu.TradeObj.getDefaultInstance()) return this;
        if (!other.objs_.isEmpty()) {
          if (objs_.isEmpty()) {
            objs_ = other.objs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureObjsIsMutable();
            objs_.addAll(other.objs_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        dzhyun.CldTradeRequiteShuJu.TradeObj parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (dzhyun.CldTradeRequiteShuJu.TradeObj) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.LazyStringList objs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureObjsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          objs_ = new com.google.protobuf.LazyStringArrayList(objs_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string objs = 1;</code>
       *
       * <pre>
       * 股票代码
       * </pre>
       */
      public com.google.protobuf.ProtocolStringList
          getObjsList() {
        return objs_.getUnmodifiableView();
      }
      /**
       * <code>repeated string objs = 1;</code>
       *
       * <pre>
       * 股票代码
       * </pre>
       */
      public int getObjsCount() {
        return objs_.size();
      }
      /**
       * <code>repeated string objs = 1;</code>
       *
       * <pre>
       * 股票代码
       * </pre>
       */
      public java.lang.String getObjs(int index) {
        return objs_.get(index);
      }
      /**
       * <code>repeated string objs = 1;</code>
       *
       * <pre>
       * 股票代码
       * </pre>
       */
      public com.google.protobuf.ByteString
          getObjsBytes(int index) {
        return objs_.getByteString(index);
      }
      /**
       * <code>repeated string objs = 1;</code>
       *
       * <pre>
       * 股票代码
       * </pre>
       */
      public Builder setObjs(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureObjsIsMutable();
        objs_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string objs = 1;</code>
       *
       * <pre>
       * 股票代码
       * </pre>
       */
      public Builder addObjs(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureObjsIsMutable();
        objs_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string objs = 1;</code>
       *
       * <pre>
       * 股票代码
       * </pre>
       */
      public Builder addAllObjs(
          java.lang.Iterable<java.lang.String> values) {
        ensureObjsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, objs_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string objs = 1;</code>
       *
       * <pre>
       * 股票代码
       * </pre>
       */
      public Builder clearObjs() {
        objs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string objs = 1;</code>
       *
       * <pre>
       * 股票代码
       * </pre>
       */
      public Builder addObjsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureObjsIsMutable();
        objs_.add(value);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:dzhyun.TradeObj)
    }

    static {
      defaultInstance = new TradeObj(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:dzhyun.TradeObj)
  }

  public interface TradeSeatOrBuilder extends
      // @@protoc_insertion_point(interface_extends:dzhyun.TradeSeat)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string seats = 1;</code>
     *
     * <pre>
     * 机构席位
     * </pre>
     */
    com.google.protobuf.ProtocolStringList
        getSeatsList();
    /**
     * <code>repeated string seats = 1;</code>
     *
     * <pre>
     * 机构席位
     * </pre>
     */
    int getSeatsCount();
    /**
     * <code>repeated string seats = 1;</code>
     *
     * <pre>
     * 机构席位
     * </pre>
     */
    java.lang.String getSeats(int index);
    /**
     * <code>repeated string seats = 1;</code>
     *
     * <pre>
     * 机构席位
     * </pre>
     */
    com.google.protobuf.ByteString
        getSeatsBytes(int index);
  }
  /**
   * Protobuf type {@code dzhyun.TradeSeat}
   *
   * <pre>
   *交易席位数据
   * </pre>
   */
  public static final class TradeSeat extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:dzhyun.TradeSeat)
      TradeSeatOrBuilder {
    // Use TradeSeat.newBuilder() to construct.
    private TradeSeat(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TradeSeat(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TradeSeat defaultInstance;
    public static TradeSeat getDefaultInstance() {
      return defaultInstance;
    }

    public TradeSeat getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TradeSeat(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                seats_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              seats_.add(bs);
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          seats_ = seats_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dzhyun.CldTradeRequiteShuJu.internal_static_dzhyun_TradeSeat_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dzhyun.CldTradeRequiteShuJu.internal_static_dzhyun_TradeSeat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dzhyun.CldTradeRequiteShuJu.TradeSeat.class, dzhyun.CldTradeRequiteShuJu.TradeSeat.Builder.class);
    }

    public static com.google.protobuf.Parser<TradeSeat> PARSER =
        new com.google.protobuf.AbstractParser<TradeSeat>() {
      public TradeSeat parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TradeSeat(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TradeSeat> getParserForType() {
      return PARSER;
    }

    public static final int SEATS_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList seats_;
    /**
     * <code>repeated string seats = 1;</code>
     *
     * <pre>
     * 机构席位
     * </pre>
     */
    public com.google.protobuf.ProtocolStringList
        getSeatsList() {
      return seats_;
    }
    /**
     * <code>repeated string seats = 1;</code>
     *
     * <pre>
     * 机构席位
     * </pre>
     */
    public int getSeatsCount() {
      return seats_.size();
    }
    /**
     * <code>repeated string seats = 1;</code>
     *
     * <pre>
     * 机构席位
     * </pre>
     */
    public java.lang.String getSeats(int index) {
      return seats_.get(index);
    }
    /**
     * <code>repeated string seats = 1;</code>
     *
     * <pre>
     * 机构席位
     * </pre>
     */
    public com.google.protobuf.ByteString
        getSeatsBytes(int index) {
      return seats_.getByteString(index);
    }

    private void initFields() {
      seats_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < seats_.size(); i++) {
        output.writeBytes(1, seats_.getByteString(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < seats_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(seats_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getSeatsList().size();
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

    public static dzhyun.CldTradeRequiteShuJu.TradeSeat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeSeat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeSeat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeSeat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeSeat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeSeat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeSeat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeSeat parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeSeat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static dzhyun.CldTradeRequiteShuJu.TradeSeat parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(dzhyun.CldTradeRequiteShuJu.TradeSeat prototype) {
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
     * Protobuf type {@code dzhyun.TradeSeat}
     *
     * <pre>
     *交易席位数据
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:dzhyun.TradeSeat)
        dzhyun.CldTradeRequiteShuJu.TradeSeatOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return dzhyun.CldTradeRequiteShuJu.internal_static_dzhyun_TradeSeat_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return dzhyun.CldTradeRequiteShuJu.internal_static_dzhyun_TradeSeat_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                dzhyun.CldTradeRequiteShuJu.TradeSeat.class, dzhyun.CldTradeRequiteShuJu.TradeSeat.Builder.class);
      }

      // Construct using dzhyun.CldTradeRequiteShuJu.TradeSeat.newBuilder()
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
        seats_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return dzhyun.CldTradeRequiteShuJu.internal_static_dzhyun_TradeSeat_descriptor;
      }

      public dzhyun.CldTradeRequiteShuJu.TradeSeat getDefaultInstanceForType() {
        return dzhyun.CldTradeRequiteShuJu.TradeSeat.getDefaultInstance();
      }

      public dzhyun.CldTradeRequiteShuJu.TradeSeat build() {
        dzhyun.CldTradeRequiteShuJu.TradeSeat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public dzhyun.CldTradeRequiteShuJu.TradeSeat buildPartial() {
        dzhyun.CldTradeRequiteShuJu.TradeSeat result = new dzhyun.CldTradeRequiteShuJu.TradeSeat(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          seats_ = seats_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.seats_ = seats_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof dzhyun.CldTradeRequiteShuJu.TradeSeat) {
          return mergeFrom((dzhyun.CldTradeRequiteShuJu.TradeSeat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(dzhyun.CldTradeRequiteShuJu.TradeSeat other) {
        if (other == dzhyun.CldTradeRequiteShuJu.TradeSeat.getDefaultInstance()) return this;
        if (!other.seats_.isEmpty()) {
          if (seats_.isEmpty()) {
            seats_ = other.seats_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSeatsIsMutable();
            seats_.addAll(other.seats_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        dzhyun.CldTradeRequiteShuJu.TradeSeat parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (dzhyun.CldTradeRequiteShuJu.TradeSeat) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.LazyStringList seats_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureSeatsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          seats_ = new com.google.protobuf.LazyStringArrayList(seats_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string seats = 1;</code>
       *
       * <pre>
       * 机构席位
       * </pre>
       */
      public com.google.protobuf.ProtocolStringList
          getSeatsList() {
        return seats_.getUnmodifiableView();
      }
      /**
       * <code>repeated string seats = 1;</code>
       *
       * <pre>
       * 机构席位
       * </pre>
       */
      public int getSeatsCount() {
        return seats_.size();
      }
      /**
       * <code>repeated string seats = 1;</code>
       *
       * <pre>
       * 机构席位
       * </pre>
       */
      public java.lang.String getSeats(int index) {
        return seats_.get(index);
      }
      /**
       * <code>repeated string seats = 1;</code>
       *
       * <pre>
       * 机构席位
       * </pre>
       */
      public com.google.protobuf.ByteString
          getSeatsBytes(int index) {
        return seats_.getByteString(index);
      }
      /**
       * <code>repeated string seats = 1;</code>
       *
       * <pre>
       * 机构席位
       * </pre>
       */
      public Builder setSeats(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureSeatsIsMutable();
        seats_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string seats = 1;</code>
       *
       * <pre>
       * 机构席位
       * </pre>
       */
      public Builder addSeats(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureSeatsIsMutable();
        seats_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string seats = 1;</code>
       *
       * <pre>
       * 机构席位
       * </pre>
       */
      public Builder addAllSeats(
          java.lang.Iterable<java.lang.String> values) {
        ensureSeatsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, seats_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string seats = 1;</code>
       *
       * <pre>
       * 机构席位
       * </pre>
       */
      public Builder clearSeats() {
        seats_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string seats = 1;</code>
       *
       * <pre>
       * 机构席位
       * </pre>
       */
      public Builder addSeatsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureSeatsIsMutable();
        seats_.add(value);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:dzhyun.TradeSeat)
    }

    static {
      defaultInstance = new TradeSeat(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:dzhyun.TradeSeat)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dzhyun_TradeObj_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_dzhyun_TradeObj_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dzhyun_TradeSeat_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_dzhyun_TradeSeat_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032CldTradeRequiteShuJu.proto\022\006dzhyun\"\030\n\010" +
      "TradeObj\022\014\n\004objs\030\001 \003(\t\"\032\n\tTradeSeat\022\r\n\005s" +
      "eats\030\001 \003(\t"
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
    internal_static_dzhyun_TradeObj_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dzhyun_TradeObj_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_dzhyun_TradeObj_descriptor,
        new java.lang.String[] { "Objs", });
    internal_static_dzhyun_TradeSeat_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_dzhyun_TradeSeat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_dzhyun_TradeSeat_descriptor,
        new java.lang.String[] { "Seats", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
