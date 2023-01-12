// Custom Exception can be created as below
class CustomException(exceptionMessage: String): Exception(exceptionMessage)

// If a function has the return type of 'Nothing', it means that it never returns (always throws an exception).
fun throwCustomException(): Nothing = throw CustomException("Custom Exception thrown")

fun main() {

    try{
        throwCustomException()
    }
    catch (e: CustomException){
        println(e.message)
    }

    /* Output

    Custom Exception thrown
     */

}