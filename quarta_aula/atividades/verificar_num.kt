package atividades

// Verifica se algum valor que foi digitado é maior ou igual a 100
fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()?.toInt()?: 0

    print("Digite o segundo número: ")
    val num2 = readLine()?.toInt()?: 0

    if (num1 >= 100 || num2 >= 100) {
        println("Pelo menos um dos números é maior ou igual a 100.")
    } else {
        println("Nenhum dos números é maior ou igual a 100.")
    }
}
