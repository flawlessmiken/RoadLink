package com.flawlessconcepts.roadlink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ViewAllBookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_booking);
    }

    public void doneBookingClicked(View view) {
        Intent goHome = new Intent(ViewAllBookingActivity.this, MainActivity.class);
        startActivity(goHome);
        finish();
    }
}