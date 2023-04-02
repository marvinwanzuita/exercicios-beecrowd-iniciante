package beecrowd.iniciante._2200_2499_._2234_

fun main(){

    var entrada = readLine().toString()
    var entradaArray = entrada.split(" ")

    var cachorrosQuentesConsumidos = entradaArray[0].toInt()
    var totalParticipantes = entradaArray[1].toDouble()

    var mediaCachorrosQuentesConsumidos = cachorrosQuentesConsumidos / totalParticipantes

    println(String.format("%.2f", mediaCachorrosQuentesConsumidos))

}