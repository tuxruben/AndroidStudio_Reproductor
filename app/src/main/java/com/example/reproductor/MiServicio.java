package com.example.reproductor;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MiServicio extends Service {

    protected MediaPlayer player;
    boolean tre =false;
    public MiServicio() {

    }
    @Override
    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create (this, R.raw.cancion1);
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if(tre){
            tre = false;
            player.pause();

            Toast.makeText(this, "Servicio pausado...!", Toast.LENGTH_LONG).show();
            return super.onStartCommand(intent, flags, startId);
        }else {


           tre = true;
            player.start();
            Toast.makeText (this, "Servicio iniciado...!",Toast.LENGTH_LONG).show ();
            return super.onStartCommand(intent, flags, startId);
        }

    }



    @Override
    public IBinder onBind(Intent intent) {
// TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onDestroy() {
// TODO Auto-generated method stub
        player.stop();
        super.onDestroy();
        Toast.makeText(this, "Servicio terminado...!", Toast.LENGTH_LONG).show();
    }
}