package com.example.meatit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.meatit.Util.MeatitAppCompatActivity;

public class CookSettingActivity extends MeatitAppCompatActivity implements View.OnClickListener {

    private int viewID;
    private Drawable orgDrawable;
    private Drawable touchDrawable;
    private Button nextBtn;
    private ImageView imageView21;
    private ImageView imageView22;
    private ImageView imageView24;
    private ImageView imageView25;
    private ImageView imageView26;
    private ImageView imageView27;
    private ImageView imageView28;
    private ImageView imageView29;
    private ImageView imageView30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cook_setting);

        nextBtn = findViewById(R.id.button12);
        nextBtn.setOnClickListener(this);

        imageView21 = findViewById(R.id.imageView21);
        imageView22 = findViewById(R.id.imageView22);
        imageView24 = findViewById(R.id.imageView24);
        imageView25 = findViewById(R.id.imageView25);
        imageView26 = findViewById(R.id.imageView26);
        imageView27 = findViewById(R.id.imageView27);
        imageView28 = findViewById(R.id.imageView28);
        imageView29 = findViewById(R.id.imageView29);
        imageView30 = findViewById(R.id.imageView30);

        imageView21.setOnClickListener(this);
        imageView22.setOnClickListener(this);
        imageView24.setOnClickListener(this);
        imageView25.setOnClickListener(this);
        imageView26.setOnClickListener(this);
        imageView27.setOnClickListener(this);
        imageView28.setOnClickListener(this);
        imageView29.setOnClickListener(this);
        imageView30.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        viewID = view.getId();

        if (viewID == R.id.button12) {
            Intent animalSettingActivityIntent = new Intent(CookSettingActivity.this, AnimalSettingActivity.class);
            startActivity(animalSettingActivityIntent);
        } else if (viewID == R.id.imageView22) {
            orgDrawable = imageView21.getDrawable();
            touchDrawable = imageView22.getDrawable();
            imageView21.setImageDrawable(touchDrawable);
            imageView22.setImageDrawable(orgDrawable);

        }

    }
}
