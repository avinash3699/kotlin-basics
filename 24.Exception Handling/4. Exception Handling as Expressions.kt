fun main() {

    // try and catch
    var num: Int? = try{ "two".toInt() } catch (e: Exception){ null }

    // throw
    val age: Int = num ?: throw Exception("Age cannot be null")

}