package com.example.mykotlinapp.interfaces

interface MyDailyTask {
    fun play()
    fun read()
    fun sleep() = print("I am sleeping")
}