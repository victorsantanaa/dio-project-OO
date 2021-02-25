package one.digitalinnovation.digiobank

class Pessoa {
    var nome: String = "Victor"
    var cpf: String = "479.632.648-06"

}

fun main() {
    val victor = Pessoa()

    println(victor.nome)
    println(victor.cpf)
}