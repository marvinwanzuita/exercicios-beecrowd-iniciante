package beecrowd.iniciante._2500_2599_._2523_

import java.util.*

fun main(){

    val sc = Scanner(System.`in`)

    var sequenciaLetras : String
    var quantidadeLetras : String

    var codigoLetras : String
    var codigoLetrasArray : Array<String>

    var palavraRevelada : String

    while (sc.hasNext()){

        sequenciaLetras = sc.nextLine()
        quantidadeLetras = sc.nextLine()
        codigoLetras = sc.nextLine()
        codigoLetrasArray = codigoLetras.split(" ").toTypedArray()

        palavraRevelada = ""

        for (i in 0 until codigoLetrasArray.size){
            palavraRevelada += sequenciaLetras[codigoLetrasArray[i].toInt() - 1].toString()
        }

        println(palavraRevelada)

    }


}