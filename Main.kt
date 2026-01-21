fun main() {
    println("Insert the letter to get your message.")

    val readln = readln().lowercase()
    val morning = "m"
    val afternoon = "a"
    val evening = "e"

    when(readln) {
        morning -> println("Good morning!")
        afternoon -> println("Good afternoon!")
        evening -> println("Good evening!")

        else -> println("Invalid value.")
    }
}