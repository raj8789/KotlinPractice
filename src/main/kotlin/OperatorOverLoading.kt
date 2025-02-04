class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
    operator fun minus(other: Point){
        var temp=Point(this.x-other.x,this.y-other.y)
        println(" "+temp.x+"   "+temp.y)
    }
}

fun main() {
    val p1 = Point(2, 3)
    val p2 = Point(4, 5)
    val result = p1 + p2  // Calls plus function
    p1-p2
    println("Result: (${result.x}, ${result.y})") // Output: (6, 8)
}
