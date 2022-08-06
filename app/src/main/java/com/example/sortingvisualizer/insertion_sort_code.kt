package com.example.sortingvisualizer

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class insertion_sort_code : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insertion_sort_code)
        setTitle("Code")
        val cpp = findViewById<TextView>(R.id.cpp)
        val codeBox = findViewById<TextView>(R.id.codeTxt)
        //cpp code
        cpp.setOnClickListener(View.OnClickListener {
            codeBox.text = "void insertionSort(int arr[], int n) \n" +
                    "{ \n" +
                    "    int i, key, j; \n" +
                    "    for (i = 1; i < n; i++)\n" +
                    "    { \n" +
                    "        key = arr[i]; \n" +
                    "        j = i - 1; \n" +
                    "        while (j >= 0 && arr[j] > key)\n" +
                    "        { \n" +
                    "            arr[j + 1] = arr[j]; \n" +
                    "            j = j - 1; \n" +
                    "        } \n" +
                    "        arr[j + 1] = key; \n" +
                    "    } \n" +
                    "} "
        })

        //java code
        val java = findViewById<TextView>(R.id.java)
        java.setOnClickListener(View.OnClickListener {
            codeBox.text = "    for i in range(1, len(arr)):\n" +
                    "        key = arr[i]\n" +
                    "        j = i-1\n" +
                    "        while j >= 0 and key < arr[j] :\n" +
                    "                arr[j + 1] = arr[j]\n" +
                    "                j -= 1\n" +
                    "        arr[j + 1] = key"
        })

        //python code
        val python = findViewById<TextView>(R.id.python)
        python.setOnClickListener(View.OnClickListener {
            codeBox.text = "for i in range(len(A)):\n" +
                    "    min_idx = i\n" +
                    "    for j in range(i+1, len(A)):\n" +
                    "        if A[min_idx] > A[j]:\n" +
                    "            min_idx = j\n" +
                    "    A[i], A[min_idx] = A[min_idx], A[i]"
        })
    }
}