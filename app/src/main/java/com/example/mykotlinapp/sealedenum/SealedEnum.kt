package com.example.mykotlinapp.sealedenum

sealed class SealedClass {
    class A : SealedClass()
    class B(val a: Int) : SealedClass()
    object C : SealedClass()
}

enum class Gender(value: Int) {
    MALE(value = 0), FEMALE(value = 1)
}

fun main(args: Array<String>) {
    checkTheSeal(SealedClass.A())
    print(Gender.MALE.ordinal)
    print(Gender.FEMALE.ordinal)
}

fun checkTheSeal(member: SealedClass) {
    when (member) {
        is SealedClass.A -> print("a")
        is SealedClass.B -> print("b ${member.a}")
        SealedClass.C -> print("c")
    }
}