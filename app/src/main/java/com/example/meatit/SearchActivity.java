package com.example.meatit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.example.meatit.Util.MeatitAppCompatActivity;

public class SearchActivity extends MeatitAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "Logining...", Toast.LENGTH_LONG).show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {

                //等待1秒，開啟TroubleShooting頁
                Intent troubleShootingActivityIntent = new Intent(SearchActivity.this, TroubleShootingActivity.class);
                startActivity(troubleShootingActivityIntent);

            }}, 1000);

    }
}
