fun main() {

    /* You can chain function calls together

       As the filter and map functions each return a collection, you can chain higher-order function calls together to concisely perform more complex operations.
     */

    val nums = listOf(-4, -3, -2, -1, 1, 2, 3, 4)


    val squaresOfPositiveNums = nums.filter { it > 0 }
                                             .map { it * it }
    println(squaresOfPositiveNums) // [1, 4, 9, 16]


    val squaresLesserThan10 = nums.map { it * it }
                                           .filter { it < 10 }
    println(squaresLesserThan10) // [9, 4, 1, 1, 4, 9]


    val maxOfSquares = nums.map { it * it }
                               .max()
    println(maxOfSquares) // 16
}
