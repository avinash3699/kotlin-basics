fun main() {

    /* The min and max functions work with basic types

       If you have a collection of basic types, you can use the min and max functions to find the lowest or highest value.
       The min and max functions work with Kotlin’s basic types because they have a natural order.
       Ints can be arranged in numerical order, for example, which makes it easy to find out which Int has the highest value, and
       Strings can be arranged in alphabetical order.
     */

    val numList: List<Int> = listOf(33, 9, 3, 6, 12)

    val max = numList.max()
    val min = numList.min()

    println(max) // 33

    println(min) // 3

}