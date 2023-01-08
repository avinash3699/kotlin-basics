data class MobileSpecification(
    val model: String,
    val RAMSize: Int = 4,
    val ROMSize: Int = 128,
    val OS: String,
    val screenSize: Float
)

fun main() {

    var RedmiNote9 = MobileSpecification("M2003J15SS", 4, 128,"Android 10", 6.56f)
    var iPhone13 = MobileSpecification("iPhone13", 4, 512, "iOS 15", 6.1f)

}