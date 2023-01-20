fun main() {

    /* The minBy and maxBy functions work with ALL types

       The min and max functions, however, can’t be used with types with no natural order.
       You can’t use them, for example, with a List<Grocery> or a Set<Duck>, as the functions don’t automatically know how Grocery items or Duck objects should be ordered.
       This means that for more complex types, you need a different approach.

       If you want to find the lowest or highest value of a type that’s more complex, you can use the minBy and maxBy functions.
       These functions work in a similar way to min and max, except that you can pass them criteria.

       The minBy and maxBy functions each take one parameter:
       a lambda that tells the function which property it should use in order to determine which item has the lowest or highest value
     */

    val phone1 = PhoneDetails("IPhone", 499.0)
    val phone2 = PhoneDetails("Samsung", 399.0)
    val phone3 = PhoneDetails("Redmi", 199.0)
    val phone4 = PhoneDetails("Nokia", 249.0)

    val phones: List<PhoneDetails> = listOf(phone1, phone2, phone3, phone4)

    val maxPricePhone: PhoneDetails = phones.maxBy { it.price }
    val minPricePhone: PhoneDetails = phones.minBy { it.price }

    println("Phone with maximum price: $maxPricePhone") // Phone with maximum price: PhoneDetails(name=IPhone, price=499.0)
    println("Phone with minimum price: $minPricePhone") // Phone with minimum price: PhoneDetails(name=Redmi, price=199.0)

    /* Output

    Phone with maximum price: PhoneDetails(name=IPhone, price=499.0)
    Phone with minimum price: PhoneDetails(name=Redmi, price=199.0)
     */
}

data class PhoneDetails(val name: String, val price: Double)