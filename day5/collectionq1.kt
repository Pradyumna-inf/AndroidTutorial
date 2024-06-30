fun reverseList(inputList: List<Int>): List<Int> {
    val reversedList = mutableListOf<Int>()
    for (i in inputList) {
        reversedList.add(0,i)
    }
    return reversedList
}
fun main() {
    val List = listOf(1, 2, 3, 4, 5)
    val reversedList = reverseList(List)
    println("Original List: $List")
    println("Reversed List: $reversedList")
}

