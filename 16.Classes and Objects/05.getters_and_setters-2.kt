/*
    To add a custom getter and setter for a primary constructor fields

    1. Remove the 'var' or 'val' from the constructor
    2. Assign the value that is got from the constructor to the fields
    3. Add a custom getter and setter
*/

class Song(songName: String, composer: String) {

    // Though a song's name won't be changed, just for learning purpose, consider it would change ;)
    var songName = songName
        get() = field
        set(newValue){
            if( (newValue.length > 0) && (newValue.length < 15) )
                field = newValue
        }

    // no setter, since it is declared with 'val'
    val composer = composer
        get() = field

}

fun main() {

    val song1 = Song("Marakkuma Nenjam", "A R Rahman")
    println(song1.songName)

    song1.songName = "This is a wonderful song composed by A R Rahman" // set unsuccessful, since length is greater than 15
    println(song1.songName)

    song1.songName = "VTK Song"
    println(song1.songName)

    /* Output

       Marakkuma Nenjam
       Marakkuma Nenjam
       VTK Song
     */

}