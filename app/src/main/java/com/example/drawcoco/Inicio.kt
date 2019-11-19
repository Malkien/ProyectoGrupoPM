package com.example.drawcoco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.fragment.app.Fragment
import com.example.drawcoco.adapters.AdapterIconos
import com.example.drawcoco.adapters.AdapterImagenesRecomendadas

class Inicio : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        var view:View = inflater.inflate(R.layout.activity_inicio, container, false)
        var imagenesRecomendadas: GridView =view.findViewById(R.id.imagenesRecomendadas)
        var imagenesIconos: GridView =view.findViewById(R.id.imagenesIconos)

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
        return view
    }
}
