package com.example.drawcoco;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontStyle;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebSettings.TextSize;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.drawcoco.clases.Personas;

import java.util.Locale;

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
        String[] letras = new String[] {"Sans", "Serif", "Monospace"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, letras);
        fuenteAjustes.setAdapter(adapter);

        String[] pais = new String[] {"Español","Inglés","Frances","Italiano"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, pais);
        idiomaAjustes.setAdapter(adapter2);

        String[] tamano = new String[] {"8","10","12","14","16","18","20","22"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, tamano);
        tamanoFuenteAjustes.setAdapter(adapter3);


    }

    //Con esta función cambiaremos de fuente todos los componentes de nuestra aplicación.
    public void elegirFuente(View vie){
        String spinnerTipoLetra=fuenteAjustes.getSelectedItem().toString();
        Typeface nuevaFuente=null;
        switch(spinnerTipoLetra){
            case "Sans":
                  nuevaFuente= Typeface.SANS_SERIF;
                break;
            case "Serif":
                   nuevaFuente=Typeface.SERIF;
                break;
            case "Monospace":
                   nuevaFuente=Typeface.MONOSPACE;
                break;

        }


    }

    //COn esta función cambiaremos el idioma de todos los componentes de nuestra aplicación
    public void elegirIdioma(View view){
        String spinnerIdioma=idiomaAjustes.getSelectedItem().toString();
        Locale idioma=null;

        switch(spinnerIdioma){
            case "Español":
                idioma=Locale.getDefault();
                break;
            case "Inglés":
                idioma=Locale.ENGLISH;
                break;
            case "Frances":
                idioma=Locale.FRENCH;
                break;
            case "Italiano":
                idioma=Locale.ITALY;
        }

    }

    //Con esta función cambiaremos el tamaño de la fuente de los componentes de nuestra aplicación.
    public void elegirTamaño(View view){
        String spinnerTamañoLetra=tamanoFuenteAjustes.getSelectedItem().toString();
        TextSize nuevoTamaño=null;
        switch(spinnerTamañoLetra){
            case "6":
                nuevoTamaño=TextSize.valueOf("6");
                break;
            case "8":
                nuevoTamaño=TextSize.valueOf("8");
                break;
            case "10":
                nuevoTamaño=TextSize.valueOf("10");
                break;
            case "12":
                nuevoTamaño=TextSize.valueOf("12");
                break;
            case "14":
                nuevoTamaño=TextSize.valueOf("14");
                break;
            case "16":
                nuevoTamaño=TextSize.valueOf("16");
                break;
            case "18":
                nuevoTamaño=TextSize.valueOf("18");
                break;
            case "20":
                nuevoTamaño=TextSize.valueOf("20");
                break;
            case "22":
                nuevoTamaño=TextSize.valueOf("22");
                break;
            case "24":
                nuevoTamaño=TextSize.valueOf("24");
                break;
            case "26":
                nuevoTamaño=TextSize.valueOf("26");
                break;
        }

    }

    public void aceptarAjustes(View view) {
        elegirFuente(view);
        elegirIdioma(view);
        elegirTamaño(view);
        Intent intent=new Intent(this, Desplegable.class);
        this.startActivity(intent);
    }
}
