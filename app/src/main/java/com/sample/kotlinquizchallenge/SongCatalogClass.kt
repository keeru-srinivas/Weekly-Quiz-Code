package com.sample.kotlinquizchallenge

/*
*
* Create a Song class with properties and computed properties.
*
* // Input
* val song = Song("Bohemian Rhapsody", "Queen", 2500000, 354)
*
* // Expected Output
* song.formattedDuration → "05:54"
* song.isPopular() → true
*
* */

class Song(
    val title: String,
    val artist: String,
    val playCount: Int,
    val durationInSeconds: Int
) {
    val formattedDuration: String
        get() {
            val minutes = durationInSeconds / 60
            val seconds = durationInSeconds % 60
            return String.format("%02d:%02d", minutes, seconds)
        }

    fun isPopular(): Boolean {
        return playCount >= 1000000
    }
}

fun main() {
    val song = Song("Bohemian Rhapsody", "Queen", 2_500_000, 354)

    println("Title: ${song.title}")
    println("Artist: ${song.artist}")
    println("Play count: ${song.playCount}")
    println("Duration: ${song.formattedDuration}")
    println("Is popular? → ${song.isPopular()}")
}
