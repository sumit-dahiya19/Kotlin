
var global:String="This is global varibale" //accessed anywhere within this package
private const val User_id="U-"
typealias strList=List<String>

fun variable(){
    val str:String="Sumit"
    //str="Dahiya" val cannot be reassigned

    var temp:String="sumit"
    temp="dahiya"

    global="Changed in function"

    var count=0 //type infer

}
fun greetUser(username:String?){
    val nametoPrint = username ?:"no username"

    /*if(username==null)
        print("no username")
    print(username)
     */
    print(nametoPrint)
}
fun getStringlength (obj:Any) : Int ?{
    if(obj is String)
        return obj.length
    else
        return null
}

fun main(args: Array<String>) {
    println("Hello Kotlin!")
    //variable()
    val userName:String? = null
    greetUser(null)

    val a = "Kotlin"
    val b: String? = null
    println(b?.length)
    println(a?.length)

    val str="sumit"
    print("Username is ${str.toUpperCase()} ") //String substituon

    //latenit
    lateinit  var name:String
    name="Sumit"
    print(name)


}