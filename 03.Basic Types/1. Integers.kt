fun main(){

    // “Kotlin has four basic integer types: Byte, Short, Int and Long.”

    // Byte  - 8  bits - -128 to 127
    // Short - 16 bits - -32768 to 32767
    // Int   - 32 bits - -2147483648 to 2147483647
    // Long  - 64 bits - -9,223,372,036,854,775,808 (-(2^63)) to 9,223,372,036,854,775,807 ((2^63) - 1)

    // By default, if you declare a variable by assigning an integer (which can be represented in 32 bits), you will create an object and variable of type 'Int'
    var year = 2022
    println(year::class) // int

    // if the variable is assigned with a value that cannot be represented in 32 or fewer bits, a 'Long' object is created automatically
    var worldPopulation = 8000000000
    println(worldPopulation::class) // long

    // To create a variable of type 'Long', add an L to the end of the integer
    var myAge = 22L
    println(myAge::class) // long

    // Assign a binary number by prefixing the number with '0b'
    var binary = 0b11
    println(binary) // 3
    println(binary::class) // int

    // Assign a hexadecimal number by prefixing the number with '0x'
    var hexadecimal = 0xFF
    println(hexadecimal) // 255
    println(hexadecimal::class) // int

    // variable name followed by "::class" will return the type of object

}
