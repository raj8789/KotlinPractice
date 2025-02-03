
class Singleton private constructor(val message: String) {
    companion object {
        private var instance: Singleton? = null

        fun getInstance(msg: String): Singleton {
            if (instance == null) {
                instance = Singleton(msg)
            }
            return instance!!
        }
    }
}
fun main() {
    val obj = Singleton.getInstance("Hello, Singleton!")
    println(obj.message) // Output: Hello, Singleton!
}
