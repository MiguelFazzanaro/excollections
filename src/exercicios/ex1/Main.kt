package exercicios.ex1

fun main() {
    val loteria = Loteria()
    loteria.loteriaDosSonhos.forEach { println(it) }

    val apelido = Apelido()
    apelido.dicionarioApelidos.forEach{ println(it)}
}

