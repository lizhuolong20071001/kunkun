package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ji(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.ji);
        mediaPlayer.start();
    }
    public void ni(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.ni);
        mediaPlayer.start();
    }
    public void tai(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.tai);
        mediaPlayer.start();
    }
    public void mei(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.mei);
        mediaPlayer.start();
    }
    public void jinitaimei(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.jinitaimei);
        mediaPlayer.start();
    }
    public void sing(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.sing);
        mediaPlayer.start();
    }
    public void url(View view){
        Intent intent= new Intent();
        intent.setAction("android.intent.action.VIEW");
        Uri content_url = Uri.parse("https://github.com/lizhuolong20071001/kunkun");
        intent.setData(content_url);
        startActivity(intent);
    }
}