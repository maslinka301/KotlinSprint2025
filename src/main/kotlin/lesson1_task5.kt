fun main() {

    val secondsInMinutesAndMinutesInHours = 60

    var seconds = 6480
    val hours: Byte = (seconds / (secondsInMinutesAndMinutesInHours * secondsInMinutesAndMinutesInHours)).toByte()
    seconds %= (secondsInMinutesAndMinutesInHours * secondsInMinutesAndMinutesInHours)
    val minutes: Byte = (seconds / secondsInMinutesAndMinutesInHours).toByte()
    seconds %= secondsInMinutesAndMinutesInHours

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}