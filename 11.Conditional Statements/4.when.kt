// Instead of writing many if..else expressions, you can use the 'when' expression, which is much easier to read.
// The 'when' expression is similar to the switch statement in Java.

fun main() {

    val monthInNumber = 10

    val monthInWords: String

    when (monthInNumber) {

        1    -> monthInWords = "January"
        2    -> monthInWords = "February"
        3    -> monthInWords = "March"
        4    -> monthInWords = "April"
        5    -> monthInWords = "May"
        6    -> monthInWords = "June"
        7    -> monthInWords = "July"
        8    -> monthInWords = "August"
        9    -> monthInWords = "September"
        10   -> monthInWords = "October"
        11   -> monthInWords = "November"
        12   -> monthInWords = "December"
        else -> monthInWords = "Invalid Month"

    }
    // The above can be done easy which is done in the next file

    println(monthInWords) // October

}