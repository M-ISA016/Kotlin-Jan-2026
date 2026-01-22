fun main() {
    println("Insert your letter:")
    val result = readln().lowercase()

    when (result) {
      in "aeiou" -> println("Vowel")
        in "bcdfghjklmnprrstvwkyz" -> println("Consonant")

        else -> println("Invalid character")
    }
}