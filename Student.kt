package com.example.myapplication

open class Student(
    adharid1: Int,
    name1: String,
    address1: String,
    phone1: Int=0,
    profession1: String,
    sid: Int=0,
    major: String="NULL",
    year: Int=0,
    semester: Int=0,
    college: String=" ",
    grade: Int=0)
    :Person(adharid1,name1,address1,phone1,profession1)
{
    var sid1: Int
    var major1: String
    var year1: Int
    var semester1: Int
    var college1: String
    var grade1: Int
    init
    {
        println("This is polymorphic class Student")
        college1=college
        sid1=sid
        major1=major
        year1=year
        semester1=semester
        grade1=grade
    }
    override fun register(course: Int): String
    {
        return "Course ID: $course is registered for Student: $sid1"
    }
    public open fun getgrade(Course: String):Int
    {
        return grade1
    }
    public fun attend(Course: String):String
    {
        return "Student $sid1 attended course $Course"
    }
    public fun learn():String
    {
        return "Student $sid1 is learning"
    }

}

fun main()
{
    var S1 = Student(10, "hamza", "address6969", 31216969, "nothing", 181004, "CS", 2018, 5, "Fast", 4)
    println(S1.register(2011))
    println(S1.attend("SMD"))
    println("Grade: ")
    println(S1.getgrade("SMD"))
    println(S1.learn())

}