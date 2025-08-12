package terceira_aula

// O when é uma estrutura condicional semelhante ao switch.
// Dias da semana
/*fun main() {
    val dia = 3

    when(dia) {
        1 -> println("Domingo")
        2 -> println("Segunda-Feira")
        3 -> println("Terça-Feira")
        4 -> println("Quarta-Feira")
        5 -> println("Quinta-Feira")
        6 -> println("Sexta-Feira")
        7 -> println("Sábado")
        else -> println("Dia inválido")
    }
}*/


// When como expressão
/*fun main() {
    val nota = 8
    val resultado = when {
        nota >= 9 -> "Excelente"
        nota >= 7 -> "Bom"
        nota >= 5 -> "Regular"
        else -> "Reprovado"
    }
    println(resultado) // Bom
}*/


// When com múltiplos valores
/*fun main() {
    val letra = 'A'
    when (letra) {
        'A', 'E', 'I', 'O', 'U' -> println("vogal")
        else -> println("Consoante")
    }
}*/

// When sem argumento
// Adicionar .. para um intervalo
fun main() {
    val idade = 17
    when {
        idade < 13 -> println("Criança")
        idade in 13.. 17 -> println("Adolescente")
        idade >= 18 -> println("Adulto")
    }
}