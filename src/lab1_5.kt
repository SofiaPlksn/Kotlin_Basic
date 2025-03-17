fun main() {
    print("Введите число: ")
    val n = readLine()?.toIntOrNull()

    if (n != null) {
        val result = "$n${n * 2}"
        println("Результат: $result")
    } else {
        println("Ошибка! Введите корректное число.")
    }
}
