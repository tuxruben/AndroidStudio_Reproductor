package com.example.reproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
boolean tre=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnPlay= (Button) findViewById (R.id.btnPlay);
        Button btnStop= (Button) findViewById (R.id.btnStop);
    }
    public void btnPlayClick(View view){
// startService (new Intent(this, MiServicio.class));

        startService(new Intent(getBaseContext(),MiServicio.class));

    }
    public void btnStopClick(View view){
        stopService(new Intent(getBaseContext(), MiServicio.class));
//stopService (new Intent(this, MiServicio.class));
    }
}