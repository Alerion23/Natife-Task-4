package com.wenger.natifetask4.patterns.adapter

import android.util.Log

class WildDuck: Duck {

    override fun fly() {
        Log.d("FLY", "Wild duck flying")
    }

    override fun quack() {
        Log.d("QUACK", "Wild duck quacking")
    }
}