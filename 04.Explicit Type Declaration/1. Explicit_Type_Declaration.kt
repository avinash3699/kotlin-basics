fun main(){

    // Why Explicit type declaration?
    // 1. To use Bytes or Shorts instead of Ints, for example, because they are more efficient
    // 2. To declare a variable at the start of your code, and assign a value to it later on

    // Instead of letting the compiler infer the variable’s type from its value,
    // put a colon (:) after the variable’s name, followed by the type you want it to be
    var shortVal: Short
    shortVal = 99
    println(shortVal::class) // short

    var byteVal: Byte
    byteVal = 99
    println(byteVal::class) // byte


    // Declaring the type AND assigning a value
    var age: Byte = 21
    println(age::class) // byte

    var name: String = "Avinash" // here the explicit type declaration is not necessary, since it is String by default
    println(name::class) // java.lang.String

}