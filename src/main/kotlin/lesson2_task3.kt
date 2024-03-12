package org.example

fun main () {

    const val minute = 60
    val startHour = 9
    val startMinute = 39
    val travelTime = 457

    val startTime = (startHour * minute) + startMinute
    val finishTime = startTime + travelTime
    val finishHour = finishTime / minute
    val finishMinute = finishTime % minute

    print(finishHour)
    print(":")
    println(finishMinute)

}