package com.example.demoex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CollectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);
    }

    public void most(View view) {
        Intent intent = new Intent(CollectionActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void podborka(View view) {
        Intent intent = new Intent(CollectionActivity.this, PodborkaActivity.class);
        startActivity(intent);
    }

    public void collection(View view) {
        Intent intent = new Intent(CollectionActivity.this, CollectionActivity.class);
        startActivity(intent);
    }

    public void profile(View view) {
        Intent intent = new Intent(CollectionActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}