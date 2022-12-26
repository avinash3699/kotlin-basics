// @JvmName defines the name of the target in the bytecode, which is also the name we can use when referring to the target from Java.
// https://www.baeldung.com/kotlin/jvm-annotations
@file:JvmName("Calculator")

fun add(num1: Int, num2: Int): Int = num1 + num2

fun mul(num1: Int, num2: Int): Int = num1 * num2

fun sub(num1: Int, num2: Int): Int = num1 - num2