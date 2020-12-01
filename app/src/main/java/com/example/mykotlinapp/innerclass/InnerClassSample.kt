package com.example.mykotlinapp.innerclass

/*
* Inner class : used to access the outer class private member
*
* */
class Outer {
    private val msg = "hey brother"

    inner class NestedClass {
        fun callMethod(): String = msg
    }
}

fun main() {
    val message = Outer().NestedClass().callMethod()
    print(message)
}