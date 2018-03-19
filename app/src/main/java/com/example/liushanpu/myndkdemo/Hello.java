package com.example.liushanpu.myndkdemo;

/**
 * Created by liushanpu on 18/3/19.
 */

public class Hello {

    static {
        System.loadLibrary("hello_jni");
    }

    public static native String sayHello();

}
