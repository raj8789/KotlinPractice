class DataHiding {
    private var x:Int=0
    fun setX( x:Int){
        this.x=x;
    }
    fun getX():Int{
        return x;
    }

}
fun main(){
    var d=DataHiding();
    //print(d.x)
    d.setX(30)
    print(d.getX())
}