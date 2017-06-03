package com.droidclass.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText username = (EditText) findViewById(R.id.username);
        final EditText password = (EditText) findViewById(R.id.password);
        Button loginButton = (Button) findViewById(R.id.button_Login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputusername = username.getText().toString();
                String inputPassword = password.getText().toString();

                if (inputusername.equals("")){
                    username.setError("username is required");
                }else if(inputPassword.equals("")){
                    password.setError("Password is required!");
                }else{
                    startActivity(new Intent(Login.this, Profile.class));
                }
            }
        });

    }
}