package com.example.mykotlinapp.sample

import android.util.Log


data class Student(var id: Int, val name: String, val college: String, val percentage: Int) :
    HumanBeing(),
    StudentActivities {

    val dismissed :String by lazy {
        "dismissed from college"
    }

    init {
        id = 0
    }

    companion object {
        var studentCount: Int = 0

        @JvmName("getStudentCount1")
        fun getStudentCount(): Int {
            return studentCount
        }

    }

    override fun play() {
        Log.v(MainActivity.MyTAG.MainTAG, "Take Rest")
    }

    override fun read() {
        Log.v(MainActivity.MyTAG.MainTAG, "Prepare More")
    }

    override fun eat() {
        Log.v(MainActivity.MyTAG.MainTAG, "All are vegetarians")
    }
}

