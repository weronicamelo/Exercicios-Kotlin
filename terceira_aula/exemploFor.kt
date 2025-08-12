package terceira_aula

/*
fun main() {
    for (i in 1 .. 5) {
        println("Repetição número $i")
    }
}*/


// Contagem regressiva
/*
fun main() {
    for (i in 5 downTo 1) {
        println("Contando para trás: $i")
    }
}*/


// Step é usado para incremento e decremento entre
// os valores de um intervalo numérico.
// No exemplo está crescente, se quiser descrente tem que usar o downTo junto
/*
fun main() {
    for (i in 1 .. 10 step 2) {
        println(i)
    }
}*/

// Percorrendo uma lista de nomes
/*
fun main() {
    val nomes = listOf("Ana", "Lucas", "Maria")

    for (nome in nomes) {
        println("Olá, $nome!")
    }
}*/

// Percorrendo uma lista com índice usando a função withIndex()
/*
fun main() {
    val frutas = listOf("Maçã", "Banana", "Laranja")

    for ((indice, fruta) in frutas.withIndex()) {
        println("Fruta $indice: $fruta")
    }
} */


// Usando o forEach
/*
fun main() {
    val numeros = listOf(10, 20, 30)

    numeros.withIndex().forEach { (i, valor) ->
        println("Posição $i tem o valor $valor")
    }
} */


// Usando o forEach com mapOf, que é um mapa imutável
// onde cada valor é associado a uma chave, armazena dados em pares.
/*
fun main() {
    val idades = mapOf("Ana" to 25, "Bruno" to 30)

    idades.forEach { (nome, idade) ->
        println("$nome tem $idade anos")
    }
}*/


// Acessando chaves e valores com mapOf
/*
fun main() {
    val alunoNotas = mapOf("Ana" to 9.5, "Bruno" to 7.0, "Carlos" to 8.2)

    println(alunoNotas["Ana"]) // Saída 9.5
    println(alunoNotas["Carlos"]) // Saída 8.2
}*/


// Usando for com until para criar intervalos exclusivos, ele
// não inclui o último número no intervalo.
/*
fun main() {
    for (i in 0 until 5) {
        println("Valor: $i")
    }
}*/

// Usando for com until em uma lista
fun main() {
    val frutas = listOf("Maçã", "Banana", "Uva")

    for (i in 0 until frutas.size) {
        println("Fruta na posição $i: ${frutas[i]}")
    }
}
