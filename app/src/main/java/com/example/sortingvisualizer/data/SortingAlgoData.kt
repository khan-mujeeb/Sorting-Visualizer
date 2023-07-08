package com.example.sortingvisualizer.data

import android.content.Context
import com.example.sortingvisualizer.R

object SortingAlgoData {

    fun getAlgorithmDetails(context: Context, algorithmName: String): Data? {
        return when (algorithmName) {
            "bsort" -> {
                Data(
                    name = context.getString(R.string.bubble_sort),
                    about = context.getString(R.string.buuble_sort_descp),
                    code = Code(
                        cpp = CodeData.getBubbleSortCode("cpp"),
                        java = CodeData.getBubbleSortCode("java"),
                        python = CodeData.getBubbleSortCode("python")
                    ),
                    tc = context.getString(R.string.time_complexity_o_n2),
                    sc = context.getString(R.string.auxiliary_space_o_1)
                )
            }
            "isort" -> {
                Data(
                    name = context.getString(R.string.insertion_sort),
                    about = context.getString(R.string.insertion_sort_descp),
                    code = Code(
                        cpp = CodeData.getInsertionSortCode("cpp"),
                        java = CodeData.getInsertionSortCode("java"),
                        python = CodeData.getInsertionSortCode("python")
                    ),
                    tc = context.getString(R.string.time_complexity_o_n2),
                    sc = context.getString(R.string.auxiliary_space_o_1)
                )
            }
            "ssort" -> {
                Data(
                    name = context.getString(R.string.selection_sort),
                    about = context.getString(R.string.selection_sort_descp),
                    code = Code(
                        cpp = CodeData.getSelectionSortCode("cpp"),
                        java = CodeData.getSelectionSortCode("java"),
                        python = CodeData.getSelectionSortCode("python")
                    ),
                    tc = context.getString(R.string.time_complexity_o_n2),
                    sc = context.getString(R.string.auxiliary_space_o_1)
                )
            }
            else -> null
        }
    }

}
