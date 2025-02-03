class DatabaseConnection {
    val connection: String by lazy {
        println("Initializing connection...")
        "Database Connection Established"
    }
}

fun main() {
    val db = DatabaseConnection()

    println("Before accessing connection")
    println(db.connection)  // Output: Initializing connection... Database Connection Established
    println(db.connection)  // Output: Database Connection Established (No initialization)
}
