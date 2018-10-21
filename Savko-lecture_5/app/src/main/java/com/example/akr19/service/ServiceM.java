package com.example.akr19.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.provider.Settings;
import android.widget.Toast;

public class ServiceM extends Service {
    @Override
    public void onCreate(){
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(ServiceM.this,"Сервис работает",Toast.LENGTH_LONG).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(ServiceM.this,"Сервис приостановлен",Toast.LENGTH_LONG).show();
    }

    @Override
    public IBinder onBind(Intent intent){
        return null;
    }
}
