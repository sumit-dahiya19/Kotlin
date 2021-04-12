//higher order functions
fun printfilterstring(list:List<String>,predicate:((String)->Boolean)?){
    list.forEach{
        if(predicate?.invoke(it)==true){
            println(it)
        }
    }
}

//function name as a variable
val predicate:(String)-> Boolean = {
    it.startsWith("J")
}
fun getprintpredicate():(String)->Boolean{
    return {it.startsWith("J")}
}
fun main() {
    val list= listOf<String>("Kotlin","Java","C++","JavaScript")
    //printfilterstring(list,{it.startsWith("J")})

    printfilterstring(list){
        it.startsWith("K")
    }

    //printfilterstring(list,predicate)
    printfilterstring(list,getprintpredicate())

}