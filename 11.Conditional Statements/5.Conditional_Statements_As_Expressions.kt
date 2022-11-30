// you can also use if..else statements as expressions (assign a value to a variable and return it)
// it can also be used for 'when' statements

fun main() {

    // if...else
    val num = 5
    val isOdd = if(num%2 != 0) true else false
    println(isOdd) // true

    // if...else if...else
    val num2 = 0
    val oddOrEvenOrZero = if(num2 == 0) "Zero" else if(num%2 == 0) "even" else "odd"
    println(oddOrEvenOrZero) // Zero

    // when
    val monthInNumber = 10
    val monthInWords = when (monthInNumber) {
        1    -> "January"
        2    -> "February"
        3    -> "March"
        4    -> "April"
        5    -> "May"
        6    -> "June"
        7    -> "July"
        8    -> "August"
        9    -> "September"
        10   -> "October"
        11   -> "November"
        12   -> "December"
        else -> "Invalid Month"
    }
    println(monthInWords) // October

}