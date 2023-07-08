package com.example.sortingvisualizer.ui

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sortingvisualizer.CodeActivity
import com.example.sortingvisualizer.adapter.MyAdaptor
import com.example.sortingvisualizer.R
import com.example.sortingvisualizer.data.Row
import com.example.sortingvisualizer.databinding.ActivityBubbleSortBinding


class bubbleSort : AppCompatActivity() {

    lateinit var binding: ActivityBubbleSortBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBubbleSortBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTitle("Bubble Sort")
        val codeBtn: CardView = findViewById(R.id.code)

        codeBtn.setOnClickListener {
            val go = Intent(this, CodeActivity::class.java)
            go.putExtra("algo", "bsort")
            startActivity(go)
        }


        val listA = intent.getIntegerArrayListExtra("list")!!

        //setting the element of unsorted
        binding.apply {
            bsOne.text = listA[0].toString()
            bsTwo.text = listA[1].toString()
            bsThree.text = listA[2].toString()
            bsFour.text = listA[3].toString()
            bsFive.text = listA[4].toString()
        }


        //bubble sort algorithm
        var j: Int
        var i: Int = 0

//        var temp = mutableListOf<Int>()
        var dataToPass = mutableListOf<Row>()
//        dataToPass.add(row(listA[0],listA[1],listA[2],listA[3],listA[4]))
        while (i < 4) {
            j = 0

            while (j < 5 - i - 1) {
                var posa: Int = -1
                var posb: Int = -1
                if (listA.get(j) > listA.get(j + 1)) {
                    var a = listA.get(j)
                    var b = listA.get(j + 1)
                    listA[j] = b
                    listA[j + 1] = a
                    posa = j
                    posb = j + 1
                }


                dataToPass.add(
                    Row(
                        listA,
                        posa,
                        posb,
                        i,
                        j
                    )
                )
                j++
            }

            i++
        }

//        dataToPass.add(row(listA[0],listA[1],listA[2],listA[3],listA[4bs
        binding.apply {
            asOne.text = listA[0].toString()
            astwo.text = listA[1].toString()
            asthree.text = listA[2].toString()
            asfour.text = listA[3].toString()
            asfive.text = listA[4].toString()
        }


        var x = findViewById<RecyclerView>(R.id.bSortList)
        x.adapter = MyAdaptor(dataToPass)
        x.layoutManager = LinearLayoutManager(this)

    }
}

