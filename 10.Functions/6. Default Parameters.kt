fun getMobileDetails(os: String = "All"){
    println("Displaying $os mobile details")
}

fun main() {

    getMobileDetails() // Displaying All mobile details

    getMobileDetails("iOS") // Displaying iOS mobile details

    getMobileDetails("Android") // Displaying Android mobile details

    /* Output

    Displaying All mobile details
    Displaying iOS mobile details
    Displaying Android mobile details
     */

}