fun strList(inputList: List<String>): Map<String,Int>{
    val resultMap = mutableMapOf<String, Int>()
    for (str in inputList) {
        var length = 0
        for (char in str) {
            length++
        }
        resultMap[str] = length
    }
    return resultMap
}
fun main() {
    val List = listOf("apple", "banana", "mango")
    val resultMap= strList(List)
    println("$resultMap")
}

