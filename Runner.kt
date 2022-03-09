package com.example.myapplication

fun main()
{
    println("Student 1: ")
    var St = Student(10, "Hamza", "Faisal Town 123", 32198999, "Student", 1, "CS", 2018, 5, "FAST", 3.1)
    println(St.register("SMD"))
    println(St.learn())
    println(St.attend("SMD"))
    println("Student Grade: ")
    println(St.getgrade("SMD"))
    println(" ")
    println("Staff 1:")
    var Stf = Staff(11, "Faez", "BOR Road", 32336788, "Technician", "Emp 1", "Technician", "Rs. 1000", 50000.0)
    println(Stf.register("NULL"))
    println("Salary in Rs: ")
    println(Stf.getSalary())
    println(Stf.attend("Lab Duty"))
    println(Stf.getPromotion())
    println(" ")

    println("PG Student 1: ")
    var Pg = PGStudent("18L-1004", "Data Science", 11, "Ali", "Faisal Town Block B", 32336789, "Student", 2, "DS", 2018, 5, "FAST", 3.63)
    println(Pg.submitthesis())
    println(" ")

    println("Technician 1: ")
    var tech = Technician("Lab Tech", 12, "Ahmed","Faisal Town Block A", 98766778, "Technician", "Emp 2", "Tch",  "Rs. 15000", 20000.0, 5)
    println(tech.install("Workstation"))
    println(tech.mantain("CS1"))
    println(" ")

    println("Faculty 1: ")
    var teach = Faculty("CS", "A", 60, "Phd", 13, "Sir", "teacher address", 97789, "Teacher", "Emp1", "Teacher", "0.0", 60000.00, 2 )
    println(teach.teach("SMD"))
    println(teach.assess(4))
}