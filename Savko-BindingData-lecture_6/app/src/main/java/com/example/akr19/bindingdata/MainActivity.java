package com.example.akr19.bindingdata;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.akr19.bindingdata.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding dataBinding;
    boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        dataBinding.setTitle1("Good Game");
        dataBinding.setTitle2("Well Played!");

     dataBinding.btnChange.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             if (flag == true) {
                 dataBinding.tTitle1.setText("GG!");
                 dataBinding.tTitle2.setText("WP!");
                 flag = false;
                 return;
             }

             dataBinding.tTitle1.setText("Good Game");
             dataBinding.tTitle2.setText("Well Played");

             flag = true;
         }
     });

    }
}
