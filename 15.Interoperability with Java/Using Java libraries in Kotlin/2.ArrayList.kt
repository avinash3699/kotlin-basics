import java.util.ArrayList


fun main() {

    val arrayList: ArrayList<Int> = ArrayList<Int>()

    arrayList.add(3)
    arrayList.add(6)
    arrayList.add(9)

    println(arrayList) // [3, 6, 9]
    println(arrayList::class) // class java.util.ArrayList

    /*

    Output:

    [3, 6, 9]
    class java.util.ArrayList

     */

}