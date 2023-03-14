package com.example.sortingvisualizer.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.sortingvisualizer.R

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

        val1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val2.requestFocus();
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })
        val2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val3.requestFocus();
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })
        val3.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val4.requestFocus();
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })
        val4.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val5.requestFocus();
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })



        // intent from main activity to sorting menu
        sortBtn.setOnClickListener(View.OnClickListener {
            //making array of nums
            val num1:String = val1.text.toString()
            val num2:String = val2.text.toString()
            val num3:String = val3.text.toString()
            val num4:String = val4.text.toString()
            val num5:String = val5.text.toString()
            if(num1.trim().isEmpty() || num2.trim().isEmpty() || num3.trim().isEmpty() || num4.trim().isEmpty()|| num5.trim()
                    .isEmpty()
            ){
                Toast.makeText(this,"Enter all values",Toast.LENGTH_LONG).show()
            }
            else{
                val intent:Intent = Intent(this, sorting_menu::class.java)



                //passing values from one intent to other
                intent.putExtra("one", num1)
                intent.putExtra("two", num2)
                intent.putExtra("three", num3)
                intent.putExtra("four", num4)
                intent.putExtra("five", num5)
                startActivity(intent)
            }

        })

    }
}