data class Phone(val brand: String, val model: String, val price: Double)

fun main() {

    /* The sumBy and sumByDouble functions

       The sumBy and sumByDouble functions return a sum of the items in a collection according to some criteria which you pass to it via a lambda.
       You can use these functions to, say, add together the quantity values for each item in a List<Grocery>, or return the sum of each unitPrice multiplied by the quantity.

       "sumBy" adds Ints together, and returns an Int.
       “sumByDouble" adds Doubles, and returns a Double.
     */
    val phone1 = Phone("IPhone", "13", 499.0)
    val phone2 = Phone("IPhone", "10", 399.0)
    val phone3 = Phone("Redmi", "Note 9", 199.0)
    val phone4 = Phone("Redmi", "Note 9 Pro", 249.0)

    val phones: List<Phone> = listOf(phone1, phone2, phone3, phone4)

    val requiredSum = phones.sumByDouble { it.price }

    // the above line is equivalent to:
    var reqSum = 0.0
    for(phone in phones)
        reqSum += phone.price

    println(requiredSum) // 1346.0
    println(reqSum) // 1346.0

    /* Output

    1346.0
    1346.0
     */
}