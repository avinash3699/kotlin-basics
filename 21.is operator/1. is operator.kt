interface Bootable{

    val bootLocation: String
        get() = "C:\\Boot"

    fun boot()

}

class Laptop: Bootable{

    override fun boot() {
        println("Laptop is booting...")
    }

}

class MobilePhone: Bootable{

    override val bootLocation: String
        get() = "Root ROM"

    override fun boot() {
        println("Mobile phone is booting...")
    }

}

class Calculator{

}

fun main() {

    val mobilePhone = MobilePhone()
    val laptop = Laptop()
    val calculator = Calculator()

    val devices = arrayOf(mobilePhone, laptop, calculator)

    for(device in devices){

        // Use the 'is' operator to check if the underlying object is the specified type (or one of its subtypes).
        if(device is Bootable){
            device.boot()
        }
        else{
            println("${device::class} is not bootable")
        }
    }

}