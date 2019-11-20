package com.example.drawcoco.perfiles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

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
import com.example.drawcoco.clases.Creador;
import com.example.drawcoco.clases.Cliente;

import java.util.ArrayList;

public class PerfilCliente extends Fragment {
    TextView nombreCliente, descripcionCliente, tituloDibujo;
    Spinner spinnerArtista;
    ImageView dibujo1;

    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.activity_perfil_cliente, container, false);

        nombreCliente = getActivity().findViewById(R.id.nombreClienteLogin);
        descripcionCliente = getActivity().findViewById(R.id.descripcionPerfilCliente);
        tituloDibujo = getActivity().findViewById(R.id.tituloDibujoPerfilCliente);
        dibujo1 = getActivity().findViewById(R.id.dibujoPerfilCliente);

        spinnerArtista = getActivity().findViewById(R.id.spinnerArtistaPerfilCliente);

        //Creador artista1 = (Creador) getIntent().getExtras().getSerializable("artista1");
        //Creador artista2 = (Creador) getIntent().getExtras().getSerializable("artista2");
        //Cliente cliente1  = (Cliente) getIntent().getExtras().getSerializable("cliente1");

        //nombreCliente.setText(cliente1.getNickname());
        //descripcionCliente.setText(cliente1.getDescripcionBreve());

        final ArrayList<Creador> arrayCreadores = new ArrayList<>();
        //arrayCreadores.add(artista1);
        //arrayCreadores.add(artista2);

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

    public void botonImagen(View view) {
        Toast.makeText(getActivity().getApplicationContext(), "Hola Pollo", Toast.LENGTH_LONG).show();
    }
}
