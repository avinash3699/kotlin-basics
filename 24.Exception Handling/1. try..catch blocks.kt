fun main() {

    /* An exception is thrown in exceptional circumstances
       An exception is a type of warning about exceptional situations that pop up at runtime. It’s a way for code to say “Something bad happened, I failed”.
     */

    /* You can catch exceptions that are thrown

       1. You can leave the exception alone.
          This will display a message in the output window, and stop your application

       2. You can catch the exception and handle it.
          If you know you might get an exception when you execute particular lines of code, you can prepare for it, and possibly recover from whatever caused it.
     */

    /* Catch exceptions using a try/catch
       You catch exceptions by wrapping the risky code in a try/catch block.

       A try/catch block tells the compiler that you know an exceptional thing could happen in the code you want to execute, and that you’re prepared to handle it.
       The compiler doesn’t care how you handle it; it cares only that you say you’re taking care of it.
     */

    // The try part of the try/catch block contains the risky code that might cause an exception.
    try {
        val num : Int = "ten".toInt()
        println(num)
    }
    // The catch part of the block specifies the exception that you want to catch, and includes the code you want to run if it catches it.
    catch (e: NumberFormatException){
        println("Invalid number")
    }

}