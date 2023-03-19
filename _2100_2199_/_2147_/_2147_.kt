package beecrowd.iniciante._2100_2199_._2147_

fun main(){

    var C = readLine()!!.toInt()
    var palavraDigitada : String
    var tempoGasto : Double
    var tempoGastoLista = mutableListOf<Double>()

    for (i in 0 until C){

        palavraDigitada = readLine().toString()
        tempoGasto = (palavraDigitada.length) / 100.0

        tempoGastoLista.add(tempoGasto)

    }

    for (tempo in tempoGastoLista){
        println(String.format("%.2f", tempo))
    }



}