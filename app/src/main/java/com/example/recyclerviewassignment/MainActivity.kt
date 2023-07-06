package com.example.recyclerviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = FibonacciAdapter(generateFibonacciSequences(10)) // change the value of n here
        recyclerView.adapter = adapter
    }

    private fun generateFibonacciSequence(n: Int): List<Int> {
        val fibonacciSequence = mutableListOf(0, 1)
        while (fibonacciSequence.size < n) {
            val sum = fibonacciSequence.takeLast(2).sum()
            fibonacciSequence.add(sum)
        }
        return fibonacciSequence
    }

    fun generateFibonacciSequences(n: Int): List<Int> {
        val fibonacciSequence = generateFibonacciSequence(n)
        return fibonacciSequence
    }
}





