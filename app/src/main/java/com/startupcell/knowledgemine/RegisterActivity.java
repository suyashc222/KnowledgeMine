package com.startupcell.knowledgemine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Hiding Title Bar
        getSupportActionBar().hide();

        String[] branches = { "--Select Branch--","Computer Science", "Information Technology", "Electrical", "Electronics", "Civil" };

        Spinner spin = (Spinner) findViewById(R.id.branch_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, branches);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(adapter);

        String[] years = { "--Select Year--","First", "Second", "Third", "Fourth"};

        Spinner spin2 = (Spinner) findViewById(R.id.year_list);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, years);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin2.setAdapter(adapter2);
    }
}