fun main() {
    val productName = "iPhone"
    val productPrice = 17_000

    when(productName) {
        in "iMac".lowercase() -> println("Applied discount")
        println("A")
    }
    else if(productPrice >= 10_000) {
        println("Applied discount.")
    }
}
