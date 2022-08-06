package com.example.sortingvisualizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Welcome");
        // getting reference of different ui element
        val sortBtn = findViewById<Button>(R.id.sort)
        val val1 = findViewById<EditText>(R.id.ele_1)
        val val2 = findViewById<EditText>(R.id.ele_2)
        val val3 = findViewById<EditText>(R.id.ele_3)
        val val4 = findViewById<EditText>(R.id.ele_4)
        val val5 = findViewById<EditText>(R.id.ele_5)


        // intent from main activity to sorting menu
        sortBtn.setOnClickListener(View.OnClickListener {
            val intent:Intent = Intent(this,sorting_menu::class.java)
            //making array of nums
            val num1:String = val1.text.toString()
            val num2:String = val2.text.toString()
            val num3:String = val3.text.toString()
            val num4:String = val4.text.toString()
            val num5:String = val5.text.toString()


            //passing values from one intent to other
            intent.putExtra("one", num1)
            intent.putExtra("two", num2)
            intent.putExtra("three", num3)
            intent.putExtra("four", num4)
            intent.putExtra("five", num5)
            startActivity(intent)
        })

    }
}