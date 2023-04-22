fun main() {
    val nomes = listOf(
        "Flávia", "Gustavo", "Carina",
        "Rammon", "Fabiano", "Marcos",
        "Douglas"
    )

    println("Count nomes = " + nomes.count())
    println("Size nomes = " + nomes.size)
    println("Lista Vazia? " + nomes.isEmpty())
    println("First Item: " + nomes.first())
    println("get_0 Item: " + nomes.get(0))
    println("[0...] Item: " + nomes[0])
    println("Last Item: " + nomes.last())
    println("Contém Specific? " + nomes.contains("Marcos"))
    println("Lista Inversa: " + nomes.asReversed())
    println("OrderList: "+ nomes.sorted())
    println("shuffled-List: " + nomes.shuffled())
}

/*fun main() {
    val num: MutableList<Int> = mutableListOf()

    num.add(8)
    println("Imp.1: " + num)

    num.add(16)
    println("Imp.2: " + num)

    num.remove(8)
    println("Imp.3: " + num)
}*/

/*fun main() {
    val numeros = listOf(8, 16, 32)

    val num = numeros.get(1)

    println(num)
}*/
