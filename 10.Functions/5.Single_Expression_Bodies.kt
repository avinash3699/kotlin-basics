// If you have a function whose body consists of a single expression,
// you can simplify the code by removing the curly braces and return statement from the function declaration.

fun printHello() = println("Hello")

fun getMax(num1: Int, num2: Int): Int = if(num1 > num2) num1 else num2
// we can also omit the return type 'Int' from the above function, since the compiler knows from the if statement that, the return type is int based on the input types

fun main() {

    printHello() // Hello

    println(getMax(3, 9)) // 9

}