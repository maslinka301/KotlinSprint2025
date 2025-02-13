package lesson_2

fun main() {

    val minutesInHour = 60

    val travelTime = 457
    val departureTimeFromServer = "9:39"

    val partsOfDepartureTime = departureTimeFromServer.split(":")
    val departureTimeInMinutes = partsOfDepartureTime[1].toInt() + partsOfDepartureTime[0].toInt() * minutesInHour

    val arriveTimeInMinutes = departureTimeInMinutes + travelTime

    val arriveTimeHours = arriveTimeInMinutes / minutesInHour
    val arriveTimeMinutes = arriveTimeInMinutes - arriveTimeHours * minutesInHour

    println("%02d:%02d".format(arriveTimeHours, arriveTimeMinutes))

}