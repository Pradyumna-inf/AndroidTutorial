fun isSubset(list1: List<Int>, list2: List<Int>): Boolean {
    for (element in list1) {
        if (element !in list2) {
            return false
        }
    }
    return true
}

fun main() {
    val list1 = listOf(1,3,4)
    val list2 = listOf(3, 2, 1, 4, 5)
    
    println(isSubset(list1, list2))
}

