/*
    Classes are templates that allow you to create your own types of objects, and define their properties and functions
    If you want your application to deal with types of objects that Kotlin doesn’t have, you can define your own types by writing new classes

    When you want to define your own class, you need to think about the objects that will be created from that class. You need to consider
        1. The things each object knows about itself (Properties - They represent an object’s state)
        2. The things each object can do (Functions - They determine an object’s behavior, and may use the object’s properties)
*/

class Song(val songName: String, val composer: String) {

    fun play() = println("Playing... ~$songName~ by $composer")

    fun stop() = println("Stopped... $songName")

    // Properties - songName and composer
    // Functions  - play() and stop()
}

fun main() {

    val song1 = Song("Marakkuma Nenjam", "A R Rahman")
    song1.play()
    song1.stop()

    /* Output

       Playing... ~Marakkuma Nenjam~ by A R Rahman
       Stopped... Marakkuma Nenjam
     */

}