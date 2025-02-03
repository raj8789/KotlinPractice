class Car(var model: String, var year :Int=2020){
    var y:String =""
    constructor( y: String,model: String,year :Int ) : this(model,year) {
        this.y=y
    }
    fun printCarDetails(){
        print("Car Model=${model} Year=${year}")
    }
}

fun main() {
    val car1 = Car("Toyota")
    val car2 = Car("Thar", 2021)
    println("${car1.model}, ${car1.year}")
    println("${car2.model}, ${car2.year}")
 //   car1.printCarDetails()
    car2.printCarDetails()
}
