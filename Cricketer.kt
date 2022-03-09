package com.example.q1

open class Cricketer(var name1: String = "NULL", var age1: Int = 0, var nationality1: String = "NULL") {

    var name : String
    var age : Int
    var nationality : String

    init{
        println("This is Cricketer Class")
        name = name1
        age = age1
        nationality = nationality1

    }

    open fun print()
    {
        println("Name: $name")
        println("Age : $age")
        println("Nationality: $nationality")
    }

}
