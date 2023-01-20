fun main() {

    /* Use map to apply a transform to your collection

       The map function takes the items in a collection, and transforms each one according to some formula that you specify.
       It returns the results of this transformation as a new List.
     */

    val nums = listOf(1, 2, 3, 4, 5, 6)

    val squaresOfNum = nums.map {it * it}
    println(squaresOfNum) // [1, 4, 9, 16, 25, 36]



    // You can also use map to create a new List containing the name of each Phone item in groceries:
    val phone1 = PhoneDetails("IPhone", 499.0)
    val phone2 = PhoneDetails("Samsung", 399.0)
    val phone3 = PhoneDetails("Redmi", 199.0)
    val phone4 = PhoneDetails("Nokia", 249.0)

    val phones: List<PhoneDetails> = listOf(phone1, phone2, phone3, phone4)

    val phoneNames = phones.map { it.name }
    println(phoneNames) // [IPhone, Samsung, Redmi, Nokia]

}

data class PhoneDetails(val name: String, val price: Double)