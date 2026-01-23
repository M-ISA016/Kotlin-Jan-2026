fun main() {
    println("Choose a month (1-12) to find out the season.")
    val month = readln().toInt()
    when(month) {
        12, 1, 2 -> println("Summer")
        3, 4, 5, -> println("Fall")
        6, 7, 8, -> println("Winter")
        9, 10, 11 -> println("Spring")
    }
}
