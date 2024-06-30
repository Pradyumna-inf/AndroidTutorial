fun newList(inputList: List<Int>,n:Int): List<Int> {
    val newList = mutableListOf<Int>()
    for (i in inputList) {
        if(i>=n){
        	newList.add(i)
        }
    }
    return newList
}
fun main() {
    val List = listOf(1, 2, 3, 4, 5)
    val newList = newList(List,4)
    println("Original List: $List")
    println("New List: $newList")
}

