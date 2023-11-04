package com.example.appy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final TextView txtView = findViewById(R.id.textview);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new addUser();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView.setText(user1.getUsername());
    }
}