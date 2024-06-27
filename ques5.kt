fun main() {
    val number = "2024"  
	var length=0
    var isDuck = false
    for (char in number) {
        length++
    }
    if (number[0] != '0') {
        for (i in 1 until length) {
            if (number[i] == '0') {
                isDuck = true
                break  
            }
        }
    }
    if (isDuck) {
        println("$number is a Duck number.")
    } else {
        println("$number is not a Duck number.")
    }
}
