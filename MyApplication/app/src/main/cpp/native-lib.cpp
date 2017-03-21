#include <jni.h>
#include <string>

extern "C"
jstring
Java_com_example_bvm_myapplication_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello;
    hello = "\nHello from C++";
    return env->NewStringUTF(hello.c_str());
}
