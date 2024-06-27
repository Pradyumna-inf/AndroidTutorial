fun main() {
    val number = 153
    var temp = number
    var sum = 0
    var digits = 0

    
    while (temp != 0) {
        digits++
        temp /= 10
    }

    temp = number

    
    while (temp != 0) {
        val digit = temp % 10
        var powerSum = 1
        for (i in 1..digits) {
            powerSum *= digit
        }
        sum += powerSum
        temp /= 10
    }
    if (sum == number) {
        println("$number is an Armstrong number.")
    } else {
        println("$number is not an Armstrong number.")
    }
}
