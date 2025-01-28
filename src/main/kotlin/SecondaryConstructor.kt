class Student(val name: String, val grade: Int) {
    var age: Int = 0
    constructor(name: String, grade: Int, age: Int) : this(name, grade) {
        this.age = age
        println("Student's name is $name, grade is $grade, and age is $age")
    }
}

fun main() {
    val student = Student("Bob", 10, 15)
}
