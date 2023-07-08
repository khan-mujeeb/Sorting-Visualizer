package com.example.sortingvisualizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sortingvisualizer.data.SortingAlgoData.getAlgorithmDetails
import com.example.sortingvisualizer.data.Data
import com.example.sortingvisualizer.databinding.ActivityCodeBinding

class CodeActivity : AppCompatActivity() {

    lateinit var binding: ActivityCodeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCodeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val algo = intent.getStringExtra("algo")!!
        val data = getAlgorithmDetails(this, algo)

        setData(data)
    }

    private fun setData(data: Data?) {
        binding.algoName.text = data!!.name
        binding.algoDesp.text = data.about
        binding.tc.text = data.tc
        binding.sc.text = data.sc

        binding.cpp.setOnClickListener {
            binding.codeTxt.setCode(
                code = data.code.cpp,
                language = "cpp"
            )
        }

        binding.java.setOnClickListener {
            binding.codeTxt.setCode(
                code = data.code.java,
                language = "java"
            )
        }

        binding.python.setOnClickListener {
            binding.codeTxt.setCode(
                code = data.code.python,
                language = "python"
            )
        }

    }
}