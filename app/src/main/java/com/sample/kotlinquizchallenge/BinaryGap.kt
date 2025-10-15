package com.sample.kotlinquizchallenge

/*
* Find the longest sequence of consecutive zeros in binary representation surrounded by ones.
*
* // Input
* findBinaryGap(9)   // Binary: 1001
* findBinaryGap(529) // Binary: 1000010001
* findBinaryGap(32)  // Binary: 100000
*
* // Expected Output
* 9 → 2
* 529 → 4
* 32 → 0 (no gap surrounded by ones)
* */

fun findBinaryGap(n:Int): Int {
    val binary = Integer.toBinaryString(n)
    var maxGap = 0
    var currentGap = 0
    var counting = false

    for (char in binary){
        when (char){
            '1'-> {
                if (counting) {
                    maxGap = maxOf(maxGap, currentGap)
                }
                counting = true
                currentGap = 0
            }
            '0'-> {
                if (counting) {
                    currentGap++
                }
            }
        }
    }
    return maxGap
}

fun main() {
    println("9 -> ${findBinaryGap(9)}")
    println("529 -> ${findBinaryGap(529)}")
    println("32 → ${findBinaryGap(32)}")
}


