package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botonLogin(View view) {
        Intent pantallaLogin = new Intent(this, Login.class);
        this.startActivity(pantallaLogin);
    }

    public void botonGaleria(View view) {
        Intent pantallaGaleria = new Intent(this, Galeria.class);
        this.startActivity(pantallaGaleria);
    }

    public void botonCliente(View view) {
        Intent pantallaCliente = new Intent(this, Cliente.class);
        this.startActivity(pantallaCliente);
    }

    public void botonEstadisticas(View view) {
        Intent pantallaEstadisticas= new Intent(this, Estadisticas.class);
        this.startActivity(pantallaEstadisticas);
    }

    public void botonCreacionPost(View view) {
    }

    public void botonVisualizacion(View view) {
    }

    public void botonInicio(View view) {
    }

    public void botonFiltar(View view) {
    }

    public void botonAjustes(View view) {
    }

    public void botonRegistro(View view) {
    }

    public void botonMenuDesplegable(View view) {
    }

    public void botonModoDiseño(View view) {
    }

    public void botonCreador(View view) {
    }
}
