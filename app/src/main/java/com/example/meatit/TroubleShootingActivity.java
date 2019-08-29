package com.example.meatit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.meatit.Util.MeatitAppCompatActivity;

public class TroubleShootingActivity extends MeatitAppCompatActivity {

    private Button refreshBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trouble_shooting);

        refreshBtn = findViewById(R.id.button11);
        refreshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent devicesAvailableActivityIntent = new Intent(TroubleShootingActivity.this, DevicesAvailableActivity.class);
                startActivity(devicesAvailableActivityIntent);
            }
        });

    }
}
