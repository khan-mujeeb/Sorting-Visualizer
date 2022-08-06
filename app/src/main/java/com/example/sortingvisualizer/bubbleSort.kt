package com.example.sortingvisualizer

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class bubbleSort : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bubble_sort)
        setTitle("Bubble Sort")
        val codeBtn:CardView = findViewById(R.id.code)

        codeBtn.setOnClickListener(View.OnClickListener {
            val go: Intent = Intent(this,bubble_sort_code::class.java)
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
        var j: Int
        var i: Int = 0

//        var temp = mutableListOf<Int>()
        var dataToPass = mutableListOf<row>()
//        dataToPass.add(row(listA[0],listA[1],listA[2],listA[3],listA[4]))
            while (i < 4) {
                j = 0

                while (j < 5 - i - 1) {
                    var posa:Int = -1
                    var posb:Int = -1
                    if (listA.get(j) > listA.get(j + 1)) {
                        var a = listA.get(j)
                        var b = listA.get(j + 1)
                        listA[j] = b
                        listA[j+1] = a
                        posa = j
                        posb = j+1
                    }


                    dataToPass.add(row(listA[0],listA[1],listA[2],listA[3],listA[4],posa,posb))
                    j++
                }

                i++
            }

//        dataToPass.add(row(listA[0],listA[1],listA[2],listA[3],listA[4]))
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

