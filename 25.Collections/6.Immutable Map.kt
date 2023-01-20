fun main() {

    // You create a Map by calling a function named 'mapOf' passing in the key/value pairs you want the Map to be initialized with.
    // Each entry takes the form "key to value"
    val detailsMap = mapOf("Name" to "Avinash", "Age" to 21, "City" to "Chennai")
    println(detailsMap) // {Name=Avinash, Age=21, City=Chennai}


    // There are three main things you might want to do with a Map

    // 1. Check whether it contains a specific key or value
    // You check whether a Map contains a particular key or value using its 'containsKey' and 'containsValue' functions.
    val isNamePresent = detailsMap.containsKey("Name")
    println(isNamePresent) // true

    val isAnyoneChennai = detailsMap.containsValue("Chennai")
    println(isAnyoneChennai) // true


    // 2. Retrieve a value for a specified key
    // You can get the value for a specified key using the 'get' and 'getValue' functions.
    // 'get' returns a 'null' value if the specified key doesn’t exist, whereas 'getValue' throws an exception.
    val name = detailsMap.get("Name")
    println(name) // Avinash

    val age = detailsMap.getValue("Age")
    println(age) // 21


    // 3. Loop through the Map’s entries
    for((key, value) in detailsMap)
        println("$key: $value")
    /* Output

    Name: Avinash
    Age: 21
    City: Chennai
     */



    // You can take a snapshot of a Map using the 'toMap' function
    val copyMap = detailsMap.toMap()
    println("Original Map: $detailsMap") // Original Map: {Name=Avinash, Age=21, City=Chennai}
    println("Copy Map: $copyMap") // Copy Map: {Name=Avinash, Age=21, City=Chennai}

    // You can copy a 'Map' into a new 'List' object containing all the key/value pairs using "toList" like this:
    val listOfMap = detailsMap.toList()
    println(listOfMap) // [(Name, Avinash), (Age, 21), (City, Chennai)]
}