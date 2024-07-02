//Write a Kotlin program that uses map, filter, and reduce functions with lambdas to process a list of numbers. First, square all the numbers, then filter out the even numbers, and finally sum the remaining numbers.

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val squaredNumbers = numbers.map { it * it }

    val oddSquaredNumbers = squaredNumbers.filter { it % 2 != 0 }

    val sum = oddSquaredNumbers.reduce { a, num -> a + num }

    println("Sum of filtered odd squared numbers: $sum")
}

