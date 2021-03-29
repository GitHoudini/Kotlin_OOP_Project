package kotlintrainingpack

class Pessoa {
    var nome:String = "João"
    var cpf:String = "123.123.123-12"

    inner class Endereco {
        var rua:String = "Teste, numero 8"
    }
}

fun main() {
    val bloco = Pessoa()
    println(bloco.nome)
    println(bloco.cpf)
    println(bloco.Endereco().rua)
}