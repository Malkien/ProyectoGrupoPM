package com.example.drawcoco;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontStyle;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebSettings.TextSize;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.drawcoco.clases.Personas;
import com.example.drawcoco.formularios.Login;
import com.example.drawcoco.formularios.Registro;

import java.util.Locale;

//En este Activity controlaremos el aspecto de nuestra aplicación, el tamaño de la fuente y su tipo,
//y el idioma utilizado eligiendolo entre el Inglés y el Español.

public class Ajustes extends AppCompatActivity {

    //Declaramos las variables de tipo Spinner
    Spinner fuenteAjustes ;
    Spinner idiomaAjustes ;
    Spinner tamanoFuenteAjustes;
    private Locale idioma;
    private Configuration config = new Configuration();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);

        fuenteAjustes= findViewById(R.id.eligeFuente);
        idiomaAjustes=findViewById(R.id.eligeIdioma);
        tamanoFuenteAjustes=findViewById(R.id.eligetamano);
        Locale spanish=new Locale("es","ES");
        Locale.setDefault(spanish);
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


        switch(spinnerIdioma){
            case "Español":
                idioma=Locale.getDefault();
                config.locale =idioma;
                break;
            case "Inglés":
                idioma=Locale.ENGLISH;
                config.locale =idioma;
                break;
            case "Frances":
                idioma=Locale.FRENCH;
                config.locale =idioma;
                break;
            case "Italiano":
                idioma=Locale.ITALY;
                config.locale =idioma;
        }
        getResources().updateConfiguration(config, null);
        Intent refresh = new Intent(this, Ajustes.class);
        startActivity(refresh);
        finish();

    }

    //Con esta función cambiaremos el tamaño de la fuente de los componentes de nuestra aplicación.
    public void elegirTamano(View view){
        String spinnerTamanoLetra=tamanoFuenteAjustes.getSelectedItem().toString();
        TextSize nuevoTamano=null;
        switch(spinnerTamanoLetra){
            case "6":
                nuevoTamano=TextSize.valueOf("6");
                break;
            case "8":
                nuevoTamano=TextSize.valueOf("8");
                break;
            case "10":
                nuevoTamano=TextSize.valueOf("10");
                break;
            case "12":
                nuevoTamano=TextSize.valueOf("12");
                break;
            case "14":
                nuevoTamano=TextSize.valueOf("14");
                break;
            case "16":
                nuevoTamano=TextSize.valueOf("16");
                break;
            case "18":
                nuevoTamano=TextSize.valueOf("18");
                break;
            case "20":
                nuevoTamano=TextSize.valueOf("20");
                break;
            case "22":
                nuevoTamano=TextSize.valueOf("22");
                break;
            case "24":
                nuevoTamano=TextSize.valueOf("24");
                break;
            case "26":
                nuevoTamano=TextSize.valueOf("26");
                break;
        }

    }


    public void aceptarAjustes(View view) {
        //elegirFuente(view);
        elegirIdioma(view);
        //elegirTamano(view);
        Intent intentInicio=new Intent(this, MainActivity.class);
        this.startActivity(intentInicio);
    }
}
