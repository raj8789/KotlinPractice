import kotlin.properties.Delegates

class Person {
    //var name:String=""
    var name: String by Delegates.observable("Unknown"){_, oldValue, newValue ->
            println(oldValue)
            println(newValue)
    }
}
fun main() {
    val person = Person()
    person.name = "Raushan"
    person.name = "Biren"
}




