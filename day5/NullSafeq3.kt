fun UpperCaseOrNull(str: String?) {
    str?.let { 
        println(it.toUpperCase()) 
    }
    if (str == null) {
        println("String is null") 
    }
}

fun main() {
    UpperCaseOrNull("Kotlin") 
    UpperCaseOrNull(null)
}

