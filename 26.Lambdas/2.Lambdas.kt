fun main() {

    // zero parameter
     val printHello = {"Hello"}

    // one parameter
    val addOneToNum = {num1: Int -> num1 + 1}

    // two parameters
    val addTwoNumbers = {num1: Int, num2: Int -> num1 + num2}

    // three parameters
    val addThreeNumbers = {num1: Int, num2: Int, num3: Int -> num1 + num2 + num3}

    // four parameters
    val addFourNumbers = {num1: Int, num2: Int, num3: Int, num4: Int -> num1 + num2 + num3 + num4}


    println(printHello()) // Hello

    println(addOneToNum(998)) // 999

    println(addTwoNumbers(3, 6)) // 9

    println(addThreeNumbers(3, 6, 9)) // 18

    println(addFourNumbers(3, 6, 9, 12)) // 30


    /* Output

    Hello
    999
    9
    18
    30
     */

}