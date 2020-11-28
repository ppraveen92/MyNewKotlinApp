package com.example.mykotlinapp.null_safety

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
    val length = nullSafetyEx1?.name!!.length ?: 0
    print(length)
    nullSafetyEx1?.let {
        it.name = "itsme"
        it.id = 1
    }
}