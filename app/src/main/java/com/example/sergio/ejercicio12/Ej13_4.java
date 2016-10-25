package com.example.sergio.ejercicio12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ej13_4 extends AppCompatActivity {

    private EditText elm_numero, elm_letra;
    private final static char[] DNI = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',  'X',  'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ej13_4);

        elm_numero = (EditText) findViewById(R.id.numDni);
        elm_letra = (EditText) findViewById(R.id.letraDni);
    }

    public void validarDni(View v){
        int numero = Integer.parseInt(elm_numero.getText().toString());
        char letra = elm_letra.getText().toString().charAt(0);

        int resto = numero % 23;
        if (letra == DNI[resto]){
            Toast.makeText(getApplicationContext(),R.string.bien,Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(),R.string.mal,Toast.LENGTH_SHORT).show();
        }
    }

}
