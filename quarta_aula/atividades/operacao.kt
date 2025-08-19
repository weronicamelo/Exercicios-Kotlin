package atividades

// Calculo das operações escolhidas pelo usuário
fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()?.toDouble()?: 0.0

    print("Digite o segundo número: ")
    val num2 = readLine()?.toDouble()?: 0.0

    println("Escolha uma das operações:")
    println("1 - Soma")
    println("2 - Subtração")
    println("3 - Multiplicação")
    println("4 - Divisão")

    print("Digite o número da operação: ")
    val operacao = readLine()?.toInt()?: 0

    when (operacao) {
        1 -> {
            val resultado = num1 + num2
            println("Resultado da soma: $resultado")
        }
        2 -> {
            val resultado = num1 - num2
            println("Resultado da subtração: $resultado")
        }
        3 -> {
            val resultado = num1 * num2
            println("Resultado da multiplicação: $resultado")
        }
        4 -> {
            if (num2 != 0.0) {
                val resultado = num1 / num2
                println("Resultado da divisão: $resultado")
            } else {
                println("Não é possível dividir por zero.")
            }
        }
        else -> println("Operação inválida.")
    }
}