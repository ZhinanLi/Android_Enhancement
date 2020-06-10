package com.learn.enhancement;

import android._1_Activity的布局深度;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import leetcode.二叉树.TreeNode;
import leetcode.二叉树._层次遍历二叉树;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _1_Activity的布局深度 activity的布局深度 = new _1_Activity的布局深度();
        activity的布局深度.getLayoutDepth(this);
        TextView tv = findViewById(R.id.tv);
        tv.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        TreeNode treeNode = new TreeNode();
        _层次遍历二叉树.levelTraversal(treeNode);


    }

}
