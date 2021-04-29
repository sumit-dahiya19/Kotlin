import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking{
    println("Main Program ${Thread.currentThread().name}")

    // Concurrent execution of functions
    val time= measureTimeMillis {
        val str1:Deferred<String> = async{getMessage1()}
        val str2:Deferred<String> = async{getMessage2()}

        println(str1.await()+str2.await())
        //executed sequentailly -> by default the method are executed sequentally

    }
    println("Time is $time ms ")




    val str1:Deferred<String> = async(start=CoroutineStart.LAZY){getMessage1()}
    val str2:Deferred<String> = async(start=CoroutineStart.LAZY){getMessage2()}

    //println(str1.await()+str2.await())


    println("Main Program ${Thread.currentThread().name}")
}
suspend fun getMessage1():String{
    delay(1000)
    println("Working in getmessage1")
    return "Hello"
}
suspend fun getMessage2():String{
    delay(1000L)
    println("Working in getmessage2")
    return "world"

}