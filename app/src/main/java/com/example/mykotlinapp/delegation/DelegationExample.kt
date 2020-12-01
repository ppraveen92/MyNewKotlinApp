package com.example.mykotlinapp.delegation

/*
*Derived class to access all the implemented public methods of interface
*
* */

interface Base {
    fun printme()
}

class BaseImpl(val x: Int) : Base {
    override fun printme() {
        print("hey brother")
    }
}

class DerivedClass(b: Base) : Base by b

fun main() {
    val b = BaseImpl(10)
    DerivedClass(b).printme()
}