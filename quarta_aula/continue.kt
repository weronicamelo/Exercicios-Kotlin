package quarta_aula

fun main() {
    for (i in 1 .. 5) {
        if ( i == 3){
            continue // Pula a interação quando i for igual a 3
        }
        println(i)
    }
}