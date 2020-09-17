package exercicios.ex4

class GuardaVolumes {
    var contador = 1
    val dicionario = mutableMapOf(contador,Pecas)

    override fun retirada() {
        TODO("Not yet implemented")
    }
    fun guardarPecas(roupas: List<Pecas>){
        dicionario.put(contador,roupas)
        contador ++
    }
    fun mostrarPecas(){

    }
    fun mostrarPecas(Integernumero){

    }
    fun devolverPecas(Integernumero){

    }
}
