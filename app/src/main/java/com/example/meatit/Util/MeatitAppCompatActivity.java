package com.example.meatit.Util;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class MeatitAppCompatActivity extends AppCompatActivity {
    private int currentNightModeState = AppCompatDelegate.getDefaultNightMode();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set Dark Theme
        ThemeUtil.setTheme(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ThemeUtil.loadTheme(this, currentNightModeState);
    }
}
