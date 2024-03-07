package com.example.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Page extends AppCompatActivity {
    EditText emailText, passwordTest;
    String rEmail, rPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        emailText = findViewById(R.id.login_username);
        passwordTest = findViewById(R.id.login_password);
        rEmail = getIntent().getStringExtra("email");
        rPassword = getIntent().getStringExtra("password");
    }
    public void login(){
        String email = emailText.getText().toString() ;
        String password = passwordTest.getText().toString() ;
        if (rEmail.equals(email) && rPassword.equals(password)){
            Intent intent = new Intent(this, Login_success.class);
        }
        else {
            Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_LONG).show();
        }
    }
}