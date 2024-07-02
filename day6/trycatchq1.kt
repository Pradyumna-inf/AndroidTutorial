//Write a Kotlin function that takes two integers and divides the first by the second. Use a try-catch block to handle any potential division by zero exceptions and return a meaningful error message.
fun main() {
    divide(10, 2)  
    divide(10, 0)  
}

fun divide(a: Int, b: Int) {
    try {
        val result = a / b
        println("Result: $result")
    } catch (e: ArithmeticException) {
        println("Error: Division by zero is not allowed.")
    }
}

