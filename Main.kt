fun main() { // New: .map, .random(), joinToString;

    println("How many characters?")
    val number = readln().toInt()
    val chars = ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&*_+^:?><-~=;/")

    var result = (1..number).map {
        chars.random()
    }
        .joinToString("")
        result += chars.random()

    println(result)
}
// I didn't understand .map properly (gemini suggestion), random() more or less.