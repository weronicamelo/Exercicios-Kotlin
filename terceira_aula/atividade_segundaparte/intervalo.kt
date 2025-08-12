package atividade02

// Exibe os números do intervalo definido pelo usuário
fun main() {
    println("Digite o valor do início: ")
    val inicio = readLine()?.toInt()?: 0

    println("Digite o valor do fim: ")
    val fim = readLine()?.toInt()?: 0

    if (inicio <= fim) {
        println("A contagem do intervalo de $inicio até $fim")
                for(i in inicio .. fim) {
                    println(i)
                }
    } else {
        println("O valor do inicio é maior que o do fim!.")
    }
}