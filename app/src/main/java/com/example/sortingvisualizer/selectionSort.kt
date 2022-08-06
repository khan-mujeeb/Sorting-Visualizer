package com.example.sortingvisualizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class selectionSort : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection_sort)
        setTitle("Selection Sort")
        val codeBtn: CardView = findViewById(R.id.code)

        codeBtn.setOnClickListener(View.OnClickListener {
            val go: Intent = Intent(this,selection_sort_code::class.java)
            startActivity(go)
        })

        // getting values from sorting_menu by a intent
        val one = intent.getStringExtra("one")
        val two = intent.getStringExtra("two")
        val three = intent.getStringExtra("three")
        val four = intent.getStringExtra("four")
        val five = intent.getStringExtra("five")

        //making of list
        var listA = mutableListOf(-1)
        listA.add(Integer.parseInt(one))
        listA.add(Integer.parseInt(two))
        listA.add(Integer.parseInt(three))
        listA.add(Integer.parseInt(four))
        listA.add(Integer.parseInt(five))
        listA.removeFirst()

        //setting the element of unsorted array
        val ele1 = findViewById<TextView>(R.id.bsOne)
        val ele2 = findViewById<TextView>(R.id.bsTwo)
        val ele3 = findViewById<TextView>(R.id.bsThree)
        val ele4 = findViewById<TextView>(R.id.bsFour)
        val ele5 = findViewById<TextView>(R.id.bsFive)

        ele1.text = one
        ele2.text = two
        ele3.text = three
        ele4.text = four
        ele5.text = five


        //bubble sort algorithm
//        var j: Int
//        var i: Int = 0

//        var temp = mutableListOf<Int>()
        var dataToPass = mutableListOf<row>()
        var i: Int = 0
        var j: Int = 0

        dataToPass.add(row(listA[0],listA[1],listA[2],listA[3],listA[4],-1,-1))
        while(i<4) {
            var temp:Int = i
            j = i+1
            while(j<5) {
                if(listA[j]<listA[temp])
                    temp = j
                j++
            }
            Collections.swap(listA, i, temp)
            dataToPass.add(row(listA[0],listA[1],listA[2],listA[3],listA[4],i,temp))
            i++
        }

        dataToPass.add(row(listA[0],listA[1],listA[2],listA[3],listA[4],-1,-1))
        //setting content of sorted array
        val e1 = findViewById<TextView>(R.id.asOne)
        val e2 = findViewById<TextView>(R.id.astwo)
        val e3 = findViewById<TextView>(R.id.asthree)
        val e4 = findViewById<TextView>(R.id.asfour)
        val e5 = findViewById<TextView>(R.id.asfive)

        e1.text = listA[0].toString()
        e2.text = listA[1].toString()
        e3.text = listA[2].toString()
        e4.text = listA[3].toString()
        e5.text = listA[4].toString()


        var x = findViewById<RecyclerView>(R.id.bSortList)
        x.adapter = MyAdaptor(dataToPass)
        x.layoutManager = LinearLayoutManager(this)
    }
}