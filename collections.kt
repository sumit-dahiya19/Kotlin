
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