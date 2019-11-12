package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.example.drawcoco.clases.Suscripcion;
import com.example.drawcoco.formularios.Login;
import com.example.drawcoco.formularios.Registro;
import com.example.drawcoco.perfiles.PerfilCliente;
import com.example.drawcoco.clases.Creador;
import com.example.drawcoco.clases.Cliente;
import com.example.drawcoco.clases.Imagen;
import com.example.drawcoco.perfiles.PerfilCreador;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static com.example.drawcoco.clases.Personas.Genero.HOMBRE;
import static com.example.drawcoco.clases.Personas.Genero.MUJER;

public class MainActivity extends AppCompatActivity {
    //Inicializo unos cuantas variables que serviran para crear unos perfiles de cliente y creador de pruebas.
    private Imagen imagenPerfil, imagenCabecera;
    private ArrayList<Imagen> galeriaArtista1, galeriaArtista2;
    private Creador artista1, artista2;
    private Cliente cliente1;
    private ArrayList<Suscripcion>listaSuscripciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = new Bundle();

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
            galeriaArtista1.add(new Imagen("Pollo Dorado", "Un pollo bonito", 50, LocalDateTime.now(), "android.resource://" + getPackageName() + "/" + R.drawable.pollodorado, arrayTags1, null, true, null));
            galeriaArtista1.add(new Imagen("Poring", "Esta blandito", 12, LocalDateTime.now(), "android.resource://" + getPackageName() + "/" + R.drawable.poi, arrayTags1, null, true, null));
            galeriaArtista1.add(new Imagen("Bunny", "Conejita Sexy", 100, LocalDateTime.now(), "android.resource://" + getPackageName() + "/" + R.drawable.bunny, arrayTags2, null, true, null));

            galeriaArtista2 = new ArrayList<Imagen>();
            galeriaArtista2.add(new Imagen("Pollo Blanco", "Un pollo gordito", 50, LocalDateTime.now(), "android.resource://" + getPackageName() + "/" + R.drawable.polloblanco, arrayTags1, null, true, null));
            galeriaArtista2.add(new Imagen("Tomberi", "Soy verde", 12, LocalDateTime.now(), "android.resource://" + getPackageName() + "/" + R.drawable.tomberi, arrayTags1, null, true, null));

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
            bundle.putSerializable("artista1", artista1);
            bundle.putSerializable("artista2", artista2);
            bundle.putSerializable("cliente1", cliente1);
        }
    }

    //Botones para ir a cada Activity, todos tienen el nombre al cual se dirigen.
    public void botonLogin(View view) {
        Intent pantallaLogin = new Intent(this, Login.class);
        this.startActivity(pantallaLogin);
    }

    public void botonGaleria(View view) {
        Intent pantallaGaleria = new Intent(this, Galeria.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("artista1", artista1);
        bundle.putSerializable("artista2", artista2);
        bundle.putSerializable("cliente1", cliente1);
        pantallaGaleria .putExtras(bundle);
        this.startActivity(pantallaGaleria);
    }

    public void botonCliente(View view) {
        Intent pantallaCliente = new Intent(this, PerfilCliente.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("artista1", artista1);
        bundle.putSerializable("artista2", artista2);
        bundle.putSerializable("cliente1", cliente1);
        pantallaCliente.putExtras(bundle);
        this.startActivity(pantallaCliente);
    }

    public void botonEstadisticas(View view) {
        Intent pantallaEstadisticas= new Intent(this, Estadisticas.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("artista1", artista1);
        pantallaEstadisticas.putExtras(bundle);
        this.startActivity(pantallaEstadisticas);
    }

    public void botonCreacionPost(View view) {
        Intent pantallaCreacionPost = new Intent(this, CreacionPost.class);
        this.startActivity(pantallaCreacionPost);
    }

    public void botonVisualizacion(View view) {
        Intent pantallaVisualizacion = new Intent(this, VisualizarPost.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("cliente1", cliente1);
        pantallaVisualizacion.putExtras(bundle);
        this.startActivity(pantallaVisualizacion);

    }

    public void botonInicio(View view) {
        Intent pantallaInicio = new Intent(this, Inicio.class);
        this.startActivity(pantallaInicio);
    }

    public void botonFiltar(View view) {
        Intent pantallaFiltrar = new Intent(this, Filtrar.class);
        this.startActivity(pantallaFiltrar);
    }

    public void botonAjustes(View view) {
        Intent pantallaAjustes = new Intent(this, Ajustes.class);
        this.startActivity(pantallaAjustes);
    }

    public void botonRegistro(View view) {
        Intent pantallaRegistro = new Intent(this, Registro.class);
        this.startActivity(pantallaRegistro);
    }

    public void botonMenuDesplegable(View view) {
        Intent menuDesplegable=new Intent(this, Desplegable.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("artista1", artista1);
        menuDesplegable.putExtras(bundle);
        this.startActivity(menuDesplegable);
    }

    public void botonModoDiseño(View view) {
        Intent pantallaCreador = new Intent(this, PerfilCreador.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("artista1", artista1);
        pantallaCreador.putExtras(bundle);
        this.startActivity(pantallaCreador);
    }

    public void botonCreador(View view) {
        Intent pantallaCreador = new Intent(this, PerfilCreador.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("artista1", artista1);
        pantallaCreador.putExtras(bundle);
        this.startActivity(pantallaCreador);
    }
}
