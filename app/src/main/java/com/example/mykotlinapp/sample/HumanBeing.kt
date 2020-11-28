package com.example.mykotlinapp.sample

import android.util.Log

open class HumanBeing {

    open fun eat(){
        Log.v(MainActivity.MyTAG.MainTAG,"Eat All Food Items")
    }

    fun playGames()
    {
        Log.v(MainActivity.MyTAG.MainTAG,"Play All games")
    }
}