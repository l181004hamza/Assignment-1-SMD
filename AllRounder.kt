package com.example.q1

class AllRounder(var n1: String = "NULL", var ag1: Int = 0, var nation1: String = "NULL", var sc1 : Int = 0, var btrank : Int = 0 , var wk1: Int = 0 , var blrank : Int = 0, var rank : Int)
    :Batsman, Bowler, Cricketer(n1, ag1,nation1)
{
    var ranking : Int
    init {
        println("This is All Rounder")
        ranking = rank
    }
    override var score: Int = 0
       get() = sc1
    override var wickets: Int = 0
        get() = wk1
    override var batRanking: Int = 0
        get() = btrank
    override var bowlRanking: Int = 0
        get() = blrank

    override fun getranking(): Int {
        return ranking
    }

    override fun print() {
        println("Name: $name")
        println("Age : $age")
        println("Nationality: $nationality")
        super<Batsman>.print()
        super<Bowler>.print()

    }
}

fun main()
{
    var a = Bowl("Hamza", 19, "Indian", 100, 2)
    a.print()
    println("Bowler Ranking: ")
    println(a.getranking())
    var ar = AllRounder("Ali", 21, "Pakistani", 1000, 1, 400, 3, 2)
    ar.print()
    println("All Rounder Ranking: ")
    println(ar.getranking())
    var b = Bat("Hamza", 18, "Pakistani", 600, 1)
    println("Batsman Ranking: ")
    println(b.getranking())
    b.print()
}