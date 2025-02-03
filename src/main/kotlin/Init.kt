class Rectangle(val width: Int, val height: Int) {
    val area: Int
    var x:Int
    constructor(x:Int,w:Int,h: Int):this(w, h){
        this.x=x
    }
    constructor() : this(1,1) {

    }

    init {
        x=10
        require(width > 0 && height > 0) { "Width and height must be positive" }
        area = width * height
    }
}
fun main() {
    var r=Rectangle()
    println(r.area)
    val rect = Rectangle(5, 10)
    println("Area: ${rect.area}") // Output: Area: 50
}
