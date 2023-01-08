data class MobileSpecification(
    val model: String,
    val RAMSize: Int,
    val ROMSize: Int,
    val OS: String,
    val screenSize: Float
)

fun main() {

    val mobile1 = MobileSpecification("M2003J15SS", 4, 128, "Android 10", 6.56f)
    val mobile2 = MobileSpecification("M2003J15SS", 4, 128, "Android 10", 6.56f)

    val mobile1AssignmentCopy = mobile1

    val mobile1CopyFunction = mobile1.copy()

    // == compares whether the objects have identical values for the properties
    println(mobile1 == mobile2) // true
    println(mobile1 == mobile1AssignmentCopy) // true
    println(mobile1 == mobile1CopyFunction) // true

    // === compares whether two variables refer to the same underlying object.
    println(mobile1 === mobile2) // false
    println(mobile1 === mobile1AssignmentCopy) // true
    println(mobile1 === mobile1CopyFunction) // false

     /* Output

     true
     true
     true
     false
     true
     false
      */

}