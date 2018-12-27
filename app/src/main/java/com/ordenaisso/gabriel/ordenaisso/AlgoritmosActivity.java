package com.ordenaisso.gabriel.ordenaisso;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;

import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import static android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;

public class AlgoritmosActivity extends Activity {
    int cont = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(SCREEN_ORIENTATION_LANDSCAPE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        /* getSupportActionBar().hide(); */
        setContentView(R.layout.activity_algoritmos);

        TextView txtNumIt = findViewById(R.id.idItNum);

        txtNumIt.setText(Integer.toString(cont));

    }
}
