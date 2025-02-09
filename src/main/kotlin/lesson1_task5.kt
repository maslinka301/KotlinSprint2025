fun main() {
    var seconds = 6480
    val hours: Byte = (seconds / 3600).toByte()
    seconds %= 3600
    val minutes: Byte = (seconds / 60).toByte()
    seconds %= 60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}