package com.example.meatit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.meatit.Util.MeatitAppCompatActivity;
import com.example.meatit.Util.NightModeSharedPrefUtil;
import com.example.meatit.Util.ThemeUtil;

public class WelcomeActivity extends MeatitAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    @Override
    protected void onStart() {
        super.onStart();

        init();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){

            @Override
            public void run() {

                //等待1秒，開啟選擇探針頁面
                Intent chooseActivityIntent = new Intent(WelcomeActivity.this, ChooseActivity.class);
                startActivity(chooseActivityIntent);

            }}, 1000);

    }

    private void init() {
        // 初始化主題
        ThemeUtil.initTheme(this);
    }
}
