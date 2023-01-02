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

fun main() {

    val computer1: Computer = Laptop()
    val computer2: Computer = MobilePhone()

    // If you want to access the behavior of an underlying object but the compiler can’t perform a smart cast, you can explicitly cast the object into the appropriate type
    // 'as' keyword is used to do a explicit type casting

    val laptop = computer1 as Laptop
    laptop.readUSBPenDrive()

    val mobile = computer2 as MobilePhone
    mobile.readSimCard()

    /* Output

    Laptop is reading USB pen drive
    Mobile Phone is reading sim card
     */

}