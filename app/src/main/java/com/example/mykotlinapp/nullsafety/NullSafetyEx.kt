package com.example.mykotlinapp.nullsafety

/*
* Null Safety Operators
* */
class NullSafetyEx {
    var id: Int? = null
    var name: String? = null
}

fun main(arg: Array<String>) {
    val nullSafetyEx1: NullSafetyEx? = NullSafetyEx()
    nullSafetyEx1?.id = 10
    nullSafetyEx1?.name = "prav"
    val length = nullSafetyEx1?.name!!.length
    print(length)
    nullSafetyEx1?.let {
        it.name = "itsme"
        it.id = 1
    }
}