package com.example.mykotlinapp.ranges

/*
* Ranges,control,iterators
*
* */
fun main(args: Array<String>) {
    val itemList: MutableList<Int> = mutableListOf()
    for (index in 1..10) itemList.add(index)
    for (item in itemList) {
        if (item == 5) {
            print("$item found in list")
        }
    }
    for (item in itemList) {
        when (item) {
            1, 3, 5, 7, 9 -> "$item is odd"
            2, 4, 6, 8, 10 -> "$item even"
        }
    }
    val result = when (8) {
        1, 3, 5, 7, 9 -> "odd"
        2, 4, 6, 8, 10 -> "even"
        else -> "unknown"
    }
    print("Result is $result")
}