package com.example.tareaclase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val REQUEST_VIDEO_CAPTURE = 1
        Intent(MediaStore.ACTION_VIDEO_CAPTURE).also {
            Intent takeVideoIntent;
            PackageManager packageManager;
            takeVideoIntent -
                takeVideoIntent.resolveActivity(packageManager)?.also {
            startActivityForResult(takeVideoIntent, REQUEST_VIDEO_CAPTURE)
        }
        }
    }




}