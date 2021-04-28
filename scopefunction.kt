import kotlin.random.Random

class Person constructor(){
    var age:Int=0
    var name:String=""

}

//way we refer to the context object and return value
// this-> lambda receiver  or it-> lambda argument
//this -> run with apply
//it -> let also

//return object -> apply also

//let run with -> return lambda result
fun main() {

    //apply
    //    //Use apply for code blocks that don't return a value and mainly operate on the members of the receiver object
    val obj=Person().apply {
        age=1
        name="A"
    }
    Random.nextInt(100).also { value->
        println("Print called with random numer $value")
    }

    val numberlist= mutableListOf<Int>()
    numberlist.also{
        println("Populating list") }
        .apply {
            add(3)
            add(2)
            add(1)
        }
        .also {
            println("Sorting the list $it")
            it.sort()
        }
        .also {
            println("list is $it")
        }

    val arr= mutableListOf<Int>(1,2,3,4)
    val countGreaterthantwo=arr.run{
        add(5)
        count {
            it>2
        }
    }.also { println(it) }

    with(arr){
        val firstitem=first()
        val lastitem=last()
        println("first item is $firstitem and last item is $lastitem")
    }


    //let is often used for executing a code block only with non-null values
    //To perform actions on a non-null object, use the safe call operator ?. on it and call let with the actions in its lambda.
    val str:String?=null
    val length=str?.let{
        println("let called on $it")
        it.length
    }

    //with
    //with for calling functions on the context object without providing the lambda result. In the code, with can be read as “ with this object, do the following.”
    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }
    val firstAndLast = with(numbers) {
        "The first element is ${first()}," +
                " the last element is ${last()}"
    }
    println(firstAndLast)

    //run
    //run does the same as with but invokes as let- as an extension function of the context object.
    //run is useful when your lambda contains both the object initialization and the computation of the return value.
    val hexNumberRegex = run {
        val digits = "0-9"
        val hexDigits = "A-Fa-f"
        val sign = "+-"

        Regex("[$sign]?[$digits$hexDigits]+")
    }

    for (match in hexNumberRegex.findAll("+1234 -FFFF not-a-number")) {
        println(match.value)
    }


    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    //Note that the to notation creates a short-living Pair object, so it's recommended that you use it only if performance isn't critical.
    //To avoid excessive memory usage, use alternative ways. For example, you can create a mutable map and populate it using the write operations
    //The apply() function can help to keep the initialization fluent here.

    val numbersMapOptimised = mutableMapOf<String, String>().apply { this["one"] = "1"; this["two"] = "2" }
    println(numbersMapOptimised)


    val num = mutableListOf("one", "two", "three")
    num
        .also { println("The list elements before adding new one: $it") }
        .add("four")

}
->Executing a lambda on non-null objects: let
->Object configuration: apply
->Object configuration and computing the result: run
->Running statements where an expression is required: non-extension run
->Additional effects: also
->Grouping function calls on an object: with

