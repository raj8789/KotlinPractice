class BankAccount(private var accountHolder: String, private var balance: Double) {
    fun getAccountHolder(): String {
        return accountHolder
    }
    fun setAccountHolder(name: String) {
        if (name.isNotBlank()) {
            accountHolder = name
        } else {
            println("Invalid name")
        }
    }

    fun getBalance(): Double {
        return balance
    }

    fun deposit(amount: Double) {
       // var balance:Double=0.0
        if (amount > 0) {
            this.balance += amount
            println("Deposited: $$amount. New Balance: $$balance")
        } else {
            println("Invalid deposit amount")
        }
    }
    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrew: $$amount. Remaining Balance: $$balance")
        } else {
            println("Invalid withdrawal amount or insufficient funds")
        }
    }
}

fun main() {
    val account = BankAccount("Sonu Yadav", 500.0)
    println("Account Holder: ${account.getAccountHolder()}")
    println("Initial Balance: ${account.getBalance()}")
    account.deposit(200.0)
    account.withdraw(100.0)
    account.setAccountHolder("Mrigendra Singh")
    println("Updated Account Holder: ${account.getAccountHolder()}")
}
