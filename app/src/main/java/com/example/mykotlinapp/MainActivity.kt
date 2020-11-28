package com.example.mykotlinapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val namee:String =""
    object MyTAG {
        val MainTAG: String = MainActivity::class.java.simpleName
    }

    lateinit var numberList: MutableList<Int>
    lateinit var studentList: MutableList<Student?>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        studentList = mutableListOf()

        numberList = mutableListOf()

        for (index in 1.rangeTo(10) ) {

            numberList.add(index)
        }
        showOnlyLogs("numbers : ${numberList}")

        showOnlyLogs("${numberList.any { number -> number > 5 }}")
        showOnlyLogs("${numberList.count { number -> number > 8 }}")
        showOnlyLogs("${numberList.find { number -> number == 5 }}")
        showOnlyLogs("${numberList.all { number -> number < 5 }}")

        showOnlyLogs(
            "${
                numberList.filter { number -> number > 9 }.map { number -> number * number }
            }"
        )

        btnAdd.setOnClickListener {
            val id = Integer.parseInt(editId?.text.toString())
            val name = editName?.text.toString()
            val percentage = Integer.parseInt(editPercentage?.text.toString())
            val college = editCollege?.text.toString()
            val student = Student(id = id, percentage = percentage, college = college, name = name)
            studentList.add(student)
            Student.studentCount = Student.studentCount + 1
            textCount.text = "Student Count ${Student.studentCount}"
            ShowToastAndLog("Added")
        }

        btnList.setOnClickListener {
            for (student in studentList) {
                showOnlyLogs(studentList.toString())
            }
        }

        btnScholar.setOnClickListener {

            for (index in 0..studentList.size - 1) {
                val student = studentList.get(index)

                student?.let {
                    if (it.percentage > 75) {
                        showOnlyLogs(it.name)
                        it.play()
                    } else {
                        it.read()
                    }
                }

            }
        }


        btnItFest.setOnClickListener {

            for (index in 0..studentList.size - 1) {
                val student = studentList.get(index)
                student?.let {
                    val isQualified = ItFest().isQualified(student.name, student.percentage)
                    if (isQualified) {
                        showOnlyLogs("${student.name} is qualified")
                    } else {
                        showOnlyLogs("${student.name} is not qualified")
                    }
                }

            }

        }

        btnPlay.setOnClickListener {
            val student = studentList?.get(0)

            student?.let {
                student.eat()
                student.playGames()
            }
        }

        btnDisplay.setOnClickListener {
            for (stud in studentList) {
                stud?.let {
                val mylamda: (String) -> Boolean = { name: String -> name.startsWith("p") }
                isNameStartWithP(stud.name, mylamda)
                }


            }

        }
    }

    fun isNameStartWithP(name: String, mylam: (String) -> Boolean) {
        showOnlyLogs("$name with p :" + mylam(name))
    }


    val value = if(2>1) 2 else 1


}

fun Activity.ShowToastAndLog(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    Log.v(MainActivity.MyTAG.MainTAG, "Added")
}

fun Activity.showOnlyLogs(msg: String) {

    Log.v(MainActivity.MyTAG.MainTAG, "Scholarship got : $msg")
}




