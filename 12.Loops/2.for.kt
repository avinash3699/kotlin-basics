// “For loops run over a range of values or items.”

fun main() {

    // **********************************************************************************************************************
    // looping through a range of numbers

    // You specify the range of values using the .. operator
    // the .. operator includes the end number in its range
    for(num in 1..10)
        print("$num ")
    // Output: 1 2 3 4 5 6 7 8 9 10
    println()


    // to exclude the end number in its range, you would replace the .. operator with 'until'
    for(num in 1 until 10)
        print("$num ")
    // Output: 1 2 3 4 5 6 7 8 9
    println()


    // use 'downTo' to reverse the range
    for(num in 10 downTo 1)
        print("$num ")
    // Output: 10 9 8 7 6 5 4 3 2 1
    println()


    // use 'step' to skip numbers in the range
    for(num in 1..10 step 2)
        print("$num ")
    // Output: 1 3 5 7 9
    println()


    for(num in 9 downTo 1 step 2)
        print("$num ")
    // Output: 9 7 5 3 1
    println()

    // **********************************************************************************************************************
    // Looping through the items in an array

    val arr = arrayOf(3, 6, 9, 33, 66, 99, 369)
    for(num in arr)
        print("$num ")
    // Output: 3 6 9 33 66 99 369
    println()

    // the array's index and value are returned at same time using 'withIndex'
    val arr2 = arrayOf(3, 6, 9)
    for((index, item) in arr2.withIndex())
        println("$item is at index $index")
    // Output:
    // 3 is at index 0
    // 6 is at index 1
    // 9 is at index 2

}