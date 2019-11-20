package com.example.drawcoco.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import com.example.drawcoco.constantes.ValoresPreferencias;

//Este Activity recopilará los datos de nuestros nuevos clientes y los alojará en una base de datos.

public class Registro extends AppCompatActivity {
    //Declaramos todas las variables que utilizaremos posteriormente para
    //cargar los valores en nuestra base de datos de clientes.
    Spinner sexoRegistro;
    String nicknameRegistro;
    String nombreRegistro;
    String apellidosRegistro;
    String emailRegistro;
    String contraseñaRegistro;
    String contraseña2Registro;
    String generoSpinnerRegistro;

    Personas.Genero genero;
    float dineroRegistro;
    TextView txtnickname;
    TextView txtnombre;
    TextView txtapellidos;
    TextView txtmail;
    TextView txtcontraseña;
    TextView txtcontraseña2;
    CheckBox creadorCheck;
    CheckBox terminos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        sexoRegistro=findViewById(R.id.eligeGenero);
        //Aquí se cargan los valores del spinner que nos dará las opciones para
        //el valor del campo género.

        String[] gen = new String[] {"Mujer","Hombre"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, gen);
        sexoRegistro.setAdapter(adapter);

        terminos=findViewById(R.id.terminos);
        creadorCheck=findViewById(R.id.creadorCheck);



        txtnickname=findViewById(R.id.textoNickName);
        txtnombre=findViewById(R.id.textoNombre);
        txtapellidos=findViewById(R.id.textoApellidos);
        txtcontraseña=findViewById(R.id.textoPassword);
        txtcontraseña2=findViewById(R.id.textoPassword2);
        txtmail=findViewById(R.id.textoEmail);
        nicknameRegistro=txtnickname.getText().toString();
        nombreRegistro=txtnombre.getText().toString();
        apellidosRegistro=txtapellidos.getText().toString();
        contraseñaRegistro=txtcontraseña.getText().toString();
        contraseña2Registro=txtcontraseña2.getText().toString();
        emailRegistro=txtmail.getText().toString();





    }
    //Esta activity redireccionará a la pantalla de inicio una vez concluya el
    // registro del nuevo usuario

    public void registrarse(View view) {

            //Aqui ponemos la condición de que si los términos del acuerdo no son aceptados, no se podrá continuar con el registro.
            if (terminos.isChecked()) {
                Intent intentInicio = new Intent(this, MainActivity.class);
                this.startActivity(intentInicio);
            } else {
                Toast.makeText(this, "Debe de aceptar los términos para registrar sus datos", Toast.LENGTH_LONG).show();
            }

            genero=elegirGenero(view);
            Toast.makeText(this,genero.toString(),Toast.LENGTH_LONG).show();


            //Al seleccionar en el checkBox la opción creador, crearemos un nuevo objeto de la clase creador que hereda de personas,
            //si no lo seleccionamos crearemos un nuevo objeto de la clase cliente.
            //Todos estos datos serán almacenados despues en nuestra base de datos.
            if (creadorCheck.isChecked()) {
                Creador usuario = new Creador(nicknameRegistro, nombreRegistro, apellidosRegistro, emailRegistro, null, contraseñaRegistro, genero, dineroRegistro, null, null, 0, null, null, null);
            } else{
                Cliente usuario = new Cliente(nicknameRegistro, nombreRegistro, apellidosRegistro, emailRegistro, null, contraseñaRegistro, genero, dineroRegistro, null, null, null);
            }

    }


    public Personas.Genero elegirGenero(View vie){
         String generoSpinner=sexoRegistro.getSelectedItem().toString();
           if(generoSpinner.equals("Mujer")){
               genero= Personas.Genero.MUJER;

           }else if(generoSpinner.equals(("Hombre"))){


               genero= Personas.Genero.HOMBRE;
           }
           return genero;
    }

}
