package utils

fun isString(string: String?) {
    if (string == null) {
        throw Exception("NULL ! ")
    } else {
        println("This variable is not null")
    }
}