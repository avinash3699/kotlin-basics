/*
    In a class, you must initialize properties before you try to use them.

    This is so important that if you declare a property without initializing it in either the property declaration or the initializer block,
    the compiler will get very upset and refuse to compile your code.

    Nearly all the time, you’ll be able to assign default values to your properties

    If you’re completely certain that you can’t assign an initial value to a property when you call the class constructor, you can prefix it with 'lateinit'.
    This tells the compiler that you’re aware that the property hasn’t been initialized yet, and you’ll handle it later.
*/

class Song(val songName: String, val composer: String) {

    // assigning default values to the properties
    // var comments: Array<String> = arrayOf("")

    var commentIndex: Int
    init {
        commentIndex = 0
    }

    // instead of assigning default values, using 'lateinit'
    lateinit var comments: Array<String>

    fun addComments(comment: String){

        // to check if a lateinit property is initialized
        if(::comments.isInitialized) {
            comments[commentIndex] = comment
        }
        else{
            comments = arrayOf(comment)
        }
    }

    fun printComments(){

        if(::comments.isInitialized) {
            for (comment in comments)
                println(comment)
        }
        else
            println("There is no comments for this song so far!")
    }

    // Properties - songName, composer, comments
    // Functions  - addComments(), printComments()
}

fun main() {

    val song1 = Song("Marakkuma Nenjam", "A R Rahman")
    song1.printComments() // There is no comments for this song so far!
    song1.addComments("Nice song!")
    song1.printComments() // Nice song!

    /* Output

       There is no comments for this song so far!
       Nice song!
     */

}