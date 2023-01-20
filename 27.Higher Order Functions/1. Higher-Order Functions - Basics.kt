fun main() {

    /* You can pass a lambda to a function

        As well as assigning a lambda to a variable, you can also use one or more as function parameters.
        Doing so allows you to pass specific behavior to a more generalized function.

        A function that uses a lambda as a parameter or return value is known as a "higher-order function".
     */


    /* Calling the function that uses lambda by passing it parameter values

        You call a function with a lambda parameter in the same way that you call any other sort of function: by passing it a value for each argument—in this case, a Double and a lambda.
     */

    // Let’s use the convert function to convert 38.0 degrees Centigrade to Fahrenheit
    val fahrenheit: Double = convert(38.0, {c: Double -> c * 1.8 + 32})
    println(fahrenheit)

    /* Output

    38.0 is converted to 100.4
    100.4
     */

}

/* Add a lambda parameter to a function by specifying its name and type

    We need to tell the convert function two things in order for it to convert one Double to another:
    the Double we want to convert, and the lambda that specifies how it should be converted.
    We’ll therefore use two parameters for the convert function: a Double and a lambda.

    You define a lambda parameter in the same way that you define any other sort of function parameter: by specifying the parameter’s type, and giving it a name.
    We’ll name our lambda 'converter', and as we want the lambda to convert a Double to a Double, its type needs to be (Double) -> Double (a lambda that accepts a Double parameter, and returns a Double).

    The function definition is below. As you can see, it specifies two parameters—a Double named x, and a lambda named converter—and returns a Double:
 */
fun convert(x: Double,
            converter: (Double) -> Double) : Double{

    val result = converter(x)
    println("$x is converted to $result")
    return result

}