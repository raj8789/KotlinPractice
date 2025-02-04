open class AnimalNew {
    open fun makeSound() {
        println("Animal makes a sound")
    }
}

class DogNew : AnimalNew() {
    override fun makeSound() {
        println("Dog barks")
    }
}
fun main() {
    val myAnimal: DogNew = DogNew()
    myAnimal.makeSound()  // Output: Dog barks
}
