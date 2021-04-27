data class A(var a:Int=0) {



}

fun main() {
    var obj1=A(5)
    var obj2=A(10)
    var ans=obj1+obj2
    println(ans.a)
    var ans1=obj1-obj2
    println(ans1.a)
    obj1++
    println(obj1.a)
    obj1--
    println(obj1.a)

}
operator fun A.plus(obj:A):A{
    println("+ operator overload")
    var new=A()
    new.a=this.a+obj.a
    return new
}
operator fun A.minus(obj:A):A{
    println("- operator overloading ")
    var new=A()
    new.a=this.a-obj.a
    return new
}
operator fun A.inc()=A(a+1)
operator fun A.dec():A{
    println("Called -- ")
    return A(a-1)
}

