package com.example.drawcoco.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.drawcoco.Inicio;
import com.example.drawcoco.MainActivity;
import com.example.drawcoco.R;
import com.example.drawcoco.clases.Cliente;
import com.example.drawcoco.clases.Creador;
import com.example.drawcoco.clases.Imagen;
import com.example.drawcoco.clases.Personas;
import com.example.drawcoco.clases.Suscripcion;

//Este Activity recopilará los datos de nuestros nuevos clientes y los alojará en una base de datos.

public class Registro extends AppCompatActivity {
    //Declaramos todas las variables que utilizaremos posteriormente para
    //cargar los valores en nuestra base de datos de clientes.
    Spinner sexo;
    String nickname;
    String nombre;
    String apellidos;
    String email;
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
    CheckBox creadorCheck;
    CheckBox terminos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        sexo=findViewById(R.id.eligegenero);
        //Aquí se cargan los valores del spinner que nos dará las opciones para
        //el valor del campo género.

        String[] gen = new String[] {"Mujer", "Hombre"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, gen);
        sexo.setAdapter(adapter);

        terminos=findViewById(R.id.terminos);
        creadorCheck=findViewById(R.id.creadorcheck);

        txtnickname=findViewById(R.id.textoNickName);
        txtnombre=findViewById(R.id.textoNombre);
        txtapellidos=findViewById(R.id.textoApellidos);
        txtcontraseña=findViewById(R.id.textoPassword);
        txtmail=findViewById(R.id.textoEmail);
        nickname=txtnickname.getText().toString();
        nombre=txtnombre.getText().toString();
        apellidos=txtapellidos.getText().toString();
        contraseña=txtcontraseña.getText().toString();
        email=txtmail.getText().toString();

    }
    //Esta activity redireccionará a la pantalla de inicio una vez concluya el
    // registro del nuevo usuario

    public void registrarse(View view) {
        if(terminos.isChecked()) {
            Intent intentInicio = new Intent(this, Inicio.class);
            this.startActivity(intentInicio);
        }else{
            Toast.makeText(this,"Debe de aceptar los términos para continuar con el registro", Toast.LENGTH_LONG).show();
        }

    //Al seleccionar en el checkBox la opción creador, crearemos un nuevo objeto de la clase creador que hereda de personas,
    //si no lo seleccionamos crearemos un nuevo objeto de la clase cliente.
    //Todos estos datos serán almacenados despues en nuestra base de datos.
        if(creadorCheck.isChecked()) {
            Creador usuario = new Creador(nickname,nombre,apellidos,email,null,contraseña,genero,dinero,null,null,0, null, null, null);
        }else{
            Cliente usuario=new Cliente(nickname,nombre,apellidos,email,null,contraseña,genero,dinero, null, null,null);
        }

    }
}
