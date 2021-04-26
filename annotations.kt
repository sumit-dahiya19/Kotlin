@Target(AnnotationTarget.CONSTRUCTOR, AnnotationTarget.LOCAL_VARIABLE)
annotation class AnnotationDemo2

class ABC @AnnotationDemo2 constructor(val count:Int){
    fun display(){
        println("Constructor annotated")
        println("Count is $count")
    }
}
fun main(){
    val obj =  ABC(5)
    obj.display()
    @AnnotationDemo2 val message: String
    message = "Hello"
    println("Local parameter annotated")
    println(message)
}