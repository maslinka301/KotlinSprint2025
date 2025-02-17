package lesson_3

fun main() {

    val incomingInfo = "D2-D4;0"

    val initialSquare = incomingInfo.substring(0, 2)
    val finalSquare = incomingInfo.substring(3, 5)
    val strokeNumber = incomingInfo.substring(6)
    println(initialSquare)
    println(finalSquare)
    println(strokeNumber)


}