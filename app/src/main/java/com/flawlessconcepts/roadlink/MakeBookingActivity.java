package com.flawlessconcepts.roadlink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class MakeBookingActivity extends AppCompatActivity {
    private Spinner spinner;
    private String hasReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_booking);

        MaterialButton makebookingButton = findViewById(R.id.bt_book_now) ;
        makebookingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeBooking();
            }
        });

        hasReturnSpinner();

    }

    private void makeBooking() {
        Intent makeBooking = new Intent(MakeBookingActivity.this, ConfirmActivity.class);
        startActivity(makeBooking);
    }

    public void hasReturnSpinner() {

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                hasReturn = adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}