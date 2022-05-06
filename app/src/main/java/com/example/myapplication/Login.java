package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import webserviceRetrofit.RetrofitMain;
import webserviceVolley.JsonArrayParsingVolley;

public class Login extends AppCompatActivity  {

    EditText password, username;
    Button cancel;
    String un = "Admin";
    String pw = "abc123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.pswd);
        cancel =(Button)findViewById(R.id.Cancel);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


        public void click_on_login (View view){

            String uname = username.getText().toString();
            String paswd = password.getText().toString();

        if (uname.equals(un) && paswd.equals(pw)) {
            Intent i = new Intent(getApplicationContext(), HomePage.class);
            startActivity(i);

        } else {
            Toast.makeText(getApplicationContext(), "email or password incorrect", Toast.LENGTH_LONG).show();
        }
    }


    public void click_for_registration(View view) {
        Intent i = new Intent(getApplicationContext(), RetrofitMain.class);
        startActivity(i);
    }
}

