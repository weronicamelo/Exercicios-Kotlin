package atividades

// Recebe números digitados e exibe a quantidade de números, soma e média
fun main() {
    var quantidade = 0
    var soma = 0

    while (true) {
        print("Digite um número ou 0 para terminar o programa: ")
        val numero = readLine()?.toInt()?: 0

        if (numero == 0) {
            break
        }

        quantidade++
        soma = soma + numero
    }

    var media = 0
    if (quantidade > 0) {
        media = soma / quantidade
    }

    println("\nQuantidade de números digitados: $quantidade")
    println("Soma dos números: $soma")
    println("Média aritmética: $media")
}
