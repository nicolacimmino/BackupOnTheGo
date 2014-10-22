package com.cimmino.nicola.backuponthego;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class UsbOtgIntentService extends Service {

    public UsbOtgIntentService()
    {
        super();
    }

    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }

}