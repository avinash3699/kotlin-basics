fun main() {

    val num1 = 6
    val num2 = 3

    // create an object similar to that of creating objects in Kotlin
    val calculator = Calculator()

    val sum = calculator.add(num1, num2)
    val difference = calculator.sub(num1, num2)
    val product = calculator.mul(num1, num2)

    println("Sum: $sum")
    println("Difference: $difference")
    println("Product: $product")

    /*

    Output:

    Sum: 9
    Difference: 3
    Product: 18

     */

}