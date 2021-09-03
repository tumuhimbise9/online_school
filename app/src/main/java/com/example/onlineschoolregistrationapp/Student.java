package com.example.onlineschoolregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
    }
    public void register(View view){
        Intent i = new Intent(Student.this,STUDENT_D.class);
        Toast.makeText(Student.this, "", Toast.LENGTH_SHORT).show();
        startActivity(i);
        finish();
    }
}