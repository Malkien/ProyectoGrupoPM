package com.example.drawcoco.adapters

import android.app.Activity
import android.app.Application
import android.content.Context
import android.net.Uri
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.drawcoco.R
import de.hdodenhof.circleimageview.CircleImageView

class AdapterIconos(val contexto: Context, val datos: ArrayList<String>): BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var li: LayoutInflater = LayoutInflater.from(contexto)
        val convertView = li.inflate(R.layout.adapter_contenedor_inicio_iconos, null)

        var icono: CircleImageView =convertView.findViewById(R.id.imagen)
        icono.setImageURI(Uri.parse(datos.get(position)))

        return convertView

    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int{
        return datos.size
    }

}