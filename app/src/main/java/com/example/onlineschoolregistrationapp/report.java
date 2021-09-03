package com.example.onlineschoolregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class report extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
    }
    public void register(View view){
        Intent i = new Intent(report.this,STUDENT_D.class);
        Toast.makeText(report.this, "Thank you for visiting us", Toast.LENGTH_SHORT).show();
        startActivity(i);
        finish();
    }
}