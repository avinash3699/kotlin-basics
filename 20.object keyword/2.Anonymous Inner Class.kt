interface Movie{
    fun getDetails(): String
}

fun main() {

    // To create an anonymous inner class in Kotlin, we have to use object expressions.
    // We can extend from one class plus multiple interfaces or just multiple interfaces.
    val movie1: Movie = object: Movie{
        override fun getDetails() = "Movie Details"
    }

    // Quite interestingly, we can create anonymous inner classes without even extending another class or interface.
    val movie2 = object {
        fun getDetails() = "Movie Details"
    }

    println(movie1.getDetails()) // Movie Details

    println(movie2.getDetails()) // Movie Details
}