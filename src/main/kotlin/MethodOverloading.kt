class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
    fun add(a: Double, b: Double): Double {
        return a + b
    }
    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
}
fun main() {
    val calc = Calculator()
    println(calc.add(5, 10))
    println(calc.add(5.5, 10.5))
    println(calc.add(1, 2, 3))
}
