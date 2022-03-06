package com.example.samplelayoutconstrain;

import static com.example.samplelayoutconstrain.R.id.editemail;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edEmail, edPassword;
    String nama, password;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignin);
        edEmail = findViewById(R.id.editemail);
        edPassword = findViewById(R.id.editpassword);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama = edEmail.getText().toString();
                password = edPassword.getText().toString();

                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: " + nama + " dan Password anda: " + password + "", Toast.LENGTH_LONG);
                t.show();
            }
        });

    }}