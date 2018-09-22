package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText Name;
    private EditText Subname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = findViewById(R.id.name_main);
        Subname = findViewById(R.id.subname_main);

    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.recreate();
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, TransitionToSecond.class);
        String name = Name.getText().toString();
        String subname = Subname.getText().toString();
        intent.putExtra("name", name);
        intent.putExtra("subname", subname);
        startActivity(intent);
    }
}
