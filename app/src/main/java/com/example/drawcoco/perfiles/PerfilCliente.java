package com.example.drawcoco.perfiles;

import androidx.fragment.app.Fragment;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.drawcoco.R;
import com.example.drawcoco.adapters.AdapterImagenesPerfilCliente;
import com.example.drawcoco.clases.Cliente;
import com.example.drawcoco.clases.Creador;
import com.example.drawcoco.clases.Imagen;
import com.example.drawcoco.clases.Suscripcion;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static com.example.drawcoco.clases.Personas.Genero.HOMBRE;
import static com.example.drawcoco.clases.Personas.Genero.MUJER;

public class PerfilCliente extends Fragment {
    TextView nombreCliente, descripcionCliente, tituloDibujo;
    Spinner spinnerArtista;
    ImageView dibujo1;
    private Imagen imagenPerfil, imagenCabecera;
    private ArrayList<Imagen> galeriaArtista1, galeriaArtista2;
    private Creador artista1, artista2;
    private Cliente cliente1;
    private ArrayList<Suscripcion>listaSuscripciones;


    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.activity_perfil_cliente, container, false);

        nombreCliente = view.findViewById(R.id.nombreClientePerfil);
        descripcionCliente = view.findViewById(R.id.descripcionPerfilCliente);
        tituloDibujo = view.findViewById(R.id.tituloDibujoPerfilCliente);
        dibujo1 = view.findViewById(R.id.dibujoPerfilCliente);

        spinnerArtista = view.findViewById(R.id.spinnerArtistaPerfilCliente);

        //Creacion de dos imagenes usando el constructor pequeño de Imagen.

        imagenPerfil = new Imagen("\"android.resource://" + view.getContext().getPackageName() + "/\" + R.drawable.polloDorado");
        imagenCabecera = new Imagen("\"android.resource://" + view.getContext().getPackageName() + "/\" + R.drawable.pulpoi");


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
            galeriaArtista1.add(new Imagen("Pollo Dorado", "Un pollo bonito", 50, LocalDateTime.now(), "android.resource://" + view.getContext().getPackageName() + "/" + R.drawable.pollodorado, arrayTags1, null, true, null));
            galeriaArtista1.add(new Imagen("Poring", "Esta blandito", 12, LocalDateTime.now(), "android.resource://" + view.getContext().getPackageName() + "/" + R.drawable.poi, arrayTags1, null, true, null));
            galeriaArtista1.add(new Imagen("Bunny", "Conejita Sexy", 100, LocalDateTime.now(), "android.resource://" + view.getContext().getPackageName() + "/" + R.drawable.bunny, arrayTags2, null, true, null));

            galeriaArtista2 = new ArrayList<Imagen>();
            galeriaArtista2.add(new Imagen("Pollo Blanco", "Un pollo gordito", 50, LocalDateTime.now(), "android.resource://" + view.getContext().getPackageName() + "/" + R.drawable.polloblanco, arrayTags1, null, true, null));
            galeriaArtista2.add(new Imagen("Tomberi", "Soy verde", 12, LocalDateTime.now(), "android.resource://" + view.getContext().getPackageName() + "/" + R.drawable.tomberi, arrayTags1, null, true, null));

            //ArrayList con los tipos de suscripciones para un usuario creador
            listaSuscripciones = new ArrayList<Suscripcion>();
            Suscripcion suscripcionBronce = new Suscripcion("Bronce", "Suscripcion de bronce", 5f, LocalDateTime.now(), LocalDateTime.now());
            Suscripcion suscripcionPlata = new Suscripcion("Plata", "Suscripcion de plata", 10f, LocalDateTime.now(), LocalDateTime.now());
            listaSuscripciones.add(suscripcionBronce);
            listaSuscripciones.add(suscripcionPlata);
            //Creacion de los artistas para uso de pruebas
            artista1 = new Creador("Mystra77", "Ana", "Belen", "mystra77@gmail.com", "Estoy cansada de dibujar Futanari",
                    "xxxx", MUJER, 50, imagenPerfil, imagenCabecera, 23, galeriaArtista1,
                    listaSuscripciones, "Hola soy Mystra77 y me encanta dibujar desde hace muchos años...");

            artista2 = new Creador("Malito", "Ivan", "Diaz", "idvera77@gmail.com", "Que bien me lo paso en clase",
                    "xxxx", HOMBRE, 120f, imagenPerfil, imagenCabecera, 10, galeriaArtista2,
                    null, "Hola soy un excelente programador y me encanta cargarme repositorios ^_^");
        }

        nombreCliente.setText(cliente1.getNickname());
        descripcionCliente.setText(cliente1.getDescripcionBreve());

        final ArrayList<Creador> arrayCreadores = new ArrayList<>();
        arrayCreadores.add(artista1);
        arrayCreadores.add(artista2);

        final ArrayList<String> arrayListNombres = new ArrayList<>();
        for (int i = 0; i < arrayCreadores.size(); i++){
            arrayListNombres.add(arrayCreadores.get(i).getNickname());
        }

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_spinner_item, arrayListNombres);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerArtista.setAdapter(arrayAdapter);

        spinnerArtista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String aux = parent.getItemAtPosition(position).toString();

                for (int i = 0; i < arrayListNombres.size(); i++){
                    if(arrayListNombres.get(i).equals(aux)){

                        String comparador = arrayListNombres.get(i).toString();

                        for (int j = 0; j < arrayCreadores.size(); j++){
                            if(arrayCreadores.get(j).getNickname().equals(comparador)){
                                AdapterImagenesPerfilCliente adapterImagenesPerfilCliente =
                                        new AdapterImagenesPerfilCliente(getActivity().getApplicationContext(), arrayCreadores.get(j).getImagenArrayList());
                                ListView listViewPago = getActivity().findViewById(R.id.contedorAdapterPerfilCliente);
                                listViewPago.setAdapter(adapterImagenesPerfilCliente);
                            }
                        }
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });
        return view;
    }

}
