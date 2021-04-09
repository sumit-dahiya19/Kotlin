fun main(){

    val names= listOf("apple","banana","chhery")

    for(name in names)
        print(name)

    for(index:Int in names.indices){
        print(names[index])
        print(index)
    }

    for((index,value) in names.withIndex()){
        println("The value at $index is $value")
    }

    names.forEachIndexed {
            index,value -> println("The value at index $index is $value")
    }
    for(index in 0..10){
        println(index)
    }
    for(s in 0 until 10 step 2){
        println(s)
    }

    repeat(5){ index->
        println(index)
    }

    for(s in 10 downTo 0 ){
        print(s)
    }
    println()

    var high=0
    while(high<10){
        print(high)
        high++
    }
    println()
    high=0
    do{
        print(high)
        high++
    }
    while(high<0)


}