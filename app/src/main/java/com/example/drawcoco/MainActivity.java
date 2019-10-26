package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.drawcoco.clases.Creador;

import static com.example.drawcoco.clases.Personas.Genero.MUJER;

public class MainActivity extends AppCompatActivity {

    private Creador artista1;
    private Intent pantallaLogin, pantallaGaleria, pantallaCliente, pantallaEstadisticas,pantallaRegistro, pantallaAjustes,pantallaFiltrar;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = new Bundle();

        artista1 = new Creador("Mystra77", "Ana","Belen","mystra77@gmail.com","xxxx", MUJER,50f,23);
        bundle.putSerializable("artista1", artista1);
    }

    public void botonLogin(View view) {
        pantallaLogin = new Intent(this, Login.class);
        this.startActivity(pantallaLogin);
    }

    public void botonGaleria(View view) {
        pantallaGaleria = new Intent(this, Galeria.class);
        this.startActivity(pantallaGaleria);
    }

    public void botonCliente(View view) {
        pantallaCliente = new Intent(this, Cliente.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("artista1", artista1);
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
    }

    public void botonVisualizacion(View view) {
    }

    public void botonInicio(View view) {
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
    }

    public void botonModoDiseño(View view) {
    }

    public void botonCreador(View view) {
    }
}
