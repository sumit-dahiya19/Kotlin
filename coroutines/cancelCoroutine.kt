/*//why cancel a coruotine
-> if we dont want its resilt
        -> if it is taking too much time
        ->to cancel a coroutine is should be cooperative

 */
import kotlinx.coroutines.*

fun main() = runBlocking{ //create a blocking coroutine that executes in current thread (main)


    println(" thread name ->  ${Thread.currentThread().name }")


    val job :Job = launch(Dispatchers.Default){ //Thread t1:creates a non-blocking coroutines
        println(" job thread name ->  ${Thread.currentThread().name }")
        try {

            for (i in 0..500) {
                print("$i.")
                // Thread.sleep(1)
                yield()
                //delay(5)
            }
            //the code has to be cooperative in order to get canelled
        }
        catch(ex:CancellationException){
            println("\nException caught safely ${ex.message}")
        }
        finally {
            withContext(NonCancellable){
                delay(100)
                println("\nClose resuose is finally ")
            }
        }
    }

    delay(10) //print few values before cancel
    job.cancel(CancellationException("My Custom Cancellation Message")) //if the coroutine is cooperative then cancel is possible

    job.join()//waits for coroutine to finish

    job.cancelAndJoin() // will make isActive=false
    //If coroutine is cooperative then cancel it else if is not cooperative then wait for the coroutine to finish


    //what makes a coroutine cooperative
    //1. Only those suspending functions that belong to kotlinx.coroutines package will make coroutine cooperative
    // delay() yield() withcontext() withtimeout()
    //2. boolena property isactive=true and false(


    //cancellable suspending functions such as yield() and delay() etc throw CancellationException on the coroutine cancelltaio

    println(" main ends thread name ->  ${Thread.currentThread().name }")

}