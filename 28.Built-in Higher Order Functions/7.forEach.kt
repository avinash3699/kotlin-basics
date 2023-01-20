fun main() {

    val phone1 = PhoneDetails("IPhone", 499.0)
    val phone2 = PhoneDetails("Samsung", 399.0)
    val phone3 = PhoneDetails("Redmi", 199.0)
    val phone4 = PhoneDetails("Nokia", 249.0)

    val phones: List<PhoneDetails> = listOf(phone1, phone2, phone3, phone4)


    /* forEach works like a for loop

       The forEach function works in a similar way to a for loop, as it allows you to perform one or more actions against each item in a collection.
       You specify these actions using a lambda.

       You can use forEach with arrays, Lists, Sets, and on a Map’s entries, keys and values properties.
     */

    val nums = listOf(3, 6, 9)
    nums.forEach{ print("$it ") } // 3 6 9


    phones.forEach{ print("${it.name} ") } // IPhone Samsung Redmi Nokia

    phones.forEach{ print("${it.price * 80} ") } // 39920.0 31920.0 15920.0 19920.0

}

data class PhoneDetails(val name: String, val price: Double)