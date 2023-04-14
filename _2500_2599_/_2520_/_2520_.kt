package beecrowd.iniciante._2500_2599_._2520_

import java.util.*

fun main(){

    val sc = Scanner(System.`in`)

    var tamanhoMatriz : String
    var tamanhoMatrizArray : Array<String>

    var linhaN : Int
    var colunaM : Int

    var linhaMatriz : String
    var linhaMatrizArray : Array<String>

    var posicaoCidade : Int

    var analogimonLinha : Int
    var analogimonColuna : Int

    var jogadorLinha : Int
    var jogadorColuna : Int

    var segundosPercorridos: Int

    var matriz : Array<Array<Int>>? = null

    var resultados = mutableListOf<Int>()

    while (sc.hasNext()){

//    var i = 0
//    while (i < 16){

        tamanhoMatriz = sc.nextLine()
        tamanhoMatrizArray = tamanhoMatriz.split(" ").toTypedArray()

        linhaN = tamanhoMatrizArray[0].toInt()
        colunaM = tamanhoMatrizArray[1].toInt()

        matriz = Array(linhaN) { Array(colunaM) { 0 } }

        analogimonLinha = 0
        analogimonColuna = 0

        jogadorLinha = 0
        jogadorColuna = 0

        segundosPercorridos = 0

        for (n in 0 until linhaN){

            linhaMatriz = sc.nextLine()
            linhaMatrizArray = linhaMatriz.split(" ").toTypedArray()

            for (m in 0 until colunaM){

                posicaoCidade = linhaMatrizArray[m].toInt()

                if (posicaoCidade == 2){
                    analogimonLinha = n
                    analogimonColuna = m
                }
                if (posicaoCidade == 1){
                    jogadorLinha = n
                    jogadorColuna = m
                }

                matriz[n][m] = posicaoCidade
            }

        }

        while (true){

            if (jogadorLinha > analogimonLinha){
                jogadorLinha--
                segundosPercorridos++
                continue
            }

            if (jogadorLinha < analogimonLinha){
                jogadorLinha++
                segundosPercorridos++
                continue
            }

            if (jogadorColuna > analogimonColuna){
                jogadorColuna--
                segundosPercorridos++
                continue
            }

            if (jogadorColuna < analogimonColuna){
                jogadorColuna++
                segundosPercorridos++
                continue
            }

            if (jogadorLinha == analogimonLinha && jogadorColuna == analogimonColuna) break

        }

        resultados.add(segundosPercorridos)

//        break
//        i++
    }

    resultados.forEach{ r -> println(r) }


}