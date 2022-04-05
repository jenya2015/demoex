package com.example.demoex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TheMagiciancActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_magicianc);
    }

    public void row_back(View view) {
        Intent intent = new Intent(TheMagiciancActivity.this, MainActivity.class);
        startActivity(intent);
    }
}