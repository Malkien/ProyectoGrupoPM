package com.example.drawcoco.perfiles;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.drawcoco.R;
import com.example.drawcoco.clases.Creador;
import com.example.drawcoco.clases.Cliente;

import java.util.ArrayList;

public class PerfilCliente extends AppCompatActivity {
    TextView nombreCliente, descripcionCliente, tituloDibujo, tituloDibujo2, tituloDibujoGratuito;
    Spinner spinnerArtista;
    ImageView dibujo1, dibujo2, dibujo1Gratuito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_cliente);

        nombreCliente = this.findViewById(R.id.nombreCliente);
        descripcionCliente = this.findViewById(R.id.descripcionCliente);
        tituloDibujo = this.findViewById(R.id.tituloDibujo);
        tituloDibujo2 = this.findViewById(R.id.titulodibujo2);
        tituloDibujoGratuito = this.findViewById(R.id.tituloDibujoGratuito);
        dibujo1 = this.findViewById(R.id.dibujo1);
        dibujo2 = this.findViewById(R.id.dibujo2);
        dibujo1Gratuito = this.findViewById(R.id.dibujo1Gratuito);

        spinnerArtista = this.findViewById(R.id.spinnerArtista);

        Creador artista1 = (Creador) getIntent().getExtras().getSerializable("artista1");
        Creador artista2 = (Creador) getIntent().getExtras().getSerializable("artista2");
        Cliente cliente1  = (Cliente) getIntent().getExtras().getSerializable("cliente1");

        nombreCliente.setText(cliente1.getNickname());
        descripcionCliente.setText(cliente1.getDescripcionCompleta());

        final ArrayList<Creador> arrayCreadores = new ArrayList<>();
        arrayCreadores.add(artista1);
        arrayCreadores.add(artista2);

        final ArrayList<String> arrayListNombres = new ArrayList<>();
        for (int i = 0; i < arrayCreadores.size(); i++){
            arrayListNombres.add(arrayCreadores.get(i).getNickname());
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayListNombres);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerArtista.setAdapter(arrayAdapter);

        spinnerArtista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String aux = parent.getItemAtPosition(position).toString();

                for (int i = 0; i < arrayListNombres.size(); i++){
                    if(arrayListNombres.get(i).equals(aux)){

                        String comparador = arrayListNombres.get(i).toString();

                        for (int j = 0; j < arrayCreadores.size(); j++){
                            if(arrayCreadores.get(j).getNickname().equals(comparador)){
                                tituloDibujo.setText(arrayCreadores.get(j).getImagenesArrayList().get(0).getNombre());
                                tituloDibujo2.setText(arrayCreadores.get(j).getImagenesArrayList().get(1).getNombre());
                                tituloDibujoGratuito.setText(arrayCreadores.get(j).getImagenesArrayList().get(2).getNombre());
                                dibujo1.setImageURI(Uri.parse(arrayCreadores.get(j).getImagenesArrayList().get(0).getRuta()));
                                dibujo2.setImageURI(Uri.parse(arrayCreadores.get(j).getImagenesArrayList().get(1).getRuta()));
                                dibujo1Gratuito.setImageURI(Uri.parse(arrayCreadores.get(j).getImagenesArrayList().get(2).getRuta()));
                            }
                        }
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });
    }

    public void botonImagen(View view) {
        Toast.makeText(this, "Hola Pollo", Toast.LENGTH_LONG).show();
    }
}
