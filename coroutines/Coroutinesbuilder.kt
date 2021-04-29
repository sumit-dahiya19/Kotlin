import kotlinx.coroutines.*

fun main() = runBlocking{

    println("Main Program Start -> ${Thread.currentThread().name}") //main thread
    //Coroutines Builder
    /*
    1.Launch
        -> GlobalScope.launch { companion Object }
    2.async
        -> GlobalScope.async{   }
    3.runBlocking
     */

    val job:Job=launch { //Thread-> main
        println("Fake  Program Start->  ${Thread.currentThread().name}")
        delay(1000)
        println("Fake  Program End->  ${Thread.currentThread().name}")
    }
    //delay(1000)
    //job.cancel()
    job.join()// wait for coroutine it finish its execution only after which nect statment will be executed



    //we can return some date using async coroutin builder and we can retrive this data using await fucntion
    // It creates a coruotine without blocking the current thread
    // async will inherti the scope and thread from its immediate parent coroutine
    //return deffered object
    val jobDeferred:Deferred<String> = async { //Thread-> main
        println("Fake  Program Start->  ${Thread.currentThread().name}")
        delay(1000)
        println("Fake  Program End->  ${Thread.currentThread().name}")
        "Sumit Dahiya "
    }

    //jobDeferred.join()
    val num:String=jobDeferred.await()
    println(num)

     


    //run-block
    //it is genrally used to write test case to test suspending functions
    //always block the thread in which it operated


    println("Main Program End -> ${Thread.currentThread().name}")



}
suspend fun myCustomSuspendingfunc(){
    delay(1000)

}