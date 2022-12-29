class Song(val songName: String, val composer: String) {

    fun play() = println("Playing... ~$songName~ by $composer")

    fun stop() = println("Stopped... $songName")

}

// Kotlin gives the programmer the ability to add more functionality to the existing classes, without inheriting them.
// This is achieved through a feature known as "extensions". When a function is added to an existing class it is known as "Extension Function".
// To add an extension function to a class, define a new function appended to the classname.
fun Song.getDetails(): Unit = print("Name: $songName\nComposer: $composer")

fun main() {

    val song1 = Song("Marakkuma Nenjam", "A R Rahman")

    song1.getDetails()

    /* Output

    Name: Marakkuma Nenjam
    Composer: A R Rahman
     */
}