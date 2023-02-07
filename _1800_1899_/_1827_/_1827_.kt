package beecrowd.iniciante._1800_1899_._1827_

import java.util.*

fun main(){

    val s = Scanner(System.`in`)
    var N : Int

    var diagonalPrincipal: Int
    var diagonalSecundaria: Int
    var parteInternaComeco: Int
    var parteInternaFinal: Int
    var metadeTamanhoMatriz: Int

    while (s.hasNext()){

        N = s.nextInt()

        val arr = Array(N) { r -> IntArray(N) }

        diagonalPrincipal = 0
        diagonalSecundaria = N - 1
        parteInternaComeco = N / 3
        parteInternaFinal = (N - 1) - parteInternaComeco
        metadeTamanhoMatriz = N / 2

        for (i in 0 until N) {
            for (j in 0 until N) {

                if (i == metadeTamanhoMatriz && j == metadeTamanhoMatriz){
                    arr[i][j] = 4
                } else if (j >= parteInternaComeco && j <= parteInternaFinal &&
                    i >= parteInternaComeco && i <= parteInternaFinal){
                    arr[i][j] = 1
                } else if (j == diagonalPrincipal){
                    arr[i][j] = 2
                } else if (j == diagonalSecundaria){
                    arr[i][j] = 3
                } else {
                    arr[i][j] = 0
                }
            }
            diagonalPrincipal++
            diagonalSecundaria--
        }

        for (i in 0 until N) {
            for (j in 0 until N) {
                print("${arr[i][j]}")
            }
            println()
        }

        println()
    }



}