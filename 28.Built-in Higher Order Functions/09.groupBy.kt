fun main() {

    /* Use groupBy to split your collection into groups

       This function lets you group the items in your collection according to some criteria, such as the value of one of its properties.
       The groupBy function accepts one parameter, a lambda, which you use to specify how the function should group the items in the collection.

       groupBy returns a Map. It uses the criteria passed via the lambda body for the keys, and each associated value is a List of items from the original collection.

       Note that you can’t use groupBy on a Map directly, but you can call it on its keys, values or entries properties.
     */

    val phone1 = Phone("IPhone", "13", 499.0)
    val phone2 = Phone("IPhone", "10", 399.0)
    val phone3 = Phone("Redmi", "Note 9", 199.0)
    val phone4 = Phone("Redmi", "Note 9 Pro", 249.0)

    val phones: List<Phone> = listOf(phone1, phone4, phone3, phone2)
    println(phones) // [Phone(brand=IPhone, model=13, price=499.0), Phone(brand=Redmi, model=Note 9 Pro, price=249.0), Phone(brand=Redmi, model=Note 9, price=199.0), Phone(brand=IPhone, model=10, price=399.0)]

    phones.groupBy { it.brand }
          .forEach { println(it)}
    /* Output

    IPhone=[Phone(brand=IPhone, model=13, price=499.0), Phone(brand=IPhone, model=10, price=399.0)]
    Redmi=[Phone(brand=Redmi, model=Note 9 Pro, price=249.0), Phone(brand=Redmi, model=Note 9, price=199.0)]
     */

}

data class Phone(val brand: String, val model: String, val price: Double)