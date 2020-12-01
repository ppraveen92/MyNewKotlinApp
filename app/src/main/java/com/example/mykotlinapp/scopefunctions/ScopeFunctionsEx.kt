package com.example.mykotlinapp.scopefunctions

/*
* Scope functions (with apply let also run )
*
* */
class Person {
    var id: Int = 0
    var name: String = "unknown"

    fun display() = print("Name is ${this.name}")
}

fun main(args: Array<String>) {
    val person1 = Person()
    val pname = with(person1) {
            id = 10
            name = "prav"
            name
    }
    print(pname)
    val person2 = Person()
    person2.apply {
        id = 20
        name = "arun"
    }.display()

    val person3 = Person()
    person3.also {
        it.id = 20
        it.name = "arun"
    }.display()

    val person4: Person? = Person()
    val nameNew = person4?.let {
        it.id = 20
        it.name = "arun"
        it.name
    }
    println(nameNew)
    val person5: Person? = Person()
    val runName = person5?.run {
        id = 20
        name = "arun"
        name
    }
    println(runName)
}