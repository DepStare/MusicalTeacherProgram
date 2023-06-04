package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstAdvancedPianoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_advanced_piano);
    }

    public void backupButton10(View v) {
        Intent intent = new Intent(this, AdvancedPianoTasksActivity.class);
        startActivity(intent);
    }

}