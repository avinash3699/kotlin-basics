fun main() {

    // A MutableSet is a subtype of Set, but with extra functions that you can use to add and remove values.

    // You define a MutableSet using the mutableSetOf function like this:
    val sampleSet = mutableSetOf(1, 2, 3)
    println(sampleSet) // [1, 2, 3]


    // You add new values to a MutableSet using the 'add' function.
    // The add function checks whether the object it’s passed already exists in the MutableSet.
    // If it finds a duplicate value, it returns false.
    // If it’s not a duplicate, however, the value gets added to the MutableSet (increasing its size by one) and
    // the function returns true to indicate that the operation was successful.
    var isAddedSuccessfully = sampleSet.add(9)
    println(isAddedSuccessfully) // true
    println(sampleSet) // [1, 2, 3, 9]

    isAddedSuccessfully = sampleSet.add(9)
    println(isAddedSuccessfully) // false
    println(sampleSet) // [1, 2, 3, 9]


    // You remove values from a MutableSet using the remove function.
    sampleSet.remove(1)

}