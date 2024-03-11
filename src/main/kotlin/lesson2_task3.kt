package org.example

fun main () {

    val startHour = 9
    val startMinute = 39
    val startTime = (startHour * 60) + startMinute
    val travelTime = 457
    val finishTime = startTime + travelTime
    val finishHour = finishTime / 60
    val finishMinute = finishTime % 60

    print(finishHour)
    print(":")
    println(finishMinute)

}