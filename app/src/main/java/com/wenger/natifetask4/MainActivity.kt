package com.wenger.natifetask4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wenger.natifetask4.patterns.adapter.TurkeyAdapter
import com.wenger.natifetask4.patterns.SomeDecorator
import com.wenger.natifetask4.patterns.SomeFactory
import com.wenger.natifetask4.patterns.adapter.WildTurkey

class MainActivity : AppCompatActivity() {

    private val adapter: TurkeyAdapter by lazy {
        val turkey = WildTurkey()
        TurkeyAdapter(turkey)
    }
    private val someDecorator: SomeDecorator by lazy {
        val someClass = SomeFactory().create()
        val secondClass = SecondClass()
        SomeDecorator(someClass, secondClass)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter.fly()
        adapter.quack()
        someDecorator.start(3)
    }
}