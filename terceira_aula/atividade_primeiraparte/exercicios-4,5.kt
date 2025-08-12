package atividade01

fun main() {
    // Comparação dos números (iguais)
    val num1 = 100
    val num2 = 89

    if (num1 == num2) {
        println("O valor $num1 é igual a $num2.")
    } else {
        println("O valor $num1 não é igual a $num2.")
    }

    // Leitura e verificação de maior e menor
    print("Digite o primeiro número: ")
    val num3 = readLine()?.toInt()?: 0

    print("Digite o segundo número: ")
    val num4 = readLine()?.toInt()?: 0

    if (num3 != null && num4 != null) {
        if (num3 > num4) {
            println("O primeiro número $num3 é maior que o segundo número $num4.")
        } else {
            println("O primeiro número $num3 é menor que o segundo número $num4.")
        }
    } else {
        println("Digite apenas números válidos.")
    }
}
