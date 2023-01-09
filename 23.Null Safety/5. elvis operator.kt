fun main() {

    /* Instead of using an if expression...
       Another thing you may want to do when you have nullable types is use an if expression that specifies an alternate value for something that’s null.
       The Elvis operator ?: is a safe alternative to an if expression. It’s called the Elvis operator because when you tip it on its side, it looks a bit like Elvis.

       The Elvis operator ?: is a safe version of an if expression. It returns the value on its left if that is not null. Otherwise, it returns the value on its right.
     */

    val str: String? = null

    // without using elvis operator
    val len1 = str?.length
    println(len1) // null

    // using elvis operator
    val len2 = str?.length ?: 0
    println(len2) // 0

    /* Working of elvis operator

       1. The Elvis operator first checks the value on its left.
       2. If the value on the left is not null, the Elvis operator returns it.
          If the value on the left is null, the Elvis operator returns the value on its right instead.
     */
}