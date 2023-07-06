package com.example.recyclerviewassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FibonacciAdapter(private val sequence: List<Int>) : RecyclerView.Adapter<FibonacciViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FibonacciViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.numbers_list_item, parent, false)
        return FibonacciViewHolder(view)
    }

    override fun onBindViewHolder(holder: FibonacciViewHolder, position: Int) {
        val number = sequence[position]
        holder.numberTextView.text = number.toString()
    }

    override fun getItemCount(): Int {
        return sequence.size
    }
}

class FibonacciViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val numberTextView: TextView = view.findViewById(R.id.number_text_view)
}
