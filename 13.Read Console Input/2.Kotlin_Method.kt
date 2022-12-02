fun main() {

    /*
    readLine() function is used to read the user input.
    The readLine() function reads a line of input from the standard input stream.

    It returns a String value, the text entered by the user.

    readLine()!! take the input as a string and followed by (!!) to ensure that the input value is not null.
    */

    print("Enter an integer: ")
    val intVal = (readLine()!!).toInt()
    println("You entered a value of type '${intVal::class}'\n")

    print("Enter a floating point input: ")
    val floatVal = (readLine()!!).toFloat()
    println("You entered a value of type '${floatVal::class}'\n")

    print("Enter a double type input: ")
    val doubleVal = (readLine()!!).toFloat()
    println("You entered a value of type '${doubleVal::class}'\n")

    print("Enter a character input: ")
    val charVal: Char = (readLine()!!)[0]
    println("You entered a value of type '${charVal::class}'\n")

    print("Enter a String input: ")
    val stringVal = (readLine()!!)
    println("You entered a value of type '${stringVal::class}'\n")

    print("Enter a boolean input: ")
    val booleanVal = (readLine()!!).toBoolean()
    println("You entered a value of type '${booleanVal::class}'\n")

    /* Output

    Enter an integer: 9
    You entered a value of type 'class kotlin.Int'

    Enter a floating point input: 36.9
    You entered a value of type 'class kotlin.Float'

    Enter a double type input: 36.9
    You entered a value of type 'class kotlin.Float'

    Enter a character input: a
    You entered a value of type 'class kotlin.Char'

    Enter a String input: avinash
    You entered a value of type 'class kotlin.String'

    Enter a boolean input: false
    You entered a value of type 'class kotlin.Boolean'

     */

}