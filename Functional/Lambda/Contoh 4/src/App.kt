// main function
fun main() {
    printResult(20){ value ->
        value / value
    }
}

fun printResult(value: Int, slice: (Int) -> Int) {
    val result = slice(value)
    println(result)
}