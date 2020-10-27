package com.example.app2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_visualizar.view.*
import kotlinx.android.synthetic.main.item_list.view.*

class adaptador(private var lista :ArrayList<frutas>,private var contexto: Context) : RecyclerView.Adapter<adaptador.ViewHolder>() {
    class ViewHolder(var vista: View,var contexto : Context) : RecyclerView.ViewHolder(vista){
        fun bind(frutas : frutas){
            vista.titulo.text = frutas.titulo


            vista.setOnClickListener {
               // vista.desc.text=frutas.desc
                //vista.visor.setImageResource(frutas.idimagen)
                contexto.startActivity(Intent(contexto,visualizar::class.java).putExtra("frut",frutas))
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false),contexto)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lista[position])
    }

}