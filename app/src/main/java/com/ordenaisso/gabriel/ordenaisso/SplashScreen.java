package com.ordenaisso.gabriel.ordenaisso;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.os.SystemClock.sleep;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        final Intent intent = new Intent(this, TelaPrincipal.class);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(intent);

            }
        }, 2000);

    }
}
