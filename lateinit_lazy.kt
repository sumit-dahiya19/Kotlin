private lateinit var courseName: String
fun fetchCourseName(courseId: String) {
    courseName = courseRepository.getCourseName(courseId)
}
if(this::courseName.isInitialized) {
} else {
}
/*
The lateinit keyword is used for late initialization of variables.
You should be very sure that your lateinit variable will be initialized before accessing it otherwise you will get:
UninitializedPropertyAccessException: lateinit property courseName has not been initialized
 */
class SomeClass {
    private val heavyObject: HeavyClass by lazy {
        println("Heavy Object initialised")
        HeavyClass()
    }

    fun accessObject() {
        println(heavyObject)
    }
}

fun main(args: Array<String>) {
    val someClass = SomeClass()
    println("SomeClass initialised")
    someClass.accessObject()
    someClass.accessObject()
}
}
}
//Now, the benefit of using lazy is that the object will be created only when it is called otherwise
// it will not be created.
//Lazy is mainly used when you want to access some read-only property because the same object is accessed throughout.