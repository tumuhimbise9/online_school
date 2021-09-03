package com.example.onlineschoolregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class STUDENT_D extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_d);
    }
    public void register(View view){
        Intent i = new Intent(STUDENT_D.this,time_table.class);
        Toast.makeText(STUDENT_D.this, "", Toast.LENGTH_SHORT).show();
        startActivity(i);
        finish();
    }
}