package com.wenger.natifetask4.patterns.adapter

import android.util.Log

class WildTurkey: Turkey {
    override fun turkeyFly() {
        Log.d("FLY", "Wild turkey flying")
    }

    override fun gobble() {
        Log.d("GOBBLE", "Wild turkey gobbling")    }
}