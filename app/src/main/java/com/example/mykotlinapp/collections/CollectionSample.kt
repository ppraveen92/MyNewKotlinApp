package com.example.mykotlinapp.collections

/*
* Shows some collection examples
*
* */
fun main() {

    val immutableList = listOf("prav", "prasa", "Rahul")
    for (item in immutableList) {
        println(item)
    }

    val immutableMap: Map<Int, String> = mapOf(9 to "prav", 8 to "prasa", 7 to "Rahul")
    for (key in immutableMap.keys) {
        println(immutableMap[key])
    }

    val mutableList = mutableListOf("prav", "prasa", "Rahul")
    mutableList[0] = "Praveen"
    mutableList.add("suman")
    for (item in mutableList) {
        println(item)
    }

    val mutableMap = mutableMapOf(9 to "prav", 8 to "prasa", 7 to "Rahul")
    mutableMap[10] = "Praveen"
    mutableMap[6] = "Saurav"
    for (item in mutableMap.values) {
        println(item)
    }

    val numbers = listOf("one", "two", "three", "four")
    val longerThan3 = numbers.filter { it.length > 3 }
    println(longerThan3)

    val numberslist = listOf(1, 2, 3)
    println(numberslist.map { it * 3 })

    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    println(colors zip animals)

    val twoAnimals = listOf("fox", "bear")
    println(colors.zip(twoAnimals))
}