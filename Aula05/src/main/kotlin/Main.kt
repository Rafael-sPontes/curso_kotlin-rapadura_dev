fun main() {
    val a = 2
    val b = 6
    val soma = somar(x = a, y = b)
    val sub = subtracao(8, 6)
    val multi = multiplicacao(a, b)
    val div = divisao(x = 10, y = 5)
    println("Soma = " + soma +
            "\nSubtração = " + sub +
            "\nMultiplicação = " + multi +
            "\nDivisão = " + div)

    val mes = nomeMes(7)
    println("Mês: " + mes)
}

fun nomeMes(numMes: Int):String {
    val nomeMes = when(numMes) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Mês Inválido!"
    }
    return nomeMes
}

fun somar(x:Int, y:Int):Int = x + y
fun subtracao(x:Int, y:Int):Int = x - y
fun multiplicacao(x:Int, y:Int):Int = x * y
fun divisao(x:Int, y:Int):Int = x / y