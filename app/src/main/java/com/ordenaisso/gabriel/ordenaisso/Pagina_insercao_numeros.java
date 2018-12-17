package com.ordenaisso.gabriel.ordenaisso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Pagina_insercao_numeros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_insercao_numeros);
        Intent intent = getIntent();
        int tempo = Toast.LENGTH_SHORT;
        int qt = intent.getIntExtra("qt_aceitar",0);
        Toast toast = Toast.makeText(getApplicationContext(),"Recebi: "+ qt, tempo);
        toast.show();
    }
}
