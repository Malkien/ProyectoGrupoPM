package com.example.drawcoco

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.example.drawcoco.adapters.AdapterContenedorPost
import com.example.drawcoco.clases.Cliente
import com.example.drawcoco.clases.Comentario
import java.time.LocalDateTime

class VisualizarPost : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar_post)
        val cliente1 = intent.extras!!.getSerializable("cliente1") as Cliente?

        var ponerComentario:GridView=this.findViewById(R.id.contenidoComentarios)
        ponerComentario.isNestedScrollingEnabled=false
        var comentarios=ArrayList<Comentario>()
        for(i in 0..5){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                comentarios.add(Comentario(cliente1,"Persona " + i,  LocalDateTime.now(), i))
            }
        }
        var adapter=AdapterContenedorPost(this,comentarios)
        ponerComentario.adapter = adapter
    }
}
