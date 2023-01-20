fun main() {

    /*
       According to Kotlin’s official documentation "A closure is a special kind of object that combines two things:
       a function, and the environment in which that function was created.
       The environment consists of any local variables that were in-scope at the time the closure was created".

       The variables defined outside the lambda which the lambda can access are sometimes referred to as the lambda’s closure.
       In clever words, we say that the lambda can access its closure.

       Closure means that a lambda can access any local variables that it captures.
     */

    val nums = listOf(3, 6, 9, -3, -10, -1)

    // As the lambda uses the 'sum' and 'sumOfPositiveNums' variable in its body, we say that the lambda’s closure has captured the variable.
    var sum = 0
    nums.forEach{ sum += it }
    println(sum) // 4


    var sumOfPositiveNums = 0
    nums.filter { it > 0 }
        .forEach{ sumOfPositiveNums += it }
    print(sumOfPositiveNums) // 18

}