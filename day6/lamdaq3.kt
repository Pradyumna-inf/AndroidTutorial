//Write a Kotlin function that uses a lambda to create a closure. The function should return a lambda that adds a given number to its input.
fun addNumClosure(numAdd: Int): (Int) -> Int {
    return { num -> num + numAdd }
}

fun main() {
    val res = addNumClosure(5)
    
    println("Adding 5 and 10: ${res(10)}") 
    println("Adding 5 and 20: ${res(20)}")    
}

