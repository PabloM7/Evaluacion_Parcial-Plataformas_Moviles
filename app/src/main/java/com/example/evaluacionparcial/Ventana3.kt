package com.example.evaluacionparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_ventana3.*

class Ventana3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana3)

        val btn_3 = findViewById<Button>(R.id.btn_regresar)
        btn_3.setOnClickListener(){
            val saltar: Intent = Intent(this, MainActivity::class.java)
        }

        var mensajeNombre=""
        val extras=intent.extras
        val nombres=extras?.getString("nombre")?:"Sin nombre"
        val generos=extras?.getString("genero")?:"Sin genero"
        val razas=extras?.getString("raza")?:"Sin raza"
        val pesos = extras?.getInt("peso")?:-1
        val hombros = extras?.getInt("hombro")?:-1
        val occipucios = extras?.getInt("occipucio")?:-1

        var imc=pesos/(hombros*occipucios)

        tv_nombre.setText("El IMC de "+nombres+" es:")
        tv_imc.setText(imc)
        if (razas=="Mini Toy" && pesos > 6){
            imageView2.setImageResource(R.drawable.gordo)
            estado_salud.setText("Sobre Peso")
            imageView4.setImageResource(R.drawable.flaco)
            opc1.setText("Desnutrido")
            imageView5.setImageResource(R.drawable.saludable)
            opc2.setText("Saludable")
        }else if(razas =="Mini Toy" && pesos < 1){
            imageView2.setImageResource(R.drawable.flaco)
            estado_salud.setText("Desnutrido")
            imageView4.setImageResource(R.drawable.gordo)
            opc1.setText("Sobre Peso")
            imageView5.setImageResource(R.drawable.saludable)
            opc2.setText("Saludable")
        }else{
            imageView2.setImageResource(R.drawable.saludable)
            estado_salud.setText("Saludable")
            imageView4.setImageResource(R.drawable.flaco)
            opc1.setText("Desnutrido")
            imageView5.setImageResource(R.drawable.gordo)
            opc2.setText("Sobre Peso")
        }
        if (razas=="Pequeña" && pesos > 15){
            imageView2.setImageResource(R.drawable.gordo)
            estado_salud.setText("Sobre Peso")
            imageView4.setImageResource(R.drawable.flaco)
            opc1.setText("Desnutrido")
            imageView5.setImageResource(R.drawable.saludable)
            opc2.setText("Saludable")
        }else if(razas =="Pequeña" && pesos < 7){
            imageView2.setImageResource(R.drawable.flaco)
            estado_salud.setText("Desnutrido")
            imageView4.setImageResource(R.drawable.gordo)
            opc1.setText("Sobre Peso")
            imageView5.setImageResource(R.drawable.saludable)
            opc2.setText("Saludable")
        }else{
            imageView2.setImageResource(R.drawable.saludable)
            estado_salud.setText("Saludable")
        }
        if (razas=="Mediana" && pesos > 27){
            imageView2.setImageResource(R.drawable.gordo)
            estado_salud.setText("Sobre Peso")
            imageView4.setImageResource(R.drawable.flaco)
            opc1.setText("Desnutrido")
            imageView5.setImageResource(R.drawable.saludable)
            opc2.setText("Saludable")
        }else if(razas =="Mediana" && pesos < 14){
            imageView2.setImageResource(R.drawable.flaco)
            estado_salud.setText("Desnutrido")
            imageView4.setImageResource(R.drawable.gordo)
            opc1.setText("Sobre Peso")
            imageView5.setImageResource(R.drawable.saludable)
            opc2.setText("Saludable")
        }else{
            imageView2.setImageResource(R.drawable.saludable)
            estado_salud.setText("Saludable")
        }
        if (razas=="Grande" && pesos > 39){
            imageView2.setImageResource(R.drawable.gordo)
            estado_salud.setText("Sobre Peso")
            imageView4.setImageResource(R.drawable.flaco)
            opc1.setText("Desnutrido")
            imageView5.setImageResource(R.drawable.saludable)
            opc2.setText("Saludable")
        }else if(razas =="Grande" && pesos < 25){
            imageView2.setImageResource(R.drawable.flaco)
            estado_salud.setText("Desnutrido")
            imageView4.setImageResource(R.drawable.gordo)
            opc1.setText("Sobre Peso")
            imageView5.setImageResource(R.drawable.saludable)
            opc2.setText("Saludable")
        }else{
            imageView2.setImageResource(R.drawable.saludable)
            estado_salud.setText("Saludable")
        }
        if (razas=="Gigante" && pesos > 82){
            imageView2.setImageResource(R.drawable.gordo)
            estado_salud.setText("Sobre Peso")
            imageView4.setImageResource(R.drawable.flaco)
            opc1.setText("Desnutrido")
            imageView5.setImageResource(R.drawable.saludable)
            opc2.setText("Saludable")
        }else if(razas =="Gigante" && pesos < 32){
            imageView2.setImageResource(R.drawable.flaco)
            estado_salud.setText("Desnutrido")
            imageView4.setImageResource(R.drawable.gordo)
            opc1.setText("Sobre Peso")
            imageView5.setImageResource(R.drawable.saludable)
            opc2.setText("Saludable")
        }else{
            imageView2.setImageResource(R.drawable.saludable)
            estado_salud.setText("Saludable")
            imageView4.setImageResource(R.drawable.flaco)
            opc1.setText("Desnutrido")
            imageView5.setImageResource(R.drawable.gordo)
            opc2.setText("Sobre Peso")
        }




    }
}