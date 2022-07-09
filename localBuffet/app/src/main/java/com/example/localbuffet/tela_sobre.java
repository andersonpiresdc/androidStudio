package com.example.localbuffet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class tela_sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sobre);

        Intent it=getIntent();
        String nome = it.getStringExtra("p_nome");
        double valor= it.getDoubleExtra("p_vTotal", 0);
        TextView tv=findViewById(R.id.tvTituloJanela);
        tv.setText(nome +" | "+valor);
    }

    public void voltarTelaPrincipal(View v){
        this.finish();
//        Intent it_telaPrincipal= new Intent(this, MainActivity.class);
//        startActivity(it_telaPrincipal);
    }

}