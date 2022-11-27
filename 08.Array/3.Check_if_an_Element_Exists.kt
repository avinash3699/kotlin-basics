fun main() {

    val arr = arrayOf(3, 6, 9, 33, 66, 99, 369)

    // using 'if' and 'in' syntax

    // 'in' is used to check the existence
    if(9 in arr)
        println("9 is present in arr")
    else
        println("9 is not present in arr")
    // Output: 9 is present in arr


    // '!in' (not in) is used to check the non-existence
    if(999 !in arr)
        println("999 is not present in arr")
    else
        println("999 is present in arr")
    // Output: 999 is not present in arr

}