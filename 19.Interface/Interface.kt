interface Bootable{

    val bootLocation: String
        get() = "C:\\Boot"

    fun boot()

}

// You mark that a class implements an interface in a similar way to how you mark that a class inherits from a superclass: by adding a 'colon' to the class header followed by the name of the interface
class Laptop: Bootable{

    override fun boot() {
        println("Laptop is booting...")
    }

}

class MobilePhone: Bootable{

    // overriding interface field
    override val bootLocation: String
        get() = "Root ROM"

    override fun boot() {
        println("Mobile phone is booting...")
    }

}

fun main() {

    val mobilePhone = MobilePhone()
    val laptop: Bootable = Laptop()

    mobilePhone.boot() // Mobile phone is booting...
    laptop.boot() // Laptop is booting...

    println(mobilePhone.bootLocation) // Root ROM
    println(laptop.bootLocation) // C:\Boot

    /* Output

    Mobile phone is booting...
    Laptop is booting...
    Root ROM
    C:\Boot
     */
}