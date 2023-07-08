package com.example.sortingvisualizer.data

object CodeData {

    fun getBubbleSortCode(code: String): String {
        return when (code) {
            "cpp" -> {
                "void bubbleSort(int arr[], int n)\n" +
                        "{\n" +
                        "    int i, j;\n" +
                        "    for (i = 0; i < n - 1; i++)\n" +
                        "    {\n" +
                        "        for (j = 0; j < n - i - 1; j++)\n" +
                        "        {\n" +
                        "            if (arr[j] > arr[j + 1])\n" +
                        "            {\n" +
                        "                swap(arr[j], arr[j + 1]);\n" +
                        "            }\n" +
                        "        }\n" +
                        "    }\n" +
                        "}"
            }
            "java" -> {
                "void bubbleSort(int arr[])\n" +
                        "{\n" +
                        "    int n = arr.length;\n" +
                        "    for (int i = 0; i < n - 1; i++)\n" +
                        "    {\n" +
                        "        for (int j = 0; j < n - i - 1; j++)\n" +
                        "        {\n" +
                        "            if (arr[j] > arr[j + 1])\n" +
                        "            {\n" +
                        "                int temp = arr[j];\n" +
                        "                arr[j] = arr[j + 1];\n" +
                        "                arr[j + 1] = temp;\n" +
                        "            }\n" +
                        "        }\n" +
                        "    }\n" +
                        "}"
            }
            "python" -> {
                "def bubbleSort(arr):\n" +
                        "    n = len(arr)\n" +
                        "    for i in range(n):\n" +
                        "        for j in range(0, n - i - 1):\n" +
                        "            if arr[j] > arr[j + 1]:\n" +
                        "                arr[j], arr[j + 1] = arr[j + 1], arr[j]"
            }
            else -> ""
        }
    }

    fun getInsertionSortCode(code: String): String {
        return when (code) {
            "cpp" -> {
                "void insertionSort(int arr[], int n)\n" +
                        "{\n" +
                        "    int i, key, j;\n" +
                        "    for (i = 1; i < n; i++)\n" +
                        "    {\n" +
                        "        key = arr[i];\n" +
                        "        j = i - 1;\n" +
                        " \n" +
                        "        while (j >= 0 && arr[j] > key)\n" +
                        "        {\n" +
                        "            arr[j + 1] = arr[j];\n" +
                        "            j = j - 1;\n" +
                        "        }\n" +
                        "        arr[j + 1] = key;\n" +
                        "    }\n" +
                        "}"
            }
            "java" -> {
                "void insertionSort(int arr[])\n" +
                        "{\n" +
                        "    int n = arr.length;\n" +
                        "    for (int i = 1; i < n; ++i) {\n" +
                        "        int key = arr[i];\n" +
                        "        int j = i - 1;\n" +
                        " \n" +
                        "        while (j >= 0 && arr[j] > key) {\n" +
                        "            arr[j + 1] = arr[j];\n" +
                        "            j = j - 1;\n" +
                        "        }\n" +
                        "        arr[j + 1] = key;\n" +
                        "    }\n" +
                        "}"
            }
            "python" -> {
                "def insertionSort(arr):\n" +
                        "    for i in range(1, len(arr)):\n" +
                        "        key = arr[i]\n" +
                        "        j = i - 1\n" +
                        " \n" +
                        "        while j >= 0 and arr[j] > key:\n" +
                        "            arr[j + 1] = arr[j]\n" +
                        "            j -= 1\n" +
                        " \n" +
                        "        arr[j + 1] = key"
            }
            else -> ""
        }
    }

    fun getSelectionSortCode(code: String): String {
        return when (code) {
            "cpp" -> {
                "void selectionSort(int arr[], int n)\n" +
                        "{\n" +
                        "    int i, j, min_idx;\n" +
                        " \n" +
                        "    for (i = 0; i < n-1; i++)\n" +
                        "    {\n" +
                        "        min_idx = i;\n" +
                        "        for (j = i+1; j < n; j++)\n" +
                        "            if (arr[j] < arr[min_idx])\n" +
                        "                min_idx = j;\n" +
                        " \n" +
                        "        swap(&arr[min_idx], &arr[i]);\n" +
                        "    }\n" +
                        "}"
            }
            "java" -> {
                "void selectionSort(int arr[])\n" +
                        "{\n" +
                        "    int n = arr.length;\n" +
                        " \n" +
                        "    for (int i = 0; i < n-1; i++)\n" +
                        "    {\n" +
                        "        int min_idx = i;\n" +
                        "        for (int j = i+1; j < n; j++)\n" +
                        "            if (arr[j] < arr[min_idx])\n" +
                        "                min_idx = j;\n" +
                        " \n" +
                        "        int temp = arr[min_idx];\n" +
                        "        arr[min_idx] = arr[i];\n" +
                        "        arr[i] = temp;\n" +
                        "    }\n" +
                        "}"
            }
            "python" -> {
                "def selectionSort(arr):\n" +
                        "    n = len(arr)\n" +
                        " \n" +
                        "    for i in range(n):\n" +
                        "        min_idx = i\n" +
                        "        for j in range(i+1, n):\n" +
                        "            if arr[j] < arr[min_idx]:\n" +
                        "                min_idx = j\n" +
                        " \n" +
                        "        arr[i], arr[min_idx] = arr[min_idx], arr[i]"
            }
            else -> ""
        }
    }
}
