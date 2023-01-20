fun main(){

    // When you have a lambda whose body has multiple lines, the last evaluated expression is used as the lambda’s return value
    // In the below code, it is: num1 + num2
    val getSum: (Int, Int) -> Int = {
        num1, num2 ->
            println("First Number: $num1")
            println("Second Number: $num2")
            num1 + num2
    }

    val sum = getSum(3, 6)
    print("Sum: $sum")

    /* Output

    First Number: 3
    Second Number: 6
    Sum: 9
     */

}