package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Step 1: Reference RecyclerView object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val data = (1..100).toList() // Replace with your actual data

        //Step 2: Provide a LayoutManager
        val numberOfColumns = 2
        val layoutManager = GridLayoutManager(this, numberOfColumns)
        recyclerView.layoutManager = layoutManager


        //Step 4: Provide a RecyclerView.Adapter
        val adapter = NumberDisplayAdapter(data)
        recyclerView.adapter = adapter

    }
}