package kotlintrainingpack

class Pessoa {
    var nome:String = "Joao"
    var cpf:String = "123.123.123-12"
    private set

    inner class Endereco {
        var rua:String = "Teste, numero 8"
    }

    constructor()

    fun pessoaInfo() = "$nome e $cpf"    
}

fun main() {
    val bloco = Pessoa()

    println(bloco.nome)
    println(bloco.cpf)
    println(bloco.Endereco().rua)
    println(bloco.pessoaInfo())
}