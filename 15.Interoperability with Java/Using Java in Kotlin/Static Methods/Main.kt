fun main() {

    val num1 = 6
    val num2 = 3

    // call the static methods from Java Calculator class similar to doing in Java
    val sum = Calculator.add(num1, num2)
    val difference = Calculator.sub(num1, num2)
    val product = Calculator.mul(num1, num2)

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