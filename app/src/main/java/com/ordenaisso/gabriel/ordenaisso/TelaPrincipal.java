package com.ordenaisso.gabriel.ordenaisso;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        EditText edtTxt;


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
                    String numerosString = edtTxt.getText().toString();
                    String txt;

                    String[] numeros = numerosString.split(" ");
                    boolean teste = testaInteiro(numeros);
                    if (teste) {
                        List<Integer> list = new ArrayList<Integer>();
                        for (String numero : numeros) {
                            list.add(Integer.parseInt(numero));
                        }

                        int tamLista = 0;
                        tamLista = list.size();
                        txt = "Valores digitados: ";
                        for (int i = 0; i < tamLista; i++) {
                            txt += list.get(i).toString() + " ";

                        }

                    } else
                    {
                        txt = "Digite apenas números inteiros!";
                    }
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

    public boolean testaInteiro(String[] numeros)
    {
        boolean testeResultado = true;

        for (String num: numeros)
        {
            try
            {
                int valor = Integer.parseInt(num);
            } catch(NumberFormatException e)
            {
                testeResultado = false;
            }
        }

        return testeResultado;
    }
}
