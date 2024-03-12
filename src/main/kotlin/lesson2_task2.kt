package org.example

fun main () {

    val stuff = 50
    val paymentStuff = 30000
    val trainees = 30
    val stuffTrainees = 20000
    val costsStuff = stuff * paymentStuff
    val costsTrainess = trainees * stuffTrainees
    val costsAll = costsTrainess + costsStuff
    val allStuff = stuff + trainees
    val avaragePayments = costsAll / allStuff

    println(costsStuff)
    println(costsAll)
    println(avaragePayments)

}