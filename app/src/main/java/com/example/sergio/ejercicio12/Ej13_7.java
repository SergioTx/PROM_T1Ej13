package com.example.sergio.ejercicio12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Ej13_7 extends AppCompatActivity {

    private Switch swCamara1, swLuz1;
    private ToggleButton btnCamara2, btnLuz2;
    ImageView ivCamara1, ivCamara2, ivLuz1, ivLuz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ej13_7);

        swCamara1 = (Switch) findViewById(R.id.swCamara1);
        swLuz1 = (Switch) findViewById(R.id.swLuz1);
        btnCamara2 = (ToggleButton) findViewById(R.id.togCamara2);
        btnLuz2 = (ToggleButton) findViewById(R.id.togLuz2);

        ivCamara1 = (ImageView) findViewById(R.id.imgCamara1);
        ivCamara2 = (ImageView) findViewById(R.id.imgCamara2);
        ivLuz1 = (ImageView) findViewById(R.id.imgLuz1);
        ivLuz2 = (ImageView) findViewById(R.id.imgLuz2);

        //no permite hacer llamada al oncheckedchange en el XML
        swCamara1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mostrarOcultar(buttonView,isChecked);
            }
        });
        btnCamara2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mostrarOcultar(buttonView,isChecked);
            }
        });
        btnLuz2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                cambiarImgLuz(buttonView,isChecked);
            }
        });
        swLuz1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                cambiarImgLuz(buttonView,isChecked);
            }
        });
    }

    public void mostrarOcultar(CompoundButton v, boolean checked){

        ImageView iv = null;
        if(v.getId() == swCamara1.getId()){
            iv = ivCamara1;
        } else {
            iv = ivCamara2;
        }

        iv.setVisibility(checked?View.VISIBLE:View.INVISIBLE);
    }

    public void cambiarImgLuz(CompoundButton v, boolean checked){

        ImageView iv = null;
        if(v.getId() == swLuz1.getId()){
            iv = ivLuz1;
        } else {
            iv = ivLuz2;
        }

        iv.setImageResource(checked?R.drawable.encendida:R.drawable.apagada);
    }
}
