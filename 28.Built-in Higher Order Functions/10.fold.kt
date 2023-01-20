fun main() {

    /*
        The fold function is arguably Kotlin’s most flexible higher-order function.
        With fold, you can specify an initial value, and perform some operation on it for each item in a collection.

        Unlike the other functions we’ve seen before, fold takes two parameters:
        the initial value, and the operation that you want to perform on it, specified by a lambda.
     */

    val nums = listOf(3, 6, 9)

    /*
        The fold function’s first parameter is the initial value—in this case, 0.
        This parameter can be any type, but it’s usually one of Kotlin’s basic types such as a number or String.

        The second parameter is a lambda which describes the operation that you want to perform on the initial value for each item in the collection.
        In the below example, we want to add each item to the initial value, so we’re using the lambda.
     */
    val sum = nums.fold(0){tempSum, item -> tempSum + item}
    println(sum) // 18

}