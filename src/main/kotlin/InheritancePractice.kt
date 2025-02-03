open class Animal{
    var name:String="Animal"
   open fun eat(){
        println("I am eat() from Class Animal")
    }
}
open class Dog: Animal() {
    fun bark(){
        print(name)
        println("I am bark() from class Dog")
    }
    override fun eat() {
        super.eat()
        println("eat() From Dog")
    }
}
class Breed:Dog(){
   fun  breed(){
       super.eat()
       println("I am breed() from Breed Class")
   }
}
fun main(){
    var dog=Dog()
   // dog.eat()
    dog=Breed();
    dog.breed()
}