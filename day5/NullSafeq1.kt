fun getLen(str: String?): Int {
    return str?.length ?: -1
}
fun main() {
    val str1: String? = "Kotlin"
    val str2: String? = null
    
    println(getLen(str1))  
    println(getLen(str2))  
}

