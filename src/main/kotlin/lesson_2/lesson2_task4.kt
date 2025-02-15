package lesson_2


fun main() {

    val buffInPercent = 20
    val buffForCalculations = buffInPercent.toDouble() / 100

    val extractedCrystalOre = 7
    val extractedIronOre = 11

    val extractedCrystalOreBuffPoints = (extractedCrystalOre * buffForCalculations).toInt()
    val extractedIronOreBuffPoints = (extractedIronOre * buffForCalculations).toInt()

    println("Бонусные очки кристаллической руды: $extractedCrystalOreBuffPoints")
    println("Бонусные очки железной руды: $extractedIronOreBuffPoints")

}