package com.example.sergio.ejercicio12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Ej13_5 extends AppCompatActivity implements View.OnClickListener {

    private ImageView rs_imagen;
    private Button rs_btnGoogle, rs_btnBing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ej13_5);

        rs_imagen = (ImageView) findViewById(R.id.imagen);
        rs_btnBing = (Button) findViewById(R.id.btn_bing);
        rs_btnGoogle = (Button) findViewById(R.id.btn_google);

        rs_btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rs_imagen.setBackgroundResource(R.drawable.google);
            }
        });

        rs_btnBing.setOnClickListener(this);
    }

    public void yahoo(View v){
        rs_imagen.setBackgroundResource(R.drawable.yahoo);
    }

    @Override
    public void onClick(View v) {
        rs_imagen.setBackgroundResource(R.drawable.bing);
    }
}
