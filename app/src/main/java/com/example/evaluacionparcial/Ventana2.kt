package com.example.evaluacionparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_ventana2.*

class Ventana2 : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana2)

        val btn_2 = findViewById<Button>(R.id.button4)
        val spinner: Spinner = findViewById(R.id.sp_genero)
        spinner.onItemSelectedListener = this
        val spinner2: Spinner = findViewById((R.id.sp_raza))
        spinner2.onItemSelectedListener = this

        btn_2.setOnClickListener {
            //Recolectar variables del formulario
            var Peso: String = et_peso.text.toString()
            var peso = Integer.parseInt(Peso)//Convierte a entero la variable Peso
            var Hombro: String = h_altura.text.toString()
            var hombro = Integer.parseInt(Hombro)//Convierte a entero la variable Hombro
            var Occipucio: String = occ.text.toString()
            var occipucio = Integer.parseInt(Occipucio)//Convierte a entero la variable Occipucio
            var nombre: String = et_nombre.text.toString()
            var genero: String = sp_genero.textDirection.toString()
            var raza: String = sp_raza.textDirection.toString()


            val saltar: Intent = Intent(this, Ventana3::class.java)
            saltar.putExtra("peso", peso)
            saltar.putExtra("hombro", hombro)
            saltar.putExtra("occipucio", occipucio)
            saltar.putExtra("nombre", nombre)
            saltar.putExtra("genero", genero)
            saltar.putExtra("raza", raza)
            startActivity(saltar)
        }
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        TODO("Not yet implemented")
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}