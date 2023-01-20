fun main() {

    // Let’s use the convert function to convert 38.0 degrees Centigrade to Fahrenheit

    // 1. Calling the function by passing lambda as parameter values
    val f1: Double = convert(38.0, {c: Double -> c * 1.8 + 32})
    println(f1) // 100.4

    // 2. You can move the lambda OUTSIDE the ()’s...
    val f2: Double = convert(38.0){c: Double -> c * 1.8 + 32}
    println(f2) // 100.4

    // 3. ...or remove the ()’s entirely
    // If you have a function that has just one parameter, and that parameter is a lambda, you can omit the parentheses entirely when you call the function.
    val result = convertFive { it * 1.8 + 32 }
    println(result) // 41.0


    /* Output

    100.4
    100.4
    41.0
     */

}

fun convert(x: Double, converter: (Double) -> Double): Double = converter(x)

fun convertFive(converter: (Int) -> Double): Double = converter(5)