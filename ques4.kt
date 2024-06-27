fun main() {
    val input = "Hello, World!"
    val frequency = IntArray(256) { 0 } 
    
    for (char in input) {
        val index = char.toInt()
        frequency[index]++
    }
    
    for (i in 0 until 256) {
        if (frequency[i] != 0) {
            println("${i.toChar()} : ${frequency[i]}")
        }
    }
}
