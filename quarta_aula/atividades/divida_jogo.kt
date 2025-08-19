package atividades

// Calculo do número de meses para quitar uma dívida de jogo
fun main() {

    print("Digite o valor inicial da dívida: R$ ")
    var divida = readLine()?.toDouble()?: 0.0

    print("Digite a taxa do juros mensal: ")
    val taxa = readLine()?.toDouble()?: 0.0

    print("Digite o valor pago mensal: R$ ")
    var pagamento = readLine()?.toDouble()?: 0.0

    var meses = 0
    var totalPago = 0.0
    var totalJurosPago = 0.0

    // Calculo do juros mensal
    while (divida > 0) {
        var juros = divida * (taxa / 100)
        divida = divida + juros

        // O pagamento mensal
        if (divida < pagamento) {
            totalPago += divida
            divida = 0.0
        } else {
            divida = divida - pagamento
            totalPago = totalPago + pagamento
        }

        totalJurosPago = totalJurosPago + juros
        meses++
    }

    println("\nNúmero de meses para pagar a dívida: $meses")
    println("Total pago: R$ ${"%.2f".format(totalPago)}")
    println("Total de juros pagos: R$ ${"%.2f".format(totalJurosPago)}")
}
