fun main() {
    val person=Person("sumit",22)
    val (name,age)=person
    println(name+age)


    //map
    val map = mutableMapOf<Int,String>()
    map.put(1,"S")
    map.put(2,"U")
    map.put(3,"M")
    map.put(4,"I")
    map.put(5,"T")
    map.put(6,"D")
    map.put(7,"A")
    map.put(8,"H")
    map.put(9,"I")
    map.put(10,"Y")
    map.put(11,"A")
    println("Initial map is")
    println(map)
    // Destructuring a map entry into key and values
    for( (key,value) in map){
        println("value $value is for key: $key")
    }

    val newmap = map.mapValues { (key,value) -> "Character ${value}" }

    println(newmap)


}
//Since data classes automatically declare componentN() functions, destructuring declarations work here.
data class Person(val name:String,val age:Int){
//Destructuring_declaration.kt
}