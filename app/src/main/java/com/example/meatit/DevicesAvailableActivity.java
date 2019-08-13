package com.example.meatit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DevicesAvailableActivity extends AppCompatActivity {

    private Button deviceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devices_available);

        deviceBtn = findViewById(R.id.button10);
        deviceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cookSettingActivityIntent = new Intent(DevicesAvailableActivity.this, CookSettingActivity.class);
                startActivity(cookSettingActivityIntent);
            }
        });

    }
}
