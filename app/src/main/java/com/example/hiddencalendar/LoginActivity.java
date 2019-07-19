package com.example.hiddencalendar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username, password;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent incomingIntent = getIntent();

        login =(Button) findViewById(R.id.btnlogin);
        username = (EditText) findViewById(R.id.txtuname);
        password = (EditText) findViewById(R.id.txtpasswd);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        Intent newIntent = new Intent(LoginActivity.this, Note.class);

    }

    public void login() {
        String user = username.getText().toString().trim();
        String pass = password.getText().toString().trim();

        if(user.equals("Username") && pass.equals("Password")) {

            Toast.makeText(this, "Successfull", Toast.LENGTH_LONG).show();

            Intent newIntent = new Intent(LoginActivity.this, Note.class);
            startActivity(newIntent);

        } else {

            Toast.makeText(this, "Use Username as the username and Password as the password", Toast.LENGTH_LONG).show();

        }
    }

}
