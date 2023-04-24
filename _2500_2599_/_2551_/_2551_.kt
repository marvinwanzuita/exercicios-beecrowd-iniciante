package beecrowd.iniciante._2500_2599_._2551_

import java.util.*

fun main() {

    val sc = Scanner(System.`in`)

    var treinosFeitos: Int

    var duracaoDistanciaTreino: String
    var duracaoDistanciaTreinoArray: Array<String>

    var duracao: Double
    var distancia: Int

    var maiorMedia: Double
    var mediaAtual: Double

    var diasMediaMaior : MutableList<Int>

    while (sc.hasNext()) {

        diasMediaMaior = mutableListOf()

        treinosFeitos = sc.nextInt()
        sc.nextLine()

        mediaAtual = 0.0
        maiorMedia = 0.0

        for (diaAtual in 1..treinosFeitos) {


            duracaoDistanciaTreino = sc.nextLine()
            duracaoDistanciaTreinoArray = duracaoDistanciaTreino.split(" ").toTypedArray()

            duracao = duracaoDistanciaTreinoArray[0].toDouble()
            distancia = duracaoDistanciaTreinoArray[1].toInt()

            mediaAtual = distancia / duracao

            if (mediaAtual > maiorMedia || diaAtual == 1) {
                maiorMedia = mediaAtual
                diasMediaMaior.add(diaAtual)
            }

        }

        diasMediaMaior.forEach { d -> println(d) }

    }

}