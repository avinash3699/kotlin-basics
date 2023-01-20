class NormalClass(
    val model: String,
    val RAMSize: Int,
    val ROMSize: Int,
    val OS: String,
    val screenSize: Float
)

data class DataClass(
    val model: String,
    val RAMSize: Int,
    val ROMSize: Int,
    val OS: String,
    val screenSize: Float
)

fun main() {

    val normalClass1 = NormalClass("M2003J15SS", 4, 128, "Android 10", 6.56f)
    val normalClass2 = NormalClass("M2003J15SS", 4, 128, "Android 10", 6.56f)

    val dataClass1 = DataClass("M2003J15SS", 4, 128, "Android 10", 6.56f)
    val dataClass2 = DataClass("M2003J15SS", 4, 128, "Android 10", 6.56f)

    println("Normal Class 1 Hashcode: ${normalClass1.hashCode()}")
    println("Normal Class 2 Hashcode: ${normalClass2.hashCode()}")

    println("Data Class 1 Hashcode: ${dataClass1.hashCode()}")
    println("Data Class 2 Hashcode: ${dataClass2.hashCode()}")

    val normalClassSet = setOf(normalClass1, normalClass2)
    val dataClassSet = setOf(dataClass1, dataClass2)

    println(
        "Set using Normal Class: $normalClassSet\n" +
        "Normal Class Set Size: ${normalClassSet.size}"
    )

    println(
        "Set using Data Class: $dataClassSet\n" +
        "Data Class Set Size: ${dataClassSet.size}"
    )

}