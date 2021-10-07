import kotlin.random.Random

fun main(){
    val listaRandom = crearListaAleatorio()
    val listaResultado = contrarLista(listaRandom)
    println("ListaRandom = $listaRandom")
    println("ListaResultado = $listaResultado")
}

fun crearListaAleatorio() : List<Int>{
    return MutableList(Random.nextInt(90,110)){ Random.nextInt(0,10) }
}

fun contrarLista(listaRandom: List<Int>) : List<Int>{
    val output = mutableListOf<Int>()
    for (numero in 0..9) {
        var ocurrencias = 0
        for (numRandom in listaRandom) {
            if (numRandom == numero) {
                ocurrencias++
            }
        }
        output.add(numero, ocurrencias)
    }
    return output
}
