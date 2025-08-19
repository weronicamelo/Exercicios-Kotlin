package atividades

// Tabuada da operação escolhida no menu
fun main() {
    var opcao = 0
    var numero = 0

    while (true) {
        println("\nEscolha uma das operações:")
        println("1 - Adição")
        println("2 - Subtração")
        println("3 - Multiplicação")
        println("4 - Divisão")
        println("5 - Sair")
        print("Digite sua opção: ")

        opcao = readLine()?.toInt()?: 0

        // Se a opção escolhida for o número cinco ele encerra
        if (opcao == 5) {
            println("Saindo do programa...")
            break
        }

        print("Digite um número para ver a tabuada: ")
        numero = readLine()?.toInt()?: 0

        when (opcao) {
            1 -> {
                println("Operação Adição:")
                for (i in 1..10) {
                    println("$numero + $i = ${numero + i}")
                }
            }
            2 -> {
                println("Operação Subtração:")
                for (i in 1..10) {
                    println("$numero - $i = ${numero - i}")
                }
            }
            3 -> {
                println("Operação Multiplicação:")
                for (i in 1..10) {
                    println("$numero * $i = ${numero * i}")
                }
            }
            4 -> {
                println("Operação Divisão:")
                for (i in 1..10) {
                    if (i != 0) {
                        println("$numero / $i = %.2f".format(numero.toDouble() / i))
                    }
                }
            }
            else -> {
                println("Opção inválida!")
            }
        }
    }
}
