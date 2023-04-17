package beecrowd.iniciante._2500_2599_._2540_

import java.util.*

fun main() {

    val sc = Scanner(System.`in`)

    var numeroJogadores: Int
    var votosString: String
    var votosArray: Array<String>

    var votosImpeachment: Int
    var porcentagemVotos: Double

    while (sc.hasNext()) {

        numeroJogadores = sc.nextInt()
        sc.nextLine()
        votosString = sc.nextLine()
        votosArray = votosString.split(" ").toTypedArray()

        votosImpeachment = 0

        for (i in 0 until numeroJogadores) {
            if (votosArray[i].toInt() == 1) votosImpeachment++
        }

        porcentagemVotos = 2 * numeroJogadores / 3.0

        if (votosImpeachment >= porcentagemVotos) {
            println("impeachment")
        } else {
            println("acusacao arquivada")
        }

    }
}