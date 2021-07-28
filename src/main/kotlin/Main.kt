import kotlin.random.Random

fun main(){
    val listaRandom = crearListaAleatorio()
    val listaResultado = mutableListOf<Int>()

    println("ListaRandom = $listaRandom")

    for (numero in 0..9) {
        var ocurrencias = 0
        for (numRandom in listaRandom) {
            if (numRandom == numero) {
                ocurrencias++
            }
        }
        listaResultado.add(numero, ocurrencias)
    }

    println("ListaResultado = $listaResultado")
}

fun crearListaAleatorio() : List<Int>{
    return MutableList(Random.nextInt(90,110)){ Random.nextInt(0,9) }
}