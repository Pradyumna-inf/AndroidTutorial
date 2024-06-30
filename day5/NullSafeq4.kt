data class User(val name:String?,val email:String?)
fun printDetailorNull(user:User){
    if (user.name == null || user.email == null) {
        println("Incomplete User")
    } 
    else {
        println("User Details:")
        println("Name: ${user.name}")
        println("Email: ${user.email}")
    }
}
fun main() {
    val user1 = User("Alan wake", "Alan.wake@example.com")
    val user2=User(null,"Arthur.rdr@gmail.com")
    printDetailorNull(user1)
    printDetailorNull(user2)
}
