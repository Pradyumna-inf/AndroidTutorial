fun main() {
    isPalindrome("kotlin") 
    isPalindrome("madam")  
}

fun isPalindrome(str: String) {
    var len = 0
    for (char in str) {
        len++
    }

    for (i in 0 until len / 2) {
        if (str[i] != str[len - i - 1]) {
            println("${str} is not a palindrome")
            return
        }
    }
    println("${str} is a palindrome")
}

