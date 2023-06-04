package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PianoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano);
    }

    public void pianoBeginnerButton(View v) {
        Intent intent = new Intent(this, PianoTasksActivity.class);
        startActivity(intent);
    }

    public void backupButton7(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void pianoAdvancedButton1(View v) {
        Intent intent = new Intent(this, AdvancedPianoTasksActivity.class);
        startActivity(intent);
    }

}