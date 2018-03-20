package com.example.liushanpu.myndkdemo;

import android.util.Log;

/**
 * Created by liushanpu on 18/3/19.
 */

public class Hello {

    //load the so
    static {
        System.loadLibrary("hello_jni");
    }

    private static String mName = "liusp";

    public static void logMessage(String str) {
        Log.d("liusp", str);
    }

    //this method will be called by native method.
    public static void staticMethod(String data) {
        logMessage(data);
        logMessage(mName);
    }

    //the static native method
    public static native String sayHello();

    //will try to invoke the static method in java through jni.
    public static native void callStaticMethod(int i);

    public static native void callStaticMethod(long l, String str);

    public native void callInstanceMethod(int i);

    public native void callInstanceMethod(String str, long l);
}
