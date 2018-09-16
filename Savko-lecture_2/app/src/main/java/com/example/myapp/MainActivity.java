package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText nameEditText;
    private EditText surnameEditText;
    private EditText cityEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.name_main);
        surnameEditText = findViewById(R.id.surname_main);
        cityEditText = findViewById(R.id.city_main);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String name = nameEditText.getText().toString();
        String surname = surnameEditText.getText().toString();
        String city = cityEditText.getText().toString();
        intent.putExtra("name", name);
        intent.putExtra("surname", surname);
        intent.putExtra("city", city);
        startActivity(intent);
    }
}
