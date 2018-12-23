package extensions

fun String.sayHello() = print("Hello ! I contain : $this")


fun String.toPlural() = when {
    this[this.length - 1] != 's' -> this + 's'
    else -> this
}
