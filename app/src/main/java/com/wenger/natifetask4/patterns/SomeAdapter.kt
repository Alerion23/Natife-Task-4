package com.wenger.natifetask4.patterns

import com.wenger.natifetask4.SomeClass

class SomeAdapter(
    private val someCLass: SomeClass
) {

    fun doSomething() {
        someCLass.start(3)
    }

}