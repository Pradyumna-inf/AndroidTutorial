fun main() {
    val n1 = 12
    val n2 = 6
    var a = n1
    var b = n2

    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }

    println("The GCD of $n1 and $n2 is $a.")
}
