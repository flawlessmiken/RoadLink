package com.flawlessconcepts.roadlink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
    }

    public void cancelBookingClicked(View view) {
        Toast.makeText(this, "Canceled", Toast.LENGTH_SHORT).show();
    }

    public void confirmBookingClicked(View view) {
        Intent viewALlBooking = new Intent(ConfirmActivity.this, ViewAllBookingActivity.class);
        startActivity(viewALlBooking);
    }
}