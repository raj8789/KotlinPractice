sealed class Shape {
    class Circle(var radius:Float): Shape() {
        fun calcArea(){
            println("Area${3.14*radius*radius}")
        }
    }
}
class Rect(var length:Int,var breadth:Int):Shape(){

}
fun main(){

}