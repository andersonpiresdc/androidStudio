package com.example.saudedc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double vlr1, vlr2, res;

    EditText etPriValor;
    EditText etSegValor;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_somar = findViewById(R.id.bt_somar);
        Button bt_subtrair = findViewById(R.id.bt_subtrair);
        Button bt_multiplicar = findViewById(R.id.bt_multiplicar);
        Button bt_dividir = findViewById(R.id.bt_dividir);

        etPriValor = findViewById(R.id.et_priValor);
        etSegValor = findViewById(R.id.et_segValor);
        tvResultado = findViewById(R.id.tv_resultado);

       /* bt_somar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vlr1 = Double.parseDouble(etPriValor.getText().toString());
                vlr2 = Double.parseDouble(etSegValor.getText().toString());
                res = vlr1 + vlr2;
                tvResultado.setText(String.valueOf(res));
            }
        });

        bt_subtrair.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vlr1 = Double.parseDouble(etPriValor.getText().toString());
                vlr2 = Double.parseDouble(etSegValor.getText().toString());
                res = vlr1 - vlr2;
                tvResultado.setText(String.valueOf(res));
            }
        });

        bt_multiplicar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vlr1 = Double.parseDouble(etPriValor.getText().toString());
                vlr2 = Double.parseDouble(etSegValor.getText().toString());
                res = vlr1 * vlr2;
                tvResultado.setText(String.valueOf(res));
            }
        });

        bt_dividir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vlr1 = Double.parseDouble(etPriValor.getText().toString());
                vlr2 = Double.parseDouble(etSegValor.getText().toString());
                res = vlr1 / vlr2;
                tvResultado.setText(String.valueOf(res));
            }
        });*/
    }

    public void somar(){
       vlr1 = Double.parseDouble(etPriValor.getText().toString());
       vlr2 = Double.parseDouble(etSegValor.getText().toString());
       res = vlr1 + vlr2;
       tvResultado.setText(String.valueOf(res));
    }

    public void subtrair(){
        vlr1 = Double.parseDouble(etPriValor.getText().toString());
        vlr2 = Double.parseDouble(etSegValor.getText().toString());
        res = vlr1 - vlr2;
        tvResultado.setText(String.valueOf(res));
    }

    public void multiplicar(){
        vlr1 = Double.parseDouble(etPriValor.getText().toString());
        vlr2 = Double.parseDouble(etSegValor.getText().toString());
        res = vlr1 * vlr2;
        tvResultado.setText(String.valueOf(res));
    }

    public void dividir(){
        vlr1 = Double.parseDouble(etPriValor.getText().toString());
        vlr2 = Double.parseDouble(etSegValor.getText().toString());
        res = vlr1 / vlr2;
        tvResultado.setText(String.valueOf(res));
    }

    public void operar(View v){
        switch (v.getId()){
            case R.id.bt_somar: somar(); break;
            case R.id.bt_subtrair: subtrair(); break;
            case R.id.bt_multiplicar: multiplicar(); break;
            case R.id.bt_dividir: dividir(); break;
        }
    }
}