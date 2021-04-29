import kotlinx.coroutines.*

import kotlin.concurrent.thread

//import kotlin.concurrent.thread

fun main() = runBlocking{


    println("Main Thread Start ${Thread.currentThread().name}") //main

    //in case of thread main function will wait for all the background thread to finish working
    //in case of coroutines main thread does't wait for coroutine completion

    GlobalScope.launch {  //create a background coroutine that runs on a background thread
        println("Worker Thread Start ${Thread.currentThread().name}")
        //Thread.sleep(1000) // block the thread in which it is opearting
        delay(1000) // does not block the thread in which it is opearitng
        //delay suspend the couroutine it does not block the thread means the other coroutines can work finely
        // in suspend function thread may change

        println("Worker Thread Finished ${Thread.currentThread().name}")
    }


    //runBlocking block the main thread
    //Create a coroutines but this time it block the current main thread
    Customdelay(2000)

    Thread.sleep(2000) //it blocks the main thread and wait for coroutines to finish
    println("Main Thread ends ${Thread.currentThread().name}")

}

suspend fun Customdelay(time:Long){
    delay(time)
}

