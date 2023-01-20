fun main() {

    // If you need a collection that doesn’t allow duplicates, you can use a Set: an unordered collection with no duplicate values.

    // You create a Set by calling a function named setOf, passing in the values you want the Set to be initialized with.
    val sampleSet = setOf(1, 2, 3, 4, 5, 6, 3, 6, 9)

    println(sampleSet) // [1, 2, 3, 4, 5, 6, 9]
    // The duplicate numbers 3 and 6 are present only once in the set object.

    // A Set’s values are unordered, so unlike a List, there’s no get function you can use to get the value at a specified index.
    // You can, however, still use the contains function to check whether a Set contains a particular value using code like this:
    val isPresent = sampleSet.contains(9)
    println(isPresent) // true


    // And you can also loop through a Set like this:
    for(item in sampleSet) print("$item ")
    println()
    // 1 2 3 4 5 6 9
}
