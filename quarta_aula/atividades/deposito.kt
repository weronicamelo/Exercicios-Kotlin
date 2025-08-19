package atividades

// Depósito inicial e taxa de juros de uma poupança
fun main() {
    print("Digite o valor do depósito inicial: R$ ")
    val valorDeposito = readLine()?.toDouble() ?: 0.0

    print("Digite o valor da taxa de juros : R$ ")
    val taxa = readLine()?.toDouble() ?: 0.0

    var saldo = valorDeposito
    var total = 0.0

    // Calculo do juros em cada mês
    for (mes in 1..24) {
        val juros = saldo * (taxa / 100)
        saldo = saldo + juros
        total = total + juros

        print("Mês $mes: Saldo final = R$ ${"%.2f".format(saldo)}\n")
    }

    println("\nO total ganho com juros nos 24 meses é: R$ %.2f".format(total))
}