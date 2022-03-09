package com.example.q1

interface Bowler
{
    var wickets: Int
    var bowlRanking : Int

    open fun print()
    {
        println("Score: $wickets")
        println("Bat Ranking: $bowlRanking")
    }

    open fun getranking() : Int
    {
        return bowlRanking
    }
}
open class Bowl(var n : String = "NULL", var ag : Int = 0, var nation : String = "NULL", var wk : Int = 0 , var rank : Int = 0): Cricketer(n, ag, nation), Bowler
{
    override var wickets: Int = 0
        get() = wk
    override var bowlRanking: Int = 0
        get() = rank

    init {
        println("This is bowler class")
    }

    override fun getranking(): Int {
        return bowlRanking
    }

    override fun print() {
        println("Name: $name")
        println("Age : $age")
        println("Nationality: $nationality")
        super<Bowler>.print()
    }
}

