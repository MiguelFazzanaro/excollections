package exercicios.ex2

import exercicios.ex1.Apelido
import exercicios.ex1.Loteria

fun main() {
    val loteria = Loteria()
    loteria.loteriaDosSonhos.forEach { println(it) }

    val apelido = Apelido()
    apelido.dicionarioApelidos.forEach{ println(it)}

}