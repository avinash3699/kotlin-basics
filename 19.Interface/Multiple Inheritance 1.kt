interface A{

    fun myFunc(){
        println("Calling from Interface A")
    }

}

interface B{

    fun myFunc(){
        println("Calling from Interface B")
    }
}

// Implementing two interfaces A, B
class X: A, B{

    override fun myFunc(){

        // super<A> refers to the superclass or interface named A. So, super<A>.myFunc() calls the version of myFunc defined in A
        super<A>.myFunc()

        // calling the version of myFunc defined in B
        super<B>.myFunc()

        // specific to class X
        println("From X")

    }

}

fun main() {

    val obj = X()
    obj.myFunc()

    /* Output

    Calling from Interface A
    Calling from Interface B
    From X
     */

}