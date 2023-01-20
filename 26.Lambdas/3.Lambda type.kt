fun main() {

    /* Lambda expressions have a type”

       Just like any other sort of object, a lambda has a type.
       The difference with a lambda’s type, however, is that it doesn’t specify a class name that the lambda implements.
       Instead, it specifies the type of the lambda’s parameters and return value.

       A lambda’s type is also known as a function type.

       A lambda’s type takes the form:
                (parameters) -> return_type
     */

    val printHello: () -> String = {"Hellooo"}

    val addTwoNum: (Int, Int) -> Int
    addTwoNum = {num1: Int, num2: Int -> num1 + num2}

    /* The compiler can infer lambda parameter types

       When you explicitly declare a variable’s type, you can leave out any type declarations from the lambda that the compiler can infer.
     */

    // The compiler already knows from addThreeNum’s type definition that any lambda that’s assigned to the variable must have three Int parameters.
    // This means that you can omit the Int type declaration from the lambda parameters definition because the compiler can infer its type.
    val addThreeNum: (Int, Int, Int) -> Int = { num1, num2, num3 -> num1 + num2 + num3}


}