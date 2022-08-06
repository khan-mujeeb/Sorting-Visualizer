package com.example.sortingvisualizer

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class selection_sort_code : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection_sort_code)
        setTitle("Code")
        val cpp = findViewById<TextView>(R.id.cpp)
        val codeBox = findViewById<TextView>(R.id.codeTxt)
        //cpp code
        cpp.setOnClickListener(View.OnClickListener {
            codeBox.text = "void selectionSort(int arr[], int n) \n" +
                    "{ \n" +
                    "    int i, j, min_idx; \n" +
                    "    for (i = 0; i < n-1; i++) \n" +
                    "    { \n" +
                    "        min_idx = i; \n" +
                    "        for (j = i+1; j < n; j++) \n" +
                    "        if (arr[j] < arr[min_idx]) \n" +
                    "            min_idx = j; \n" +
                    " \n" +
                    "        swap(&arr[min_idx], &arr[i]); \n" +
                    "    } \n" +
                    "} "
        })

        //java code
        val java = findViewById<TextView>(R.id.java)
        java.setOnClickListener(View.OnClickListener {
            codeBox.text = "   void selectionSort(int arr[])\n" +
                    "    {\n" +
                    "        int n = arr.length;\n" +
                    " \n" +
                    "        for (int i = 0; i < n-1; i++)\n" +
                    "        {\n" +
                    "            \n" +
                    "            int min_idx = i;\n" +
                    "            for (int j = i+1; j < n; j++)\n" +
                    "                if (arr[j] < arr[min_idx])\n" +
                    "                    min_idx = j;\n" +
                    "\n" +
                    "            int temp = arr[min_idx];\n" +
                    "            arr[min_idx] = arr[i];\n" +
                    "            arr[i] = temp;\n" +
                    "        }\n" +
                    "    }"
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