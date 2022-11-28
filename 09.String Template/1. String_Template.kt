fun main() {

    // String templates provide a quick and easy way of referring to a variable from inside a String
    // To include the value of a variable inside a String, you prefix the variable name with a $

    var name = "Avinash"
    var age = 21
    println("Watashi wa $name desu. I am $age years old") // Watashi wa Avinash desu. I am 21 years old


    // You can also use String templates to refer to an object’s properties, or call its functions.
    // In this case, you enclose the expression in curly braces

    var arr = arrayOf(3, 6, 9)
    println("The third element of the array is ${arr[2]}. The size of array is ${arr.size}") // The third element of the array is 9. The size of array is 3


    // You can even use String templates to evaluate more complex expressions from inside a String.
    // Here’s how, for example, you would use an if expression to include different text depending on the size of the array

    var arr2 = arrayOf(3, 6, 9, 33, 66, 99, 369)
    println("My array is ${if (arr2.size >= 5) "large" else "small"}!!!") // My array is large!!!

}