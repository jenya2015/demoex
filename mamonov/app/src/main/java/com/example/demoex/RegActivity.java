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
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegActivity extends AppCompatActivity {

    private EditText email_register;
    private EditText password_register;
    private Button register;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        mAuth = FirebaseAuth.getInstance();

        email_register = findViewById(R.id.editTextTextEmailAddress2);
        password_register = findViewById(R.id.editTextTextPassword2);
        register = findViewById(R.id.button_reg);

        register.setOnClickListener(v -> {
            if(email_register.getText().toString().isEmpty() || password_register.getText().toString().isEmpty()){
                Toast.makeText(RegActivity.this, "Fields cannot be empty", Toast.LENGTH_LONG).show();
            }else{
                mAuth.createUserWithEmailAndPassword(email_register.getText().toString(),
                        password_register.getText().toString()).addOnCompleteListener(task -> {
                            if (task.isSuccessful()){
                                Intent intent =  new Intent(RegActivity.this, LoginActivity.class);
                                startActivity(intent);
                            }
                            else {
                                Toast.makeText(RegActivity.this, "Yoy have some errors", Toast.LENGTH_LONG).show();
                            }
                        });
            }
        });
    }


}