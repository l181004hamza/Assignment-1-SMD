package com.example.myapplication

open class Staff(adharid1: Int,
                 name1: String,
                 address1: String,
                 phone1: Int,
                 profession1: String,
                 empid1: String="NULL",
                 emprole1: String="NULL",
                 empdept1: String="NULL",
                 empSalary1: Double=0.0,
                 empExperience1: Int=0
):Person(adharid1,name1,address1,phone1,profession1)
{
    var empid: String
    var emprole: String
    var empdept: String
    var empsalary: Double = 0.0
    var empexperience: Int = 0
    init
    {
        println("This is polymorphic class Staff")
        empid=empid1
        empexperience=empExperience1
        empsalary=empSalary1
        empdept=empdept1
        emprole=emprole1


    }
    public fun attend(Duty: String):String
    {
        return "Employee $empid performed task $Duty"
    }
    public fun getPromotion():String
    {
        return "Employee $empid got promoted"
    }
    public fun getSalary():Double
    {
        return empsalary
    }
}

