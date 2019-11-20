package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.example.drawcoco.adapters.AdapterPaginas;
import com.google.android.material.tabs.TabLayout;

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
        adapterPaginas.addFragment(new Inicio());
        adapterPaginas.addFragment(new Inicio());
        adapterPaginas.addFragment(new Inicio());
        adapterPaginas.addFragment(new Inicio());
        adapterPaginas.addFragment(new Inicio());

        viewPager.setAdapter(adapterPaginas);
    }
}
