package com.example.meatit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private int viewID;
    private Button createAccountButton;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        createAccountButton = findViewById(R.id.button8);
        loginButton = findViewById(R.id.button7);
        createAccountButton.setOnClickListener(this);
        loginButton.setOnClickListener(this);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //直接返回桌面，不直接關閉應用程式
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent home = new Intent(Intent.ACTION_MAIN);
            home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            home.addCategory(Intent.CATEGORY_HOME);
            startActivity(home);
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onClick(View view) {
        viewID = view.getId();
        if (viewID == R.id.button7) {
            //login
            Intent searchActivityIntent = new Intent(LoginActivity.this, SearchActivity.class);
            startActivity(searchActivityIntent);
        } else if (viewID == R.id.button8) {
            //create account
            Intent createAccountActivityIntent = new Intent(LoginActivity.this, CreateAccountActivity.class);
            startActivity(createAccountActivityIntent);
        } else {

        }
    }
}
