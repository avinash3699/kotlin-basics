class OuterClass{

    // Companion objects are essentially the same as a standard object definition, only with a couple of additional features to make development easier.
    // A companion object is always declared inside another class. Whilst it can have a name, it doesn’t need to have one, in which case it automatically has the name Companion

    companion object { // Equivalent to "companion object Companion"
        val message: String = "Inside companion object"
    }

    // Companion objects allow their members to be accessed from inside the companion class without specifying the name.
    fun getMessage(): String = message

}

fun main() {

    val message1 = OuterClass().getMessage()
    val message2 = OuterClass.Companion.message
    val message3 = OuterClass.message

    println(message1) // Inside companion object
    println(message2) // Inside companion object
    println(message3) // Inside companion object

}