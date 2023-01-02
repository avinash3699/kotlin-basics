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

    // computer1.readUSBPenDrive() //error: Unresolved reference: readUSBPenDrive
    // computer2.readSimCard() //error: Unresolved reference: readSimCard
    // The above lines result in errors because, computer1 and computer2 are declared of type 'Computer'.
    // The methods 'readUSBPenDrive' and 'readSimCard' are not defined in 'Computer' class.

    // The is operator performs a "smart cast".
    // Casting means that the compiler treats a variable as though its type is different to the one that it’s declared as, and
    // Smart Casting means that the compiler automatically performs the cast on your behalf.

    // The 'is' operator performs a smart cast whenever the compiler can guarantee that the variable can’t change between checking the object’s type and when it’s used.

    if(computer1 is Laptop)
        // computer1 of type "Computer" is smart cast to type "Laptop" since the condition is checked in the previous line
        computer1.readUSBPenDrive()


    if(computer2 is MobilePhone)
        computer2.readSimCard()


    /* Output

    Laptop is reading USB pen drive
    Mobile Phone is reading sim card
     */
}