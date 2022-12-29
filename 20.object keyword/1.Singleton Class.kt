// To create a Singleton class, we need to use the 'object' keyword.
// The object class can have functions, properties, and the init method.
// The constructor method is not allowed in an object, so we can use the init method if some initialization is required and the object can be defined inside a class.
object Database{

    fun getUserDetails(){
        println("Student Details")
        // database query
    }

}

fun main() {

    // We call the method and member variables present in the singleton class using the class name
    Database.getUserDetails()

}