fun main() {

    val str: String? = null
    // val strLength = str.length //error: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

    /* Keep things safe with safe calls

       If you want to access a nullable type’s properties and functions, an alternative approach is to use a "safe call".
       A safe call lets you access functions and properties in a single operation without you having to perform a separate null-check.

       ?. is the safe call operator. It lets you safely access a nullable type’s functions and properties.
     */

    // Accessing Properties
    val strLength = str?.length
    println(strLength) // null

    // Accessing Functions
    val firstChar = str?.get(0)
    println(firstChar) // null

}