package com.startupcell.knowledgemine;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText input_username;
    EditText input_password;
    Button loginbtn;
    TextView registerbtn;


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hiding Title Bar
        getSupportActionBar().hide();


        input_username=findViewById(R.id.input_username);
        input_password=findViewById(R.id.input_password);
        loginbtn=findViewById(R.id.btn_login);
        registerbtn=findViewById(R.id.register);

        loginbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DashboardActivity.class);
                startActivity(intent);
            }

        });

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });


    }

}