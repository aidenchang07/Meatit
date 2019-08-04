package com.example.meatit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();


        //等待1秒
        try {
            // delay 1 second
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //開啟導覽頁
        Intent introActivityIntent = new Intent(MainActivity.this, IntroActivity.class);
        startActivity(introActivityIntent);

    }
}
