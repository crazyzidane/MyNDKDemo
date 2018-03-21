package com.example.liushanpu.myndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.text1);

        Hello.callStaticMethod(111);

        //Because the sayHello is static method, it is did not initial for Hello class.
        tv1.setText(Hello.sayHello());

        // call non static method
        new Hello().callInstanceMethod(222);
    }
}
