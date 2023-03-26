package beecrowd.iniciante._2100_2199_._2166_

import kotlin.math.sqrt

fun main(){

    var quantidadeRepeticoes = readLine()!!.toInt()

    var resultado : Double

    if (quantidadeRepeticoes == 0){
        resultado = 0.0
    } else if (quantidadeRepeticoes == 1){
        resultado = 1.5
    } else {
        resultado = dividirPorDois(quantidadeRepeticoes, 1.0 + sqrt(2.0))
    }

    println(String.format("%.10f",resultado))

}


fun dividirPorDois(repeticoes: Int, resultado: Double): Double {
    return if (repeticoes == 0) {
        resultado
    } else {
        dividirPorDois(repeticoes - 1, sqrt(2 + sqrt(2.0)))
    }
}
