package atividade02

// Exibe o intervalo números de números pares de 0 a 20
fun main() {
    for (i in 0..20) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}
