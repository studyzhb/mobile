// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dzhyun.user.proto

#import "J2ObjC_source.h"
#import "com/dzhyun/proto/DzhyunUser.h"
#import "com/google/protobuf/Descriptors_PackagePrivate.h"
#import "com/google/protobuf/ExtensionRegistry.h"
#import "com/google/protobuf/GeneratedMessage_PackagePrivate.h"
#import "com/google/protobuf/RepeatedField.h"
#import "java/lang/IllegalArgumentException.h"

#pragma GCC diagnostic ignored "-Wprotocol"
#pragma clang diagnostic ignored "-Wprotocol"
#pragma GCC diagnostic ignored "-Wincomplete-implementation"
#pragma clang diagnostic ignored "-Wincomplete-implementation"

@implementation ComDzhyunProtoDzhyunUser

+ (void)registerAllExtensionsWithComGoogleProtobufExtensionRegistry:(ComGoogleProtobufExtensionRegistry *)extensionRegistry {
  ComDzhyunProtoDzhyunUser_registerAllExtensionsWithComGoogleProtobufExtensionRegistry_(extensionRegistry);
}

@end

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ComDzhyunProtoDzhyunUser)

void ComDzhyunProtoDzhyunUser_registerAllExtensionsWithComGoogleProtobufExtensionRegistry_(ComGoogleProtobufExtensionRegistry *extensionRegistry) {
}

J2OBJC_INITIALIZED_DEFN(ComDzhyunProtoDzhyunUser_UserInfo);

ComGoogleProtobufDescriptors_Descriptor *ComDzhyunProtoDzhyunUser_UserInfo_descriptor_;

@implementation ComDzhyunProtoDzhyunUser_UserInfo

typedef struct ComDzhyunProtoDzhyunUser_UserInfo_Storage {
  uint32_t hasBits[1];
  NSString *object_;
  NSString *propVersion_;
  CGPRepeatedField groups_;
} ComDzhyunProtoDzhyunUser_UserInfo_Storage;

+ (ComGoogleProtobufDescriptors_Descriptor *)getDescriptor {
  return ComDzhyunProtoDzhyunUser_UserInfo_descriptor_;
}

+ (void)initialize {
  if (self == [ComDzhyunProtoDzhyunUser_UserInfo class]) {
    static CGPFieldData fields[] = {
      {
        .name = "Object",
        .javaName = "Object",
        .number = 1,
        .flags = CGPFieldFlagRequired,
        .type = ComGoogleProtobufDescriptors_FieldDescriptor_Type_STRING,
        .defaultValue.valueId = @"",
        .hasBitIndex = 0,
        .offset = offsetof(ComDzhyunProtoDzhyunUser_UserInfo_Storage, object_),
        .className = NULL,
        .containingType = "ComDzhyunProtoDzhyunUser_UserInfo",
        .optionsData = NULL,
      },
      {
        .name = "PropVersion",
        .javaName = "PropVersion",
        .number = 2,
        .flags = CGPFieldFlagRequired,
        .type = ComGoogleProtobufDescriptors_FieldDescriptor_Type_STRING,
        .defaultValue.valueId = @"",
        .hasBitIndex = 1,
        .offset = offsetof(ComDzhyunProtoDzhyunUser_UserInfo_Storage, propVersion_),
        .className = NULL,
        .containingType = "ComDzhyunProtoDzhyunUser_UserInfo",
        .optionsData = NULL,
      },
      {
        .name = "Groups",
        .javaName = "Groups",
        .number = 3,
        .flags = CGPFieldFlagRepeated,
        .type = ComGoogleProtobufDescriptors_FieldDescriptor_Type_STRING,
        .defaultValue.valueId = nil,
        .hasBitIndex = 0,
        .offset = offsetof(ComDzhyunProtoDzhyunUser_UserInfo_Storage, groups_),
        .className = NULL,
        .containingType = "ComDzhyunProtoDzhyunUser_UserInfo",
        .optionsData = NULL,
      },
    };
    CGPInitDescriptor(&ComDzhyunProtoDzhyunUser_UserInfo_descriptor_, self, [ComDzhyunProtoDzhyunUser_UserInfo_Builder class], 0, sizeof(ComDzhyunProtoDzhyunUser_UserInfo_Storage), 3, fields);
    J2OBJC_SET_INITIALIZED(ComDzhyunProtoDzhyunUser_UserInfo)
  }
}

@end

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ComDzhyunProtoDzhyunUser_UserInfo)

ComDzhyunProtoDzhyunUser_UserInfo *ComDzhyunProtoDzhyunUser_UserInfo_getDefaultInstance() {
  ComDzhyunProtoDzhyunUser_UserInfo_initialize();
  return (ComDzhyunProtoDzhyunUser_UserInfo *)[CGPNewMessage(ComDzhyunProtoDzhyunUser_UserInfo_descriptor_) autorelease];
}

ComDzhyunProtoDzhyunUser_UserInfo_Builder *ComDzhyunProtoDzhyunUser_UserInfo_newBuilder() {
  ComDzhyunProtoDzhyunUser_UserInfo_initialize();
  return (ComDzhyunProtoDzhyunUser_UserInfo_Builder *)[CGPNewBuilder(ComDzhyunProtoDzhyunUser_UserInfo_descriptor_) autorelease];
}

ComDzhyunProtoDzhyunUser_UserInfo_Builder *ComDzhyunProtoDzhyunUser_UserInfo_newBuilderWithComDzhyunProtoDzhyunUser_UserInfo_(ComDzhyunProtoDzhyunUser_UserInfo *message) {
  ComDzhyunProtoDzhyunUser_UserInfo_initialize();
  return (ComDzhyunProtoDzhyunUser_UserInfo_Builder *)CGPBuilderFromPrototype(ComDzhyunProtoDzhyunUser_UserInfo_descriptor_, message);
}

ComGoogleProtobufDescriptors_Descriptor *ComDzhyunProtoDzhyunUser_UserInfo_getDescriptor() {
  ComDzhyunProtoDzhyunUser_UserInfo_initialize();
  return ComDzhyunProtoDzhyunUser_UserInfo_descriptor_;
}

ComDzhyunProtoDzhyunUser_UserInfo *ComDzhyunProtoDzhyunUser_UserInfo_parseFromWithByteArray_withComGoogleProtobufExtensionRegistryLite_(IOSByteArray *bytes, ComGoogleProtobufExtensionRegistryLite *registry) {
  ComDzhyunProtoDzhyunUser_UserInfo_initialize();
  return (ComDzhyunProtoDzhyunUser_UserInfo *)CGPParseFromByteArray(ComDzhyunProtoDzhyunUser_UserInfo_descriptor_, bytes, registry);
}

ComDzhyunProtoDzhyunUser_UserInfo *ComDzhyunProtoDzhyunUser_UserInfo_parseFromWithJavaIoInputStream_withComGoogleProtobufExtensionRegistryLite_(JavaIoInputStream *input, ComGoogleProtobufExtensionRegistryLite *registry) {
  ComDzhyunProtoDzhyunUser_UserInfo_initialize();
  return (ComDzhyunProtoDzhyunUser_UserInfo *)CGPParseFromInputStream(ComDzhyunProtoDzhyunUser_UserInfo_descriptor_, input, registry);
}
ComDzhyunProtoDzhyunUser_UserInfo *ComDzhyunProtoDzhyunUser_UserInfo_parseDelimitedFromWithJavaIoInputStream_withComGoogleProtobufExtensionRegistryLite_(JavaIoInputStream *input, ComGoogleProtobufExtensionRegistryLite *registry) {
  ComDzhyunProtoDzhyunUser_UserInfo_initialize();
  return (ComDzhyunProtoDzhyunUser_UserInfo *)CGPParseDelimitedFromInputStream(ComDzhyunProtoDzhyunUser_UserInfo_descriptor_, input, registry);
}

@implementation ComDzhyunProtoDzhyunUser_UserInfo_Builder

+ (ComGoogleProtobufDescriptors_Descriptor *)getDescriptor {
  return [ComDzhyunProtoDzhyunUser_UserInfo getDescriptor];
}

@end

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ComDzhyunProtoDzhyunUser_UserInfo_Builder)
J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ComDzhyunProtoDzhyunUser_UserInfoOrBuilder)

ComGoogleProtobufDescriptors_Descriptor *ComDzhyunProtoDzhyunUser_UserInfo_Builder_getDescriptor() {
  ComDzhyunProtoDzhyunUser_UserInfo_initialize();
  return ComDzhyunProtoDzhyunUser_UserInfo_descriptor_;
}
