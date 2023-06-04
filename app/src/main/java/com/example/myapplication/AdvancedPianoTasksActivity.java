package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdvancedPianoTasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_piano_tasks);
    }

    public void advancedPianoButton1(View v) {
        Intent intent = new Intent(this, FirstAdvancedPianoActivity.class);
        startActivity(intent);
    }

    public void advancedPianoButton2(View v) {
        Intent intent = new Intent(this, ThirdAdvancedPianoActivity.class);
        startActivity(intent);
    }

    public void advancedPianoButton3(View v) {
        Intent intent = new Intent(this, ThirdAdvancedPianoActivity.class);
        startActivity(intent);
    }

    public void backupButton9(View v) {
        Intent intent = new Intent(this, PianoActivity.class);
        startActivity(intent);
    }

}