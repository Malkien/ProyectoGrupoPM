package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Coordinador extends AppCompatActivity implements ComunicacionMenu{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinador);
    }

    @Override
    public void Menu(int boton) {
        Intent intent=new Intent(this, Menu.class);
        intent.putExtra("botonPulsado", boton);
        startActivity(intent);
    }
}
