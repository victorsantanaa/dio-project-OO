package one.digitalinnovation.digiobank

class Pessoa {
    var nome: String = "Victor"
    var cpf: String = "479.632.648-06"
    private set

    inner class Endereco {
        var rua: String = "Rua dos Aliados"
    }

}

fun main() {
    val victor = Pessoa()

    println(victor.nome)
    println(victor.cpf)

    println(victor.Endereco().rua)
}