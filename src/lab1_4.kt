fun main() {
    val totalDays: Int = 2642

    val years = totalDays / 365
    val remainingDaysAfterYears = totalDays % 365
    val weeks = remainingDaysAfterYears / 7
    val days = remainingDaysAfterYears % 7

    println("В $totalDays днях: -  Лет: $years, Недель: $weeks, Дней: $days")
}
