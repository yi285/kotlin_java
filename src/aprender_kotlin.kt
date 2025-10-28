fun main() {
    println("¡Hola, Ángel! Bienvenido a Kotlin")

    for (i in 1..5) {
        println("Número $i")
    }

    print("Escribe tu nombre: ")
    val nombre = readLine()
    println("¡Encantado de conocerte, $nombre!")
}
