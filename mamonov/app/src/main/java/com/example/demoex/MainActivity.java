package com.example.demoex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void most(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void podborka(View view) {
        Intent intent = new Intent(MainActivity.this, PodborkaActivity.class);
        startActivity(intent);
    }

    public void collection(View view) {
        Intent intent = new Intent(MainActivity.this, CollectionActivity.class);
        startActivity(intent);
    }

    public void profile(View view) {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    public void view(View view) {
        Intent intent = new Intent(MainActivity.this, TheMagiciancActivity.class);
        startActivity(intent);
    }
}