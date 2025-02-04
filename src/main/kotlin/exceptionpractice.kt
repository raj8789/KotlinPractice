//fun main() {
//    try {
//        val result = 10 / 2
//        println(result)
//        println("&&&&&&&&&&&&&&&&")
//       // System.exit(0)
//    } catch (e: ArithmeticException) {
//        println("Exception caught: ${e.message}")
//    }
//    finally {
//        println("***************")
//    }
//    // var obj =Student()
//    // var obj :Student =Student()
//}


//fun checkAge(age: Int) {
//    if (age < 18) {
//        throw IllegalArgumentException("Age must be 18 or above.")
//    } else {
//        println("Access granted.")
//    }
//}
//fun main() {
//    try {
//        checkAge(16) // This will throw an exception
//    }catch (e:Exception){
//        print(e.message)
//    }
//}


//class MyException(message: String) : Exception(message)
//fun main() {
//    throw MyException("This is a custom exception")
//}


fun main() {
    try {
        val list = listOf(1, 2, 3)
        println(list[5]) // IndexOutOfBoundsException
    }
    catch (e: ArithmeticException) {
        println("Arithmetic Exception: ${e.message}")
    } catch (e: IndexOutOfBoundsException) {
        println("IndexOutOfBoundsException: ${e.message}")
    } catch (e:Exception){

    }
}