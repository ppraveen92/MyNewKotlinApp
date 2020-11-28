package com.example.mykotlinapp.interoperability.ktfiles

import com.example.mykotlinapp.interoperability.javafiles.Person

/*
 * Interoperability Kt Class
 *
 * */
class Company(val name: String, val strength: Int) {
    fun getTheCompanyName(): String {
        return name
    }
}

fun main(ar: Array<String>) {
    val person = Person(234, "sam")
    print(person.name)
}

@JvmOverloads
fun setVehicleSpecification(name: String, wheel: Int = 4) {
    print("Vehicle is $name with $wheel wheels")
}