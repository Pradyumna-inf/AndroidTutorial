//Write a Kotlin function that uses lambdas to perform a sequence of operations on a list of strings: filter the strings to include only those starting with a specific letter, convert them to uppercase, and then sort them alphabetically
fun pStr(list: List<String>, startingLetter: Char): List<String> {
    return list
        .filter { it.startsWith(startingLetter, ignoreCase = true) } // Filter strings starting with a specific letter
        .map { it.uppercase() }
        .sorted() 
}

fun main() {
    val strings = listOf("hello","kotlin","kite","python","kilometer")
    val pStr = pStr(strings, 'k')
    println(pStr)
}


