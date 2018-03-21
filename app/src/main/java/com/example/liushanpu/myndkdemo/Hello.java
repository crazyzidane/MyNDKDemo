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

    //static var
    private static String mName = "liusp";

    //non static var
    private String mAddress = "ChengDu";

    public static void logMessage(String str) {
        Log.d("liusp", str);
    }

    //this static method will be called by native method.
    public static void staticMethod(String data) {
        logMessage(data);
        logMessage(mName);
    }

    //the non static method.
    public void method(String data) {
        logMessage(data);
        logMessage(mAddress);
    }

    //the static native method
    public static native String sayHello();

    //will try to invoke the static method in java through jni.
    public static native void callStaticMethod(int i);

    public static native void callStaticMethod(long l, String str);

    public native void callInstanceMethod(int i);

    public native void callInstanceMethod(String str, long l);
}
