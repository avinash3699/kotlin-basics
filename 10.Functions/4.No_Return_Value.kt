// If you don’t want your function to return a value,

// 1. you can either omit the return type from the function declaration, or
fun printHello(){
    println("Hello!")
}

// 2. specify a return type of Unit
// Declaring a return type of Unit means that the function returns no value
fun printHello(): Unit{
    println("Hello!")
}

// If you specify that your function has no return value, then you need to make sure that it doesn’t return one.
// If you try to return a value in a function with no declared return type, or a return type of Unit, your code won’t compile

fun main() {

    printHello() // Hello!

}