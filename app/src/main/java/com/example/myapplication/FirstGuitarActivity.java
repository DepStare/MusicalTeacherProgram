package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstGuitarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_guitar);
    }

    public void backupButton14(View v) {
        Intent intent = new Intent(this, GuitarTasksActivity.class);
        startActivity(intent);
    }
}