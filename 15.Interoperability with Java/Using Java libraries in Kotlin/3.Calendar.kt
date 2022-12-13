import java.util.Calendar

fun main() {

    val calendar = Calendar.getInstance()

    println(calendar::class)
    println()

    println("Current Calendar's Year: " + calendar.get(Calendar.YEAR))
    println("Current Calendar's Day: " + calendar.get(Calendar.DATE))
    println("Current Calendar's Month: " + calendar.get(Calendar.MONTH))
    println("Current MINUTE: " + calendar.get(Calendar.MINUTE))
    println("Current SECOND: " + calendar.get(Calendar.SECOND))

    /* Output

       class java.util.GregorianCalendar

       Current Calendar's Year: 2022
       Current Calendar's Day: 5
       Current Calendar's Month: 11
       Current MINUTE: 40
       Current SECOND: 35
     */
}