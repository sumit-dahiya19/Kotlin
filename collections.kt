
fun sayHello(list:List<String>){
    list.forEach{  itr->
        println("Hello $itr")
    }
}

fun main() {
    val arr= arrayOf("kotlin","Programming","Sumit")
    println(arr.size)
    println(arr[0])
    println(arr[1])
    println(arr.get(2))
    // println(arr.get(3))

    for(i in arr)
        println(i)

    arr.forEach { myitr->
        println(myitr)
    }
    arr.forEachIndexed{index,value->
        println("Value at $index is $value")

    }

    val list= mutableListOf("Sumit","Dahiya","kotlin")
    println(list[0])
    list.add("Mutable list")
    list.forEach(){ itr->
        println(itr)
    }


    val mp = mutableMapOf(1 to "a",2 to "b",3 to "c")
    mp.put(4,"mutable map")
    mp.forEach(){ k,v->
        println("$k -> $v")
    }

    sayHello(list)



}

//new code from here

fun main() {
    var numbers= mutableListOf<String>("One","two","three")
    val newCollections= mutableListOf<String>("1","2","3","4")
    numbers.add("four")
    println(numbers)
    numbers=newCollections
    println(numbers)

    print(numbers)

    val words = "A long time ago in a galaxy far far away".split(" ")
    println(words)
    val shortWords = mutableListOf<String>()
    words.getShortWordsTo(shortWords, 5)
    println(shortWords)

    numbers.removeAt(2)
    numbers.shuffle()
    print(numbers)

    val set= setOf<Int>(1,2,2,2,3,3)
    println("number of elements ${set.size}")
    if(set.contains(2))
        println("2 is in the set")

    val set2= setOf<Int>(3,1,2)
    println("${set==set2}")
    println("$")

    val mp= mutableMapOf<String,Int>("One" to 1,"Two" to 2)
    mp["Three"]=3
    mp.put("four",4)
    print(mp)



}
fun print(string:Collection<String>){
    for(s in string){
        print("$s")
    }
    println(" My function")
}
fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) { it.length <= maxLength }
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}