fun main() {

    // arrayOf() can be used to create an Array
    val arr = arrayOf(3, 6, 9)

    println(arr) // [Ljava.lang.Integer;@7ea987ac
    println(arr::class) // class [Ljava.lang.Integer;

    // Print the size of the array
    println(arr.size) // 3

    // Individual elements can be accessed using the index
    // first element is present at index 0
    println(arr[0]) // 3
    println(arr[1]) // 6
    println(arr[2]) // 9

    // Elements of an array can be updated using the index
    // but the new value has to be the right type
    arr[2] = 66

    // Arrays hold items of a specific type. You can either let the compiler infer the type from the array’s values, or
    // explicitly define the type using Array<Type>.
    var arr1 = arrayOf(1, 2, 3)
    var arr2: Array<Int> = arrayOf(1, 2, 3)

}