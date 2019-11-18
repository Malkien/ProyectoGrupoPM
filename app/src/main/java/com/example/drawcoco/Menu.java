package com.example.drawcoco;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Menu extends Fragment {

    private final int[] BOTONESMENU={//Guardo los botones del menu
            R.id.menu_boton_inicio,
            R.id.menu_boton_galeria,
            R.id.menu_boton_seguidos,
            R.id.menu_boton_suscripciones,
            R.id.menu_boton_perfil,
            R.id.menu_boton_ajustes};
    public Menu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View miMenu = inflater.inflate(R.layout.fragment_menu, container, false);//Cojo el view

        ImageButton botonMenu;
        for(int boton=0 ; boton< BOTONESMENU.length;boton++){
            botonMenu=(ImageButton) miMenu.findViewById(BOTONESMENU[boton]);
            final int finalBoton = boton;
            botonMenu.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    FragmentActivity estaActividad = getActivity();
                    ((ComunicacionMenu)estaActividad).Menu(finalBoton);
                }
            });
        }

        return miMenu;
    }

}
