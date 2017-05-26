package com.droidclass.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final TextView username = (TextView) findViewById(R.id.username);
        final TextView password = (TextView) findViewById(R.id.password);
        Button loginButton = (Button) findViewById(R.id.button_Login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredusername = username.getText().toString();
                String enteredPassword = password.getText().toString();

                if (enteredusername.equals("")){
                    username.setError("username is required");
                }else if(enteredPassword.equals("")){
                    password.setError("Password is required!");
                }else{
                    startActivity(new Intent(Login.this, Profile.class));
                }
            }
        });

    }
}