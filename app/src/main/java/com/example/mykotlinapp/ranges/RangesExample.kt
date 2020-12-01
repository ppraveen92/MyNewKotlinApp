package com.example.mykotlinapp.ranges

/*
* Ranges,control,iterators
*
* */
fun main() {
    val itemList: MutableList<Int> = mutableListOf()
    for (index in 1.rangeTo(10)) itemList.add(index)
    for (index in 10.downTo(1)) itemList.add(index)
    for (index in 10.downTo(1) step 2) itemList.add(index)
    for (index in 1..10) itemList.add(index)
    for (item in itemList) {
        if (item == 5) {
            print("$item found in list")
        }
    }
    for (item in itemList) {
        val res = when (item) {
            1, 3, 5, 7, 9 -> "$item is odd"
            2, 4, 6, 8, 10 -> "$item even"
            else -> "nknown"
        }
        print(res)
    }
    val result = when (8) {
        1, 3, 5, 7, 9 -> "odd"
        2, 4, 6, 8, 10 -> "even"
        else -> "unknown"
    }
    print("Result is $result")
}
