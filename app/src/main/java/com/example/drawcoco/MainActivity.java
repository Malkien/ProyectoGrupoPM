package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.drawcoco.formularios.Login;
import com.example.drawcoco.formularios.Registro;
import com.example.drawcoco.perfiles.PerfilCliente;
import com.example.drawcoco.clases.Creador;
import com.example.drawcoco.clases.Cliente;
import com.example.drawcoco.clases.Imagenes;
import com.example.drawcoco.perfiles.PerfilCreador;

import java.util.ArrayList;

import static com.example.drawcoco.clases.Personas.Genero.HOMBRE;
import static com.example.drawcoco.clases.Personas.Genero.MUJER;

public class MainActivity extends AppCompatActivity {

    private Creador artista1, artista2;
    private Cliente cliente1;
    private ArrayList<Imagenes> galeria1, galeria2;
    private Imagenes imagen1, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, imagen8;

    private Intent pantallaLogin, pantallaVisualizacion, pantallaGaleria, pantallaCliente, pantallaEstadisticas,pantallaRegistro, pantallaAjustes,pantallaFiltrar, pantallaCreador, menuDesplegable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = new Bundle();

        cliente1 = new Cliente("Furro","Jose","Feliz","jaja@gmail.com","Me encanta el furry","xxxx",HOMBRE,200);

        ArrayList<Imagenes> galeria1= new ArrayList<Imagenes>();
        galeria1.add(imagen1 = new Imagenes("Pollo Dorado", "Un pollo doradito", 20, "Infantil", "android.resource://" + getPackageName() + "/" + R.drawable.pollodorado));
        galeria1.add(imagen2 = new Imagenes("Poring", "QUE BLANDITOOO", 10,"Infatil", "android.resource://" + getPackageName() + "/" + R.drawable.poi));
        galeria1.add(imagen5 = new Imagenes("Pulpoi", "Violento",0, "Infantil", "android.resource://" + getPackageName() + "/" + R.drawable.pulpoi));
        galeria1.add(imagen7 = new Imagenes("Tomberi", "Soy un tomberi especial", 50, "Infantil", "android.resource://" + getPackageName() + "/" + R.drawable.tomberi));
        galeria1.add(imagen8 = new Imagenes("Bunny","FFXIV Bunny",0, "Hot", "android.resource://" + getPackageName() + "/" + R.drawable.bunny));

        artista1 = new Creador("Mystra77", "Ana","Belen","mystra77@gmail.com", "Estoy cansada de dibujar Futanari",
                "xxxx", MUJER,50f,23, galeria1);

        ArrayList<Imagenes> galeria2= new ArrayList<Imagenes>();
        galeria2.add(imagen1 = new Imagenes("Pollo Blanco", "Es blanco", 5, "Infantil", "android.resource://" + getPackageName() + "/" + R.drawable.polloblanco));
        galeria2.add(imagen2 = new Imagenes("Tomberi", "Soy un tomberi especial", 50, "Infantil", "android.resource://" + getPackageName() + "/" + R.drawable.tomberi));
        galeria2.add(imagen6 = new Imagenes("Bunny","FFXIV Bunny",0, "Hot", "android.resource://" + getPackageName() + "/" + R.drawable.bunny));

        artista2 = new Creador("Malito", "Ivan","Diaz","idvera77@gmail.com", "Que bien me lo paso en clase",
                "xxxx", HOMBRE,120f,50, galeria2);

        bundle.putSerializable("artista1", artista1);
        bundle.putSerializable("artista2", artista2);
        bundle.putSerializable("cliente1", cliente1);

    }

    public void botonLogin(View view) {
        pantallaLogin = new Intent(this, Login.class);
        this.startActivity(pantallaLogin);
    }

    public void botonGaleria(View view) {
        pantallaGaleria = new Intent(this, Galeria.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("artista1", artista1);
        bundle.putSerializable("artista2", artista2);
        bundle.putSerializable("cliente1", cliente1);
        pantallaGaleria .putExtras(bundle);
        this.startActivity(pantallaGaleria);
    }

    public void botonCliente(View view) {
        pantallaCliente = new Intent(this, PerfilCliente.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("artista1", artista1);
        bundle.putSerializable("artista2", artista2);
        bundle.putSerializable("cliente1", cliente1);
        pantallaCliente.putExtras(bundle);
        this.startActivity(pantallaCliente);
    }

    public void botonEstadisticas(View view) {
        pantallaEstadisticas= new Intent(this, Estadisticas.class);
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
        pantallaVisualizacion = new Intent(this, VisualizarPost.class);
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
        pantallaFiltrar = new Intent(this, Filtrar.class);
        this.startActivity(pantallaFiltrar);
    }

    public void botonAjustes(View view) {
        pantallaAjustes = new Intent(this, Ajustes.class);
        this.startActivity(pantallaAjustes);
    }

    public void botonRegistro(View view) {
        pantallaRegistro = new Intent(this, Registro.class);
        this.startActivity(pantallaRegistro);
    }

    public void botonMenuDesplegable(View view) {
        menuDesplegable=new Intent(this, Desplegable.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("artista1", artista1);
        menuDesplegable.putExtras(bundle);
        this.startActivity(menuDesplegable);
    }

    public void botonModoDiseño(View view) {
        pantallaCreador = new Intent(this, PerfilCreador.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("artista1", artista1);
        pantallaCreador.putExtras(bundle);
        this.startActivity(pantallaCreador);
    }

    public void botonCreador(View view) {
        pantallaCreador = new Intent(this, PerfilCreador.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("artista1", artista1);
        pantallaCreador.putExtras(bundle);
        this.startActivity(pantallaCreador);
    }
}
