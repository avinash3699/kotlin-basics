/* You can explicitly throw exceptions

   It can sometimes be useful to deliberately throw exceptions in your own code.
   You throw an exception using the 'throw' keyword.
 */

fun main(){

    try{
        checkEligibility(-20)
    }
    catch (e: java.lang.IllegalArgumentException){
        println(e)
    }

    /* Output

    java.lang.IllegalArgumentException: Age cannot be negative
     */

}

fun checkEligibility(age: Int): Boolean{

    // 'throw' keyword is used to deliberately throw an exception
    if(age < 0) throw IllegalArgumentException("Age cannot be negative")
    else if(age < 60) return true
    return false
}