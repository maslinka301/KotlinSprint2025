package lesson_2


fun main() {

    val buff = 0.2

    val extractedCrystalOre = 7
    val extractedIronOre = 11

    val extractedCrystalOreBuffPoints = (extractedCrystalOre * buff).toInt()
    val extractedIronOreBuffPoints = (extractedIronOre * buff).toInt()

    println("Бонусные очки кристаллической руды: $extractedCrystalOreBuffPoints")
    println("Бонусные очки железной руды: $extractedIronOreBuffPoints")

}