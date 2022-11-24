fun main(){

    // There are two basic floating-point types: Float and Double

    // Float  - 32 bits
    // Double - 64 bits

    // By default, if you declare a variable by assigning an floating point number, you will create an object and variable of type 'Double'
    var currentKotlinVersion = 1.7
    println(currentKotlinVersion::class) // double

    // To create a variable of type 'Float', add an 'f' or 'F' to the end of the number
    var price = 99.9f
    println(price::class) // float

    var newPrice = 89.9F
    println(newPrice::class) // float

}