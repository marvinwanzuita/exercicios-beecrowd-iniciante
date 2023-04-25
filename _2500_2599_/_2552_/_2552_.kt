package beecrowd.iniciante._2500_2599_._2552_

import java.util.*

fun main() {

    val sc = Scanner(System.`in`)

    var tamanhoMatriz: String
    var tamanhoMatrizArray: Array<String>

    var linhaN: Int
    var colunaM: Int

    var matriz: Array<Array<Int>>?

    var linhaMatriz: String
    var linhaMatrizArray: Array<String>

    var paesDeQueijoTabuleiro: Int
    var matrizResultado: String

    while (sc.hasNext()) {

        tamanhoMatriz = sc.nextLine()
        tamanhoMatrizArray = tamanhoMatriz.split(" ").toTypedArray()

        linhaN = tamanhoMatrizArray[0].toInt()
        colunaM = tamanhoMatrizArray[1].toInt()

        matriz = Array(linhaN) { Array(colunaM) { 0 } }

        for (n in 0 until linhaN) {
            linhaMatriz = sc.nextLine()
            linhaMatrizArray = linhaMatriz.split(" ").toTypedArray()
            for (m in 0 until colunaM) {
                matriz[n][m] = linhaMatrizArray[m].toInt()
            }
        }


        for (n in 0 until linhaN) {
            matrizResultado = ""
            for (m in 0 until colunaM) {
                paesDeQueijoTabuleiro = 0
                if (matriz[n][m] == 1) {
                    matrizResultado += "9"
                } else {
                    try {
                        if (matriz[n - 1][m] == 1) paesDeQueijoTabuleiro++
                    } catch (e: ArrayIndexOutOfBoundsException) {
                    }
                    try {
                        if (matriz[n + 1][m] == 1) paesDeQueijoTabuleiro++
                    } catch (e: ArrayIndexOutOfBoundsException) {
                    }
                    try {
                        if (matriz[n][m - 1] == 1) paesDeQueijoTabuleiro++
                    } catch (e: ArrayIndexOutOfBoundsException) {
                    }
                    try {
                        if (matriz[n][m + 1] == 1) paesDeQueijoTabuleiro++
                    } catch (e: ArrayIndexOutOfBoundsException) {
                    }
                    matrizResultado += paesDeQueijoTabuleiro
                }
            }
            println(matrizResultado)
        }

    }

}