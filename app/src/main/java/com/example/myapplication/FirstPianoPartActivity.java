package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstPianoPartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_first_part);
    }

    public void backupButton2(View v) {
        Intent intent = new Intent(this, PianoTasksActivity.class);
        startActivity(intent);
    }
}