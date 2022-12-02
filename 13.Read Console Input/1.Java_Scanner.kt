import java.util.Scanner

fun main() {

    // backticks (`) are used for "Escaping Java identifiers that are keywords in Kotlin"
    // Here 'in' is a keyword in Kotlin, so we are enclosing the Java 'in' using backticks
    val sc = Scanner(System.`in`)

    print("Enter an integer: ")
    val intVal = sc.nextInt()
    println("You entered a value of type '${intVal::class}'\n")

    print("Enter a floating point input: ")
    val floatVal = sc.nextFloat()
    println("You entered a value of type '${floatVal::class}'\n")

    print("Enter a double type input: ")
    val doubleVal = sc.nextDouble()
    println("You entered a value of type '${doubleVal::class}'\n")

    print("Enter a character input: ")
    val charVal = sc.next()[0]
    println("You entered a value of type '${charVal::class}'\n")

    print("Enter a String input: ")
    val stringVal = sc.next()
    println("You entered a value of type '${stringVal::class}'\n")

    print("Enter a boolean input: ")
    val booleanVal = sc.nextBoolean()
    println("You entered a value of type '${booleanVal::class}'\n")

    /* Output

    Enter an integer: 9
    You entered a value of type 'class kotlin.Int'

    Enter a floating point input: 36.99
    You entered a value of type 'class kotlin.Float'

    Enter a double type input: 36.90
    You entered a value of type 'class kotlin.Double'

    Enter a character input: n
    You entered a value of type 'class kotlin.Char'

    Enter a String input: ash
    You entered a value of type 'class kotlin.String'

    Enter a boolean input: true
    You entered a value of type 'class kotlin.Boolean'

     */

}