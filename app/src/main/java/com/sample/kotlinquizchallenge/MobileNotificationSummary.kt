package com.sample.kotlinquizchallenge

/*
*
* Write a function that takes the number of notifications a user has received and returns a summary string.
*
* Example
* -> 0 -> No Notifications
* -> 1-99 -> You have 3 Notifications
* -> 100+ -> You have Notifications 99+
* */

fun getNotificationSummary(count: Int): String{
    return when {
        count == 0 -> "No Notifications"
        count in 1..99 -> "You have $count Notification ${if(count > 1) "s" else ""}"
        else -> "You have 99+ Notifications"
    }
}

fun main(){
    print("Enter the number of notifications: ")
    val input = readLine()
    val count = input?.toIntOrNull()
    if (count == null|| count <0){
        println("Invalid input")
    }else{
        val summary = getNotificationSummary(count)
        println(summary)
    }

}
