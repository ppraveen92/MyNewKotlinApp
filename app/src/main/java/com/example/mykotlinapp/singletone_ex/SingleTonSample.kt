package com.example.mykotlinapp.singletone_ex

object SingleTonSample {
    var name = "ROBO"
    fun getCompanyName(): String = name
}

fun main(args: Array<String>) {
    SingleTonSample.name = "PHILIPS"
    SingleTonSample.getCompanyName()
    StaticExample.isPraveen()
}

class StaticExample {
    companion object {
        var name = "Praveen"
        fun isPraveen() = if (!name.startsWith("R")) true else false
    }
}