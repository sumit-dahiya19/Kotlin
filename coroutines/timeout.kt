import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main Program start:${Thread.currentThread().name}")

    val result:String?=withTimeoutOrNull(2000){
        try {
            for (i in 0..500) {
                print("$i.")
                delay(500)
            }
        }
        catch(ex:TimeoutCancellationException){
            //TimeoutCancellationException is subclass of cancellation exception
        }
        finally {

        }
        "Done Coroutine"
    }

    println("\n$result")

    println("Main Program ends:${Thread.currentThread().name}")
}