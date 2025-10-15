package com.sample.kotlinquizchallenge

/*
* Return a new array where each element is the sum of all previous elements.
*
* // Input
* runningSum(intArrayOf(1, 2, 3, 4))
* runningSum(intArrayOf(3, 1, 2, 10, 1))
*
* // Expected Output
* [1, 2, 3, 4] → [1, 3, 6, 10]
* [3, 1, 2, 10, 1] → [3, 4, 6, 16, 17]
* */

fun runningSum(nums: IntArray): IntArray {
    val result = IntArray(nums.size) // new array to store running totals
    var sum = 0

    for (i in nums.indices) {
        sum += nums[i]        // keep adding each element
        result[i] = sum       // store the current total
    }

    return result
}

fun main() {
    val arr1 = intArrayOf(1, 2, 3, 4)
    val arr2 = intArrayOf(3, 1, 2, 10, 1)

    println("${arr1.toList()} → ${runningSum(arr1).toList()}")
    println("${arr2.toList()} → ${runningSum(arr2).toList()}")
}