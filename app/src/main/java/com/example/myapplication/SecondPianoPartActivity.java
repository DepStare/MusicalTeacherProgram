package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondPianoPartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_piano_part);
    }

    public void backupbutton4(View v) {
        Intent intent = new Intent(this, PianoTasksActivity.class);
        startActivity(intent);
    }

}