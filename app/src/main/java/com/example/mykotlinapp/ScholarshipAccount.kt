package com.example.mykotlinapp

class ScholarshipAccount {

    val name: String = ""
    var accountBal: Int = 0

    @JvmOverloads
    fun creditScholar(name: String, bal: Int = 0) {
        accountBal = accountBal + bal
    }
}
