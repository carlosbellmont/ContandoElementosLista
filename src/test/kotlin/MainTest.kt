import org.junit.jupiter.api.Test
class MainTest {
    @Test
    fun main_lista() {
        println("====== main_lista ======")
        val list = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val output = listOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
        println(list)
        println(output)
        println(contrarLista(list))
        assert(contrarLista(list).toString().contentEquals(output.toString()))
    }

    @Test
    fun main_listaFaltandoNumeros() {
        println("====== main_listaFaltandoNumeros ======")
        val list = listOf(0, 1, 2, 3, 4)
        val outputEsperado = listOf(1, 1, 1, 1, 1, 0, 0, 0, 0, 0)
        println("Lista original =  $list")
        println("Output = ${contrarLista(list)}")
        println("Output Esperado = $outputEsperado")
        assert(contrarLista(list).toString().contentEquals(outputEsperado.toString()))
    }

    @Test
    fun main_listaSinNumeros() {
        println("====== main_listaSinNumeros ======")
        val list = listOf<Int>()
        val outputEsperado = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        println("Lista original =  $list")
        println("Output = ${contrarLista(list)}")
        println("Output Esperado = $outputEsperado")
        assert(contrarLista(list).toString().contentEquals(outputEsperado.toString()))
    }
}