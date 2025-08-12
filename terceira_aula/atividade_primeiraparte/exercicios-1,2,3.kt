package atividade01

fun main() {
    // Calculando a potência
    val num1 = 51.0
    val expoente = 8.0
    val resultado = Math.pow(num1, expoente)
    println("O valor de $num1 elevado a potência $expoente é: $resultado")

    // Comparação entre os números (maior)
    val num2 = 100
    val num3 = 89

    if (num2 > num3) {
        println("O valor $num2 é maior que o de $num3.")
    } else {
        println("O valor $num2 não é maior que $num3.")
    }

    // Comparação entre os números (diferentes)
    if (num2 != num3) {
        println("O valor $num2 é diferente de $num3.")
    } else {
        println("O valor $num2 não é diferente de $num3.")
    }
}
