package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.drawcoco.clases.Creador;

public class Estadisticas extends AppCompatActivity {
    private TextView cabeceraEstadistica, datosDinero, datosNumeroUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas);

        Creador artista1 = (Creador) getIntent().getExtras().getSerializable("artista1");

        cabeceraEstadistica = this.findViewById(R.id.textoCabeceraEstadisticas);
        datosDinero = this.findViewById(R.id.datosDinero);
        datosNumeroUsuarios = this.findViewById(R.id.datosNumerosUsuario);

        cabeceraEstadistica.setText(getString(R.string.cabeceraEstadisticas) + " " + artista1.getNombre());
        datosDinero.setText(artista1.getDinero() + " €");
        datosNumeroUsuarios.setText(""+ artista1.getSuscriptores());
    }
}
