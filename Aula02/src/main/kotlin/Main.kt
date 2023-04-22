fun main() {
    //Inteiro (1,2,3,4) (int)
    val anoAtual = 2023
    val proximoAno:Int = 2024

    //Float (1.5, 2.7, 5.6)
    val altura = 1.77f
    val pesoDaCadeira:Float = 4.5f;

    //Double > Float
    val PIf:Float = 3.14159265359f
    val PId:Double = 3.14159265359
    println("PI float = " + PIf)
    println("PI double = " + PId)

    //Char
    val letraInicial:Char = 'A'

    //String - Fio
    val nome = "Lucas"
    val sobrenome:String = "Silva"

    //Booleans
    val voceEhAlto = false
    val voceTrabalha:Boolean = true

    val ehMaiorA = 2 > 3
    println("2 > 3 = " + ehMaiorA)

    val ehMaiorB = 3 == 3
    println("3 == 3 = " + ehMaiorB)
}

/*
fun main() {
    var idade = 24      //Variável Multável
    val nome = "Caio"   //Variável Imultável

    println(idade)
    idade = 25
    println(idade)

    //nome = ""
}
*/