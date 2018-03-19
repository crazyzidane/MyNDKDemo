#设置工作目录，my-dir会返回Android.mk文件所在的目录
LOCAL_PATH  :=  $(call my-dir)

#清除几乎所有以LOCAL——PATH开头的变量（不包括LOCAL_PATH）
include $(CLEAR_VARS)

#设置模块的名称，即编译出来.so文件名,要和上述步骤中build.gradle中NDK节点设置的名字相同
LOCAL_MODULE    :=  hello_jni

LOCAL_SRC_FILES :=  com_example_liushanpu_myndkdemo_Hello.cpp

#指定生成的静态库或者共享库在运行时依赖的共享库模块列表
include $(BUILD_SHARED_LIBRARY)