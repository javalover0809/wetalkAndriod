package com.example.myapplication;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity2 extends AppCompatActivity {

    private EditText uname;
    private EditText upass;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        uname = (EditText) findViewById(R.id.uname);
        upass = (EditText) findViewById(R.id.upass);
    }
    public void LoginGet(View view){
        String name=uname.getText().toString();
        String pass=upass.getText().toString();
        System.out.println("用户名是:" + name);
        System.out.println("密码是:" + pass);
    }

    public void buttonGet(View view){
        System.out.println("前端点击了button按钮");
//        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
//        startActivity(intent);
    }


    public void switchGet(View view){
        System.out.println("点击了switch按钮");
    }
}