fun main() {

    /* Use 'finally' for the things you want to do no matter what

       If you have important cleanup code that you want to run regardless of an exception, you can put it in a 'finally' block.
       The 'finally' block is optional, but it’s guaranteed to run no matter what.
     */

    try{
        val input: Int = "ten".toInt()
        println("Valid number")
    }

    catch (e: Exception){
        println("Invalid number")
    }

    finally {
        println("Number check process completed")
    }

    /* Output

    Invalid number
    Number check process completed
     */
}