//Write a Kotlin function that accesses an array element by index. Use a finally block to print a message indicating the end of the operation, regardless of whether an exception was thrown.
fun accessArrayElement(arr: Array<Int>, i: Int) {
    try {
        val element = arr[i]
        println("Element at index $i is: $element")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Error: Index $i is out of bounds.")
    } finally {
        println("End of array access operation.")
    }
}

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    accessArrayElement(arr, 2)  
    accessArrayElement(arr, 10)
}
