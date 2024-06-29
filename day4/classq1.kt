fun main() {
    val acc1 = BankAccount(1234, 20000)
    acc1.deposit(1000)
    acc1.withdraw(4000)
    var bal = acc1.checkBalance()
    println("Current balance: $bal")
}

class BankAccount(val accountNumber: Int, var balance: Int) {
    fun deposit(amt: Int) {
        balance += amt
        println("Deposited $amt.")
    }

    fun withdraw(amt: Int) {
        if (amt <= balance) {
            balance -= amt
            println("Withdrew $amt.")
        } else {
            println("Insufficient balance.")
        }
    }

    fun checkBalance(): Int {
        return balance
    }
}

