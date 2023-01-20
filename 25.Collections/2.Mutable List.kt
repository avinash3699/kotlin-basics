fun main() {

    // If you want a List whose values you can update, you need to use a MutableList.
    // You define a MutableList in a similar way to how you define a List, except this time, you use the mutableListOf function instead:
    val programmingLanguages = mutableListOf("Kotlin", "Swift", "Python")
    println(programmingLanguages) // [Kotlin, Swift, Python]


    // You add new values to a MutableList using the add function.
    // If you want to add a new value to the end of the MutableList, you pass the value to the add function as a single parameter.
    programmingLanguages.add("Dart")
    println(programmingLanguages) // [Kotlin, Swift, Python, Dart]


    // If you want to insert a value at a specific index instead, you can do so by passing the index value to the 'add' function in addition to the value.
    programmingLanguages.add(0, "Java")
    println(programmingLanguages) // [Java, Kotlin, Swift, Python, Dart]


    // There are two ways of removing a value from a MutableList.

    // 1. Call the 'remove' function, passing in the value you want to remove.
    programmingLanguages.remove("Dart")
    println(programmingLanguages) // [Java, Kotlin, Swift, Python]

    // 2. Use the 'removeAt' function to remove the value at a given index.
    programmingLanguages.removeAt(2)
    println(programmingLanguages) // [Java, Kotlin, Python]


    // If you want to update the MutableList so that the value at a particular index is replaced with another, you can do so using the 'set' function.
    programmingLanguages.set(0, "Swift")
    println(programmingLanguages) // [Swift, Kotlin, Python]


    // Sort the MutableList in a natural order using the 'sort' function
    programmingLanguages.sort()
    println(programmingLanguages) // [Kotlin, Python, Swift]


    // Reverse the MutableList using the 'reverse' function
    programmingLanguages.reverse()
    println(programmingLanguages) // [Swift, Python, Kotlin]


    // Use the 'shuffle' function to randomize it
    programmingLanguages.shuffle()
    println(programmingLanguages) // any permutation of the list is outputted


    // Use the 'addAll' function to add all the items that are held in another collection.
    val newLanguages = mutableListOf("Go", "Ruby", "Scala")
    programmingLanguages.addAll(newLanguages)
    println(programmingLanguages) // [Python, Swift, Kotlin, Go, Ruby, Scala]


    // The 'removeAll' function removes items that are held in another collection
    programmingLanguages.removeAll(newLanguages)
    println(programmingLanguages) // [Python, Swift, Kotlin]


    // The 'retainAll' function retains all the items that are held in another collection and removes everything else.
    programmingLanguages.retainAll(listOf("Kotlin", "Swift"))
    println(programmingLanguages) // [Swift, Kotlin]


    // It can sometimes be useful to copy a List, or MutableList, so that you can save a snapshot of its state. You can do this using the 'toList' function.
    val copyList: List<String> = programmingLanguages.toList()
    println("Original List: $programmingLanguages") // Original List: [Swift, Kotlin]
    println("Copy List: $copyList")                 // Copy List: [Swift, Kotlin]

    // MutableList also has a 'toMutableList' function which returns a copy that’s a new MutableList.
    var copyList2 = programmingLanguages.toMutableList()

    // Use the 'clear' function to remove every item like this
    programmingLanguages.clear()
    println(programmingLanguages) // []

}