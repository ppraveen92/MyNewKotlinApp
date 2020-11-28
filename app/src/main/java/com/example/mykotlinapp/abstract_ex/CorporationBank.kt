package com.example.mykotlinapp.abstract_ex

class CorporationBank : RBIBank() {
    override fun simpleinterest() = print("SI Corp rule")
    override fun commonIntereset() = print("CI Corp rule")
}