fun main() {

    /* Filter

       This function lets you search, or filter, a collection according to some criteria that you pass to it using a lambda.

       For most collections, filter returns a List that includes all the items that match your criteria, which you can then use elsewhere in your code.
       If it’s being used with a Map, however, it returns a Map
     */

    val phone1 = Phone("IPhone", "13", 499.0)
    val phone2 = Phone("IPhone", "10", 399.0)
    val phone3 = Phone("Redmi", "Note 9", 199.0)
    val phone4 = Phone("Redmi", "Note 9 Pro", 249.0)

    val phones: List<Phone> = listOf(phone1, phone2, phone3, phone4)

    // filter
    val iPhones = phones.filter { it.brand == "IPhone" }
    println(iPhones) // [Phone(brand=IPhone, model=13, price=499.0), Phone(brand=IPhone, model=10, price=399.0)]

    /* There’s a whole FAMILY of filter functions

       Kotlin has several variations of the filter function that can sometimes be useful.

       The "filterTo" function, for example, works like the filter function, except that it appends the items that match the specified criteria to another collection.
       The "filterIsInstance" function returns a List of all the items which are instances of a given class.
       The "filterNot" function returns those items in a collection which don’t match the criteria you pass to it.
     */

    // filterNot
    val nonIPhones = phones.filterNot { it.brand == "IPhone" }
    println(nonIPhones) // [Phone(brand=Redmi, model=Note 9, price=199.0), Phone(brand=Redmi, model=Note 9 Pro, price=249.0)]

    // filterIsInstance
    val isPhones = phones.filterIsInstance(Phone::class.java)
    println(isPhones) // [Phone(brand=IPhone, model=13, price=499.0), Phone(brand=IPhone, model=10, price=399.0), Phone(brand=Redmi, model=Note 9, price=199.0), Phone(brand=Redmi, model=Note 9 Pro, price=249.0)]

    // filterTo
    val iPhone13: MutableList<Phone> = phones.filter { it.brand == "IPhone" && it.model == "13" } as MutableList<Phone>
    println(iPhone13) // [Phone(brand=IPhone, model=13, price=499.0)]

    val allIPhones = phones.filterTo(iPhone13){it.brand == "IPhone" && it.model != "13"}
    println(allIPhones) // [Phone(brand=IPhone, model=13, price=499.0), Phone(brand=IPhone, model=10, price=399.0)]

}

data class Phone(val brand: String, val model: String, val price: Double)