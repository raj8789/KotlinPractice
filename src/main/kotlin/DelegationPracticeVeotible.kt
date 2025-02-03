import kotlin.properties.Delegates

class Person2 {
//    var age: Int by Delegates.vetoable(0) { _, old, new ->
//        new >= 18  // Only allow values greater than or equal to 18
//    }
    var age: Int by Delegates.vetoable(0){_, oldValue, newValue -> newValue>=18  }
}

fun main() {
    val person = Person2()
    person.age = 25  // Age is valid
    println("Person's age: ${person.age}")  // Output: Person's age: 25

    person.age = 17  // This won't be allowed
    println("Person's age: ${person.age}")  // Output: Person's age: 25
}
