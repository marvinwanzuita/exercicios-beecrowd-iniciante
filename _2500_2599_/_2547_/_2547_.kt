package beecrowd.iniciante._2500_2599_._2547_

import java.util.*

fun main() {

    val sc = Scanner(System.`in`)

    var visitantesAlturaMinimaMaxima: String
    var visitantesAlturaMinimaMaximaArray: Array<String>

    var quantidadePessoas: Int
    var alturaMinima: Int
    var alturaMaxima: Int

    var alturaVisitante: Int
    var visitantesAlturaPermitida: Int

    while (sc.hasNext()) {

        visitantesAlturaMinimaMaxima = sc.nextLine()
        visitantesAlturaMinimaMaximaArray = visitantesAlturaMinimaMaxima.split(" ").toTypedArray()

        quantidadePessoas = visitantesAlturaMinimaMaximaArray[0].toInt()
        alturaMinima = visitantesAlturaMinimaMaximaArray[1].toInt()
        alturaMaxima = visitantesAlturaMinimaMaximaArray[2].toInt()

        visitantesAlturaPermitida = 0

        for (i in 0 until quantidadePessoas) {

            alturaVisitante = sc.nextInt()
            sc.nextLine()
            if (alturaVisitante in alturaMinima..alturaMaxima) visitantesAlturaPermitida++

        }

        println(visitantesAlturaPermitida)

    }

}