package atividade02

// Progressão Aritimética de 20 elementos definidos pelo usuário
fun main() {
    println("Digite o primeiro termo:")
    val primeiroTermo = readLine()?.toInt()?: 0

    println("Digite a razão:")
    val razao = readLine()?.toInt()?: 0

    println("A Progressão Aritmética de 20 termos:")
    var termo = primeiroTermo
    for (i in 1..20) {
        println(termo)
        termo += razao
    }
}
