package com.example.sergio.ejercicio12;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Ej13_6 extends AppCompatActivity {

    private Switch swCamara1, swLuz1;
    private ToggleButton btnCamara2, btnLuz2;
    ImageView ivCamara1, ivCamara2, ivLuz1, ivLuz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ej13_6);

        swCamara1 = (Switch) findViewById(R.id.swCamara1);
        swLuz1 = (Switch) findViewById(R.id.swLuz1);
        btnCamara2 = (ToggleButton) findViewById(R.id.togCamara2);
        btnLuz2 = (ToggleButton) findViewById(R.id.togLuz2);

        ivCamara1 = (ImageView) findViewById(R.id.imgCamara1);
        ivCamara2 = (ImageView) findViewById(R.id.imgCamara2);
        ivLuz1 = (ImageView) findViewById(R.id.imgLuz1);
        ivLuz2 = (ImageView) findViewById(R.id.imgLuz2);

        swCamara1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                camara(buttonView,isChecked);
            }
        });
        btnCamara2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                camara(buttonView,isChecked);
            }
        });
        btnLuz2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                luz(buttonView,isChecked);
            }
        });
        swLuz1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                luz(buttonView,isChecked);
            }
        });
    }

    public void camara(CompoundButton v, boolean checked){

        ImageView iv = null;
        if(v.getId() == swCamara1.getId()){
            iv = ivCamara1;
        } else {
            iv = ivCamara2;
        }

        iv.setVisibility(checked?View.VISIBLE:View.INVISIBLE);
    }

    public void luz(CompoundButton v, boolean checked){

        ImageView iv = null;
        if(v.getId() == swLuz1.getId()){
            iv = ivLuz1;
        } else {
            iv = ivLuz2;
        }

        iv.setImageResource(checked?R.drawable.encendida:R.drawable.apagada);

    }

}
