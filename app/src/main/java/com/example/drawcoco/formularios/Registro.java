package com.example.drawcoco.formularios;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
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
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

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

    FirebaseAuth mAuth;
    FirebaseFirestore bd;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        //FirebaseAuth y FirebaseFirestore son necesarios para la conexion a una base de datos Firebase.
        mAuth = FirebaseAuth.getInstance();
        bd = FirebaseFirestore.getInstance();

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
        intent = new Intent(this, Login.class);
    }
    //Esta activity redireccionará a la pantalla de inicio una vez concluya el
    // registro del nuevo usuario

    public void registrarse(View view) {
        nicknameRegistro=txtnickname.getText().toString();
        nombreRegistro=txtnombre.getText().toString();
        apellidosRegistro=txtapellidos.getText().toString();
        contraseñaRegistro=txtcontraseña.getText().toString();
        contraseña2Registro=txtcontraseña2.getText().toString();
        emailRegistro=txtmail.getText().toString();

        //Aqui ponemos la condición de que si los términos del acuerdo no son aceptados, no se podrá continuar con el registro.
        if (!terminos.isChecked()) {
            Toast.makeText(this, "Debe de aceptar los términos para registrar sus datos", Toast.LENGTH_LONG).show();
        }else {
            genero = elegirGenero(view);
            //Al seleccionar en el checkBox la opción creador, crearemos un nuevo objeto de la clase creador que hereda de personas,
            //si no lo seleccionamos crearemos un nuevo objeto de la clase cliente.
            //Todos estos datos serán almacenados despues en nuestra base de datos.
            if (creadorCheck.isChecked()) {
                Creador usuario = new Creador(nicknameRegistro, nombreRegistro, apellidosRegistro, emailRegistro, null, contraseñaRegistro, genero, dineroRegistro, null, null, 0, null, null, null);

                //Creamos el usuario usando Firebase, aqui añadimos el mail y la contraseña que introducimos en sus respectivos campos.
                mAuth.createUserWithEmailAndPassword(emailRegistro,contraseñaRegistro)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Log.d("ExitoRegistro", "createUserWithEmail:success");
                                //Nos lleva al Login para poder acceder con todas las funciones de la pagina.
                                startActivity(intent);
                            } else {
                                Log.d("FalloRegistro", "Ha petado el registro");
                            }
                        }
                    }
                );
            } else {
                Cliente usuario = new Cliente(nicknameRegistro, nombreRegistro, apellidosRegistro, emailRegistro, null, contraseñaRegistro, genero, dineroRegistro, null, null, null);
                //Creamos el usuario usando Firebase, aqui añadimos el mail y la contraseña que introducimos en sus respectivos campos.
                mAuth.createUserWithEmailAndPassword(emailRegistro,contraseñaRegistro)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Log.d("ExitoRegistro", "createUserWithEmail:success");
                                    //Directamente nos lleva a la pantalla de Login.
                                    startActivity(intent);
                                } else {
                                    Log.d("FalloRegistro", "Ha petado el registro");
                                }
                            }
                        }
                    );
            }
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
