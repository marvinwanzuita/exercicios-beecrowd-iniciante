package beecrowd.iniciante._2760_2799_._2779_

fun main() {

    val colecaoTotal = readLine()?.toIntOrNull()

    if (colecaoTotal != null) {
        val listaNumeros = (1..colecaoTotal).toList()

        val figurinhasCompradas = readLine()?.toIntOrNull()

        if (figurinhasCompradas != null) {
            val numerosDigitados = mutableListOf<Int>()

            for (i in 1..figurinhasCompradas) {
                val numero = readLine()?.toIntOrNull()

                if (numero != null) {
                    numerosDigitados.add(numero)
                }
            }

            val numerosFaltantes = listaNumeros.filterNot { numerosDigitados.contains(it) }

            println(numerosFaltantes.size)
        } else {
            println("Quantidade de números inválida.")
        }
    } else {
        println("Número inválido.")
    }


}