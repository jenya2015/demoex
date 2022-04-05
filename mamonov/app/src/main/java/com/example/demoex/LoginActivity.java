package com.example.demoex;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private EditText email_login;
    private EditText password;
    private Button login;
    private TextView registration;

    private  FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email_login = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword);
        login = findViewById(R.id.button_login);
        registration = findViewById(R.id.button_reg);

        mAuth = FirebaseAuth.getInstance();

        registration.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, RegActivity.class);
            startActivity(intent);
        });

        login.setOnClickListener(v -> {
            if(email_login.getText().toString().isEmpty()||password.getText().toString().isEmpty()){
                Toast.makeText(LoginActivity.this, "Fields cannot be empty", Toast.LENGTH_LONG).show();
            }
            else {
                mAuth.signInWithEmailAndPassword(email_login.getText().toString(), password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(LoginActivity.this, "You have some errors", Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
    }

}