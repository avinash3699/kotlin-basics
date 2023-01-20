fun main() {

    // You create a List in a similar way to how you create an array: by calling a function named listOf, passing in the values you want the List to be initialized with.
    val programmingLanguages = listOf("Java", "Kotlin", "Swift", "Python")


    // looping through a list and printing all its items
    for (lang in programmingLanguages)
        print("$lang ")
    println()
    // Output for above loop print: Java Kotlin Swift Python


    // You can access the items of a list using the "get" function
    val lang = programmingLanguages.get(1)
    println(lang) // Kotlin


    // You can also check whether the List contains a reference to a particular object, and retrieve its index:
    if("Python" in programmingLanguages)
        println(programmingLanguages.indexOf("Python")) // 3

}