interface A{

    fun myFunc(){
        println("Calling from Interface A")
    }

}

open class B{

    open fun myFunc(){
        println("Calling from Class B")
    }
}

// Implementing the interface A and extending a class B
class X: A, B() {

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
    Calling from Class B
    From X
     */

}