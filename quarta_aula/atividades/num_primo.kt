package atividades

// Calculo de número primo e quantidade de vezes que ele é divisível
fun main() {
    print("Digite um número qualquer: ")
    val numero = readLine()?.toInt()?: 0

    if (numero <= 1) {
        println("O número $numero não é primo.")
    } else {
        var divisor = 0

        for (i in 1..numero) {
            if (numero % i == 0) {
                divisor++
            }
        }

        // Verificação de número primo
        if (divisor == 2) {
            println("O número $numero é primo.")
        } else {
            println("O número $numero não é primo e é divisível por $divisor vezes.")
        }
    }
}
