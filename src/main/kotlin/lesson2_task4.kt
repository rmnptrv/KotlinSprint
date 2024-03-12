package org.example

fun main () {

    val crystal = 7
    val metall = 11

    val buff = 20.0 / 100

    val crystalBuff = (crystal * buff).toInt()
    var metalBuff = (metall * buff).toInt()

    print("Кристал ")
    println(crystalBuff)
    print("Металл ")
    println(metalBuff)

}