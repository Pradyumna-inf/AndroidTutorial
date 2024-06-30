fun filterStr(list: List<Any>): List<String> {
    val resultList = mutableListOf<String>()
    for (element in list) {
        (element as? String)?.let { resultList.add(it) }
    }
    return resultList
}

fun main() {
    val list: List<Any> = listOf(1, "Kotlin", 2, "banana", 3.0,"Python")
    val strings = filterStr(list)
    println(strings)  
}
