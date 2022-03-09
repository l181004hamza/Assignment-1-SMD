package com.example.myapplication

abstract class Person(var AID: Int=0, var N: String="NULL", var Ad: String="NULL", var PH: Int=0, var Prof: String="NULL")
{
    var adharid: Int
    var name: String
    var address: String
    var phone: Int
    var profession: String
    init {
        println("This is abstract class Person")
        this.adharid=AID
        this.name=N
        this.address=Ad
        this.phone=PH
        this.profession=Prof
    }

    public open fun register(UID: Int): String {
        return "The Person is Registered: $UID"
    }
    public fun perform(duty: String): String
    {
        return "Person $name Performed $duty"
    }
    public fun include(service: String): String
    {
        return "Service $service included to Person $name with Id: $adharid"
    }
    public fun like(item: String): String
    {
        return "Person Id: $adharid likes Item: $item"
    }
}

