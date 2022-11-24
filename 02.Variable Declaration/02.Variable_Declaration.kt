fun main(){

    // In order to create a variable, the compiler needs to know three thing
    // 1. What is the name of the variable
    // 2, Whether the variable can be reused
    // 3. What type of variable it is

    // If the variable’s type isn’t explicitly defined, the compiler infers it from its value
    // A variable holds a reference to an object

    // 'val' is used when the 'value of the variable stays the same throughout the program'
    // val - immutable
    val name = "Avinash"

    // 'var' is used when the 'value of the variable will change'
    // var - mutable
    var age = 21

    
    name = "Cheems" // error: Val cannot be reassigned

    age = 22 // No error

}