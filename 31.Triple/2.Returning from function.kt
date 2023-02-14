fun main(){

    val result = getSumDifferenceProduct(3, 6)

    println(result) // (9, -3, 18)
    println(result::class.simpleName) // Triple

    val (sum, difference, product) = result
    println("$sum $difference $product") // 9 -3 18

}

fun getSumDifferenceProduct(num1: Int, num2: Int): Triple<Int, Int, Int>{

    val sum = num1 + num2
    val difference = num1 - num2
    val product = num1 * num2

    return Triple(sum, difference, product)

}