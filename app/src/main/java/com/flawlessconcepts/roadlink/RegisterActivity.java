package com.flawlessconcepts.roadlink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        MaterialButton registerButton = findViewById(R.id.bt_register) ;
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerClicked();
            }
        });
    }

    private void registerClicked() {
        Intent startMenuActivity = new Intent(RegisterActivity.this, MenuActivity.class);
        startActivity(startMenuActivity);
    }
}