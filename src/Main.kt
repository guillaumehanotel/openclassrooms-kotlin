import extensions.sayHello
import extensions.toPlural

fun main(args: Array<String>) {

    println("Hello World")
    val message: String? = "yo"
    println("c'est génial $message")


    val users: ArrayList<String> = arrayListOf("Guigui", "Benji")
    users.add("Samy")
    users.map { it -> it.toUpperCase() }.forEach { println(it) }
    println(users)


    lateinit var name: String

    val coursKotlin = Course(156, "Kotlin", "2 jours", true)

    println(minBy10(10, 50))

    print(colorToString(Color.GREEN))

    println(while20Items())

    val sins = arrayOf("Meliodas", "Ban", "King")

    showArrayContent(sins)


    val p1 = Player("Meliodas")
    println(p1)

    val test: String? = null

    //isString(test)

    test?.sayHello()

    val voiture = "voiture".toPlural()
    val camions = "camions".toPlural()
    println(voiture)
    println(camions)

    val user = User.newInstance("toto@orange.fr", "erty", "url.com")


    val players: List<Player> = listOf(
            Player("toto@gmail.com", 20, 2000),
            Player("hello@gmail.com", 18, 0),
            Player("oc@gmail.com", 35, 1000))

    println(players.maxBy { it.experience })
    println(players.maxBy { it.age })


}


fun getResult(nb1: Int, nb2: Int) = nb1 + nb2

fun getUsernameUpperCase(name: String) = name.toUpperCase()

fun isUsernameOfTeacher(name: String) = name.equals("Phil") || name.equals("Ambroise")

class Course(private val identifiant: Int, var titre: String, val duree: String, var etat: Boolean)

fun minBy10(nb1: Int, nb2: Int) = if (nb1 > nb2) nb2*10 else nb1*10

enum class Color {
    RED,
    BLUE,
    GREEN
}

fun colorToString (color: Color) = when (color) {
    Color.RED -> "RED"
    Color.BLUE -> "BLUE"
    Color.GREEN -> "GREEN"
}

fun while20Items () {
    var i = 0
    while (i <= 20){
        println(i)
        i++
    }
}

fun showArrayContent(array: Array<String>){
    for (item in array) println(item)
}

fun isUserOld(age: Int) = when {
    age > 65 -> true
    age < 0 -> throw Exception("Too young")
    age > 100 -> throw Exception("Too old")
    else -> false
}

data class User(val email: String, var password: String, var urlImage: String){
    companion object {
        fun newInstance(email: String, password: String, urlImage: String) = User(email, password, urlImage)
    }
}

open class Button(var title: String = "button",
                  var bgColor: Color = Color.GREEN){

    init {
        println("hello")
    }
}

class CircleButton(_title: String = "circleButton",
                   _bgColor: Color = Color.GREEN,
                   var radius: Double = 2.0) :Button(_title, _bgColor)




