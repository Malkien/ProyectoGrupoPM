package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.drawcoco.clases.Personas;

//Este Activity recopilará los datos de nuestros nuevos clientes y los alojará en una base de datos.

public class Registro extends AppCompatActivity {
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

        String[] gen = new String[] {"Mujer", "Hombre"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, gen);
        sexo.setAdapter(adapter);


        /*txtnickname=this.findViewById(R.id.textoNickName);
        txtnombre=this.findViewById(R.id.textoNombre);
        txtapellidos=this.findViewById(R.id.textoApellidos);
        txtmail=this.findViewById(R.id.textoEmail);
        txtcontraseña=this.findViewById(R.id.textoPassword);
        txtgenero=this.findViewById(R.id.eligegenero);

        nickname= (String)txtnickname.getText();
        nombre=(String)txtnombre.getText();
        apellidos=(String)txtapellidos.getText();
        mail=(String)txtmail.getText();
        contraseña=(String)txtcontraseña.getText();



        //Captamos los datos a través de la clase persona, creando una nueva persona que
        //posteriormente almacenaremos en la base de datos.
        //Personas persona=new Personas(nickname,nombre,apellidos,mail,contraseña,genero,dinero);*/
    }
}
