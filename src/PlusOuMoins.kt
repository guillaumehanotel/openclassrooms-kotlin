import java.util.*

fun main(args: Array<String>) {

    val random = (0..50).random()

    


}



fun IntRange.random() =
        Random().nextInt((endInclusive + 1) - start) + start