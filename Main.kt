fun main() {
    val archiveType = readln()
    when(archiveType) {
        "jpg", "png", "gif" -> println("Image.")
        "mp4", "mkv" -> println("Video.")
        "pdf", "txt", "doc" -> println("Document.")
        else -> println("Unknown extension.")
    }
}