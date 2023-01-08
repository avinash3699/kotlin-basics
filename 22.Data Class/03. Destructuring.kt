data class MobileSpecification(
    val model: String,
    val RAMSize: Int,
    val ROMSize: Int,
    val OS: String,
    val screenSize: Float
)

fun main() {

    val RedmiNote9 = MobileSpecification("M2003J15SS", 4, 128,"Android 10", 6.56f)

    // Destructuring a data object splits it into its component parts.
    val (model, RAM, ROM, OS, screenSize) = RedmiNote9

    // The above line of code does the same thing as the lines below
    val model1 = RedmiNote9.component1()
    val RAM1 = RedmiNote9.component2()
    val ROM1 = RedmiNote9.component3()
    val OS1 = RedmiNote9.component4()
    val screenSize1 = RedmiNote9.component5()

    // de-structure variables (line 14)
    println("Redmi Note 9 Phone Specifications")
    println("Model: $model")
    println("RAM: ${RAM}GB")
    println("ROM: ${ROM}GB")
    println("OS: $OS")
    println("Screen Size: ${screenSize}inch")

    println()

    // manual componentN (line 17 - 21)
    println("Redmi Note 9 Phone Specifications")
    println("Model: $model1")
    println("RAM: ${RAM1}GB")
    println("ROM: ${ROM1}GB")
    println("OS: $OS1")
    println("Screen Size: ${screenSize1}inch")

    /* Output

    Redmi Note 9 Phone Specifications
    Model: M2003J15SS
    RAM: 4GB
    ROM: 128GB
    OS: Android 10
    Screen Size: 6.56inch

    Redmi Note 9 Phone Specifications
    Model: M2003J15SS
    RAM: 4GB
    ROM: 128GB
    OS: Android 10
    Screen Size: 6.56inch
     */


}