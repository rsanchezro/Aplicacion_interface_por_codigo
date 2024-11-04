package com.example.aplicacion_interface_por_codigo

import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var texto1:TextView
    lateinit var texto2:TextView
    lateinit var contenedor:LinearLayoutCompat




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inicializarComponentes()

        setContentView(this.contenedor)

    }

    private fun inicializarComponentes() {
        texto1 = TextView(this)
        texto2 = TextView(this)
        contenedor = LinearLayoutCompat(this)
        texto1.setText("Campo de texto1")
        this.texto2.setText("Campo de texto2")
        this.contenedor.setBackgroundColor(ContextCompat.getColor(this,R.color.red))
        this.contenedor.setOrientation(LinearLayoutCompat.VERTICAL)

        this.texto2.layoutParams= LinearLayoutCompat.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT,
                1F
            )

        this.texto1.layoutParams= LinearLayoutCompat.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT,
                1F
            )

        this.contenedor.addView(this.texto1)
        this.contenedor.addView(this.texto2)
    }
}