package com.example.a212697748.primeiroprojetocurso

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick( view: View){
        Log.i("BOTAO", "Botão foi pressionado");

        //var texto = findViewById(R.id.txtExibicao) as TextView
        var texto = findViewById<TextView>(R.id.txtExibicao)
        texto.setText("Eita carai, funcionou!")
    }

    fun buttonLimparClick(view: View){
        var txt = findViewById<TextView>(R.id.txtExibicao)
        txt.setText("Clique no botão")
    }

}
