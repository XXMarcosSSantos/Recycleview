package com.devspace.recyclerview

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
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
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val adapter = ContactListAdapter()

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)

        ivGrid.setOnClickListener{
            rvList.layoutManager = GridLayoutManager(this, 2)
        }
        ivList.setOnClickListener {
            rvList.layoutManager = LinearLayoutManager(this)

        }
        adapter.setOnClickListener { contact ->
            Log.d("marcos", contact.toString())
        }
    }
}

val contacts = listOf(
    Contact(
        "Bruna",
        "(55) 11 98765-4776",
        icon = R.drawable.sample16
    ),
    Contact(
        "Eduarda",
        "(55) 11 97654-9087",
        icon = R.drawable.sample15
    ),
    Contact(
        "Bruno",
        "(55) 11 99077-4523",
        icon = R.drawable.sample14
    ),
    Contact(
        "Mariana",
        "(55) 11 98066-9123",
        icon = R.drawable.sample13
    ),
    Contact(
        "Salah",
        "(55) 11 91267-7509",
        icon = R.drawable.sample12
    ),
    Contact(
        "Abigail",
        "(55) 11 90186-9855",
        icon = R.drawable.sample11
    ),
    Contact(
        "Eduardo",
        "(55) 11 95542-7214",
        icon = R.drawable.sample10
    ),
    Contact(
        "Patrick",
        "(55) 11 98765-4321",
        icon = R.drawable.sample9
    ),
    Contact(
        "Igor",
        "(55) 11 97654-3210",
        icon = R.drawable.sample8
    ),
    Contact(
        "Rose",
        "(55) 11 96543-2109",
        icon = R.drawable.sample7
    ),
    Contact(
        "Margarida",
        "(55) 11 98432-1098",
        icon = R.drawable.sample6
    ),
    Contact(
        "Samara",
        "(55) 11 97321-0987",
        icon = R.drawable.sample5
    ),
    Contact(
        "Neide",
        "(55) 11 98765-4321",
        icon = R.drawable.sample4
    ),
    Contact(
        "Soraya",
        "(55) 11 97654-3210",
        icon = R.drawable.sample3
    ),
    Contact(
        "Oscar",
        "(55) 11 96543-2109",
        icon = R.drawable.sample2
    ),
    Contact(
        "Viviane",
        "(55) 11 98432-1098",
        icon = R.drawable.sample1
    ),
)
