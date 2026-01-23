fun main() { 
    println("Salary Bonus Calculator. Put your number of years working in the enterprise.")
    val enterpriseYears = readln().toInt()

    when (enterpriseYears) {
        in 0..1 -> println("5% Bonus!")
        in 2..5 -> println("10% Bonus!")
        in 6..10 -> println("15% Bonus!")
        else -> println("20% Bonus!")
    }
}
