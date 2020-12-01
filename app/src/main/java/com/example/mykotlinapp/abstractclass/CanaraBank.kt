package com.example.mykotlinapp.abstractclass

class CanaraBank : RBIBank() {
    override fun simpleinterest() = print("SI Canara rule")
    override fun commonIntereset() = print("CI Canara rule")
}