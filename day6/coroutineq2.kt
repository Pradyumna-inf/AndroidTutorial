//Write a coroutine in Kotlin that handles exceptions during the execution of tasks.
import kotlinx.coroutines.*

fun main() = runBlocking {
    try {
        println("Starting task...")
        delay(500L)
        throw Exception("Something went wrong!")
    } catch (e: Exception) {
        println("Caught an exception: ${e.message}")
    } finally {
        println("Task completed.")
    }
}

