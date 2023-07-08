package com.example.sortingvisualizer.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.sortingvisualizer.R

class sorting_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorting_menu)

        setTitle("Menu")
        //getting values from the intent
        val list = intent.getIntegerArrayListExtra("list")

        //geting references
        val bSort = findViewById<TextView>(R.id.buubleSortBtn)

        //intent to sorting mwnu to bubble sort
        bSort.setOnClickListener(View.OnClickListener {
            intent = Intent(this, bubbleSort::class.java)
            intent.putIntegerArrayListExtra("list", list)
            startActivity(intent)
        })

        val sSort = findViewById<TextView>(R.id.selectionSortBtn)

        //intent to sorting menu to selection sort
        sSort.setOnClickListener(View.OnClickListener {
            intent = Intent(this, selectionSort::class.java)
            intent.putIntegerArrayListExtra("list", list)
            startActivity(intent)
        })

        val iSort = findViewById<TextView>(R.id.insertionSortBtn)
        iSort.setOnClickListener(View.OnClickListener {
            intent = Intent(this, insertion_sort::class.java)
            intent.putIntegerArrayListExtra("list", list)
            startActivity(intent)
        })

    }
}