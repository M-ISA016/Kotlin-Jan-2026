
import kotlin.random.Random

//chatgpt version of the password generator

fun main() {

    // Gerando uma senha com 'qtd' caracteres aleatórios.
    val random = Random
    val caracteres = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

    println("Digite a quantidade de caracteres:")
    val qtd = readln().toInt()  // Solicita a quantidade de caracteres para a senha.

    var senha = ""

    // Gera a senha com a quantidade de caracteres especificada
    for (i in 0 until qtd) {
        val dinam = random.nextInt(caracteres.length)  // Gera um índice aleatório válido.
        senha += caracteres[dinam]  // Adiciona o caractere correspondente à senha.
    }

    println("Senha gerada: $senha")
}



