fun main() {
    val sequenceNumber = generateSequence(6) { it + 1 }
    sequenceNumber.take(8).forEach { print("$it ") }
}