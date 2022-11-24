fun main() {

    // 'val' is used when the 'value of the variable stays the same throughout the program'
    // val - immutable
    val a: Int = 1 // here the variable 'a' is declared using 'val' so it cannot be changed and it is also mentioned with the variable type of 'Int'
    // and initialized as 1

    // If the variable’s type isn’t explicitly defined, the compiler infers it from its value
    val b = 2 // here the variable 'b' is declared using 'val' and initialized as 2

    val c: Int // here the variable 'c' is declared using 'val' and also mentioned that it as 'Int' type and doesn't initialized
    c = 3 // the varible 'c' is initialized for the first time and it cannot be reinitialized since 'val' is immutable

    val immutable: Int = 3
    immutable = 5   //impossible, since variables declared using 'val' are immutable (i.e cannot be changed after first initialization)

    // 'var' is used when the 'value of the variable will change'
    // var - mutable
    var mutable: Int = 5 // here variable mutable is declared using 'var' and mentioned its type as 'Int'

    mutable = 65 // mutable, since variables declared using 'var' can be changed

    mutable = "dinesh" // impossible, since variable mutable is mentioned as Int type. So it can only store values of type Int

    var mutableOfAnyType: Any = 3 // here variable 'mutableOfAnyType' is mentioned as Any it can be able to refer any kind of value
    // 'mutableOfAnyType' is initialized with type Int and value as '3'

    mutableOfAnyType = 'D' // variable 'mutableOfAnyType' is reinitialized with type char and value as 'D'

    mutableOfAnyType = "Dinesh" // variable 'mutableOfAnyType' is reinitialized with type String and value as 'Dinesh'

}