package atividades

// Empréstimo bancário para compra de uma casa
fun main() {
    print("Digite o valor da casa: R$ ")
    val valorCasa = readLine()?.toDouble()?: 0.0

    print("Digite o seu salário: R$ ")
    val salario = readLine()?.toDouble()?: 0.0

    print("Digite a quantidade de anos para pagar: ")
    val anos = readLine()?.toInt()?: 0

    // Cálculo do valor da prestação mensal
    val meses = anos * 12
    val prestacaoMensal = valorCasa / meses

    // 30% do salário para o valor da prestação
    val limitePrestacao = salario * 0.30

    if (prestacaoMensal <= limitePrestacao) {
        println("Empréstimo aprovado!")
        println("Valor da prestação mensal: R$ %.2f $prestacaoMensal")
    } else {
        println("Empréstimo reprovado!")
        println("A prestação mensal de R$ %.2f ultrapassa 30% do seu salário.".format(prestacaoMensal))
    }
}
