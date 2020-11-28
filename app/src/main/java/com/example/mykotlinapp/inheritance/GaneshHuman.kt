package com.example.mykotlinapp.inheritance

class GaneshHuman : HumanBeing() {
    fun drive() = print("I can drive as well")
}

fun main(args: Array<String>) {
    val ganeshHuman = GaneshHuman()
    ganeshHuman.eat()
    ganeshHuman.playGames()
    ganeshHuman.drive()
}