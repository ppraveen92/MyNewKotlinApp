package com.example.mykotlinapp.interfaces

/*
* Interface concept
* */
class GaneshPerson : MyDailyTask {
    override fun play() {
        print("i am playing")
    }

    override fun read() {
        print("i am reading")
    }
}

fun main(args: Array<String>) {
    val ganes = GaneshPerson()
    ganes.play()
    ganes.read()
    ganes.sleep()
}