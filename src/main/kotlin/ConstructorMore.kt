class Employee(val name: String, val id: Int) {
    var department: String = "Unknown"
    constructor(name: String, id: Int, department: String) : this(name, id) {
        this.department = department
    }

    fun displayInfo() {
        println("Name: $name, ID: $id, Department: $department")
    }
}

fun main() {
    val emp1 = Employee("Raushan", 101)
    val emp2 = Employee("Biren Yadav", 102, "Chef")
   // print((emp1.))

    emp1.displayInfo()
    emp2.displayInfo()
}
