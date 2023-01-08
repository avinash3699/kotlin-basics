// You define a data class by prefixing a normal class definition with the 'data' keyword.
// The curly braces are omitted as the data class has no body
data class MobileSpecification(
    val model: String,
    val RAMSize: Int,
    val ROMSize: Int,
    val OS: String,
    val screenSize: Float
)

fun main() {

    // You create objects from a data class in the same way that you create objects from a normal class: by calling its constructor.
    var RedmiNote9 = MobileSpecification("M2003J15SS", 4, 128,"Android 10", 6.56f)
    var iPhone13 = MobileSpecification("iPhone13", 4, 512, "iOS 15", 6.1f)

    println(RedmiNote9) // MobileSpecification(model=M2003J15SS, RAMSize=4, ROMSize=128, OS=Android 10, screenSize=6.56)

    println(iPhone13) // MobileSpecification(model=iPhone13, RAMSize=4, ROMSize=512, OS=iOS 15, screenSize=6.1)

    /* Output

    MobileSpecification(model=M2003J15SS, RAMSize=4, ROMSize=128, OS=Android 10, screenSize=6.56)
    MobileSpecification(model=iPhone13, RAMSize=4, ROMSize=512, OS=iOS 15, screenSize=6.1)
     */
}