package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var rview = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adaptador(generarFrutas(),this)

    }



    private fun generarFrutas() : ArrayList<frutas>{
        val lista = ArrayList<frutas>()
        lista.add(frutas("Manzana",R.drawable.apple,"La manzana es el fruto comestible de la especie Malus domestica, llamada comúnmente manzano. Es una fruta pomácea de forma redonda y sabor más o menos dulce"))
        lista.add(frutas("Platano",R.drawable.banana,"Es un fruto comestible, botánicamente una baya, de varios tipos de grandes plantas herbáceas del género Musa."))
        lista.add(frutas("Sandia",R.drawable.watermelon,"Es una especie de la familia Cucurbitaceae originaria de África, pero tiene una gran presencia y difusión en Asia."))
        lista.add(frutas("Mango",R.drawable.mango,"El mango es el nombre de las frutas de varias especies de árboles del género Mangifera, especialmente de Mangifera indica, y sus numerosos cultivares."))
        lista.add(frutas("Uvas",R.drawable.grape,"La uva es la común denominación que reciben los frutos formados en los racimos de la vid."))
        lista.add(frutas("Kiwi",R.drawable.kiwifruit,"El kiwi es la baya de la enredadera Actinidia deliciosa. Es originaria de una gran área de China"))
        lista.add(frutas("Fresas",R.drawable.raspberry,"Es un género de plantas rastreras estoloníferas de la familia Rosaceae. Agrupa unos 400 taxones descritos, de los cuales solo unos 20 están aceptados."))
        lista.add(frutas("Naranja",R.drawable.orange,"La naranja es una fruta cítrica obtenida del naranjo dulce, del naranjo amargo y de naranjos de otras variedades o híbridos, de origen asiático."))
        lista.add(frutas("Limón",R.drawable.lemon,"Es una fruta comestible de sabor ácido y extremadamente fragante que se usa principalmente en la alimentación."))

        return lista
    }

}


