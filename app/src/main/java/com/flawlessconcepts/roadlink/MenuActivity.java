package com.flawlessconcepts.roadlink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        MaterialButton viewBookingButton = findViewById(R.id.bt_view_booking) ;
        viewBookingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewBookingClicked();
            }
        });


        MaterialButton makebookingButton = findViewById(R.id.bt_make_booking) ;
        makebookingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeBookingClicked();
            }
        });
    }

    private  void viewBookingClicked(){
        Intent startViewBooking = new Intent(MenuActivity.this, ViewBookingActivity.class);
        startActivity(startViewBooking);
    }
    private void makeBookingClicked(){
        Intent startMakeBooking = new Intent(MenuActivity.this, MakeBookingActivity.class);
        startActivity(startMakeBooking);
    }
}