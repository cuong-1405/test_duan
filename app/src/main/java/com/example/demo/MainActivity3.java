package com.example.demo;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    @Override
    protected void onStart(){
        Log.d( "onStart","Ham onStart được gọi");
        super.onStart();
    }
    @Override
    protected void onResume(){
        Log.d( "onResume","Ham onResume được gọi");
        super.onResume();
    }
    @Override
    protected void onStop(){
        Log.d( "onStop","Ham onStop được gọi");
        super.onStop();
    }    @Override
    protected void onPause(){
        Log.d( "onPause","Ham onPause được gọi");
        super.onPause();
    }
    protected void onDestroy(){
        Log.d( "onDestroy","Ham onDestroy được gọi");
        super.onDestroy();
    }
    protected void onRestart(){
        Log.d( "onRestart","Ham onRestart được gọi");
        super.onRestart();
    }


}