package com.example.onlineschoolregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class time_table extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);
    }
    public void register(View view){
        Intent i = new Intent(time_table.this,report.class);
        Toast.makeText(time_table.this, "", Toast.LENGTH_SHORT).show();
        startActivity(i);
        finish();
    }
}