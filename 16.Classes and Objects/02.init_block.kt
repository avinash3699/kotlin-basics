/*
    If you need to initialize a property to something more complex than a simple expression, or
    if there’s extra code you want to run when each object is created, you can use one or more initializer blocks

    Initializer blocks are executed when the object is initialized, immediately after the constructor is called, and they’re prefixed with the 'init' keyword
    Your class can have multiple initializer blocks. Each one runs in the order in which it appears in the class body, interleaved with any property initializers
*/

class Song(val songName: String, val composer: String) {
    // The properties defined in the constructor are defined first (1)

    // This init block runs next (2)
    init {
        println("$songName is being created")
    }

    // interleaved property between init blocks
    // This property is created after the first init block has finished (3)
    var rating: Float = 0f

    // The second init block runs after the property has been created (4)
    init{
        println("Current rating of the song is $rating")
    }

    fun play() = println("Playing... ~$songName~ by $composer")

    fun stop() = println("Stopped... $songName")

    // Properties - songName, composer, rating
    // Functions  - play() and stop()
}

fun main() {

    val song1 = Song("Marakkuma Nenjam", "A R Rahman")
    song1.play()
    song1.stop()

    /* Output

       Marakkuma Nenjam is being created
       Current rating of the song is 0.0
       Playing... ~Marakkuma Nenjam~ by A R Rahman
       Stopped... Marakkuma Nenjam
     */

}