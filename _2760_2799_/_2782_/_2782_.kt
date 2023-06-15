package beecrowd.iniciante._2760_2799_._2782_

import beecrowd.iniciante._2100_2199_._2164_.fibonacci

fun main(){

    var tamanhoSequencia = readLine()!!.toInt()

    var sequenciaNumerosString = readLine().toString()
    var sequenciaNumerosArray = sequenciaNumerosString.split(" ")
    var sequenciaNumeros = mutableListOf<Int>()

    var totalEscadinhas = 0
    var escadinhaAnterior = 0
    var escadinhaAtual = 0

    sequenciaNumerosArray.forEach { sequenciaNumeros.add(it.toInt()) }


    for (i in sequenciaNumeros.indices){

        if (i == 0){
            totalEscadinhas++
            continue
        }

        if (i == 1){
            continue
        }

        try {
            escadinhaAnterior = escadinha(sequenciaNumeros[i-2], sequenciaNumeros[i-1])
            escadinhaAtual = escadinha(sequenciaNumeros[i-1], sequenciaNumeros[i])
        } catch (e: Exception){
            continue
        }

        if (escadinhaAnterior == escadinhaAtual){
            continue
        } else {
            totalEscadinhas++
        }

    }

    println(totalEscadinhas)

}

fun escadinha(n1: Int, n2: Int): Int{
    return if (n1 <= n2){
        n2 - n1
    } else {
        n1 - n2
    }
}