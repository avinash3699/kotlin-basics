/* Use typealias to provide a different name for an existing type

   A type alias lets you provide an alternative name for an existing type, which you can then use in your code.

   You define a type alias using the "typealias" keyword.
 */
typealias StrArr = Array<String>

fun main() {

    // here 'StrArr' is referred to Array<String>
    val arr: StrArr = arrayOf("This", "is", "a", "String", "Array")

    // the above line is equivalent to:
    val arr: Array<String> = arrayOf("This", "is", "a", "String", "Array")

}