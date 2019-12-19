package com.example.drawcoco

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.GridView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.drawcoco.adapters.AdapterIconos
import com.example.drawcoco.adapters.AdapterImagenesRecomendadas
import com.example.drawcoco.formularios.Login
import com.example.drawcoco.formularios.Registro
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.FirebaseFirestore

class Inicio : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        var view:View = inflater.inflate(R.layout.activity_inicio, container, false)
        var imagenesRecomendadas: GridView =view.findViewById(R.id.imagenesRecomendadas)
        var imagenesIconos: GridView =view.findViewById(R.id.imagenesIconos)
        var botonLoginInicio: Button =view.findViewById(R.id.btnLoginInicio)
        var botonRegistroInicio:Button=view.findViewById(R.id.btnRegistroInicio)

        var iconos=ArrayList<String>()
        for(i in 0..4){
            iconos.add("android.resource://" + getActivity()!!.getPackageName() + "/" + R.drawable.pollodorado)
        }
        var imagenesRecom=ArrayList<String>()
        for(i in 0..4){
            imagenesRecom.add("android.resource://" + getActivity()!!.getPackageName() + "/" + R.drawable.goku)
        }
        var adapter= AdapterImagenesRecomendadas(getActivity()!!.applicationContext,imagenesRecom)
        var adapter2= AdapterIconos(getActivity()!!.applicationContext,iconos)
        imagenesRecomendadas.adapter = adapter
        imagenesIconos.adapter = adapter2

        botonRegistroInicio.setOnClickListener(View.OnClickListener {
            val intentRegistroInicio = Intent(view.context, Registro::class.java)
            (view.context as Activity).startActivity(intentRegistroInicio)
        })
        botonLoginInicio.setOnClickListener(View.OnClickListener {
            val intentLoginInicio = Intent(view.context, Login::class.java)
            (view.context as Activity).startActivity(intentLoginInicio)
        })
        return view
    }
}
