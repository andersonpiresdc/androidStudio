package com.example.apaagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText et_Nome, et_Telefone;
    Button btnGravar, btnConsultar, btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Nome = findViewById(R.id.edtNomePrincipal);
        et_Telefone = findViewById(R.id.edtTelefonePrincipal);

        btnGravar = findViewById(R.id.btnGravar);
        btnConsultar = findViewById(R.id.btnConsultar);
        btnFechar = findViewById(R.id.btnFechar);
    }
}