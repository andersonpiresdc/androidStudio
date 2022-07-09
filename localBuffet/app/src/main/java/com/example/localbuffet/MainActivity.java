package com.example.localbuffet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {

    double vtaca, vprato, vmesas, vcadeiras, vTotal;
    EditText edTacas, edPratos, edMesas, edCadeiras;
    CheckBox cbTacas, cbPratos, cbMesas, cbCadeiras;
    TextView tvResultado;
    Button btCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTacas = findViewById(R.id.edTacas);
        edPratos = findViewById(R.id.edPratos);
        edMesas = findViewById(R.id.edMesas);
        edCadeiras = findViewById(R.id.edCadeiras);

        cbTacas = findViewById(R.id.cbTacas);
        cbPratos = findViewById(R.id.cbPratos);
        cbMesas = findViewById(R.id.cbMesas);
        cbCadeiras = findViewById(R.id.cbCadeiras);

        tvResultado = findViewById(R.id.tvResultado);

        btCalcular = findViewById(R.id.btCalcular);

        vtaca     = 0.25;
        vprato    = 0.20;
        vmesas    = 15.00;
        vcadeiras = 5.00;
        vTotal    = 0;

        cbTacas.setText(cbTacas.getText().toString() + " " + vtaca);
        cbPratos.setText(cbPratos.getText().toString() + " " +  vprato);
        cbMesas.setText(cbMesas.getText().toString() + " " +  vmesas);
        cbCadeiras.setText(cbCadeiras.getText().toString() + " " +  vcadeiras);
    }

    public void Calcular(View v){
        vTotal = 0.0;
        if(cbTacas.isChecked()){
            vTotal += vtaca * Double.parseDouble(edTacas.getText().toString());
        }
        if(cbPratos.isChecked()){
            vTotal += vprato * Double.parseDouble(edPratos.getText().toString());
        }
        if(cbMesas.isChecked()){
            vTotal += vmesas * Double.parseDouble(edMesas.getText().toString());
        }
        if(cbCadeiras.isChecked()){
            vTotal += vcadeiras * Double.parseDouble(edCadeiras.getText().toString());
        }
        tvResultado.setText("Valor total: R$ "+vTotal);

//        Toast.makeText(this, "Calculo efetuado!", Toast.LENGTH_SHORT).show();

        AlertDialog.Builder cxMsg = new AlertDialog.Builder(this);
        cxMsg.setMessage("Valor da locação calculado.");
        cxMsg.setNegativeButton("Ok", null);
        cxMsg.show();
    }

    public void abrirTelaSobre(View v){
        Intent it_telaSobre = new Intent(this, tela_sobre.class);
        it_telaSobre.putExtra("p_nome", "Anderson");
        it_telaSobre.putExtra("p_vTotal", vTotal);
        startActivity(it_telaSobre);
    }


}