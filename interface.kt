interface PersonInfo {

    val provider:String
    fun printInfo(person:Person){
        println(provider)
        person.printInfo()
    }

}
interface Session{
    fun getsessionid():String
}
open class A : PersonInfo,Session {
    protected open val session_idprefix="Session"
    override val provider: String
        get() = "Default"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("override default")
    }

    override fun getsessionid(): String {
        return session_idprefix
    }
}
fun checktypes(obj:A){
    if(obj is Session)
        println("is a session info provider")
    else {
        println("not a session info provider ")
        println(obj.getsessionid())
    }


}

class fancy : A() {
    override val provider: String
        get() ="fancyinfo provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        print("fancy info")
    }

    override val session_idprefix: String
        get() = "fancy session"
}

fun main() {
    val obj=A()
    obj.printInfo(Person())
    println(obj.getsessionid())
    checktypes(obj)

    val obj1=fancy()
    println(obj1.provider)
    obj1.printInfo(Person())
    obj1.session_idprefix
}