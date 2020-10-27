package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_visualizar.*
import kotlinx.android.synthetic.main.activity_visualizar.view.*

class visualizar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar)

        val fruta = intent.getSerializableExtra("frut") as frutas
        visor.setImageResource(fruta.idimagen)
        descripcion.text=getString(R.string.desc, fruta.desc)

    }


}