class Outer{
   private var name:String="Unknown"
    fun Outerhello(){
        println("I am outer Hello")
    }
   inner class Inner{
        fun printVal(){
            Outerhello()
            println(name)
        }
    }
}
fun main(){
   var outer=Outer()
   var inner=outer.Inner()
   inner.printVal()
}
/*

 */