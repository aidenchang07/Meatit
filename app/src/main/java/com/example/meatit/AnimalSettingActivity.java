package com.example.meatit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.meatit.Util.MeatitAppCompatActivity;

public class AnimalSettingActivity extends MeatitAppCompatActivity {

    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_setting);

        nextBtn = findViewById(R.id.button14);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent meatResultActivityIntent = new Intent(AnimalSettingActivity.this, MeatResultActivity.class);
                startActivity(meatResultActivityIntent);
            }
        });

    }
}
