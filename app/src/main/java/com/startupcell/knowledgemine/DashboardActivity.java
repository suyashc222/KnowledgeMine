package com.startupcell.knowledgemine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class DashboardActivity extends AppCompatActivity {

    RelativeLayout resources;
    RelativeLayout request_resource;
    RelativeLayout raise_doubt;
    RelativeLayout the_photon;
    RelativeLayout countribute_us;
    RelativeLayout miners_den;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Hiding Title Bar
        getSupportActionBar().hide();

        resources=findViewById(R.id.resources);
        request_resource=findViewById(R.id.request_resource);
        raise_doubt=findViewById(R.id.raise_doubt);
        the_photon=findViewById(R.id.the_photon);
        countribute_us=findViewById(R.id.countribute_us);
        miners_den=findViewById(R.id.miners_den);

        resources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        request_resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        raise_doubt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        the_photon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        countribute_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,CountributeUsActivity.class);
                startActivity(intent);
            }
        });

        miners_den.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}