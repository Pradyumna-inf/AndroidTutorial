fun sumOfList(numbers: List<Int>): Int {
    var sum = 0
    for (n in numbers) {
        sum += n
    }
    return sum
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    println("The sum of the list is: ${sumOfList(list)}")
}

