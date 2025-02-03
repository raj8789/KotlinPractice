fun main() {
//    try {
//        val result = 10 / 0
//        println(result)
//    } catch (e: ArithmeticException) {
//        println("Exception caught: ${e.message}")
//    }
    print(10/0)
    System.exit(0)
}

//fun main() {
//    try {
//        val result = 10 / 2
//        println(result)
//    } catch (e: Exception) {
//        println("Exception: ${e.message}")
//    } finally {
//        println("Execution completed.")
//    }
//}


//fun checkAge(age: Int) {
//    if (age < 18) {
//        throw IllegalArgumentException("Age must be 18 or above.")
//    } else {
//        println("Access granted.")
//    }
//}
//fun main() {
//    checkAge(16) // This will throw an exception
//}


//class MyException(message: String) : Exception(message)
//fun main() {
//    throw MyException("This is a custom exception")
//}


//fun main() {
//    try {
//        val list = listOf(1, 2, 3)
//        println(list[5]) // IndexOutOfBoundsException
//    } catch (e: ArithmeticException) {
//        println("Arithmetic Exception: ${e.message}")
//    } catch (e: IndexOutOfBoundsException) {
//        println("IndexOutOfBoundsException: ${e.message}")
//    }
//}