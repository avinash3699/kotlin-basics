// If you want to get something back from a function, you need to declare it
// If you declare that a function returns a value, then you must return a value of the declared type
fun getMax(num1: Int, num2: Int): Int{

    return if(num1 > num2) num1 else num2

}

fun main() {

    println(getMax(3, 9)) // 9

}