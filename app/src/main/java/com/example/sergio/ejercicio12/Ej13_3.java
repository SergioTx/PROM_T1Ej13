package com.example.sergio.ejercicio12;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Ej13_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ej13_3);
    }

    public void amarillo(View v){
        LinearLayout l = (LinearLayout) findViewById(R.id.fondoPantalla);
        l.setBackgroundColor(Color.YELLOW);
    }

    public void gris(View v){
        LinearLayout l = (LinearLayout) findViewById(R.id.fondoPantalla);
        l.setBackgroundColor(Color.GRAY);
    }

}
