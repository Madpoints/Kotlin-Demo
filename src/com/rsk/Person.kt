package com.rsk

class Person(var Name: String) {
    fun displayName() {
        println("Name is $Name")
    }

    fun displyWithLambda(func: (s:String) -> Unit) {
        func(Name)
    }
}