package com.wenger.natifetask4.patterns

import com.wenger.natifetask4.SecondClass
import com.wenger.natifetask4.SomeClass

class SomeDecorator(
    private val someClass: SomeClass,
    private val secondClass: SecondClass
) {

    fun start(num: Int) {
        someClass.start(num)
        secondClass.start(num)
    }
}