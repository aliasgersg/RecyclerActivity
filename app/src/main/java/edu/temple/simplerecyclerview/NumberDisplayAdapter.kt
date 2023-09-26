package edu.temple.simplerecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val data: List<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>(){

class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {

    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {

    }


}