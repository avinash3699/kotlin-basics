fun main(){

    var age: Byte = 21
    var copyAge = age

    age = 22
    copyAge = 23

    println(copyAge) // 23
    println(age) // 22

    println(age::class) // byte
    println(copyAge::class) // byte

    // TODO: DOUBT
    // Page No. 91 in HEAD FIRST KOTLIN mentions that the two variable point to the same object reference.
    // But as per the above execution, changing the value of one variable is not changing the other one.


    // trying to assign a variable of one type to a different type, compilation error will be thrown
    var name = "Avinash"
    var id: Int = name // Type mismatch: inferred type is String but Int was expected
    
}