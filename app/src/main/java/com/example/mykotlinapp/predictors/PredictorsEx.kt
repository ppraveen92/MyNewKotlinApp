package com.example.mykotlinapp.predictors
/*
* Predictors
*
* */
fun main(args: Array<String>) {
    val numberList = mutableListOf<Int>()
    for (index in 1.rangeTo(10)) numberList.add(index)
    print("numbers : ${numberList}")
    print("${numberList.any { number -> number > 5 }}")
    print("${numberList.count { number -> number > 8 }}")
    print("${numberList.find { number -> number > 5 }}")
    print("${numberList.all { number -> number < 5 }}")
}