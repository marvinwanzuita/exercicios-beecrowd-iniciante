package beecrowd.iniciante._2000_2099_._2028_

import java.util.*

fun main(){

    val s = Scanner(System.`in`)

    var NLista = mutableListOf<Int>()
    var N : Int
    var caso = 1
    var quantidadeNumeros : Int
    var sequenciaNumerosString : String

    var sequenciaNumeros = mutableListOf<Int>()
    sequenciaNumeros.add(0)
    for (i in 0..200){
        for (j in 0 until i){
            sequenciaNumeros.add(i)
        }
    }

    while(s.hasNext()) {
        NLista.add(s.nextInt())
    }

    for (i in 0 until NLista.size){

        N = NLista[i]

        quantidadeNumeros = 1


        for (i in 1..N){
            quantidadeNumeros += i
        }

        sequenciaNumerosString = ""

        for (i in 0 until quantidadeNumeros){
            sequenciaNumerosString += "${sequenciaNumeros[i]} "
        }


        if (N == 0){
            println("Caso $caso: 1 numero")
            println(0)
        } else {
            println("Caso $caso: $quantidadeNumeros numeros")
            println(sequenciaNumerosString.trimEnd())
        }

        caso++
        println()
    }

}