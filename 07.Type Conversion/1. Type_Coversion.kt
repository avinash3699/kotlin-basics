fun main() {

    // Every numeric type has the following conversion functions:
    // toByte(), toShort(), toInt(), toLong(), toFloat() and toDouble()

    // **********************************************************************************************************************
    // Integer type to Integer type
    var byteAge: Byte = 21

    //var intAge: Int = byteAge // error: Type mismatch: inferred type is Byte but Int was expected

    var intAge: Int = byteAge.toInt() // no error
    println(intAge) // 21

    var shortAge: Short = byteAge.toShort() // no error
    println(shortAge) // 21

    var longAge: Long = byteAge.toLong() // no error
    println(longAge) // 21


    // **********************************************************************************************************************
    // Integer type to Floating point type
    var brainUsagePercentage = 100

    // var floatConverted: Float = brainUsagePercentage // error: Type mismatch: inferred type is Int but Float was expected

    var floatConverted: Float = brainUsagePercentage.toFloat() // no error
    println(floatConverted) // 100.0

    var doubleConverted: Double = brainUsagePercentage.toDouble() // no error
    println(doubleConverted) // 100.0


    // **********************************************************************************************************************
    // Floating point type to Integer type
    // the compiler will chop off everything after the decimal point
    var floatVal = 36.9f

    // var intOfFloat: Int = floatVal // error: Type mismatch: inferred type is Float but Int was expected

    var intOfFloat: Int = floatVal.toInt() // no error
    println(intOfFloat) // 36

    var longOfFloat: Long = floatVal.toLong() // no error
    println(longOfFloat) // 36


    // **********************************************************************************************************************
    // Floating point type to Floating point type

    // Float to Double
    var floatPrice = 36.9F

    // var doublePrice: Double = floatPrice // error: Type mismatch: inferred type is Float but Double was expected

    var doublePrice: Double = floatPrice.toDouble()
    println(doublePrice) // 36.900001525878906
    // TODO find why 36.9F is converted to the above double value


    // Double to Float
    var doubleNum: Double = 36.9

    // var floatNum: Float = doubleNum // error: Type mismatch: inferred type is Double but Float was expected

    var floatNum: Float = doubleNum.toFloat()
    println(floatNum) // 36.9


    // **********************************************************************************************************************
    // Special Case
    // Long to Int if the long value is too long to be stored in an Int object
    // The compiler chops up the value, and you’re left with some weird (but calculable) number
    var x = 1234567890123
    var y: Int = x.toInt()
    println(y) // 1912276171
    // TODO why exactly the above number. How it is calculated

}