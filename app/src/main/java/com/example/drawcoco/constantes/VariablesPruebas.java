package com.example.drawcoco.constantes;

import android.os.Build;

import com.example.drawcoco.R;
import com.example.drawcoco.clases.Cliente;
import com.example.drawcoco.clases.Creador;
import com.example.drawcoco.clases.Imagen;
import com.example.drawcoco.clases.Suscripcion;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static com.example.drawcoco.clases.Personas.Genero.HOMBRE;
import static com.example.drawcoco.clases.Personas.Genero.MUJER;

public class VariablesPruebas {
    public Imagen imagenPerfil, imagenCabecera;
    public ArrayList<Imagen> galeriaArtista1, galeriaArtista2;
    public Creador artista1, artista2;
    public Cliente cliente1;
    public ArrayList<Suscripcion>listaSuscripciones;

    public void VariablesPruebas(){
        //Creacion de dos imagenes usando el constructor pequeño de Imagen.
        imagenPerfil = new Imagen("\"android.resource://\" + getPackageName() + \"/\" + R.drawable.polloDorado");
        imagenCabecera = new Imagen("\"android.resource://\" + getPackageName() + \"/\" + R.drawable.pulpoi");


        //Creacion de un cliente, utilizando el constructor completo
        cliente1 = new Cliente("Pervert", "Jose", "Gallardo","perver@gmail.com",
                "Me gustan los dibujitos chinos","xxxxx", HOMBRE, 500, imagenPerfil, imagenCabecera, null);

        //Creacion de dos ArrayList de String para incluir unos cuantos tags en las imagenes
        ArrayList<String> arrayTags1 = new ArrayList<>();
        arrayTags1.add("Infantil");
        arrayTags1.add("Bonito");

        ArrayList<String> arrayTags2 = new ArrayList<>();
        arrayTags2.add("Sexy");
        arrayTags2.add("Hot");

        //Con este if podemos utilizar LocalDateTime.now() que no es soportado en la version 23
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            //Creacion de dos ArrayList de imagenes para utilizarlos en los artistas.
            galeriaArtista1 = new ArrayList<Imagen>();
            galeriaArtista1.add(new Imagen("Pollo Dorado", "Un pollo bonito", 50, LocalDateTime.now(), "android.resource://" + getClass().getPackage().getName() + "/" + R.drawable.pollodorado, arrayTags1, null, true, null));
            galeriaArtista1.add(new Imagen("Poring", "Esta blandito", 12, LocalDateTime.now(), "android.resource://" + getClass().getPackage().getName() + "/" + R.drawable.poi, arrayTags1, null, true, null));
            galeriaArtista1.add(new Imagen("Bunny", "Conejita Sexy", 100, LocalDateTime.now(), "android.resource://" + getClass().getPackage().getName() + "/" + R.drawable.bunny, arrayTags2, null, true, null));

            galeriaArtista2 = new ArrayList<Imagen>();
            galeriaArtista2.add(new Imagen("Pollo Blanco", "Un pollo gordito", 50, LocalDateTime.now(), "android.resource://" + getClass().getPackage().getName() + "/" + R.drawable.polloblanco, arrayTags1, null, true, null));
            galeriaArtista2.add(new Imagen("Tomberi", "Soy verde", 12, LocalDateTime.now(), "android.resource://" + getClass().getPackage().getName() + "/" + R.drawable.tomberi, arrayTags1, null, true, null));

            //ArrayList con los tipos de suscripciones para un usuario creador
            listaSuscripciones=new ArrayList<Suscripcion>();
            Suscripcion suscripcionBronce=new Suscripcion("Bronce", "Suscripcion de bronce", 5f, LocalDateTime.now(), LocalDateTime.now());
            Suscripcion suscripcionPlata=new Suscripcion("Plata", "Suscripcion de plata", 10f, LocalDateTime.now(), LocalDateTime.now());
            listaSuscripciones.add(suscripcionBronce);
            listaSuscripciones.add(suscripcionPlata);
            //Creacion de los artistas para uso de pruebas
            artista1 = new Creador("Mystra77", "Ana","Belen","mystra77@gmail.com", "Estoy cansada de dibujar Futanari",
                    "xxxx", MUJER,50, imagenPerfil, imagenCabecera, 23, galeriaArtista1,
                    listaSuscripciones, "Hola soy Mystra77 y me encanta dibujar desde hace muchos años...");

            artista2 = new Creador("Malito", "Ivan","Diaz","idvera77@gmail.com", "Que bien me lo paso en clase",
                    "xxxx", HOMBRE,120f,imagenPerfil, imagenCabecera, 10, galeriaArtista2,
                    null, "Hola soy un excelente programador y me encanta cargarme repositorios ^_^");

            //Serializacion de artistas y cliente
        }
    }
}
