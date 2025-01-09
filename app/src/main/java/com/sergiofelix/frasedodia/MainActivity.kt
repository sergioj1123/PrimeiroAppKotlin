package com.sergiofelix.frasedodia

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.phraseOfTheDay)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun quote(view: View){
        val quotes = arrayOf(
            "Acredite que você pode e já está no meio do caminho.",
            "A única maneira de fazer um ótimo trabalho é amar o que você faz.",
            "Seu tempo é limitado, não o gaste vivendo a vida de outra pessoa.",
            "O futuro pertence àqueles que acreditam na beleza de seus sonhos.",
            "Esforce-se não para ser um sucesso, mas sim para ser de valor.",
            "A mente é tudo. O que você pensa, você se torna.",
            "A melhor maneira de prever o futuro é criá-lo.",
            "Não fique olhando para o relógio; faça o que ele faz. Continue.",
            "Sempre parece impossível até que seja feito.",
            "A jornada de mil milhas começa com um único passo."
        )
        val index = (0..9).random()
        val textView = findViewById<TextView>(R.id.phraseOutput)
        textView.text = quotes[index]
    }
}

