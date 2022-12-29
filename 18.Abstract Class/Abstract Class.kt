abstract class SportsPerson{

    val legsCount = 2
    val handsCount = 2

    // abstract fields
    abstract val name: String
    abstract var age: Int

    fun walk(){
        println("SportsPerson is walking")
    }

    // abstract method
    abstract fun play()

}

class Cricketer(override val name: String, override var age: Int): SportsPerson(){

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