package com.example.javaquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.javaquizapp.basicsandhistorypackage.basicsandhistory;
import com.example.javaquizapp.controlstatementspackage.controlstatements;

public class Categories extends AppCompatActivity {

    private Button mBasics;
    private Button mControlStatements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        mBasics = findViewById(R.id.button_basics_and_history);
        mControlStatements = findViewById(R.id.button_control_statements);

        // onClickListener of Basics and History Category
        mBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Categories.this, basicsandhistory.class);
                startActivity(intent);
            }
        });
        // onClickListener of Control Statements Category
        mControlStatements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Categories.this, controlstatements.class);
                startActivity(intent);
            }
        });
    }
}
