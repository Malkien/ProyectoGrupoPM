package com.example.drawcoco

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.GridView
import android.widget.LinearLayout
import android.widget.ListView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.drawcoco.adapters.AdapterContenedorPost
import com.example.drawcoco.clases.Comentario
import java.time.LocalDateTime

class VisualizarPost : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar_post)
        var ponerComentario:GridView=this.findViewById(R.id.contenidoComentarios)
        ponerComentario.isNestedScrollingEnabled=false
        var comentarios=ArrayList<Comentario>()
        for(i in 0..5){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                comentarios.add(Comentario("Persona " + i, "Soy la persona " + i, LocalDateTime.now(), i))
            }
        }
        var adapter=AdapterContenedorPost(this,comentarios)
        ponerComentario.adapter = adapter
    }
}
