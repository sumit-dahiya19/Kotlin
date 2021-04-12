internal class Person (val first_name:String="Sumit",val last_name:String="Dahiya"){

    //public by default
    //internal -> public within the module
    //private-> only avilable in the file in which it is implemented
    //protected-> only avilalbe within this class and within subclasses

    protected var nickname:String?=null

        //custom setter
        set(value) {
            field=value
            println("log messages:new nickname is $value")
        }
        //custom getter
        get(){
            println("the return value is $field")
            return field
        }

    /*val firstName:String = first_name
    val lastName:String=last_name

    init{
        firstName=first_name
        lastName=last_name
    }
     */
    init{
        println("inti block 1")
    }
    fun call(){
        println("Class body")}

    constructor():this("Called if ","Primary not called"){
        println("Secondary contrcutor ")
    }

    init {
        println("inti block 2")
    }
    //init block before secondry constructor

    fun printInfo(){
        var nickname=if(nickname!=null) nickname else "no nickname"
        nickname=nickname?:"no nickname"// elvis operator
        println("$first_name $last_name nickname is : $nickname")
    }
}
fun main() {
    val obj=Person("Sumit","Dahiya")
    obj.printInfo()
    //property access syntax
    obj.last_name
    obj.first_name

    val obj_sec=Person()
    obj.nickname="sumii"
    //obj.nickname="shyam"
    println(obj.nickname)
    obj.printInfo()



}