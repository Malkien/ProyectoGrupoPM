package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.app.FragmentManager;
import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;

import com.example.drawcoco.adapters.AdapterPaginas;
import com.example.drawcoco.clases.Cliente;
import com.example.drawcoco.clases.Creador;
import com.example.drawcoco.clases.Imagen;
import com.example.drawcoco.clases.Suscripcion;
import com.example.drawcoco.perfiles.PerfilCliente;
import com.example.drawcoco.perfiles.PerfilCreador;
import com.google.android.material.tabs.TabLayout;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static com.example.drawcoco.clases.Personas.Genero.HOMBRE;
import static com.example.drawcoco.clases.Personas.Genero.MUJER;

public class Coordinador extends AppCompatActivity{
    private AdapterPaginas adapterPaginas;//Adaptador de las paginas
    private ViewPager viewPager;//Donde se muestan las paginas


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinador);
        adapterPaginas=new AdapterPaginas(getSupportFragmentManager());

        viewPager=findViewById(R.id.contenedorFragment);

        setupViewPager();

        TabLayout tb=findViewById(R.id.tabs);
        tb.setupWithViewPager(viewPager);
        tb.getTabAt(0).setIcon(getDrawable(R.drawable.icono_menu_home));
        tb.getTabAt(1).setIcon(getDrawable(R.drawable.icono_menu_imagen));
        tb.getTabAt(2).setIcon(getDrawable(R.drawable.icono_menu_corazon));
        tb.getTabAt(3).setIcon(getDrawable(R.drawable.icono_menu_dinero));
        tb.getTabAt(4).setIcon(getDrawable(R.drawable.icono_menu_perfil));
        tb.getTabAt(5).setIcon(getDrawable(R.drawable.icono_menu_ajustes));

    }


    private void setupViewPager() {

        adapterPaginas.addFragment(new Inicio());
        adapterPaginas.addFragment(new Galeria());

        adapterPaginas.addFragment(new Inicio());//Sin fragment de momento
        adapterPaginas.addFragment(new Inicio());//Sin fragment de momento
        String quePantalla="CLIENTE";
        switch (quePantalla){
            case "CLIENTE":
                adapterPaginas.addFragment(new PerfilCliente(this));//tener variable para con un switch elegir el fragment.
                break;
            case "CREADOR":
                adapterPaginas.addFragment(new PerfilCreador(this));//tener variable para con un switch elegir el fragment.
                break;
            case "Invitado":
                adapterPaginas.addFragment(new PerfilCliente(this));//Hacer que se desactive el navegation o algo
                break;
        }
        adapterPaginas.addFragment(new Ajustes());

        viewPager.setAdapter(adapterPaginas);
    }
}
