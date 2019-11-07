package com.example.drawcoco.adapters

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import com.example.drawcoco.R
import com.example.drawcoco.clases.Comentario
import de.hdodenhof.circleimageview.CircleImageView
import java.util.*

class AdapterContenedorPost(val contexto:Context,val datos: ArrayList<Comentario>): BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var li:LayoutInflater=(contexto as Activity).getLayoutInflater()
        val convertView = li.inflate(R.layout.activity_adapter_contenedor_post, null)

        var nombre:TextView=convertView.findViewById(R.id.nombre)
        var icono:CircleImageView=convertView.findViewById(R.id.imagen)
        var comentario:TextView=convertView.findViewById(R.id.comentario)
        var fecha:TextView=convertView.findViewById(R.id.fecha)
        var estrellas:RatingBar=convertView.findViewById(R.id.estrellas)

        Toast.makeText(contexto,"posicion: "+position,Toast.LENGTH_LONG).show()
        nombre.text=datos.get(position).nombre
        //Aprender como poner ImageView de database
        //icono.setImageResource()
        comentario.text=datos.get(position).comentario
        fecha.text=datos.get(position).fecha.toString()
        estrellas.numStars=datos.get(position).estrellas
        return convertView

    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return position as Long
    }

    override fun getCount(): Int{
      return datos.size
    }

}