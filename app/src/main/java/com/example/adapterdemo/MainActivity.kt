package com.example.adapterdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val data:ArrayList<String> = ArrayList()

        for (i in 1..15){
            data.add("Books $i")
        }

        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val currView = view as TextView
            Toast.makeText(this, "Value is ${currView.text.toString()} & its position is $position ", Toast.LENGTH_SHORT).show()
        }
    }
}