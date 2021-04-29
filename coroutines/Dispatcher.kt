import kotlinx.coroutines.*

fun main() = runBlocking {


    println("main thread-> :${Thread.currentThread().name}")

    launch{
        println("C1:${Thread.currentThread().name}")
        delay(1000)
        println("C1 after delay:${Thread.currentThread().name}")
    }
    launch(Dispatchers.Default) {
        println("C2:${Thread.currentThread().name}")
        delay(1000)
        println("C2 after delay:${Thread.currentThread().name}")
    }
    launch(Dispatchers.Unconfined) {
        println("C3:${Thread.currentThread().name}")
        delay(1000)
        println("C3 after delay:${Thread.currentThread().name}")

        launch(coroutineContext) {
            println("C4:${Thread.currentThread().name}")
            delay(1000)
            println("C4 after delay:${Thread.currentThread().name}")
        }
    }




    println("main thread in end -> :${Thread.currentThread().name}")

}