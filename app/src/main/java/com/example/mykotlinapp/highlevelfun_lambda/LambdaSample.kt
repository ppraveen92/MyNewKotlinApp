package com.example.mykotlinapp.highlevelfun_lambda

/*
* Highlevel Functional - Lambda Functions . closure,it
* */

fun main(args: Array<String>) {
    var resultHere = 0
    val myFirstLamda: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    addTwoNumber(1, 2, myFirstLamda)
    val mySecondLambda: (Int, Int) -> Unit = { a: Int, b: Int -> resultHere = a + b }
    multiplyTwoNumber(a = 2, b = 3, operation = mySecondLambda)
    val compareLambda: (String) -> Boolean = { it.startsWith("p") }
    print(getNameWithP("prave", compareLambda))
}

fun addTwoNumber(a: Int, b: Int, operation: (Int, Int) -> Int) {
    val result = operation(a, b)
    print(result)
}

fun multiplyTwoNumber(a: Int, b: Int, operation: (Int, Int) -> Unit) {
    val result = operation(a, b)
    print(result)
}

fun getNameWithP(name: String, operation: (String) -> Boolean) {
    operation(name)
}