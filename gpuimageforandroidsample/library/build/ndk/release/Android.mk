LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := library
LOCAL_SRC_FILES := \
	/home/osabe/work/IDEA-workspace/GPUImageForAndroidSample/library/jni/yuv-decoder.c \
	/home/osabe/work/IDEA-workspace/GPUImageForAndroidSample/library/jni/Android.mk \
	/home/osabe/work/IDEA-workspace/GPUImageForAndroidSample/library/jni/Application.mk \

LOCAL_C_INCLUDES += /home/osabe/work/IDEA-workspace/GPUImageForAndroidSample/library/jni
LOCAL_C_INCLUDES += /home/osabe/work/IDEA-workspace/GPUImageForAndroidSample/library/src/release/jni

include $(BUILD_SHARED_LIBRARY)
