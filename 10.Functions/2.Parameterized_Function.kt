// Each parameter must have a name and type
fun printTwoNumbers(num1: Int, num2: Int){
    println("The first number is $num1")
    println("The second number is $num2")
}
// Behind the scenes, the parameter variables are created as local val variables that can’t be reused for other values

fun main() {

    // if a function has a parameter, you must pass it something and
    // that something must be a value of the appropriate type
    // if a function has multiple parameters, you must pass arguments of the right type in the right order
    printTwoNumbers(3, 6) // no error


    printTwoNumbers() // error: No value passed for parameter 'num1'
                     //        No value passed for parameter 'num2'
    printTwoNumbers(3) // error: No value passed for parameter 'num2'


    printTwoNumbers("One", "Two") // error: Type mismatch: inferred type is String but Int was expected
                                              //        Type mismatch: inferred type is String but Int was expected
    // TODO: how kotlin displays two errors at the same line. The execution of above statement results in those two errors

}

/*
TIP: Parameters vs Arguments

A function uses parameters. A caller passes arguments.

Arguments are the things you pass into the functions. An argument (a value like 2 or “Pizza”) lands face-down into a parameter.
And a parameter is nothing more than a local variable: a variable with a name and type that’s used inside the body of the function
 */