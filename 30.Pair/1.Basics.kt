/* Links

    https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/
    https://www.geeksforgeeks.org/pair-in-kotlin/
    https://www.youtube.com/watch?v=_atRFBA_Dw0&t=131s
 */

fun main() {

    // There are two ways of defining pairs

    // 1.
    val pair1 = Pair(3, 6)

    // 2.
    val pair2 = 6 to 9



    // Accessing values of a pair

    // 1. Using 'first' and 'second'
    val num1 = pair1.first
    val num2 = pair1.second

    // 2. Destructuring
    val (num3, num4) = pair2


    println("$num1 $num2") // 3 6

    println("$num3 $num4") // 6 9
}