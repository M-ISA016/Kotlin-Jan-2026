/* 15/01/2026 // parameters, listOf, etc.  === I had to use AI and read documentation to fix problems like
printing entire variables.

(kotlin, androidArch, androidExpress, compose): Products (online courses)
(productName, price, stock, inStock, sales): Their data
 */
data class Product(

    val productName: String,
    val price: Double,
    val stock: Int,
    val inStock: Boolean,
    val sales: Int
)
fun main() {
// If outOfStock is =< 20, println(

    val kotlin = Product("Kotlin", 123.00, 0, false, 888)
    val androidArch = Product("Android Arch", 234.00, 0, false, 888)
    val androidExpress = Product("Android Express", 345.00, 567, true, 321)
    val compose = Product("Compose", 456.00, 432, true, 456)

    printProduct(kotlin)
    printProduct(androidArch)
    printProduct(androidExpress)
    printProduct(compose)
}

    fun printProduct(product: Product) {

        println(
            """
        Courses Data ====
        
        Name: ${product.productName}
        Price: ${product.price}
        Stock: ${product.stock}
        In Stock: ${product.inStock}
        Sales: ${product.sales}
        """.trimIndent()
        )
    }

