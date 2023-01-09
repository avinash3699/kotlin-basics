fun main() {

    // An array of nullable types is one whose items are nullable.

    // val array: Array<String> = arrayOf(null, "Safety", "Kotlin") //error: Type mismatch: inferred type is String? but String was expected
    val array: Array<String?> = arrayOf(null, "Safety", "Kotlin") // no error


    // If you want a variable to hold references to any type of object and null values, its type must be Any?

    // val arr: Array<Any> =  arrayOf("String", 3, 6.9, 'a', null) //error: Type mismatch: inferred type is Any? but Any was expected
    val arr: Array<Any?> =  arrayOf("String", 3, 6.9, 'a', null)

}
