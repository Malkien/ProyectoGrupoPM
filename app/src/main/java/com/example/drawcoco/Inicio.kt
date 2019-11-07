package com.example.drawcoco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.example.drawcoco.adapters.AdapterIconos
import com.example.drawcoco.adapters.AdapterImagenesRecomendadas

class Inicio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
        var imagenesRecomendadas: GridView =this.findViewById(R.id.imagenesRecomendadas)
        var imagenesIconos: GridView =this.findViewById(R.id.imagenesIconos)

        var iconos=ArrayList<String>()
        for(i in 0..4){
            iconos.add("android.resource://" + getPackageName() + "/" + R.drawable.pollodorado)
        }
        var imagenesRecom=ArrayList<String>()
        for(i in 0..4){
            imagenesRecom.add("android.resource://" + getPackageName() + "/" + R.drawable.goku)
        }
        var adapter= AdapterImagenesRecomendadas(this,imagenesRecom)
        var adapter2= AdapterIconos(this,iconos)
        imagenesRecomendadas.adapter = adapter
        imagenesIconos.adapter = adapter2
    }
}
