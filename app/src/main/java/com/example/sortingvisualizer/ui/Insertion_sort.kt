package com.example.sortingvisualizer.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sortingvisualizer.CodeActivity
import com.example.sortingvisualizer.R
import com.example.sortingvisualizer.adapter.MyAdaptor
import com.example.sortingvisualizer.data.Row

class insertion_sort : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insertion_sort)
        setTitle("Insertion Sort")
        val codeBtn: CardView = findViewById(R.id.code)

        codeBtn.setOnClickListener(View.OnClickListener {
            val go: Intent = Intent(this, CodeActivity::class.java)
            go.putExtra("algo", "isort")
            startActivity(go)
        })

        // getting values from sorting_menu by a intent
        val one = intent.getStringExtra("one")
        val two = intent.getStringExtra("two")
        val three = intent.getStringExtra("three")
        val four = intent.getStringExtra("four")
        val five = intent.getStringExtra("five")

        val listA = intent.getIntegerArrayListExtra("list")!!

        //setting the element of unsorted array
        val ele1 = findViewById<TextView>(R.id.bsOne)
        val ele2 = findViewById<TextView>(R.id.bsTwo)
        val ele3 = findViewById<TextView>(R.id.bsThree)
        val ele4 = findViewById<TextView>(R.id.bsFour)
        val ele5 = findViewById<TextView>(R.id.bsFive)

        ele1.text = listA[0].toString()
        ele2.text = listA[1].toString()
        ele3.text = listA[2].toString()
        ele4.text = listA[3].toString()
        ele5.text = listA[4].toString()


        //bubble sort algorithm
//        var j: Int
//        var i: Int = 0

//        var temp = mutableListOf<Int>()
        var dataToPass = mutableListOf<Row>()
        var i: Int = 1
        var j: Int = 0

        dataToPass.add(Row(listA[0],listA[1],listA[2],listA[3],listA[4],-1,-1))
        while(i<5) {
            var temp:Int = listA[i]
            j = i-1
            while(j>=0 && listA[j]>temp) {
                listA[j+1] = listA[j]
                j--
                dataToPass.add(Row(listA[0],listA[1],listA[2],listA[3],listA[4],j+1,i))
            }
            listA[j+1] = temp

            i++
        }

        dataToPass.add(Row(listA[0],listA[1],listA[2],listA[3],listA[4],-1,-1))
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