package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PianoTasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_tasks);
    }

    public void backupButton1(View v) {
        Intent intent = new Intent(this, PianoActivity.class);
        startActivity(intent);
    }
    public void firstStepsButton(View v) {
        Intent intent = new Intent(this, FirstPianoPartActivity.class);
        startActivity(intent);
    }

    public void secondPartPianoButton(View v) {
        Intent intent = new Intent(this, SecondPianoPartActivity.class);
        startActivity(intent);
    }

    public void thirdPartPianoButton(View v) {
        Intent intent = new Intent(this, ThirdPianoPartActivity.class);
        startActivity(intent);
    }

    public void fourthPartPianoButton(View v) {
        Intent intent = new Intent(this, FourthPianoPartActivity.class);
        startActivity(intent);
    }
}