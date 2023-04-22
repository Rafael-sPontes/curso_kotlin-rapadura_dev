fun main() {
    val nomes = listOf(
        "Flávia", "Gustavo", "Carina","Rammon",
        "Fabiano", "Marcos", "Ismael"
    )

    /*for (nome in nomes) {
        println("Nome: " + nome)
    }*/

    /*for (index in nomes.indices) {
        println(index)
    }*/

    /*for (index in nomes.indices) {
        println(nomes[index])
    }*/

    /*for ((index, nome) in nomes.withIndex()) {
        println("Index [" + index + "] Nome: " + nome)
    }*/

    /*nomes.forEach { println(it) }*/

    /*nomes.forEachIndexed {
            i, nome -> println("Index [" + i + "] Nome: " + nome)
    }*/

    for (index in 0..nomes.lastIndex) {
        println("Index [" + index + "] Nome: " + nomes[index])
    }
}