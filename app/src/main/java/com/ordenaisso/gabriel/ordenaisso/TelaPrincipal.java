package com.ordenaisso.gabriel.ordenaisso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        final EditText edtTxt;

        edtTxt = findViewById(R.id.idEdtView);
        final int duracao = Toast.LENGTH_SHORT;
        Button botao_confirma = findViewById(R.id.idBotaoConfirma);
        botao_confirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edtTxt.getText().toString().matches("")) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Nenhum valor digitado", duracao);
                    toast.show();
                }else
                {
                    String txt = "Valor digitado: " + edtTxt.getText();
                    Toast toast = Toast.makeText(getApplicationContext(), txt, duracao);
                    toast.show();
                }
            }
        });
        Button botao_proximo = findViewById(R.id.idBotaoProximo);
        botao_proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtTxt.getText().toString().matches("")) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Nenhum valor digitado", duracao);
                    toast.show();
                }else
                {
                    String txt = edtTxt.getText().toString();
                    int valor = Integer.parseInt(txt);
                    abrirPagina_insercao(valor);
                }
            }
        });
        Button botao_algoritmo = findViewById(R.id.idBotaoAlgoritmo);
        botao_algoritmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPagina_algoritmo();
            }
        });
    }
    public void abrirPagina_insercao(int valor){
        Intent intent = new Intent(this, Pagina_insercao_numeros.class);
        intent.putExtra("qt_aceitar",valor);
        startActivity(intent);
    }

    public void abrirPagina_algoritmo()
    {
        Intent intentAlgoritmos = new Intent (this, AlgoritmosActivity.class);
        startActivity(intentAlgoritmos);
    }
}
