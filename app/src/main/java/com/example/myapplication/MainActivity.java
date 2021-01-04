package com.example.myapplication;
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

public class MainActivity extends AppCompatActivity {

    private EditText uname;
    private EditText upass;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname = (EditText) findViewById(R.id.uname);
        upass = (EditText) findViewById(R.id.upass);

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);   //全屏
//        play_mp4();

    }

    public void LoginGet(View view){
        String name=uname.getText().toString();
        String pass=upass.getText().toString();
        System.out.println("用户名是:" + name);
        System.out.println("密码是:" + pass);
    }

    public void buttonGet(View view){
        System.out.println("前端点击了button按钮");
    }

    public void switchGet(View view){
        System.out.println("点击了switch按钮");
    }
//    private void play_mp4(){
//        String videoUrl1 = "/storage/emulated/0/test.mp4";   // 或者 file:///storage/emulated/0/test.mp4
//        Uri uri = Uri.parse( videoUrl1 );
//        videoView = (VideoView)this.findViewById(R.id.videoView );
//        videoView.setMediaController(new MediaController(this));
//        videoView.setVideoURI(uri);
//        videoView.start();
//    }
//
//    private void play_rtsp() throws IOException {
//        String videoUrl2 = "rtsp://192.168.110.227:1935/vod/sample.mp4" ;
//        Uri uri = Uri.parse( videoUrl2 );
//        videoView = (VideoView)this.findViewById(R.id.videoView );
//        //videoView.setVideoPath(path);
//        videoView.setVideoURI(uri);
//        videoView.requestFocus();
//        videoView.start();
//    }
}