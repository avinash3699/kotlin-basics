fun main() {

    /* You can replace a single parameter with it

       If you have a lambda which has a single parameter, and the compiler can infer its type, you can omit the parameter, and refer to it in the lambda body using the keyword 'it'.
     */

    // Instead of doing the below, 'it' can be used (Line number 13)
    val addOneToNum: (Int) -> Int = {num -> num + 1}

    // As the lambda has a single parameter, num, and the compiler can infer that num is an Int, we can omit the num parameter from the lambda,
    // and replace it with 'it' in the lambda body like this:
    val addOneToNum: (Int) -> Int = {it + 1}
    println(addOneToNum(8)) // 9


    // Note that you can only use the 'it' syntax in situations where the compiler can infer the type of the parameter.
    // The following code, for example, won’t compile because the compiler can’t tell what type it should be:
    val addOneToNum = {it + 1} //error: Unresolved reference: it
}