fun main(){

    // 1. Initialize a variable before you use it, or you’ll get a compiler error
    var num: Byte
    println(num) // Variable 'num' must be initialized


    // 2. Use the right value for the variable’s type
    var value: String
    value = 21 // The integer literal does not conform to the expected type String

    var count: Int
    count = "One" // Type mismatch: inferred type is String but Int was expected

    var byteNum: Byte
    byteNum = 369 // The integer literal does not conform to the expected type Byte

    // 3.
    // Though 'Byte' value fits into a 'Int' object, the types are different, so it will result in a compilation error
    var age: Byte = 21
    var copyAge: Int = age // Type mismatch: inferred type is Byte but Int was expected

    // The Kotlin compiler will only let you assign a value to a variable if the value and variable are compatible.
    // If the value is too large, or it’s the wrong type, the code won’t compile.

}