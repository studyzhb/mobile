// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dzhyun.dxspirit.proto

#import "J2ObjC_header.h"
#import "com/google/protobuf/GeneratedMessage.h"
#import "com/google/protobuf/MessageOrBuilder.h"
#import "com/google/protobuf/ProtocolMessageEnum.h"
#import "java/lang/Enum.h"

@class ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder;
@class ComGoogleProtobufDescriptors_Descriptor;
@class ComGoogleProtobufExtensionRegistry;

@interface ComDzhyunProtoDzhyunDxspirit : NSObject

+ (void)registerAllExtensionsWithComGoogleProtobufExtensionRegistry:(ComGoogleProtobufExtensionRegistry *)extensionRegistry;

@end

FOUNDATION_EXPORT void ComDzhyunProtoDzhyunDxspirit_registerAllExtensionsWithComGoogleProtobufExtensionRegistry_(ComGoogleProtobufExtensionRegistry *extensionRegistry);

J2OBJC_EMPTY_STATIC_INIT(ComDzhyunProtoDzhyunDxspirit)

J2OBJC_TYPE_LITERAL_HEADER(ComDzhyunProtoDzhyunDxspirit)

@protocol ComDzhyunProtoDzhyunDxspirit_DXSpiritOrBuilder < ComGoogleProtobufMessageOrBuilder >

- (BOOL)hasShiJian;
- (long long int)getShiJian;

- (BOOL)hasObj;
- (NSString *)getObj;

- (BOOL)hasTongZhi;
- (NSString *)getTongZhi;

- (BOOL)hasShuJu;
- (long long int)getShuJu;

@end

J2OBJC_EMPTY_STATIC_INIT(ComDzhyunProtoDzhyunDxspirit_DXSpiritOrBuilder)

J2OBJC_TYPE_LITERAL_HEADER(ComDzhyunProtoDzhyunDxspirit_DXSpiritOrBuilder)

@interface ComDzhyunProtoDzhyunDxspirit_DXSpirit : ComGoogleProtobufGeneratedMessage<ComDzhyunProtoDzhyunDxspirit_DXSpiritOrBuilder>

+ (ComDzhyunProtoDzhyunDxspirit_DXSpirit *)getDefaultInstance;
- (ComDzhyunProtoDzhyunDxspirit_DXSpirit *)getDefaultInstanceForType;
+ (ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *)newBuilder OBJC_METHOD_FAMILY_NONE;
- (ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *)newBuilderForType OBJC_METHOD_FAMILY_NONE;
- (ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *)toBuilder;
+ (ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *)newBuilderWithComDzhyunProtoDzhyunDxspirit_DXSpirit:(ComDzhyunProtoDzhyunDxspirit_DXSpirit *)message OBJC_METHOD_FAMILY_NONE;
+ (ComGoogleProtobufDescriptors_Descriptor *)getDescriptor;
+ (ComDzhyunProtoDzhyunDxspirit_DXSpirit *)parseFromWithByteArray:(IOSByteArray *)bytes;
+ (ComDzhyunProtoDzhyunDxspirit_DXSpirit *)parseFromWithByteArray:(IOSByteArray *)bytes withComGoogleProtobufExtensionRegistryLite:(ComGoogleProtobufExtensionRegistryLite *)registry;
+ (ComDzhyunProtoDzhyunDxspirit_DXSpirit *)parseFromNSData:(NSData *)data;
+ (ComDzhyunProtoDzhyunDxspirit_DXSpirit *)parseFromNSData:(NSData *)data registry:(ComGoogleProtobufExtensionRegistryLite *)registry;
+ (ComDzhyunProtoDzhyunDxspirit_DXSpirit *)parseFromWithJavaIoInputStream:(JavaIoInputStream *)input;
+ (ComDzhyunProtoDzhyunDxspirit_DXSpirit *)parseFromWithJavaIoInputStream:(JavaIoInputStream *)bytes withComGoogleProtobufExtensionRegistryLite:(ComGoogleProtobufExtensionRegistryLite *)registry;
+ (ComDzhyunProtoDzhyunDxspirit_DXSpirit *)parseDelimitedFromWithJavaIoInputStream:(JavaIoInputStream *)input;
+ (ComDzhyunProtoDzhyunDxspirit_DXSpirit *)parseDelimitedFromWithJavaIoInputStream:(JavaIoInputStream *)bytes withComGoogleProtobufExtensionRegistryLite:(ComGoogleProtobufExtensionRegistryLite *)registry;

#define ComDzhyunProtoDzhyunDxspirit_DXSpirit_SHIJIAN_FIELD_NUMBER 1
#define ComDzhyunProtoDzhyunDxspirit_DXSpirit_OBJ_FIELD_NUMBER 2
#define ComDzhyunProtoDzhyunDxspirit_DXSpirit_TONGZHI_FIELD_NUMBER 3
#define ComDzhyunProtoDzhyunDxspirit_DXSpirit_SHUJU_FIELD_NUMBER 4

@end

FOUNDATION_EXPORT ComDzhyunProtoDzhyunDxspirit_DXSpirit *ComDzhyunProtoDzhyunDxspirit_DXSpirit_getDefaultInstance();
FOUNDATION_EXPORT ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *ComDzhyunProtoDzhyunDxspirit_DXSpirit_newBuilder();
FOUNDATION_EXPORT ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *ComDzhyunProtoDzhyunDxspirit_DXSpirit_newBuilderWithComDzhyunProtoDzhyunDxspirit_DXSpirit_(ComDzhyunProtoDzhyunDxspirit_DXSpirit *message);
FOUNDATION_EXPORT ComGoogleProtobufDescriptors_Descriptor *ComDzhyunProtoDzhyunDxspirit_DXSpirit_getDescriptor();
FOUNDATION_EXPORT ComDzhyunProtoDzhyunDxspirit_DXSpirit *ComDzhyunProtoDzhyunDxspirit_DXSpirit_parseFromWithByteArray_withComGoogleProtobufExtensionRegistryLite_(IOSByteArray *bytes, ComGoogleProtobufExtensionRegistryLite *registry);
CGP_ALWAYS_INLINE inline ComDzhyunProtoDzhyunDxspirit_DXSpirit *ComDzhyunProtoDzhyunDxspirit_DXSpirit_parseFromWithByteArray_(IOSByteArray *bytes) {
  return ComDzhyunProtoDzhyunDxspirit_DXSpirit_parseFromWithByteArray_withComGoogleProtobufExtensionRegistryLite_(bytes, nil);
}
FOUNDATION_EXPORT ComDzhyunProtoDzhyunDxspirit_DXSpirit *ComDzhyunProtoDzhyunDxspirit_DXSpirit_parseFromWithJavaIoInputStream_withComGoogleProtobufExtensionRegistryLite_(JavaIoInputStream *input, ComGoogleProtobufExtensionRegistryLite *registry);
CGP_ALWAYS_INLINE inline ComDzhyunProtoDzhyunDxspirit_DXSpirit *ComDzhyunProtoDzhyunDxspirit_DXSpirit_parseFromWithJavaIoInputStream_(JavaIoInputStream *input) {
  return ComDzhyunProtoDzhyunDxspirit_DXSpirit_parseFromWithJavaIoInputStream_withComGoogleProtobufExtensionRegistryLite_(input, nil);
}
FOUNDATION_EXPORT ComDzhyunProtoDzhyunDxspirit_DXSpirit *ComDzhyunProtoDzhyunDxspirit_DXSpirit_parseDelimitedFromWithJavaIoInputStream_withComGoogleProtobufExtensionRegistryLite_(JavaIoInputStream *input, ComGoogleProtobufExtensionRegistryLite *registry);
CGP_ALWAYS_INLINE inline ComDzhyunProtoDzhyunDxspirit_DXSpirit *ComDzhyunProtoDzhyunDxspirit_DXSpirit_parseDelimitedFromWithJavaIoInputStream_(JavaIoInputStream *input) {
  return ComDzhyunProtoDzhyunDxspirit_DXSpirit_parseDelimitedFromWithJavaIoInputStream_withComGoogleProtobufExtensionRegistryLite_(input, nil);
}

J2OBJC_STATIC_INIT(ComDzhyunProtoDzhyunDxspirit_DXSpirit)

J2OBJC_TYPE_LITERAL_HEADER(ComDzhyunProtoDzhyunDxspirit_DXSpirit)

FOUNDATION_EXPORT ComGoogleProtobufDescriptors_Descriptor *ComDzhyunProtoDzhyunDxspirit_DXSpirit_descriptor_;

@interface ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder : ComGoogleProtobufGeneratedMessage_Builder<ComDzhyunProtoDzhyunDxspirit_DXSpiritOrBuilder>

- (ComDzhyunProtoDzhyunDxspirit_DXSpirit *)getDefaultInstanceForType;
- (ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *)mergeFromWithComDzhyunProtoDzhyunDxspirit_DXSpirit:(ComDzhyunProtoDzhyunDxspirit_DXSpirit *)message;
- (ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *)mergeFromWithComGoogleProtobufMessage:(id<ComGoogleProtobufMessage>)message;
- (ComDzhyunProtoDzhyunDxspirit_DXSpirit *)build;
- (ComDzhyunProtoDzhyunDxspirit_DXSpirit *)buildPartial;
+ (ComGoogleProtobufDescriptors_Descriptor *)getDescriptor;

- (ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *)setShiJianWithLong:
    (long long int)value;
- (ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *)clearShiJian;

- (ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *)setObjWithNSString:
    (NSString *)value;
- (ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *)clearObj;

- (ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *)setTongZhiWithNSString:
    (NSString *)value;
- (ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *)clearTongZhi;

- (ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *)setShuJuWithLong:
    (long long int)value;
- (ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder *)clearShuJu;

@end

FOUNDATION_EXPORT ComGoogleProtobufDescriptors_Descriptor *ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder_getDescriptor();

J2OBJC_EMPTY_STATIC_INIT(ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder)

J2OBJC_TYPE_LITERAL_HEADER(ComDzhyunProtoDzhyunDxspirit_DXSpirit_Builder)
