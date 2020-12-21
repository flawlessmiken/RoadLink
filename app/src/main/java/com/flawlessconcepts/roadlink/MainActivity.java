package com.flawlessconcepts.roadlink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {


    MaterialButton RegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton registerButton = findViewById(R.id.register) ;
        MaterialButton loginButton = findViewById(R.id.login) ;
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegister();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu();
            }
        });
    }


    private void openRegister(){
         Intent startRegister = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(startRegister);
    }

    private void openMenu(){
        Intent startMenu = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(startMenu);
    }
}