fun main() {

    val arr = arrayOf(3, 6, 9, 33, 66, 99, 369)

    // using index
    var index = 0
    while(index < arr.size){
        print("${arr[index]} ")
        index++
    }
    println()
    // Output: 3 6 9 33 66 99 369


    // using 'for' and 'in' syntax
    for(num in arr)
        print("$num ")
    println()
    // Output: 3 6 9 33 66 99 369

}