package com.example.myapplication

class Faculty(faculty_special: String="NULL" ,
              section: String="NULL",
              noofstudents: Int=0,
              qualification: String="NULL",
              adharid1: Int,
              name1: String,
              address1: String,
              phone1: Int,
              profession1: String,
              empid1: String,
              emprole1: String,
              empdept1: String,
              empSalary1: Double,
              empExperience1: Int):Staff(adharid1,name1,address1, phone1,profession1,empid1,emprole1,empdept1,empSalary1,empExperience1)
{
    var faculty_special1: String
    var section1: String
    var noofstudents1: Int
    var qualification1: String
    init
    {
        println("This is concrete class Faculty")
        faculty_special1=faculty_special
        section1=section
        noofstudents1=noofstudents
        qualification1=qualification
    }
    public fun teach(Course:String):String
    {
        return "Teacher Id: $empid is teaching $Course"
    }
    public fun assess(grade:Int):String
    {
        return "Teacher Id: $empid marked grade: $grade"
    }
}
