import kotlin.random.Random


//-> takeif = When called on an object with a predicate provided,
//takeIf returns this object if it matches the predicate. Otherwise, it returns null
fun main() {
    val number= Random.nextInt(100)
    val evenornull=number.takeIf { it%2==0 }
    val oddornull=number.takeUnless { it%2==0 }
    println("even $evenornull , odd: $oddornull")

    val str:String="hello"
    val caps=str.takeIf { it.isNotEmpty() } ?.toUpperCase()
    println(caps)

    displaySubStringPosition("010000011", "11")
    displaySubStringPosition("010000011", "12")

}
fun displaySubStringPosition(input:String,sub:String){
    input.indexOf(sub).takeIf { it>=0 }?.let{
        println("The substring $sub is found in $input.")
        println("Its start position is $it.")
    }
}