package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdAdvancedPianoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_advanced_piano);
    }

    public void backupButton9(View v) {
        Intent intent = new Intent(this, AdvancedPianoTasksActivity.class);
        startActivity(intent);
    }

}