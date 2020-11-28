package com.example.mykotlinapp.dataclass_constructors
/*
* data classes and constructors
* */
data class Bird(var name: String, var isFly: Boolean) {
    constructor(birdName: String) : this(birdName, false)
}

class Animal {
    var name: String = ""
    var hasHorn: String = ""

    init {
        name = "Horse"
        hasHorn = "Yes"
    }
}

fun main(args: Array<String>) {
    val peacock = Bird("pcock", true)
    val penguin = Bird("penguin")
    print(penguin)
    print(peacock)
    val horse = Animal()
    print(horse.name)
    print(horse.hasHorn)
    val rabbit = Animal()
    rabbit.name = "rabbit"
    rabbit.hasHorn = "No"
    print(rabbit.name)
    print(rabbit.hasHorn)
}