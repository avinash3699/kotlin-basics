fun main() {

    val str: String? = null

    /* Use let to run code if values are not null

       When you use nullable types, you may want to execute code if (and only if) a particular value is not null.
       The 'let' keyword used in conjunction with the safe call operator ?. tells the compiler that you want to perform some action when the value it’s operating on is not null.
       ?.let allows you to run code for a value that’s not null.

       Once you’ve established that the value is not null, you can refer to it in the body of the 'let' using 'it'.
       So in the following code example, 'it' refers to a non-nullable version of the 'str' variable, allowing you to directly access its length property.
     */
    str?.let {
        println(it.length)
    }


    /* Using 'let' with array items
       'let' can also be used to perform actions using the non-null items of an array.
       You can use the following code to loop through an array of String?s, and print each item that is not null.
     */
    val array: Array<String?> = arrayOf(null, "Safety", "Kotlin")

    for(element in array){
        element?.let{
            // print("$element ")
            print("$it ")
            // above two lines are valid and same
        }
    }
    println()


    /* Using let to streamline expressions
       'let' is particularly useful in situations where you want to perform actions on the return value of a function which may be null
     */
    fun getInput(): String?{
        val input = readLine()

        // return 'null' if the input is empty, else return the input string
        if(input?.length == 0) return null
        return input
    }

    // print the input only if it is not null
    getInput()?.let {
        println("You entered: $it")
    }
}