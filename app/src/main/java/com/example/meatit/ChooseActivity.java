package com.example.meatit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import com.example.meatit.Util.NightModeSharedPrefUtil;
import com.example.meatit.Util.ThemeUtil;

public class ChooseActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    static {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
    }

    private int viewID;
    private ImageView imageView23;
    private ImageView imageView31;
    private Switch darkModeSw;
    private boolean mIsNightMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeUtil.setTheme(this);
        if (NightModeSharedPrefUtil.loadNightModeState(this)) {
            setTheme(R.style.DarkTheme);
//            Toast.makeText(getApplication(), "hihiDark", Toast.LENGTH_SHORT).show();
        } else {
            setTheme(R.style.LightTheme);
//            Toast.makeText(getApplication(), "hihiLight", Toast.LENGTH_SHORT).show();
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        imageView23 = findViewById(R.id.imageView23);
        imageView31 = findViewById(R.id.imageView31);
        imageView23.setOnClickListener(this);
        imageView31.setOnClickListener(this);
        darkModeSw = findViewById(R.id.sw_dark_mode);
        darkModeSw.setOnCheckedChangeListener(this);

        if (NightModeSharedPrefUtil.loadNightModeState(this)) {
            darkModeSw.setChecked(true);
        }

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
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        // Non-human button press does not trigger
        if(!compoundButton.isPressed()) {
            return;
        }
        mIsNightMode = b;
        if(mIsNightMode){
//                    getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            NightModeSharedPrefUtil.setNightModeState(this,true);
//                    Toast.makeText(getApplication(), "hihiYES", Toast.LENGTH_SHORT).show();
            ThemeUtil.reCreateOnThread(this);
        }else{
//                    getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            NightModeSharedPrefUtil.setNightModeState(this,false);
//                    Toast.makeText(getApplication(), "hihiNO", Toast.LENGTH_SHORT).show();
            ThemeUtil.reCreateOnThread(this);
        }
    }

}
