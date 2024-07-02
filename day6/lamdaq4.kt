//Write a Kotlin function that takes another function as a parameter and uses it to transform a list of strings.
fun transformStrings(list: List<String>, transform: (String) -> String): List<String> {
    return list.map(transform)
}

fun main() {
    val strings = listOf("pradyumna","raj","swaraj","lalit","rishu")
    val upperCaseStrings = transformStrings(strings) { it.uppercase() }
    println(upperCaseStrings)
}
