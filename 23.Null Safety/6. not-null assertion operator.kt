fun main() {

    /* The !! operator deliberately throws a NullPointerException

       The not-null assertion operator, or !!, is different to the other methods for dealing with nulls.

       Instead of making sure that your code is safe by handling any null values,
       the not-null assertion operator deliberately throws a NullPointerException if something turns out to be null.

       The message that’s displayed in the output window gives you information about the NullPointerException,
       including a stack trace giving you the location of the not-null assertion that caused it.
       So, 'not-null assertions' are useful if you want to test assumptions about your code, as they enable you to pinpoint problems.
     */

    val str: String? = null

    val len = str!!.length

    /* Output

    Exception in thread "main" java.lang.NullPointerException
	at _6__not_null_assertion_operatorKt.main(6. not-null assertion operator.kt:17)
	at _6__not_null_assertion_operatorKt.main(6. not-null assertion operator.kt)
     */

}