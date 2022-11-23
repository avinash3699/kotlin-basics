// Whenever you write a Kotlin application, you must add a function to it called main, which starts your application.
// When you run your code, the JVM looks for this function, and executes it.

// The function begins with the word 'fun', which is used to tell the Kotlin compiler that it’s a function.
// The 'fun' keyword is followed by the 'name of the function', in this case 'main'.

// If you’re using Kotlin 1.2, or an earlier version, your main function must take the following form in order for it to start your application
fun main(args: Array<String>){
    println("Hello World! - Parameterized Constructor")
}

// From Kotlin 1.3, however, you can omit main’s parameters so that the function looks like this
fun main() {
    println("Hello World! - Parameterless Constructor")
}