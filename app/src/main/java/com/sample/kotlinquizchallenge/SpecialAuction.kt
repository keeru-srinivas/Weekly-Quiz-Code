package com.sample.kotlinquizchallenge

/*
*
* Implement an auction bidding system where new bids must be higher than current bid.
*
* // Input
* placeBid(50)  // First bid
* placeBid(30)  // Too low
* placeBid(75)  // Valid higher bid
*
* // Expected Output
* 50 → 50 (accepted)
* 30 → null (rejected)
* 75 → 75 (accepted)
* */

var currentBid: Int? = null   // keeps track of the highest bid so far

fun placeBid(newBid: Int): Int? {
    return if (currentBid == null || newBid > currentBid!!) {
        currentBid = newBid     // update the current highest bid
        currentBid              // return the accepted bid
    } else {
        null                    // reject if not higher
    }
}

fun main() {
    println("50 → ${placeBid(50)}")  // first bid (accepted)
    println("30 → ${placeBid(30)}")  // lower bid (rejected → null)
    println("75 → ${placeBid(75)}")  // higher bid (accepted)
}