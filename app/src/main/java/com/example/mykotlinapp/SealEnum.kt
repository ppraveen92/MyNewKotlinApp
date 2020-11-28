package com.example.mykotlinapp


sealed class MyOperation {
    class Add(val value: Int) : MyOperation()
    class Substract(val value1: Int, val value2: Int) : MyOperation()


    fun operate(x: Int, op: MyOperation) = when (op) {
        is MyOperation.Add -> x + op.value
        is MyOperation.Substract -> x - op.value1 - op.value2

    }
}


enum class Gender(string: String) {
    MALE("male"), FEMALE("female")
}

fun main(args:ArrayList<String>){
}