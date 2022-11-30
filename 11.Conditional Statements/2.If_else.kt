/*
Syntax:

if (condition) {
  // block of code to be executed if the condition is true
}
else {
  // block of code to be executed if the condition is false
}
 */

// You can omit the curly braces {} when 'if' or 'else' has only one statement:

fun main() {

    val num = 5

    if(num%2 == 0)
        println("$num is even")
    else
        println("$num is odd")
    // 5 is odd

}