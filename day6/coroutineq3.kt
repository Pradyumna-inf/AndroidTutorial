//Write a Kotlin program using coroutines that performs a long-running task but cancels it if it takes more than 2 seconds to complete. Use the withTimeout function to achieve this.
import kotlinx.coroutines.*

fun main() = runBlocking {
    try {
        withTimeout(2000L) {
            println("Starting task...")
    		delay(3000L)
    		println("task completed.")
        }
    } catch (e: TimeoutCancellationException) {
        println("IT WAS CANCELLED AS IT TAKING SO LONG DURATION.")
    }
}


