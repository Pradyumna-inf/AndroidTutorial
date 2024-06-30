class Person(val Name:String,val Age:Int)
fun main() {
    val persons = listOf(
        Person("Alice", 25),
        Person("Alan", 30),
        Person("Nathan", 20),
        Person("Arthur", 25),
        Person("Victor", 22)
    )
    val sortAge = persons.sortedBy { it.Age }
    
   
    val sortPersons = sortAge.sortedBy { it.Name }
    
    
    sortPersons.forEach { println("${it.Name} - ${it.Age}") }
}

