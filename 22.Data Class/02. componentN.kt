data class MobileSpecification(
    val model: String,
    val RAMSize: Int,
    val ROMSize: Int,
    val OS: String,
    val screenSize: Float
)

fun main() {

    val RedmiNote9 = MobileSpecification("M2003J15SS", 4, 128,"Android 10", 6.56f)

    // If you wanted to retrieve the value of the object’s first property (its model property), you could do this by calling the object’s component1() function like this
    val model = RedmiNote9.component1()
    val OS = RedmiNote9.component4()

    // This does the same thing as the above code
    val model1 = RedmiNote9.model
    val OS1 = RedmiNote9.OS

    println("Redmi Note 9 Model: $model") // Redmi Note 9 Model: M2003J15SS
    println("Redmi Note 9 OS: $OS") // Redmi Note 9 OS: Android 10

    println("Redmi Note 9 Model: $model1") // Redmi Note 9 Model: M2003J15SS
    println("Redmi Note 9 OS: $OS1") // Redmi Note 9 OS: Android 10

    /* Output

    Redmi Note 9 Model: M2003J15SS
    Redmi Note 9 OS: Android 10
    Redmi Note 9 Model: M2003J15SS
    Redmi Note 9 OS: Android 10
     */
}