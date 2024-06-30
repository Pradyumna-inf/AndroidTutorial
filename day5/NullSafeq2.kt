fun filterNonNullInt(list: List<Int?>): List<Int> {
    return list.filterNotNull()
}
fun main() {
    val List = listOf(null,2, 3, null, 5, null,6)
    val nonNullList = filterNonNullInt(List)
    
    println("Original List: $List")
    println("Non-null Integers: $nonNullList")
}


