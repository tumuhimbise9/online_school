package com.example.onlineschoolregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class parent_d extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_d);
    }
    public void register(View view){
        Intent i = new Intent(parent_d.this,STUDENT_D.class);
        Toast.makeText(parent_d.this, "", Toast.LENGTH_SHORT).show();
        startActivity(i);
        finish();
    }
}