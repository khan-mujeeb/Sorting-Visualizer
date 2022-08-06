package com.example.sortingvisualizer

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class bubble_sort_code : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Code")
        setContentView(R.layout.activity_bubble_sort_code)
        val cpp = findViewById<TextView>(R.id.cpp)
        val codeBox = findViewById<TextView>(R.id.codeTxt)
        cpp.setOnClickListener(View.OnClickListener {
            codeBox.text = "void bubbleSort(int arr[], int n)\n" +
                    "{\n" +
                    "    int i, j;\n" +
                    "    for (i = 0; i < n - 1; i++)\n" +
                    "  \n" +
                    "        for (j = 0; j < n - i - 1; j++)\n" +
                    "            if (arr[j] > arr[j + 1])\n" +
                    "                swap(arr[j], arr[j + 1]);\n" +
                    "}"
        })

        val java = findViewById<TextView>(R.id.java)
        java.setOnClickListener(View.OnClickListener {
            codeBox.text = "void bubbleSort(int arr[])\n" +
                    "    {\n" +
                    "        int n = arr.length;\n" +
                    "        for (int i = 0; i < n - 1; i++)\n" +
                    "            for (int j = 0; j < n - i - 1; j++)\n" +
                    "                if (arr[j] > arr[j + 1]) {\n" +
                    "                    int temp = arr[j];\n" +
                    "                    arr[j] = arr[j + 1];\n" +
                    "                    arr[j + 1] = temp;\n" +
                    "                }\n"
        })

        val python = findViewById<TextView>(R.id.python)
        python.setOnClickListener(View.OnClickListener {
            codeBox.text = "\n" +
                    "def bubbleSort(arr):\n" +
                    "    n = len(arr)\n" +
                    "    for i in range(n):\n" +
                    "        for j in range(0, n-i-1):\n" +
                    "            if arr[j] > arr[j+1]:\n" +
                    "                arr[j], arr[j+1] = arr[j+1], arr[j]"
        })
    }
}