//Write a simple coroutine in Kotlin that prints "Hello" and then "World" after a 1-second delay.
import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000L)
        println("World")
    }
    println("Hello")
}


