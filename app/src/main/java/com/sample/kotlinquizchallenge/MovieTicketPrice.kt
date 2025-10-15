package com.sample.kotlinquizchallenge

/*
*
* Create a function that calculates movie ticket price based on age and showtime.
*
* // Input
* calculateTicketPrice(age = 25, isMatinee = false) // Adult, evening
* calculateTicketPrice(age = 70, isMatinee = true)  // Senior, matinee
* calculateTicketPrice(age = 8, isMatinee = false)  // Child, evening
*
* // Expected Output
* 25, false → 15
* 70, true → 8
* 8, false → 8
*
* */

fun calculateTicketPrince(age: Int, isMatinee: Boolean): Int {
    return when{
        age<13 -> if (isMatinee) 6 else 8
        age in 13..64 -> if (isMatinee) 10 else 15
        age>=65 -> if (isMatinee) 8 else 12
        else -> 0

    }
}

fun main(){
    println("25, false → ${calculateTicketPrince(25, false)}")
    println("70, true → ${calculateTicketPrince(70, true)}")
    println("8, false → ${calculateTicketPrince(8, false)}")
}

