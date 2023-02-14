fun main(){

    val result = getSumAndProduct(3, 6)
    val (sum, product) = getSumAndProduct(3, 6)

    println(result) // (9, 18)
    println(result::class.simpleName) // Pair

    println("$sum $product") // 9 18

}

fun getSumAndProduct(num1: Int, num2: Int): Pair<Int, Int>{

    val sum = num1 + num2
    val product = num1 * num2

    // return Pair(sum, product)
    return sum to product

}