/*
    A lambda expression, or lambda, is a type of object that holds a block of code.
    You can assign a lambda to a variable, just as you can any other sort of object, or pass a lambda to a function which can then execute the code it holds.
    This means that you can use lambdas to pass specific behavior to a more generalized function.
 */

fun main() {

    /* What lambda code looks like

    The lambda starts and ends with curly braces {}. All lambdas are defined within curly braces, so they can’t be omitted.

    Inside the curly braces, the lambda parameters are defined.
    Lambdas can have single parameters, multiple parameters, or none at all.

    The parameter definition is followed by ->.
    -> is used to separate any parameters from the body. It’s like saying "Hey, parameters, do this!"

    Finally, the -> is followed by the lambda body. This is the code that you want to be executed when the lambda runs.
    The body can have multiple lines, and the last evaluated expression in the body is used as the lambda’s return value.
    */

    // You can assign a lambda to a variable in the same way that you assign any other sort of object to a variable:
    // by defining the variable using val or var, then assigning the lambda to it.
    val addOne = {num: Int -> num + 1}

    // When you assign a lambda to a variable, you’re assigning a block of code to it, not the result of the code being run.
    // To run the code in a lambda, you need to explicitly invoke it.
    val result1 = addOne(6)
    val result2 = addOne.invoke(6)

    println(result1) // 7
    println(result2) // 7

    /* Output

    7
    7
     */

}