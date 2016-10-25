package com.example.sergio.ejercicio12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ej13_2 extends AppCompatActivity {

    private TextView resultado;
    private EditText val1, val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ej13_2);

        val1 = (EditText) findViewById(R.id.primerValor);
        val2 = (EditText) findViewById(R.id.segundoValor);
        resultado = (TextView) findViewById(R.id.resultado);
    }
/*
//con varios métodos, el onclick llamaba a cada uno
    public void sumar(View v){
        double a, b, r;
        a = Double.parseDouble(val1.getText().toString());
        b = Double.parseDouble(val2.getText().toString());
        r = a + b;
        resultado.setText(this.getText(R.string.resultado) + " " + r);
    }

    public void restar(View v){
        double a, b, r;
        a = Double.parseDouble(val1.getText().toString());
        b = Double.parseDouble(val2.getText().toString());
        r = a - b;
        resultado.setText(this.getText(R.string.resultado) + " " + r);
    }

    public void multiplicar(View v){
        double a, b, r;
        a = Double.parseDouble(val1.getText().toString());
        b = Double.parseDouble(val2.getText().toString());
        r = a * b;
        resultado.setText(this.getText(R.string.resultado) + " " + r);
    }

    public void dividir(View v){
        double a, b, r;
        a = Double.parseDouble(val1.getText().toString());
        b = Double.parseDouble(val2.getText().toString());
        r = a / b;
        resultado.setText(this.getText(R.string.resultado) + " " + r);
    }
*/
    //un solo método
    public void operar(View v){
        double a, b, r = 0;
        int id = v.getId();
        a = Double.parseDouble(val1.getText().toString());
        b = Double.parseDouble(val2.getText().toString());

        switch (id){
            case R.id.sumar:
                r = a+b;
                break;
            case R.id.restar:
                r = a-b;
                break;
            case R.id.multiplicar:
                r = a*b;
                break;
            case R.id.dividir:
                r = a/b;
                break;
        }
        resultado.setText(this.getText(R.string.resultado) + " " + r);
    }
}
