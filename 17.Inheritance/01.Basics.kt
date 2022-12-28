/* Declare the superclass and its properties and functions as 'open'

Before a class can be used as a superclass, you have to explicitly tell the compiler that this is allowed.
You do this by prefixing the name of the class and any properties or functions you want to override—with the keyword 'open'
This tells the compiler that you’ve designed the class to be a superclass, and that you’re happy for the properties and functions you’ve declared as open to be overridden
 */
open class SportsPerson{

    val legsCount = 2
    val handsCount = 2

    // open fields
    open val name = ""
    open var age = 0

    fun walk(){
        println("SportsPerson is walking")
    }

    // open method
    open fun play(){
        println("SportsPerson is playing")
    }

}


/* How a subclass inherits from a superclass?

To make a class inherit from another, you add a colon (:) to the class header followed by the name of the superclass.
This makes the class a subclass, and gives it all the properties and functions of the class it inherits from.
 */

/* How to override properties?

You override a property that’s been inherited from a superclass by adding the property to the subclass, and prefixing it with the override keyword.
 */

// If you define a property in the superclass using 'val', you must override it in the subclass if you want to assign a different value to it.
// If a superclass property has been defined using var, you don’t need to override it in order to assign a new value to it, as var variables can be reused for other values.
class Cricketer(override val name: String, override var age: Int): SportsPerson(){

    /* How to override functions

    You override a function in a similar way to how you override a property: by adding the function to the subclass, prefixed with override.
     */
    override fun play() {
        println("SportsPerson is playing cricket")
    }
}

fun main() {

    val sportsPerson = Cricketer("Avinash", 21)

    // accessing the overridden function
    sportsPerson.play() // SportsPerson is playing cricket

    // accessing the super class function
    sportsPerson.walk() // SportsPerson is walking

    // accessing the overridden fields
    println(sportsPerson.name) // Avinash
    println(sportsPerson.age) // 21

    // accessing the super class fields
    println(sportsPerson.legsCount) // 2
    println(sportsPerson.handsCount) // 2

    /* Output

    SportsPerson is playing cricket
    SportsPerson is walking
    Avinash
    21
    2
    2
     */
}