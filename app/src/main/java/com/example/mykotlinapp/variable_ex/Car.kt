package com.example.mykotlinapp.variable_ex

/*
* Variable declaration data types and String interpolation
*
* */
class Car {
    var color: String = "white"
    var hornType = "air horn"
    private val wheel = 4
    var milege: Float = 16.7F
    fun getSpec() {
        print("The ${this.wheel} wheel car is in ${this.color} color with ${this.hornType} ")
    }
}

fun main(args: Array<String>) {
    val audi = Car()
    audi.color = "red"
    audi.milege = 15.3F
    audi.hornType = "normal"
    audi.getSpec()
}