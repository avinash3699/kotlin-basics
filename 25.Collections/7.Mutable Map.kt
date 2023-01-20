fun main() {

    // You define a MutableMap in a similar way to how you define a Map, except that you use the mutableMapOf function instead of mapOf.
    val detailsMap = mutableMapOf("Name" to "Avinash", "Age" to 21, "City" to "New York")
    println(detailsMap) // {Name=Avinash, Age=21, City=New York}

    // MutableMap is a subtype of Map, so you can call the same functions on a MutableMap that you can on a Map.
    // A MutableMap, however, has extra functions that you can use to add, remove and update key/value pairs.


    // You put entries into a MutableMap using the put function.
    // If the MutableMap already contains the specified key, the put function replaces the value for that key, and returns the original value.
    detailsMap.put("City", "Chennai")
    println(detailsMap) // {Name=Avinash, Age=21, City=Chennai}

    // You can put many key/value pairs into the MutableMap at once using the putAll function.
    // This takes one argument, a Map containing the entries you want to add.
    detailsMap.putAll(mapOf("Department" to "CSE", "Programmer" to true))
    println(detailsMap) // {Name=Avinash, Age=21, City=Chennai, Department=CSE, Programmer=true}


    // You remove an entry from a MutableMap using the remove function. This function is overloaded so that there are two ways of calling it.

    // 1. The first way is to pass to the remove function the key whose entry you want to remove.
    detailsMap.remove("City")
    println(detailsMap) // {Name=Avinash, Age=21, Department=CSE, Programmer=true}

    // 2. The second way is to pass the remove function the key name and a value.
    // In this case, the function will only remove the entry if it finds a match for both the key and the value.
    detailsMap.remove("Department", "CSE")
    println(detailsMap) // {Name=Avinash, Age=21, Programmer=true}


    // You can take a snapshot of a MutableMap using the 'toMutableMap' function
    val copyMap = detailsMap.toMutableMap()
    println("Original Map: $detailsMap") // Original Map: {Name=Avinash, Age=21, Programmer=true}
    println("Copy Map: $copyMap") // Copy Map: {Name=Avinash, Age=21, Programmer=true}

    // You can copy a 'MutableMap' into a new 'List' object containing all the key/value pairs using "toList" like this:
    val listOfMap = detailsMap.toList()
    println(listOfMap) // [(Name, Avinash), (Age, 21), (Programmer, true)]


    // You can also get direct access to the key/value pairs using the Map’s entries property.
    // The entries property returns a Set if it’s used with a Map, and returns a MutableSet if it’s used with a MutableMap.
    val mapEntries = detailsMap.entries
    println(mapEntries) // [Name=Avinash, Age=21, Programmer=true]
    println(mapEntries::class) // class java.util.LinkedHashMap$LinkedEntrySet

    // Other useful properties are keys (which returns a Set, or MutableSet, of the Map’s keys), and values (which returns a generic collection of the Map’s values).
    val keys = detailsMap.keys
    println(keys) // [Name, Age, Programmer]
    println(keys::class) // class java.util.LinkedHashMap$LinkedKeySet

    val values = detailsMap.values
    println(values) // [Avinash, 21, true]
    println(values::class) // class java.util.LinkedHashMap$LinkedValues

}