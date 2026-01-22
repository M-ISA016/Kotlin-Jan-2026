fun main() { // Remember to use "in"
    println("Insert the current temperature:")
    val temperature = readln().toInt()

    when(temperature) {
      in -100..14 -> println("Cold")
        in 15..25 -> println("Pleasant")
        in 26..100 -> println("Hot")
    }
}

