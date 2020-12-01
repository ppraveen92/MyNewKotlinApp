package com.example.mykotlinapp.overriding

class GaneshHuman : HumanBeing() {
    fun drive() = print("I can drive as well")
    override fun eat() = print("I will eat only veg items")
    override fun playGames() = print("Play only few games")
}

fun main(args: Array<String>) {
    val ganeshHuman = GaneshHuman()
    ganeshHuman.eat()
    ganeshHuman.playGames()
    ganeshHuman.drive()
}