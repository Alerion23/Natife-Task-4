package com.wenger.natifetask4.patterns

object Singleton {

    private var mTestClass: SomeBuilder? = null

    private fun getTestClass(name: String, id: Int): SomeBuilder {
        return if (mTestClass != null) {
            mTestClass!!
        } else {
            mTestClass = SomeBuilder.Builder()
                .withName(name)
                .withId(id)
                .build()
            mTestClass!!
        }
    }
}