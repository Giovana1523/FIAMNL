package com.example.listatarefas;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListaTarefasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefas);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Criando um intent explícito
                // Recupera-se o contexto da view
                // Chama-se explicitamente a classe da activity que deseja abrir
                Intent intent = new Intent(v.getContext(), NovaTarefaActivity.class);

                // Inicia-se a activity
                startActivity(intent);
            }
        });

    }

}
