package beecrowd.iniciante._2760_2799_._2770_

import java.util.*

fun main() {

    var sc = Scanner(System.`in`)

    var dimensoesString: String
    var dimensoesArray: Array<String>
    var ladoX: Int
    var ladoY: Int
    var quantidadePedidos: Int

    var ladosFornecidosString: String
    var ladosFornecidosArray: Array<String>
    var ladoXFornecido: Int
    var ladoYFornecido: Int

    var resultadoList = mutableListOf<String>()

    while (sc.hasNext()) {

        dimensoesString = sc.nextLine()
        dimensoesArray = dimensoesString.split(" ").toTypedArray()

        ladoX = dimensoesArray[0].toInt()
        ladoY = dimensoesArray[1].toInt()
        quantidadePedidos = dimensoesArray[2].toInt()

        for (i in 0 until quantidadePedidos) {

            ladosFornecidosString = sc.nextLine()
            ladosFornecidosArray = ladosFornecidosString.split(" ").toTypedArray()

            ladoXFornecido = ladosFornecidosArray[0].toInt()
            ladoYFornecido = ladosFornecidosArray[1].toInt()

            if (ladoYFornecido <= ladoY && ladoXFornecido <= ladoX) {
                resultadoList.add("Sim")

            } else if (ladoYFornecido <= ladoX && ladoXFornecido <= ladoY) {
                resultadoList.add("Sim")

            } else {
                resultadoList.add("Nao")

            }

        }

    }

    resultadoList.forEach { println(it) }

}