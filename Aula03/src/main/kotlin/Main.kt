fun main() {
    val a = 42
    val b = 6
    var maior = 0

    /*if (a > b) {
        maior = a
    } else {
        maior = b
    }*/

    maior = if(a > b) a else b
    print(maior)
}

/*fun main() {
    val hora = 18

    if (hora < 12) {
        print("Bom dia!")
    } else if ( hora >= 12 && hora < 18) {
        print("Boa tarde!")
    } else {
        print("Boa noite!")
    }
}*/

/* Maior Idade (Condicional if else)
fun main() {
    val idade = 17

    if (idade >= 18) {
        println("Pode entrar")
    } else {
        println("Pode ir pra Casa")
    }
}
*/