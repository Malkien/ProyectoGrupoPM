package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.fonts.Font;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

//En este Activity controlaremos el aspecto de nuestra aplicación, el tamaño de la fuente y su tipo,
//y el idioma utilizado eligiendolo entre el Inglés y el Español.

public class Ajustes extends AppCompatActivity {

    //Declaramos las variables de tipo Spinner
    Spinner fuenteAjustes ;
    Spinner idiomaAjustes ;
    Spinner tamanoFuenteAjustes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);

        fuenteAjustes= findViewById(R.id.eligeFuente);
        idiomaAjustes=findViewById(R.id.eligeIdioma);
        tamanoFuenteAjustes=findViewById(R.id.eligetamano);

        //Aquí hemos cargado los spinner con los valores que les queremos ofrecer a nuestros usuarios,
        //utilizando los adaptadores.
        String[] letras = new String[] {"Courier", "SanSerif", "TimesNewRoman"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, letras);
        fuenteAjustes.setAdapter(adapter);

        String[] pais = new String[] {"Español", "Ingles"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, pais);
        idiomaAjustes.setAdapter(adapter2);

        String[] tamano = new String[] {"2","4","6","8","10","12","14","16","18","20","22","24","26","28","30","32","34"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, tamano);
        tamanoFuenteAjustes.setAdapter(adapter3);
    }


    public void aceptarAjustes(View view) {
        Intent intentDesplegable=new Intent(this, Desplegable.class);
        this.startActivity(intentDesplegable);
    }
}
