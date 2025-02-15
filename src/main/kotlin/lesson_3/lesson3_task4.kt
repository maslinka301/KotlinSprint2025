package lesson_3

fun main() {

    var initialSquare = "E2"
    var finalSquare = "E4"
    var strokeNumber = 1

    var progressRecord = "$initialSquare-$finalSquare;$strokeNumber"
    println(progressRecord)

    initialSquare = "D2"
    finalSquare = initialSquare[0].toString() + (initialSquare[1] + 1).toString()
    strokeNumber += 1

    progressRecord = "$initialSquare-$finalSquare;$strokeNumber"
    println(progressRecord)

}