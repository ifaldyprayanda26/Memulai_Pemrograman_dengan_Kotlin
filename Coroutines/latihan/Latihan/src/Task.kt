import kotlinx.coroutines.*

// TODO 1
suspend fun sum(valueA: Int, valueB: Int): Int {
    delay(3000L)
    val sumValue = valueA + valueB
    return sumValue
}

// TODO 2
suspend fun multiple(valueA: Int, valueB: Int): Int {
    delay(2000L)
    val multipleValue =  valueA * valueB
    return multipleValue
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(20, 20) }

    // TODO 3
    println("Result sum: ${resultSum.await()}")
    println("Result multiple: ${resultMultiple.await()}")
}