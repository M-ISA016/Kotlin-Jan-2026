fun main() {
    println("Insert your exam grades on the space below:")

    val grades = readln().toDouble()
    when(grades) {
        in 9.0..10.0 -> println("A - Excellent! You're a master!")
        in 7.0..8.9 -> println("B - Very good! Keep going!")
        in 5.0..6.9 -> println("C - You passed, but you can get better.")
        in 0.0..4.9 -> println("D - Study more, you can do it in the next!")
        else -> println("Error: Invalid grade.")
    }
}
