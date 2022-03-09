package com.example.q1

interface Batsman
{
    var score: Int
    var batRanking : Int


    open fun print()
    {
        println("Score: $score")
        println("Bat Ranking: $batRanking")
    }

    open fun getranking() : Int
    {
        return batRanking
    }

}

open class Bat(var n : String = "NULL", var ag: Int = 0 , var nation: String = "NULL" , var sc : Int = 0, var brank : Int = 0): Cricketer(n, ag, nation), Batsman
{
    override var score: Int =0
        get() = sc

    override var batRanking: Int = 0
        get() = brank

    override fun print() {
        super<Batsman>.print()
        println("Name: $name")
        println("Age : $age")
        println("Nationality: $nationality")
    }

    override fun getranking(): Int {
        return batRanking
    }
}

