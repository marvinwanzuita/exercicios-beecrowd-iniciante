package beecrowd.iniciante._2100_2199_._2126_

import java.util.*

fun main(){

    var s = Scanner(System.`in`)

    var entradas = mutableListOf<String>()
    var subsequencia : String
    var sequencia : String

    var contadorEntradas = 0
    var quantidadeSubsequentes : Int
    var caso = 1
    var posicaoUltimaSequencia : Int


//    for (i in 0 until 2){
//        entradas.add(readLine().toString())
//    }

    while(s.hasNext()) {
        entradas.add(s.nextLine())
    }

    for (i in 0 until entradas.size step 2){

        subsequencia = entradas[contadorEntradas]
        contadorEntradas++
        sequencia = entradas[contadorEntradas]
        contadorEntradas++

        quantidadeSubsequentes = 0
        posicaoUltimaSequencia = sequencia.lastIndexOf(subsequencia) + 1

        while (sequencia.contains(subsequencia)){
            quantidadeSubsequentes++
            sequencia = sequencia.replaceFirst(subsequencia, " ")
        }

        println("Caso #$caso:")

        if (quantidadeSubsequentes == 0){
            println("Nao existe subsequencia")
        } else {
            println("Qtd.Subsequencias: $quantidadeSubsequentes")
            println("Pos: $posicaoUltimaSequencia")
        }

        println()
        caso++

    }


}

