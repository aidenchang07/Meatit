package com.example.meatit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ChooseActivity extends AppCompatActivity implements View.OnClickListener {

    private int viewID;
    private ImageView imageView23;
    private ImageView imageView31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        imageView23 = findViewById(R.id.imageView23);
        imageView31 = findViewById(R.id.imageView31);
        imageView23.setOnClickListener(this);
        imageView31.setOnClickListener(this);

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
}
