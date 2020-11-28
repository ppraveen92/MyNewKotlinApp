package com.example.mykotlinapp.abstract_ex

class CanaraBank : RBIBank() {
    override fun simpleinterest() = print("SI Canara rule")
    override fun commonIntereset() = print("CI Canara rule")
}