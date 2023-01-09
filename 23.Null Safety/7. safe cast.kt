fun main() {

    val computer1: Computer = Laptop()
    val computer2: Computer = MobilePhone()

    // If 'computer1' and 'computer2' are assigned a value of some other type in between the type-check and the cast, the system will throw a ClassCastException.
    // Use a safe cast (as?) to avoid getting a ClassCastException.

    // 'as?' lets you perform a safe explicit cast. If the cast fails, it returns null.
    // The safe alternative is to perform a 'safe cast' using the 'as?' operator using code like this:
    if(computer1 != null) {
        val laptop = computer1 as? Laptop
        laptop?.readUSBPenDrive()
    }

    if(computer2 != null) {
        val mobile = computer2 as? MobilePhone
        mobile?.readSimCard()
    }

    /* Output

    Laptop is reading USB pen drive
    Mobile Phone is reading sim card
     */

}

abstract class Computer{
    abstract fun switchOn()
    abstract fun switchOff()
}

class Laptop: Computer(){
    override fun switchOn() {
        println("Laptop is switching on...")
    }

    override fun switchOff() {
        println("Laptop is switching off...")
    }

    fun readUSBPenDrive(){
        println("Laptop is reading USB pen drive")
    }
}

class MobilePhone: Computer(){
    override fun switchOn() {
        println("Mobile Phone is switching on...")
    }

    override fun switchOff() {
        println("Mobile Phone is switching off...")
    }

    fun readSimCard(){
        println("Mobile Phone is reading sim card")
    }

}