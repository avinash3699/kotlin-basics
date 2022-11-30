/*
Syntax:

if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
 */

// You can omit the curly braces {} when 'if', 'else if' or 'else' has only one statement:

fun main() {

    val num = 0
    // val num = 1
    // val num = 2

    if(num == 0)
        println("$num is neither odd nor even")
    else if(num%2 == 0)
        println("$num is even")
    else
        println("$num is odd")

    // Input  : num = 0
    // Output : 0 is neither odd nor even

    // Input  : num = 2
    // Output : 2 is even

    // Input  : num = 1
    // Output : 1 is odd

}