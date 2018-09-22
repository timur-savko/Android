package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class TransitionToSecond extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String name = ": " + intent.getStringExtra("name");
        String subname = ": " + intent.getStringExtra("subname");
        TextView nameTextView = findViewById(R.id.name_second);
        TextView surnameTextView = findViewById(R.id.subname_second);
        nameTextView.append(name);
        surnameTextView.append(subname);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.recreate();
    }

}
