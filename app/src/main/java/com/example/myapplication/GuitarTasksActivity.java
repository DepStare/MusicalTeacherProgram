package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GuitarTasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitar_tasks);
    }

    public void backupButton13(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void guitarButton1(View v) {
        Intent intent = new Intent(this, FirstGuitarActivity.class);
        startActivity(intent);
    }

    public void guitarButton2(View v) {
        Intent intent = new Intent(this, SecondGuitarActivity.class);
        startActivity(intent);
    }

    public void guitarButton3(View v) {
        Intent intent = new Intent(this, ThirdGuitarActivity.class);
        startActivity(intent);
    }

}