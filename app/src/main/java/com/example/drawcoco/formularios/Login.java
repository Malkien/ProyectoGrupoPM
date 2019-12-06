package com.example.drawcoco.formularios;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.drawcoco.Ajustes;
import com.example.drawcoco.Inicio;
import com.example.drawcoco.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

public class Login extends AppCompatActivity {
    EditText mail, contraseña;
    TextView Registrar, Recuperar;
    FirebaseAuth mAuth;
    FirebaseFirestore bd;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //FirebaseAuth y FirebaseFirestore son necesarios para la conexion a una base de datos Firebase.
        mAuth = FirebaseAuth.getInstance();
        bd = FirebaseFirestore.getInstance();

        Registrar = this.findViewById(R.id.clickRegistrateLogin);
        Recuperar = this.findViewById(R.id.clickRecuperarLogin);
        mail = this.findViewById(R.id.cajaMailLogin);
        contraseña = this.findViewById(R.id.cajaContraseñaLogin);
        intent = new Intent(this, Inicio.class);

//      Evento para ir a la Activity Registro
        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Registro.class);
                startActivity(intent);
            }
        });

//      Evento para indicar si queremos recuperar la cuenta o no.
        Recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case DialogInterface.BUTTON_POSITIVE:
                        //Yes button clicked
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        //No button clicked
                        break;
                }
                }
            };
            AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
            builder.setMessage("¿Quieres recuperar la cuenta?").setPositiveButton("Si", dialogClickListener)
                    .setNegativeButton("No", dialogClickListener).show();
            }
        });

    }

    public void clickRegistrate(View view) {
        Intent clickRegistrate = new Intent(this, Registro.class);
        startActivity(clickRegistrate);
    }

    public void Loguearse(View view) {
        String mailLogin = mail.getText().toString();
        String contraseñaLogin = contraseña.getText().toString();

        if(mailLogin.isEmpty()&&contraseñaLogin.isEmpty()){
            Toast.makeText(Login.this, "Por favor rellene los campos",Toast.LENGTH_SHORT).show();
        }else{
            //Se conecta a la base de datos y busca algun usuario con ese mail y contraseña.
            mAuth.signInWithEmailAndPassword(mailLogin, contraseñaLogin)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser user = mAuth.getCurrentUser();
                            Toast.makeText(Login.this, "Usuario encontrado",Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Login.this, "Usuario no encontrado",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            );
        }
    }
}
