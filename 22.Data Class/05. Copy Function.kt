data class MobileSpecification(
    val model: String,
    val RAMSize: Int,
    val ROMSize: Int,
    val OS: String,
    val screenSize: Float
)

fun main() {

    val RedmiNote9 = MobileSpecification("M2003J15SS", 4, 128,"Android 10", 6.56f)

    // copying the entire object without changing any of its properties
    val copyMobile = RedmiNote9.copy()

    // The below line prints "true" as both the objects hold the same property values
    println(RedmiNote9 == copyMobile) // true


    // making a new copy of the RedmiNote9 object and altering the 'ROMSize'
    val copyMobileModifiedROM = RedmiNote9.copy(ROMSize = 256)

    // The below line prints "false" since the value of 'ROMSize' property is different
    println(RedmiNote9 == copyMobileModifiedROM) // false


    // altering more than one property value
    val copyMobileModifiedROMAndRAM = RedmiNote9.copy(ROMSize = 256, RAMSize = 8)

    // The below line prints "false" since the value of properties 'ROMSize' and 'RamSize' are altered
    println(RedmiNote9 == copyMobileModifiedROMAndRAM) // false


    /* Output

    true
    false
    false
     */
}