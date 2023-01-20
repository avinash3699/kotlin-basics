typealias IntDouble = (Int) -> Double

fun main() {

    // here 'IntDouble' is referred to "(Int) -> Double"
    val lambda: IntDouble = {it * 3.14}

    // the above line is equivalent to:
    val lambda: (Int) -> Double = {it * 3.14}
}