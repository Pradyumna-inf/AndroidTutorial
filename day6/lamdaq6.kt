//Write a Kotlin function that uses a lambda to calculate the factorial of a given number. The lambda should be assigned to a variable, and the function should use this lambda to compute the factorial.
fun calcFact(n: Int): Long {
    val fact: (Int) -> Long = { num ->
        if (num == 0 || num == 1) 1 else num * calcFact(num - 1)
    }

    return fact(n)
}

fun main() {
    val number = 6
    val factRes = calcFact(number)
    println("Factorial of $number is: $factRes")
}

