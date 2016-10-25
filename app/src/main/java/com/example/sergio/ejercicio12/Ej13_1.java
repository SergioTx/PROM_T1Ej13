package com.example.sergio.ejercicio12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Ej13_1 extends AppCompatActivity {

    TextView resultado;
    EditText val1, val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ej13_1);

        val1 = (EditText) findViewById(R.id.primerValor);
        val2 = (EditText) findViewById(R.id.segundoValor);
        resultado = (TextView) findViewById(R.id.resultado);
    }

    public void sumar(View v){
        double a, b, r;
        a = Double.parseDouble(val1.getText().toString());
        b = Double.parseDouble(val2.getText().toString());
        r = a + b;
        resultado.setText(this.getText(R.string.suma) + " " + r);
    }
}
