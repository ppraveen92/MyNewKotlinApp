package com.example.mykotlinapp.abstractclass

class CorporationBank : RBIBank() {
    override fun simpleinterest() = print("SI Corp rule")
    override fun commonIntereset() = print("CI Corp rule")
}