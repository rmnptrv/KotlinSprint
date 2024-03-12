package org.example

fun main () {

    val crystal = 7
    val metall = 11
    val percentFull = 100
    val percetn = 20.0

    val buff = percetn / percentFull

    val crystalBuff = (crystal * buff).toInt()
    var metalBuff = (metall * buff).toInt()

    print("Кристал ")
    println(crystalBuff)
    print("Металл ")
    println(metalBuff)


}