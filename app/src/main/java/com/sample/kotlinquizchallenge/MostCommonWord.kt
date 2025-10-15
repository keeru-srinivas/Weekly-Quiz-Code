package com.sample.kotlinquizchallenge

/*
* Find the most frequently occurring word, ignoring common stop words.
*
* // Input
* findMostCommonWord("The sun shines and the sky is blue and clear")
*
* // Expected Output
* "The sun shines and the sky is blue and clear" → "and"
*
* */

fun findMostCommonWord(text: String):String {
    val stopWords = setOf("the", "is", "a", "an", "and", "of", "to", "in", "on", "for", "with")
    val words = text
        .lowercase()
        .split(" ", ",", ".", "!", "?", ";", ":")
        .filter { it.isNotBlank() && it !in stopWords }
    if (words.isEmpty()) return "No valid words"
    val wordCount = words.groupingBy { it }.eachCount()
    val mostCommon = wordCount.maxByOrNull{it.value}?.key?: "No words found"

    return mostCommon

}
fun main() {
    val sentence = "The sun shines and the sky is blue and clear"
    println("\"$sentence\" → \"${findMostCommonWord(sentence)}\"")
}
