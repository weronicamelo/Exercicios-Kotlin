package atividades

// Contagem de números dentro de um intervalo
fun main() {
    print("Digite o valor de início: ")
    val inicio = readLine()?.toInt()?: 0

    print("Digite o valor de fim: ")
    val fim = readLine()?.toInt()?: 0

    // Exibe os números dentro do intervalo
    println("Contagem de $inicio até $fim:")
    for (numero in inicio..fim) {
        println(numero)
    }
}
