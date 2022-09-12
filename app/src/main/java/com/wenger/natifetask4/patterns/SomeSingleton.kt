package com.wenger.natifetask4.patterns

class SomeSingleton {

    companion object {

        private var instance: SomeBuilder? = null

        private fun getInstance(name: String, id: Int): SomeBuilder {
            if (instance != null) {
                return instance!!
            }
            synchronized(this) {
                if (instance != null) {
                    instance
                } else {
                    instance = SomeBuilder.Builder()
                        .withName(name)
                        .withId(id)
                        .build()
                }
            }
            return instance!!
        }
    }
}