fun main() {

    // A nullable type is one that can hold null values in addition to its base type.
    // You declare that a type is nullable by adding a question mark (?) to the end of the type.


    // You can use a nullable type everywhere you can use a non-nullable type

    /* 1. When defining variables and properties.
          Any variable or property can be nullable, but you must explicitly define it as such by declaring its type, including the ?.
          The compiler is unable to infer when a type is nullable, and by default, it will always create a non-nullable type.
    */

    // var str: String = null //error: Null can not be a value of a non-null type String
    var str: String? = null // no error


    /* 2. When defining parameters.
          You can declare any function or constructor parameter type as nullable.
          When you define a function (or constructor) with a nullable parameter, you must still provide a value for that parameter when you call the function, even if that value is null.
          Just like with non-nullable parameter types, you can’t omit a parameter unless it’s been assigned a default value.
     */
    fun printText(text: String?){
        print(text)
    }


    /* 3. When defining function return types.
          A function can have a nullable return type.
     */
    fun getResult(): String? {
        return null
    }

}