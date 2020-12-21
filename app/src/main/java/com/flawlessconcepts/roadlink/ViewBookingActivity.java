package com.flawlessconcepts.roadlink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ViewBookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
    }

    public void viewBookingClicked(View view) {
        Intent viewAllBooking = new Intent(ViewBookingActivity.this, ViewAllBookingActivity.class);
        startActivity(viewAllBooking);
    }
}