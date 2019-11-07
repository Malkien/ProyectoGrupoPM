package com.example.drawcoco.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.drawcoco.Inicio;
import com.example.drawcoco.MainActivity;
import com.example.drawcoco.R;
import com.example.drawcoco.clases.Personas;

//Este Activity recopilará los datos de nuestros nuevos clientes y los alojará en una base de datos.

public class Registro extends AppCompatActivity {
    //Declaramos todas las variables que utilizaremos posteriormente para
    //cargar los valores en nuestra base de datos de clientes.
    Spinner sexo;
    String nickname;
    String nombre;
    String apellidos;
    String mail;
    String descripcion;
    String contraseña;
    Personas.Genero genero;
    float dinero;
    TextView txtnickname;
    TextView txtnombre;
    TextView txtapellidos;
    TextView txtmail;
    TextView txtcontraseña;
    TextView txtgenero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        sexo=findViewById(R.id.eligegenero);
        //Aquí se cargan los valores del spinner que nos dará las opciones para
        //el valor del campo género.

        String[] gen = new String[] {"Mujer", "Hombre"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, gen);
        sexo.setAdapter(adapter);

    }
    //Esta activity redireccionará a la pantalla de inicio una vez concluya el
    // registro del nuevo usuario

    public void registrarse(View view) {
        Intent intentInicio=new Intent(this, Inicio.class);
        this.startActivity(intentInicio);
    }
}
