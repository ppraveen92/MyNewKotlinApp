package com.example.mykotlinapp.singleton

object SingleTonSample {
    var name = "ROBO"
    fun getCompanyName(): String = name
}

fun main() {
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