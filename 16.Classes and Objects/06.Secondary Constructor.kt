// Just as in other languages such as Java, classes in Kotlin let you define one or more secondary constructors.
// Secondary constructors are extra constructors that allow you to pass different parameter combinations to create objects.
// Most of the time, however, you don’t need to use them as having default parameter values is so flexible.

class Song(val songName: String, val composer: String) {

    // Each secondary constructor starts with the 'constructor' keyword, and is followed by the set of parameters used to call it.
    // If the class has a primary constructor, each secondary constructor must delegate to it.
    // You can define extra code that the secondary constructor should run when it’s called in the secondary constructor’s body within the curly braces {}
    constructor(songName: String): this(songName, "Unknown") {
        println("Please set the composer name once available.")
    }

    fun play() = println("Playing... ~$songName~ by $composer")

    fun stop() = println("Stopped... $songName")

}

fun main() {

    val song1 = Song("Marakkuma Nenjam")
    song1.play()
    song1.stop()

    /* Output

    Please set the composer name once available.
    Playing... ~Marakkuma Nenjam~ by Unknown
    Stopped... Marakkuma Nenjam
     */

}