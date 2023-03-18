package beecrowd.iniciante._2100_2199_._2146_

import java.util.*

fun main(){

    var s = Scanner(System.`in`)

    var entradas = mutableListOf<Int>()

    while(s.hasNext()) {
        entradas.add(s.nextInt())
    }

    for (i in entradas.indices){
        println(entradas[i] - 1)

    }

}