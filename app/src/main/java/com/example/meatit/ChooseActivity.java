package com.example.meatit;

import androidx.appcompat.app.AppCompatDelegate;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

import com.example.meatit.Util.AnimationUtil;
import com.example.meatit.Util.MeatitAppCompatActivity;
import com.example.meatit.Util.NightModeSharedPrefUtil;
import com.example.meatit.Util.ThemeUtil;

public class ChooseActivity extends MeatitAppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private int viewID;
    private ImageView imageView23;
    private ImageView imageView31;
    private Switch darkModeSw;
    private AnimationUtil animationUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        init();
    }

    private void init() {
        animationUtil = new AnimationUtil();

        findView();
        setListener();

        // 初始化Switch按鈕
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            darkModeSw.setChecked(true);
        } else {
            darkModeSw.setChecked(false);
        }
    }

    private void findView() {
        imageView23 = findViewById(R.id.imageView23);
        imageView31 = findViewById(R.id.imageView31);
        darkModeSw = findViewById(R.id.sw_dark_mode);
    }

    private void setListener() {
        imageView23.setOnClickListener(this);
        imageView31.setOnClickListener(this);
        darkModeSw.setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View view) {
        viewID = view.getId();
        if (viewID == R.id.imageView23) {
            Intent beforeIntroActivityIntent = new Intent(ChooseActivity.this, BeforeIntroActivity.class);
            startActivity(beforeIntroActivityIntent);
        } else if (viewID == R.id.imageView31) {
            Intent afterIntroActivityIntent = new Intent(ChooseActivity.this, AfterIntroActivity.class);
            startActivity(afterIntroActivityIntent);
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean mIsNightMode) {
        // Non-human button press does not trigger
        if(!compoundButton.isPressed()) {
            return;
        }

        if(mIsNightMode){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            animationUtil.reCreateByAnimation(ChooseActivity.this);
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            animationUtil.reCreateByAnimation(ChooseActivity.this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Save night mode settings before activity closing
        NightModeSharedPrefUtil.setNightModeState(ChooseActivity.this,AppCompatDelegate.getDefaultNightMode());
    }
}
