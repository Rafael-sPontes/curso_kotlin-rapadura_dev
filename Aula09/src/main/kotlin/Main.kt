fun main() {

    /* 1# Não podemos usar variáveis sem antes inicizalizá-las
    var idade: Int = 0
    println(idade)*/

    /*var userName: String? = ""
    userName = null //getUserName()
    println("Olá, $userName")*/

    var userName: String? = ""
    userName = getUserName()

    userName?.let { println("Olá, $it") }
}

fun getUserName(): String? {
    return "Rafael"
}