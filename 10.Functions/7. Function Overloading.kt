// Function overloading is when you have two or more functions with the same name but with different argument lists.

fun sum(num1: Int, num2: Int) = num1 + num2

fun sum(num1: Float, num2: Float) = num1 + num2

fun sum(num1: Int, num2: Int, num3: Int) = num1 + num2 + num3

fun main() {

    val sum1 = sum(3, 6)

    val sum2 = sum(3, 6, 9)

    val sum3 = sum(3.3f, 6.6f)

    println("$sum1\n$sum2\n$sum3")

    /* Output

    9
    18
    9.9
     */

}

/* Dos and don’ts for function overloading

1. The return types can be different
    You’re free to change the return type of overloaded function, so long as the argument lists are different.

2. You can’t change ONLY the return type
    If only the return type is different, it’s not a valid overload—the compiler will assume you’re trying to override the function.
    And even that won’t be legal unless the return type is a subtype of the return type declared in the superclass.
    To overload a function, you MUST change the argument list, although you can change the return type to anything

 */