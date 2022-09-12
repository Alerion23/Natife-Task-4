package com.wenger.natifetask4.patterns

class SomeBuilder(
    private val name: String,
    private val id: Int
) {

    class Builder {

        private var name = ""
        private var id = 1

        fun withName(name: String): Builder {
            this.name = name
            return this
        }

        fun withId(id: Int): Builder {
            this.id = id
            return this
        }

        fun build(): SomeBuilder {
            return SomeBuilder(name, id)
        }
    }

}