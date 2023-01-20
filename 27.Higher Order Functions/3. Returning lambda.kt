fun main() {

    /* A function can return a lambda

    As well as using a lambda as a parameter, a function can also return one by specifying the lambda’s type as its return type.
    The following code, for example, defines a function named getConversionLambda that returns a lambda of type (Double) -> Double.
    The exact lambda that’s returned by the function depends on the value of the String that’s passed to it.

    You can invoke the lambda returned by a function, or use it as an argument for another function.
     */

    val USDToRupee = getConversionLambda("US Dollars")
    println(USDToRupee(1000.0)) // 82740.0

    val PoundsToRupee = getConversionLambda("Pounds")
    println(PoundsToRupee(1000.0)) // 87980.0

    val YenToRupee = getConversionLambda("Yen")
    println(YenToRupee(1000.0)) // 620.0

    val RialToRupee = getConversionLambda("Rial")
    println(RialToRupee(1000.0)) // Currency not found: Rial
                                 // 1000.0

}

fun getConversionLambda(s: String): (Double) -> Double {

    if(s.equals("US Dollars"))
        return { it * 82.74 }

    else if(s.equals("Pounds"))
        return { it * 87.98 }

    else if(s.equals("Yen"))
        return { it * 0.62 }

    return {
        println("Currency not found: $s")
        it
    }

}
