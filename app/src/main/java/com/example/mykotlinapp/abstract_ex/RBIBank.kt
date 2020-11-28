package com.example.mykotlinapp.abstract_ex
/*
* Abstract concept
* */
abstract class RBIBank {
    var bal: Long = 100
    abstract fun simpleinterest()
    abstract fun commonIntereset()

    fun deposit(amt: Long) {
        bal = bal + amt
        print("deposited $amt, now current bal is $bal")
    }
}

fun main(args: Array<String>) {
    val cor = CorporationBank()
    cor.deposit(100)
    cor.simpleinterest()
    val can = CanaraBank()
    can.deposit(1000)
    can.simpleinterest()
}