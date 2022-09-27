package com.example.sortingvisualizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class sorting_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorting_menu)

        setTitle("Menu")
        //getting values from the intent
        val one = intent.getStringExtra("one")
        val two = intent.getStringExtra("two")
        val three = intent.getStringExtra("three")
        val four = intent.getStringExtra("four")
        val five = intent.getStringExtra("five")

        //geting references
        val bSort = findViewById<TextView>(R.id.buubleSortBtn)

        //intent to sorting mwnu to bubble sort
        bSort.setOnClickListener(View.OnClickListener {
            intent = Intent(this,bubbleSort::class.java)
            intent.putExtra("one", one)
            intent.putExtra("two", two)
            intent.putExtra("three", three)
            intent.putExtra("four", four)
            intent.putExtra("five", five)
            startActivity(intent)
        })

        val sSort = findViewById<TextView>(R.id.selectionSortBtn)

        //intent to sorting menu to selection sort
        sSort.setOnClickListener(View.OnClickListener {
            intent = Intent(this,selectionSort::class.java)
            intent.putExtra("one", one)
            intent.putExtra("two", two)
            intent.putExtra("three", three)
            intent.putExtra("four", four)
            intent.putExtra("five", five)
            startActivity(intent)
        })

        val iSort = findViewById<TextView>(R.id.insertionSortBtn)
        iSort.setOnClickListener(View.OnClickListener {
            intent = Intent(this,insertion_sort::class.java)
            intent.putExtra("one", one)
            intent.putExtra("two", two)
            intent.putExtra("three", three)
            intent.putExtra("four", four)
            intent.putExtra("five", five)
            startActivity(intent)
        })

    }
}