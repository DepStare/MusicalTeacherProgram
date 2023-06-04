package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FourthPianoPartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_piano_part);
    }

    public void backupButton6(View v) {
        Intent intent = new Intent(this, PianoTasksActivity.class);
        startActivity(intent);
    }

}