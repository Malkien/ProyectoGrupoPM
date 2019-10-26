package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.drawcoco.clases.Creador;

import java.util.ArrayList;

public class Cliente extends AppCompatActivity {
    TextView nombreCliente, descripcionCliente, tituloDibujo;
    Spinner spinnerArtista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        nombreCliente = this.findViewById(R.id.nombreCliente);
        descripcionCliente = this.findViewById(R.id.descripcionCliente);
        tituloDibujo = this.findViewById(R.id.tituloDibujo);
        spinnerArtista = this.findViewById(R.id.spinnerArtista);

        Creador artista1 = (Creador) getIntent().getExtras().getSerializable("artista1");

        ArrayList<String> arrayListArtistas = new ArrayList<>();
        arrayListArtistas.add(artista1.getNickname());
        arrayListArtistas.add("Andres");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayListArtistas);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        nombreCliente.setText(" " + artista1.getNombre());
        descripcionCliente.setText("No paro de dibujar tias con polla ^_^");
        tituloDibujo.setText("Pollo bonito");

        spinnerArtista.setAdapter(arrayAdapter);
    }
}
