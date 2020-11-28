package com.example.mykotlinapp.functions

import android.app.ProgressDialog.show

/*
* Functions,extension,infix,default params,named params
*
* */
class FunctionExamples {
    var name = "unknown"
    fun getHisName(): String {
        return name
    }
}

fun main(args: Array<String>) {
    val newFun = FunctionExamples()
    newFun.name = "Ganesh"
    val name: String = newFun.getHisName()
    print(name)
    val value1 = 10
    val result: Int = value1.comparingTo(20)
    print("biggest is $result")
    val resultInfix: Int = value1 compareWithInfix 20
    print("biggest is $resultInfix")
    setVehicleSpecification(name = "audi")
    setVehicleSpecification(name = "lorry", wheel = 6)
}

fun Int.comparingTo(a: Int): Int {
    if (this > a)
        return this
    else
        return a
}

infix fun Int.compareWithInfix(a: Int): Int {
    if (this > a)
        return this
    else
        return a
}

fun setVehicleSpecification(name: String, wheel: Int = 4) {
    print("Vehicle is $name with $wheel wheels")
}