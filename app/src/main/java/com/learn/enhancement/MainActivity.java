package com.learn.enhancement;

import android._1_Activity的布局深度;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _1_Activity的布局深度 activity的布局深度 = new _1_Activity的布局深度();
        activity的布局深度.getLayoutDepth(this);
    }

}
