//Create a custom exception class in Kotlin called InvalidAgeException. Write a function that checks a person's age and throws InvalidAgeException if the age is less than 18.
class InvalidAgeException(message: String) : Exception(message)

fun checkAge(age: Int) {
    if (age < 18) {
        throw InvalidAgeException("Age must be 18 or older.")
    } else {
        println("Age $age is valid.")
    }
}

fun main() {
    try {
        checkAge(20) 
        checkAge(15) 
    } catch (e: InvalidAgeException) {
        println("Error: ${e.message}")
    }
}

