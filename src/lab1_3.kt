fun main() {
    print("Введите четырёхзначное число: ")
    val number = readLine()?.toIntOrNull()

    if (number != null && number in 1000..9999) {
        val digits = number.toString().toCharArray().joinToString(", ")
        println("Цифры числа: $digits")
    } else {
        println("Ошибка! Введите корректное четырёхзначное число.")
    }
}
