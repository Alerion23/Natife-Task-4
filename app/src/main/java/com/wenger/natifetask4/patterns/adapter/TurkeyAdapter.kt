package com.wenger.natifetask4.patterns.adapter


class TurkeyAdapter(
    private val turkey: Turkey
) : Duck {

    override fun fly() {
        turkey.turkeyFly()
    }

    override fun quack() {
        turkey.gobble()
    }
}