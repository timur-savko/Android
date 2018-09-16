package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String surname = intent.getStringExtra("surname");
        String city = intent.getStringExtra("city");
        TextView nameTextView = findViewById(R.id.name_second);
        TextView surnameTextView = findViewById(R.id.surname_second);
        TextView cityTextView = findViewById(R.id.city_second);
        nameTextView.setText(name);
        surnameTextView.setText(surname);
        cityTextView.setText(city);
    }
}
