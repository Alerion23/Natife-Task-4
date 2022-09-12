package com.wenger.natifetask4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wenger.natifetask4.patterns.SomeAdapter
import com.wenger.natifetask4.patterns.SomeDecorator
import com.wenger.natifetask4.patterns.SomeFactory

class MainActivity : AppCompatActivity() {

    private val adapter: SomeAdapter by lazy {
        val someClass = SomeFactory().create()
        SomeAdapter(someClass)
    }
    private val someDecorator: SomeDecorator by lazy {
        val someClass = SomeFactory().create()
        val secondClass = SecondClass()
        SomeDecorator(someClass, secondClass)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter.doSomething()
        someDecorator.start(3)
    }
}