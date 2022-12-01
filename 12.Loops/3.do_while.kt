// The do..while loop is a variant of the while loop.
// This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.

/*
Syntax:

do {
  // code block to be executed
}
while (condition);
 */

fun main() {

    var num = 0
    do{
        print("$num ")
        num++
    } while(num < 5)
    println()
    // Output: 0 1 2 3 4


    var num2 = 0
    do{
        print("$num2 ")
        num++
    } while(num2 < 0)
    // Output: 0
    // Though the while condition is false at the beginning itself, the condition is checked only after executing the block of code in 'do'
    // Hence, 0 is printed

}