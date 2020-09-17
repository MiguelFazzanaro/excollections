package exercicios.ex2

fun main() {
    val lista = mutableListOf<Int>()
    val conjunto = mutableMapOf(
            1 to "",
            2 to "",
            3 to "",
            4 to "",
            5 to "",
            6 to "",
            7 to "",
            8 to "",
    )

    lista.add(1)
    lista.add(5)
    lista.add(5)
    lista.add(6)
    lista.add(7)
    lista.add(8)
    lista.add(8)
    lista.add(8)


    conjunto[1] = 1.toString()
    conjunto[2] = 5.toString()
    conjunto[3] = 5.toString()
    conjunto[4] = 6.toString()
    conjunto[5] = 7.toString()
    conjunto[6] = 8.toString()
    conjunto[7] = 8.toString()
    conjunto[8] = 8.toString()




    lista.forEach{ println(it)}
    conjunto.forEach {println(it)}

}


