package lesson_2

import kotlin.math.pow


fun main() {

    val initialAmount = 70_000
    val interestRate = 16.7
    val termOfTheInvestment = 20

    val futureAmount = initialAmount * (1 + interestRate / 100).pow(termOfTheInvestment)

    println("%.3f".format(futureAmount))
}