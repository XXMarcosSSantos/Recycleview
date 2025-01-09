package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)


    }
}

val contacts = listOf(
    Contact(
        "bruna",
        "(55) 11 98765-4776",
        icon = R.drawable.sample16
    ),
    Contact(
        "eduarda",
        "(55) 11 97654-9087",
        icon = R.drawable.sample15
    ),
    Contact(
        "bruno",
        "(55) 11 99077-4523",
        icon = R.drawable.sample14
    ),
    Contact(
        "raabe",
        "(55) 11 98066-9123",
        icon = R.drawable.sample13
    ),
    Contact(
        "musq",
        "(55) 11 91267-7509",
        icon = R.drawable.sample12
    ),
    Contact(
        "abigail",
        "(55) 11 90186-9855",
        icon = R.drawable.sample11
    ),
    Contact(
        "edu",
        "(55) 11 95542-7214",
        icon = R.drawable.sample10
    ),
    Contact(
        "patrick",
        "(55) 11 98765-4321",
        icon = R.drawable.sample9
    ),
    Contact(
        "igor",
        "(55) 11 97654-3210",
        icon = R.drawable.sample8
    ),
    Contact(
        "rose",
        "(55) 11 96543-2109",
        icon = R.drawable.sample7
    ),
    Contact(
        "Margarida",
        "(55) 11 98432-1098",
        icon = R.drawable.sample6
    ),
    Contact(
        "samara",
        "(55) 11 97321-0987",
        icon = R.drawable.sample5
    ),
    Contact(
        "neide",
        "(55) 11 98765-4321",
        icon = R.drawable.sample4
    ),
    Contact(
        "soraya",
        "(55) 11 97654-3210",
        icon = R.drawable.sample3
    ),
    Contact(
        "oscar",
        "(55) 11 96543-2109",
        icon = R.drawable.sample2
    ),
    Contact(
        "viviane",
        "(55) 11 98432-1098",
        icon = R.drawable.sample1
    ),
)
