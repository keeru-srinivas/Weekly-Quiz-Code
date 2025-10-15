package com.sample.kotlinquizchallenge

/*
*
* Write a function that removes all vowels from a string, case-insensitive.
*
* // Input
* removeVowels("Hello World")
* removeVowels("Kotlin Programming")
*
* // Expected Output
* "Hello World" → "Hll Wrld"
* "Kotlin Programming" → "Ktln Prgrmmng"
* */

fun removeVowels(input: String): String {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    return input.filter { it.lowercaseChar() !in vowels }
}

fun main() {
    println("\"Hello World\" → \"${removeVowels("Hello World")}\"")
    println("\"Kotlin Programming\" → \"${removeVowels("Kotlin Programming")}\"")
}